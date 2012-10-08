package bakerg;

public class Particle {
	private double density;
	public Particle(Material material) {
		density = material.getDensity();
	}
}
