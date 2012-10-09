package bakerg;

import javax.swing.JOptionPane;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class EventHandler {
	public static void pollInput() {
		while(Keyboard.next()) {
			if(Keyboard.getEventKey() == Keyboard.KEY_RETURN) {
				Console.handleString(JOptionPane.showInputDialog("Enter Command"));
			}
		}
	}
	public static int getKeyPressed() {
		return Keyboard.getEventKey();
	}
	public static int getMouseX() {
		return Mouse.getX();
	}
	public static int getMouseY() {
		return Mouse.getY();
	}
	public static int getMouseKeyClicked() {
		return Mouse.getEventButton();
	}
}
