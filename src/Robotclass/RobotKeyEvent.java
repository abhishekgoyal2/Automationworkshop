package Robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotKeyEvent {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		 String command = "notepad.exe";
	        Runtime run = Runtime.getRuntime();
	        run.exec(command);
	        try {
	            Thread.sleep(2000);
	        }
	        catch (InterruptedException e)
	        {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_0);
		Thread.sleep(500);
		robot.keyRelease(KeyEvent.VK_0);
		robot.keyPress(KeyEvent.VK_1);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_0);
		Thread.sleep(500);
		robot.keyRelease(KeyEvent.VK_0);
		robot.keyPress(KeyEvent.VK_1);
		Thread.sleep(500);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_1);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_1);
		robot.keyPress(KeyEvent.VK_ENTER);
		
//		01 
		 
	}
	
}
