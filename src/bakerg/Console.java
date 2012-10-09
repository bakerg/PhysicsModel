package bakerg;

import bakerg.Enums.Materials;

public class Console {
	private static Materials materials;
	public static void handleString(String command) {
		command += " -";
		if(command.startsWith("add")) {
			int matStart = command.indexOf("-m:") + 3;
			String mat = command.substring(matStart, command.indexOf("-", matStart)-1);
			if(mat.equalsIgnoreCase("iron")) {
				Material material = Enums.getMaterial(materials.IRON);
			}
			int amountStart = command.indexOf("-a:") + 3;
			int amount = Integer.parseInt(command.substring(amountStart, command.indexOf("-", amountStart)-1));
			System.out.println("Amount: "+amount+" Material: "+mat);
		}
	}
}
