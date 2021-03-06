package bakerg;

public class Console {
	public static void handleString(String command) {
		command += " -";
		double x;
		double y;
		if(command.startsWith("add")) {
			int matStart = command.indexOf("-m:") + 3;
			String mat = command.substring(matStart, command.indexOf("-", matStart)-1);
			int amountStart = command.indexOf("-a:") + 3;
			int amount = Integer.parseInt(command.substring(amountStart, command.indexOf("-", amountStart)-1));
			if(command.indexOf("-x:") == -1) {
				x = 400;
			}else {
				int xStart = command.indexOf("-x:") + 3;
				x = Double.parseDouble(command.substring(xStart, command.indexOf("-", xStart)-1));
			}
			if(command.indexOf("-y:") == 1) {
				y = 300;
			}else {
				int yStart = command.indexOf("-y:") + 3;
				y = Double.parseDouble(command.substring(yStart, command.indexOf("-", yStart)-1));
			}	
			System.out.println("Amount: "+amount+" Material: "+MaterialsEnum.getType(mat).tag+" X:"+x+" Y:"+y);
			ParticleController.addParticles(MaterialsEnum.getType(mat).density, MaterialsEnum.getType(mat).theromoconductance, amount, x, y);
			
			
		}
	}
}
