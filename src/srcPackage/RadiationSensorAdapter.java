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
        return adaptee.getRadiationValue();
    }

    @Override
    public String readReport()
    {
        return adaptee.getStatusInfo();
    }

    @Override
    public String readName()
    {
        return adaptee.getName();
    }
}
