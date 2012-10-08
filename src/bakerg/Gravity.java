package bakerg;

public class Gravity {
	private static final double G = 6.67E-11; //The universal constant for gravity to 2 significant figures
	public static double getForce(double m1, double m2, double r) { //m1 = mass1 (kg), m2 = mass2 (kg), r = distance between the centres of gravity of the two objects (m)
		return G * ((m1 * m2) / (r * r));
	}
}
