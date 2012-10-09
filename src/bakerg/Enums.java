package bakerg;


public class Enums {
	private static Materials materials;
	public enum Materials {
		IRON
	}
	public static Material getMaterial(Materials material) {
		switch(material) {
		case IRON:
			return new MaterialIron();
		default:
			return new MaterialIron();
		}
		
	}
}
