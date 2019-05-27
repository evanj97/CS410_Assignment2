package srcPackage;

import sensor.PressureSensor;
import sensor.RadiationSensor;
import sensor.TemperatureSensor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class SensorApplication extends JFrame
{

    public SensorApplication()
    {
        setTitle("Sensor Tracker");
        setLayout(new GridLayout(3, 1));

        JPanel temperaturePnl = new JPanel();
        temperaturePnl.setBorder(new TitledBorder("Temperature")); // initialize temperature panel
        add(temperaturePnl);
        temperaturePnl.setLayout(new GridLayout(2, 1));

        JProgressBar temperatureBar = new JProgressBar(0, 400);
        temperaturePnl.add(temperatureBar);
        JLabel temperatureLbl = new JLabel("Message --> VAL "); // initialize temperature bar and label
        temperaturePnl.add(temperatureLbl);


        JPanel radiationPnl = new JPanel();
        radiationPnl.setBorder(new TitledBorder("Radiation")); // initialize radiation panel
        add(radiationPnl);
        radiationPnl.setLayout(new GridLayout(2, 1));

        JProgressBar radiationBar = new JProgressBar(0, 6);
        radiationPnl.add(radiationBar);
        JLabel radiationLbl = new JLabel("Message --> VAL ");// initialize radiation bar and label
        radiationPnl.add(radiationLbl);


        JPanel pressurePnl = new JPanel();
        pressurePnl.setBorder(new TitledBorder("Pressure")); // initialize pressure panel
        add(pressurePnl);
        pressurePnl.setLayout(new GridLayout(2, 1));

        JProgressBar pressureBar = new JProgressBar(0, 10);
        pressurePnl.add(pressureBar);
        JLabel pressureLbl = new JLabel("Message --> VAL "); // initialize pressure bar and label
        pressurePnl.add(pressureLbl);

        // Initialize sensor adapters
        Sensor[] sensors = {
                new TemperatureSensorAdapter(new TemperatureSensor()),
                new RadiationSensorAdapter(new RadiationSensor()),
                new PressureSensorAdapter(new PressureSensor())
        };

        // store sensor values and reports
        double[] sensorValues = {sensors[0].readValue(), sensors[1].readValue(), sensors[2].readValue()};
        String[] sensorReports = {sensors[0].readReport(), sensors[1].readReport(), sensors[2].readReport()};

        // update labels and bars with stored sensor values and reports
        temperatureLbl.setText(sensorReports[0] + "-->" + sensorValues[0]);
        temperatureBar.setValue((int) sensorValues[0]);

        radiationLbl.setText(sensorReports[1] + "-->" + sensorValues[1]);
        radiationBar.setValue((int) sensorValues[1]);

        pressureLbl.setText(sensorReports[2] + "-->" + sensorValues[2]);
        pressureBar.setValue((int) sensorValues[2]);

        // initialize window
        setPreferredSize(new Dimension(600, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public static void main(String[] args)
    {
        SensorApplication app = new SensorApplication();
    }

}
