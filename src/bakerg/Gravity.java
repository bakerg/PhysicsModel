package bakerg;

public class Gravity {
	private static final double G = 6.67E-11; 
	public static double getForce(double m1, double m2, double r) {
		double F = G * ((m1 * m2) / (r * r));
		return F;
	}
}
