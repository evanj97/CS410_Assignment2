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
        return adaptee.senseTemperature();
    }

    @Override
    public String readReport()
    {
        return adaptee.getTempReport();
    }

    @Override
    public String readName()
    {
        return adaptee.getSensorType();
    }
}
