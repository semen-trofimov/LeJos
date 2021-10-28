import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.CodeTemplate;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.SensorModes;
import lejos.robotics.SampleProvider;


public class SensorTest1 {
    public static void main(String [] args)
    {
        Port port = LocalEV3.get().getPort("S2");
        SensorModes sensor = new EV3UltrasonicSensor(port);
        SampleProvider distance= sensor.getMode("Distance");
        CodeTemplate.SomeMode distance;
        float[] sample = new float[distance.sampleSize()];
        while (true)
            distance.fetchSample(sample,0);
    }
}
