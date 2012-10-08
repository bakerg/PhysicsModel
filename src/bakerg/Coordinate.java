package bakerg;

public class Coordinate {
	public static double getCartesianX(double r, double b) {
		return r * Math.cos(b);
	}
	public static double getCartesianY(double r, double b) {
		return r * Math.sin(b);
	}
	public static double getPolarRadius(double x, double y) {
		return Math.sqrt((x * x)+(y*y));
	}
	public static double getPolarBearing(double x, double y) {
		return Math.atan2(y, x);
	}
}
