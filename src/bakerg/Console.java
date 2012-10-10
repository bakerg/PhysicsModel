package bakerg;

import bakerg.Enums.Materials;

public class Console {
	private static Materials materials;
	public static void handleString(String command) {
		command += " -";
		Material material = null;
		if(command.startsWith("add")) {
			int matStart = command.indexOf("-m:") + 3;
			String mat = command.substring(matStart, command.indexOf("-", matStart)-1);
			if(mat.equalsIgnoreCase("iron")) {
				material = Enums.getMaterial(materials.IRON);
			}
			int amountStart = command.indexOf("-a:") + 3;
			int amount = Integer.parseInt(command.substring(amountStart, command.indexOf("-", amountStart)-1));
			int xStart = command.indexOf("-x:") + 3;
			double x = Double.parseDouble(command.substring(xStart, command.indexOf("-", xStart)-1));
			int yStart = command.indexOf("-y:") + 3;
			double y = Double.parseDouble(command.substring(yStart, command.indexOf("-", yStart)-1));
			
			System.out.println("Amount: "+amount+" Material: "+mat+" X:"+x+" Y:"+y);
			ParticleController.addParticles(material, amount, x, y);
		}
	}
}
