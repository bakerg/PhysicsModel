package bakerg;

public class Gravity {
	public static double getForce(double m1, double m2, double r, double G) {
		double F = G * ((m1 * m2) / (r * r));
		return F;
	}
}
