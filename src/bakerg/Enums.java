package bakerg;


public class Enums {
	private static Materials materials;
	public enum Materials {
		IRON
	}
	public Material getMaterial() {
		switch(materials) {
		case IRON:
			return new MaterialIron();
		default:
			return new MaterialIron();
		}
		
	}
}
