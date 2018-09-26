package july31;

import java.util.Comparator;

public class Car implements Comparable<Car> {

	private String name;
	private int price;
	private int speed;
	public static final CarSpeedComparator speedctor = new CarSpeedComparator();
	public static final CarSpeedRevComparator speedrevctor = new CarSpeedRevComparator();
	public static final CarPriceComparator pricector = new CarPriceComparator();
	public static final CarPriceRevComparator pricerevctor = new CarPriceRevComparator();
	public static final CarNameComparator namector = new CarNameComparator();
	public static final CarNameRevComparator namerevctor = new CarNameRevComparator();

	public Car(String name, int speed, int price) {
		this.name = name;
		this.speed = speed;
		this.price = price;
	}

	private static class CarSpeedComparator implements Comparator<Car> {

		@Override
		public int compare(Car arg0, Car arg1) {
			return arg0.speed - arg1.speed;
		}

	}

	private static class CarSpeedRevComparator implements Comparator<Car> {

		@Override
		public int compare(Car arg0, Car arg1) {
			return arg1.speed - arg0.speed;
		}

	}

	private static class CarPriceComparator implements Comparator<Car> {

		@Override
		public int compare(Car arg0, Car arg1) {
			return arg1.price-arg0.price;
		}

	}

	private static class CarPriceRevComparator implements Comparator<Car> {

		@Override
		public int compare(Car arg0, Car arg1) {
			return arg0.price-arg1.price;		}

	}

	private static class CarNameComparator implements Comparator<Car> {

		@Override
		public int compare(Car arg0, Car arg1) {
			return arg0.name.compareTo(arg1.name);
		}

	}

	private static class CarNameRevComparator implements Comparator<Car> {

		@Override
		public int compare(Car arg0, Car arg1) {
			return arg1.name.compareTo(arg0.name);
		}

	}

	@Override
	public int compareTo(Car other) {
		return this.speed - other.speed;
	}

	@Override
	public String toString() {
		return this.name + ", " + this.price + ", " + this.speed;
	}

}
