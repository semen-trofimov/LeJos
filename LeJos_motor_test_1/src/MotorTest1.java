import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class MotorTest1 {
    public static void main(String [] args)
    {
        RegulatedMotor m = new EV3LargeRegulatedMotor(MotorPort.A);
        m.rotate(360);
        Delay.msDelay(1000);
        m.stop();
    }

}
