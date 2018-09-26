package Aug12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

import july31.GenericHeap;

public class Graph {
	private class Vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();
	}

	private HashMap<String, Vertex> vces = new HashMap<>();

	public int numVertices() {
		return vces.size();
	}

	public boolean containsVertex(String vname) {
		return vces.containsKey(vname);
	}

	public void addVertex(String vname) {
		if (vces.containsKey(vname)) {
			return;
		}
		Vertex v = new Vertex();
		vces.put(vname, v);
	}

	public int numEdges() {
		int rv = 0;

		ArrayList<String> vertices = new ArrayList<>(vces.keySet());
		for (String vname : vertices) {
			Vertex v = vces.get(vname);
			rv = rv + v.nbrs.size();
		}

		return rv / 2;
	}

	public boolean containsEdge(String v1name, String v2name) { // are nbrs?
		Vertex v1 = vces.get(v1name);
		Vertex v2 = vces.get(v2name);
		if (v1 == null || v2 == null || v1.nbrs.containsKey(v2name) == false) {
			return false;
		}

		return true;
	}

	public void addEdge(String v1name, String v2name, int weight) {
		Vertex v1 = vces.get(v1name);
		Vertex v2 = vces.get(v2name);
		if (v1 == null || v2 == null) {
			return;
		}

		v1.nbrs.put(v2name, weight);
		v2.nbrs.put(v1name, weight);
	}

	public void removeEdge(String v1name, String v2name) {
		Vertex v1 = vces.get(v1name);
		Vertex v2 = vces.get(v2name);
		if (v1 == null || v2 == null) {
			return;
		}

		v1.nbrs.remove(v2name);
		v2.nbrs.remove(v1name);
	}

	public void removeVertex(String vname) {
		Vertex v = vces.get(vname);
		ArrayList<String> nbrnames = new ArrayList<>(v.nbrs.keySet());
		for (String nbrname : nbrnames) {
			Vertex nbr = vces.get(nbrname);
			nbr.nbrs.remove(vname);
		}

		vces.remove(vname);
	}

	public void display() {
		ArrayList<String> vnames = new ArrayList<>(vces.keySet());
		for (String vname : vnames) {
			String str = vname + " -> ";
			Vertex v = vces.get(vname);
			ArrayList<String> nbrnames = new ArrayList<>(v.nbrs.keySet());
			for (String nbrname : nbrnames) {
				str += nbrname + "[" + v.nbrs.get(nbrname) + "], ";
			}
			System.out.println(str + ".");
		}
	}

	public boolean hasPath(String v1name, String v2name) {
		return hasPath(v1name, v2name, new HashMap<>(), v1name);
	}

	private boolean hasPath(String v1name, String v2name, HashMap<String, Boolean> processed, String psf) {
		if (processed.containsKey(v1name)) {
			return false;
		}
		Vertex v1 = vces.get(v1name);
		processed.put(v1name, true);
		if (v1.nbrs.containsKey(v2name)) {
			System.out.println(psf + v2name);
			return true;
		}
		ArrayList<String> nbrnames = new ArrayList<>(v1.nbrs.keySet());
		for (String nbrname : nbrnames) {
			if (hasPath(nbrname, v2name, processed, psf + nbrname)) {
				return true;
			}
		}
		return false;
	}

	public boolean hasPathAll(String v1name, String v2name) {
		return hasPathAll(v1name, v2name, new HashMap<>(), v1name);
	}

	private boolean hasPathAll(String v1name, String v2name, HashMap<String, Boolean> processed, String psf) {
		if (processed.containsKey(v1name)) {
			return false;
		}
		Vertex v1 = vces.get(v1name);
		processed.put(v1name, true);
		if (v1.nbrs.containsKey(v2name)) {
			System.out.println(psf + v2name);
			return true;
		}
		boolean mr = false;
		ArrayList<String> nbrnames = new ArrayList<>(v1.nbrs.keySet());
		for (String nbrname : nbrnames) {
			boolean rr = hasPathAll(nbrname, v2name, processed, psf + nbrname);
			processed.remove(v1name);
			if (rr = true) {
				mr = true;
			}
		}
		return mr;
	}

	public boolean bfs(String v1name, String v2name) {

		LinkedList<Pair> queue = new LinkedList<>();
		Pair pair = new Pair(v1name, vces.get(v1name), v1name);
		HashMap<String, Boolean> processed = new HashMap<>();

		queue.add(pair);
		processed.put(v1name, true); // we can also do it as we did it in dfs
										// but not vice-versa

		while (queue.size() != 0) {
			pair = queue.removeFirst();
			System.out.println(pair.vname + " via " + pair.psf);

			if (pair.vtx.nbrs.containsKey(v2name)) {
				System.out.println(pair.psf + v2name);
				return true;
			}
			ArrayList<String> nbrnames = new ArrayList<>(pair.vtx.nbrs.keySet());
			for (String nbrname : nbrnames) {
				if (!processed.containsKey(nbrname)) {
					processed.put(nbrname, true);
					Pair newpair = new Pair(nbrname, vces.get(nbrname), pair.psf + nbrname);
					queue.addLast(newpair);
				}
			}
		}
		return false;
	}

	public boolean dfs(String v1name, String v2name) {

		LinkedList<Pair> stack = new LinkedList<>();
		Pair pair = new Pair(v1name, vces.get(v1name), v1name);
		HashMap<String, Boolean> processed = new HashMap<>();

		stack.add(pair);

		while (stack.size() != 0) {
			pair = stack.removeFirst();
			System.out.println(pair.vname + " via " + pair.psf);

			if (processed.containsKey(pair.vname)) {
				continue;
			}
			processed.put(pair.vname, true);

			if (pair.vtx.nbrs.containsKey(v2name)) {
				System.out.println(pair.psf + v2name);
				return true;
			}
			ArrayList<String> nbrnames = new ArrayList<>(pair.vtx.nbrs.keySet());
			for (String nbrname : nbrnames) {
				if (!processed.containsKey(nbrname)) {
					Pair newpair = new Pair(nbrname, vces.get(nbrname), pair.psf + nbrname);
					stack.addFirst(newpair);
				}
			}
		}
		return false;
	}

	public void dft() {
		LinkedList<Pair> stack = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		ArrayList<String> vnames = new ArrayList<>(vces.keySet());
		for (String vname : vnames) {
			if (processed.containsKey(vname)) {
				continue;
			}
			Pair pair = new Pair(vname, vces.get(vname), vname);
			stack.addFirst(pair);
			while (stack.size() != 0) {
				pair = stack.removeFirst();

				if (processed.containsKey(pair.vname)) {
					continue;
				}
				processed.put(pair.vname, true);
				System.out.println(pair.vname + " via " + pair.psf);

				ArrayList<String> nbrnames = new ArrayList<>(pair.vtx.nbrs.keySet());
				for (String nbrname : nbrnames) {
					if (!processed.containsKey(nbrname)) {
						Pair newpair = new Pair(nbrname, vces.get(nbrname), pair.psf + nbrname);
						stack.addFirst(newpair);
					}
				}
			}
		}
	}

	public void bft() {
		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		ArrayList<String> vnames = new ArrayList<>(vces.keySet());
		for (String vname : vnames) {
			if (processed.containsKey(vname)) {
				continue;
			}
			Pair pair = new Pair(vname, vces.get(vname), vname);
			queue.addLast(pair);
			while (queue.size() != 0) {
				pair = queue.removeFirst();

				if (processed.containsKey(pair.vname)) {
					continue;
				}
				processed.put(pair.vname, true);
				System.out.println(pair.vname + " via " + pair.psf);

				ArrayList<String> nbrnames = new ArrayList<>(pair.vtx.nbrs.keySet());
				for (String nbrname : nbrnames) {
					if (!processed.containsKey(nbrname)) {
						Pair newpair = new Pair(nbrname, vces.get(nbrname), pair.psf + nbrname);
						queue.addLast(newpair);
					}
				}
			}
		}
	}

	public boolean isConnected() {
		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		ArrayList<String> vnames = new ArrayList<>(vces.keySet());
		int count = 0;
		for (String vname : vnames) {
			if (processed.containsKey(vname)) {
				continue;
			}
			if (count != 0) {
				return false;
			}
			count++;
			Pair pair = new Pair(vname, vces.get(vname), vname);
			queue.addLast(pair);
			while (queue.size() != 0) {
				pair = queue.removeFirst();

				if (processed.containsKey(pair.vname)) {
					continue;
				}
				processed.put(pair.vname, true);
				System.out.println(pair.vname + " via " + pair.psf);

				ArrayList<String> nbrnames = new ArrayList<>(pair.vtx.nbrs.keySet());
				for (String nbrname : nbrnames) {
					if (!processed.containsKey(nbrname)) {
						Pair newpair = new Pair(nbrname, vces.get(nbrname), pair.psf + nbrname);
						queue.addLast(newpair);
					}
				}
			}
		}
		return true;
	}

	public boolean isCyclic() {
		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		ArrayList<String> vnames = new ArrayList<>(vces.keySet());
		for (String vname : vnames) {
			if (processed.containsKey(vname)) {
				continue;
			}
			Pair pair = new Pair(vname, vces.get(vname), vname);
			queue.addLast(pair);
			while (queue.size() != 0) {
				pair = queue.removeFirst();

				if (processed.containsKey(pair.vname)) {
					return true;
				}
				processed.put(pair.vname, true);
				System.out.println(pair.vname + " via " + pair.psf);

				ArrayList<String> nbrnames = new ArrayList<>(pair.vtx.nbrs.keySet());
				for (String nbrname : nbrnames) {
					if (!processed.containsKey(nbrname)) {
						Pair newpair = new Pair(nbrname, vces.get(nbrname), pair.psf + nbrname);
						queue.addLast(newpair);
					}
				}
			}
		}
		return false;
	}

	public ArrayList<String> getConnectedComponents() {
		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		ArrayList<String> mr = new ArrayList<>();

		ArrayList<String> vnames = new ArrayList<>(vces.keySet());
		// int count =0;
		for (String vname : vnames) {
			if (processed.containsKey(vname)) {
				continue;
			}
			Pair pair = new Pair(vname, vces.get(vname), vname);
			queue.addLast(pair);
			String str = "";
			while (queue.size() != 0) {
				pair = queue.removeFirst();

				if (processed.containsKey(pair.vname)) {
					continue;
				}
				processed.put(pair.vname, true);
				// System.out.println(pair.vname + " via " + pair.psf);
				str = str + pair.vname;

				ArrayList<String> nbrnames = new ArrayList<>(pair.vtx.nbrs.keySet());
				for (String nbrname : nbrnames) {
					if (!processed.containsKey(nbrname)) {
						Pair newpair = new Pair(nbrname, vces.get(nbrname), pair.psf + nbrname);
						queue.addLast(newpair);
					}
				}
			}
			mr.add(str);
		}

		return mr;
	}

	public boolean isTree() {
		return this.isConnected() && this.isCyclic() == false;
	}

	private class Pair {
		Vertex vtx;
		String psf;
		String vname;
		String colour;

		Pair(String vname, Vertex vtx, String psf) {
			this.vname = vname;
			this.vtx = vtx;
			this.psf = psf;
		}
	}

	public HashMap<String, DjikstraPair> djikstra(String src) {

		HashMap<String, DjikstraPair> hm = new HashMap<>();
		GenericHeap<DjikstraPair> heap = new GenericHeap<>(DjikstraPair.compt);

		ArrayList<String> vnames = new ArrayList<>(vces.keySet());
		for (String vname : vnames) {
			DjikstraPair pair = new DjikstraPair(vname, "", Integer.MAX_VALUE);

			if (src.equals(vname)) {
				pair.csf = 0;
				pair.psf = vname;
			}
			hm.put(vname, pair);
			heap.add(pair);

		}

		while (heap.size() != 0) {
			DjikstraPair rp = heap.removeHP();

			ArrayList<String> nbrnames = new ArrayList<>(vces.get(rp.vname).nbrs.keySet());
			for (String nbrname : nbrnames) {
				DjikstraPair np = hm.get(nbrname);
				int ocf = np.csf;
				int ncf = rp.csf + vces.get(rp.vname).nbrs.get(np.vname);
				if (ocf > ncf) {
					np.csf = ncf;
					np.psf = rp.psf + np.vname;
					heap.updatePriority(np);
				}
			}
		}
		return hm;
	}

	private static class DjikstraPair {
		String vname;
		String psf;
		int csf;
		private static final djkcomparator compt = new djkcomparator();

		DjikstraPair(String vname, String psf, int csf) {
			this.vname = vname;
			this.csf = csf;
			this.psf = psf;
		}

		private static class djkcomparator implements Comparator<DjikstraPair> {

			@Override
			public int compare(DjikstraPair arg0, DjikstraPair arg1) {
				return arg1.csf - arg0.csf;
			}

		}

		@Override
		public String toString() {
			return this.psf + "@" + this.csf;
		}
	}

	public Graph prings(){
		Graph g= new  Graph();
		
		HashMap<String, PrimsPair> hm = new HashMap<>();
		GenericHeap<PrimsPair> heap = new GenericHeap<>(PrimsPair.compt);

		ArrayList<String> vnames = new ArrayList<>(vces.keySet());
		for (String vname : vnames) {
			PrimsPair pair = new PrimsPair(vname, null, Integer.MAX_VALUE);

			hm.put(vname, pair);
			heap.add(pair);

		}

		while(heap.size()!=0){
			PrimsPair rp= heap.removeHP();
			
//			if(rp.atv.equals(null)){     // cannot use
			
			if(rp.atv==null){
				g.addVertex(rp.vname);
			}else{
				g.addVertex(rp.vname);
				g.addEdge(rp.vname, rp.atv, rp.ctav);
			}
			
			ArrayList<String> nbrnames = new ArrayList<>(vces.get(rp.vname).nbrs.keySet());
			for(String nbrname: nbrnames){
//				if(g.containsVertex(nbrname)){
//					continue;
//				}
				PrimsPair np = hm.get(nbrname);
				int ocf = np.ctav;
				int ncf= vces.get(rp.vname).nbrs.get(np.vname);
				if(ocf>ncf){
					np.ctav = ncf;
					np.atv= rp.vname;
					heap.updatePriority(np);
				}
			}
		}
		return g;
	}

	private static class PrimsPair {
		String vname;
		String atv; // acquired through vertex
		int ctav; // cost through av
		private static final primscomparator compt = new primscomparator();

		PrimsPair(String vname, String atv, int ctav) {
			this.vname = vname;
			this.atv = atv;
			this.ctav = ctav;
		}

		private static class primscomparator implements Comparator<PrimsPair> {

			@Override
			public int compare(PrimsPair arg0, PrimsPair arg1) {
				return arg1.ctav - arg0.ctav;
			}

		}

		// @Override
		// public String toString(){
		// return this.psf+ "@" + this.csf;
		// }
	}

	public boolean isbarpitite(){

		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, String> processed = new HashMap<>();

		ArrayList<String> vnames = new ArrayList<>(vces.keySet());
		for (String vname : vnames) {
			if (processed.containsKey(vname)) {
				continue;
			}
			Pair pair = new Pair(vname, vces.get(vname), vname);
			pair.colour="red";
			queue.addLast(pair);
			while (queue.size() != 0) {
				pair = queue.removeFirst();
				
				if (processed.containsKey(pair.vname)) {
					String oldcolour = processed.get(pair.vname);
					String newcolour = pair.colour;
					if(!oldcolour.equals(newcolour)){
						return false;
					}
					continue;
				}
				processed.put(pair.vname, pair.colour);

				ArrayList<String> nbrnames = new ArrayList<>(pair.vtx.nbrs.keySet());
				for (String nbrname : nbrnames) {
					if (!processed.containsKey(nbrname)) {
						Pair newpair = new Pair(nbrname, vces.get(nbrname), pair.psf + nbrname);
						if(pair.colour.equals("red")){
							newpair.colour = "green";
						}else{
							newpair.colour = "red";
						}		
						queue.addLast(newpair);
					}
				}
			}
		}
		return true;
	}

}
