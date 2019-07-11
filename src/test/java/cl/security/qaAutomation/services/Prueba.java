package cl.security.qaAutomation.services;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Prueba {
	public static void main(String[] args) throws Exception {
	
	StringSelection stringSelection = new StringSelection("C:\\Users\\Matias Briso\\Desktop\\cencosud_test");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	Robot robot = new Robot();
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
}
