package bakerg;

public class Particle {
	public double x;
	public double y;
	private double bearing;
	private double radius;
	private double density;
	public Particle(Material material, double x, double y) {
		density = material.getDensity();
		this.x = x;
		this.y = y;
	}
	public void setRadius(double r) { //manually set the radius
		radius = r;
	}
	public void setBearing(double b) { //manually set the bearing
		bearing = b;
	}
	public void setPosition(double x, double y) { //set the particle to position (x,y)
		this.x = x;
		this.y = y;
		radius = Coordinate.getPolarRadius(x, y);
		bearing = Coordinate.getPolarBearing(x, y);
	}
	public void updatePosition() { // convert the coordinates of the particle into cartesian for rendering
		x = Coordinate.getCartesianX(radius, bearing);
		y = Coordinate.getCartesianY(radius, bearing);
	}
	public double getDensity() {
		return density;
	}
}
