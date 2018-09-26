package Aug12;

public class GraphClient {

	public static void main(String[] args) {
		Graph g = new Graph();
		
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addVertex("F");
		g.addVertex("G");
	
		g.addEdge("A", "B", 10);
		g.addEdge("A", "D", 40);
		g.addEdge("B", "C", 10);
		g.addEdge("C", "D", 10);
		g.addEdge("D", "E", 2);
		g.addEdge("E", "F", 3);
//		g.addEdge("E", "G", 8);
		g.addEdge("F", "G", 3);
	
//		g.display();
//		System.out.println(g.hasPath("A", "G"));
//		g.removeEdge("D", "E");
//		g.removeEdge("A", "B");
//		g.removeEdge("E", "G");
//		System.out.println(g.hasPath("A", "G"));

//		System.out.println(g.hasPathAll("A", "G"));
//		g.removeEdge("D", "E");
//		System.out.println(g.hasPathAll("A", "G"));
//	
//		System.out.println(g.dfs("A", "G"));
//		g.removeEdge("D", "E");
//		System.out.println(g.dfs("A", "G"));
//		
//		System.out.println(".................");
//		
//		System.out.println(g.bfs("A", "G"));
//		g.removeEdge("D", "E");
//		System.out.println(g.bfs("A", "G"));
//		
//		g.dft();
//		System.out.println(".................");	
//	g.bft();
//	
//	System.out.println(g.isConnected());
//	System.out.println(g.isCyclic());
//	System.out.println(g.getConnectedComponents());
//	
//	System.out.println(g.djikstra("A"));
//	g.prings().display();
//	Graph g1 = g.prings();
//	g1.display();
	System.out.println(g.isbarpitite());
	}

}
