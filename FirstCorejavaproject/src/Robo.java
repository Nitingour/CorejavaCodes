import java.awt.AWTException; 
import java.awt.Robot; 
import java.awt.event.KeyEvent; 
import java.io.*; 
  //Robot class example
public class Robo 
{ 
    public static void main(String[] args) throws IOException, 
                           AWTException, InterruptedException 
    { 
        String command = "notepad.exe"; 
        Runtime run = Runtime.getRuntime(); 
        run.exec(command); 
        try { 
               Thread.sleep(2000); 
        } 
        catch (InterruptedException e) 
        { 
            e.printStackTrace(); 
        } 
        // Create an instance of Robot class 
        Robot robot = new Robot(); 
     //  while(true)
       // robot.mouseMove(0, 0);
  
  // Press keys using robot. A gap of 
        // of 500 mili seconds is added after 
        // every key press 
        robot.keyPress(KeyEvent.VK_H); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_E); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_L); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_L); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_O); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_SPACE); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_F); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_R); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_O); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_M); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_SPACE); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_E); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_D); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_S); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_Y); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_T); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_A); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_N); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_G); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_O); 
         } 
} 