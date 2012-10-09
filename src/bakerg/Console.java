package bakerg;

public class Console {
	public static void handleString(String command) {
		if(command.startsWith("add")) {
			int material = command.indexOf("-m:") + 3;
			String mat = command.substring(material, command.indexOf("-", material));
			mat = mat.toUpperCase();
			
		}
	}
}
