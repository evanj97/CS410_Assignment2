package srcPackage;

import sensor.PressureSensor;

public class PressureSensorAdapter implements Sensor
{
    private PressureSensor adaptee;

    public PressureSensorAdapter(PressureSensor pressureSensor)
    {
        this.adaptee = pressureSensor;
    }

    @Override
    public double readValue()
    {
        return adaptee.readValue();
    }

    @Override
    public String readReport()
    {
        return adaptee.getReport();
    }

    @Override
    public String readName()
    {
        return adaptee.getSensorName();
    }
}
