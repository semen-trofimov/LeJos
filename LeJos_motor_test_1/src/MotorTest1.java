import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;
import lejos.hardware.Button;
import lejos.hardware.lcd.*;

public class MotorTest1 {
    public static void main(String [] args)
    {   
    	System.out.println("hello world");
    	RegulatedMotor m = new EV3LargeRegulatedMotor(MotorPort.A);
    	m.setSpeed(600);
    	LCD.drawString("Run Motor test", 0, 0);
    	Delay.msDelay(1000);
    	LCD.drawString("Press UP key, motor forward run ", 0, 0);
    	Button.UP.waitForPressAndRelease();
        m.forward();
        Delay.msDelay(5000);
        m.stop();
        LCD.drawString("Press down key, motor backward run ", 0, 0);
    	Button.DOWN.waitForPressAndRelease();
        m.backward();
        Delay.msDelay(5000);
        m.stop();
    }

}
