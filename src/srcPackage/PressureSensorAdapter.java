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
