package bakerg;

public class Orbit {
	public static double getVelocity(double m, double r) {
		return Math.sqrt((Gravity.getG() * m) / r);
	}
	public static double getAcceleration(double m, double r) {
		return (Gravity.getG() * m) / (r * r);
	}
}
