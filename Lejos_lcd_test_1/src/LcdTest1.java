import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;

public class LcdTest1 {
    public static void main(String[] args)
    {
        LCD.drawString("Hello from java LeJos!!!", 0,0);
        Delay.msDelay(1000);
    }
}
