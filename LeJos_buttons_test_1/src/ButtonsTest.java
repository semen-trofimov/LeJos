import lejos.hardware.Sound;
import lejos.hardware.lcd.LCD;
import lejos.hardware.Button;
import lejos.utility.Delay;

public class ButtonsTest {
    public static void main(String[] args)
    {
        LCD.drawString("test button", 0, 0);
        Delay.msDelay(1000);
        Button.ENTER.waitForPressAndRelease();
        Sound.beep();
        Button.LEFT.waitForPressAndRelease();
        Sound.beep();
        Button.RIGHT.waitForPressAndRelease();
        Sound.beep();
        Button.DOWN.waitForPressAndRelease();
        Sound.beep();
        Button.ESCAPE.waitForPressAndRelease();
        Sound.beep();

    }
}
