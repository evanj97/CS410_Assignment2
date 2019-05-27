package srcPackage;

import sensor.TemperatureSensor;

public class TemperatureSensorAdapter implements Sensor
{
    private TemperatureSensor adaptee;

    public TemperatureSensorAdapter(TemperatureSensor temperatureSensor)
    {
        this.adaptee = temperatureSensor;
    }

    @Override
    public double readValue()
    {
        return 0;
    }

    @Override
    public String readReport()
    {
        return null;
    }

    @Override
    public String readName()
    {
        return null;
    }
}
