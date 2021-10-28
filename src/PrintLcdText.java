import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;

public class PrintLcdText {
    public static void main(String[] args){
        LCD.drawString("hello!!!",0,0);
        Delay.msDelay(1000);
    }
}
