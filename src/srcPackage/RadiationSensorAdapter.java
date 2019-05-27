package srcPackage;

import sensor.RadiationSensor;

public class RadiationSensorAdapter implements Sensor
{
    private RadiationSensor adaptee;

    public RadiationSensorAdapter(RadiationSensor radiationSensor)
    {
        this.adaptee = radiationSensor;
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
