package bakerg;

import java.util.ArrayList;

public class ParticleController {
	public static ArrayList<Particle> particles = new ArrayList<Particle>();
	public static void addParticles(double density, double thermoconductance, int amount, double x, double y) {
		for(int i = 0; i < amount; i++) {
			particles.add(new Particle(density, thermoconductance, x, y));
		}
	}
	public static void removeParticle(Particle particle) {
		particles.remove(particle);
	}
	
}
