package bakerg;

public enum MaterialsEnum {
	
	IRON(10,20,"iron"),
	HYDROGEN(1,5,"hydrogen");
	
	public double density,
			   theromoconductance;
	public String tag;
	
	private MaterialsEnum(int density, int thermoconductance, String tag) {
		this.density = density;
		this.theromoconductance = thermoconductance;
		this.tag = tag;
	}
	
	public double densityThermoconducatanceRatio() {
		return density/theromoconductance;
	}
	public static MaterialsEnum getType(String tag) {		
		MaterialsEnum[] materials = MaterialsEnum.values();
		for(int i=0;i<materials.length;i++) {
			if(materials[i].tag.equalsIgnoreCase(tag)) {
				return materials[i];
			}
		}
		return null;
	}
}
