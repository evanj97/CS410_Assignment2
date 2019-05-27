package srcPackage;

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

        JProgressBar temperatureBar = new JProgressBar(0, 500);
        temperaturePnl.add(temperatureBar);
        JLabel temperatureLbl = new JLabel("Message --> VAL "); // initialize temperature bar and label
        temperaturePnl.add(temperatureLbl);


        JPanel radiationPnl = new JPanel();
        radiationPnl.setBorder(new TitledBorder("Radiation")); // initialize radiation panel
        add(radiationPnl);
        radiationPnl.setLayout(new GridLayout(2, 1));

        JProgressBar radiationBar = new JProgressBar(0, 500);
        radiationPnl.add(radiationBar);
        JLabel radiationLbl = new JLabel("Message --> VAL ");// initialize radiation bar and label
        radiationPnl.add(radiationLbl);


        JPanel pressurePnl = new JPanel();
        pressurePnl.setBorder(new TitledBorder("Pressure")); // initialize pressure panel
        add(pressurePnl);
        pressurePnl.setLayout(new GridLayout(2, 1));

        JProgressBar pressureBar = new JProgressBar(0, 500);
        pressurePnl.add(pressureBar);
        JLabel pressureLbl = new JLabel("Message --> VAL "); // initialize pressure bar and label
        pressurePnl.add(pressureLbl);


        setPreferredSize(new Dimension(600, 600)); // initialize window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public static void main(String[] args)
    {
        SensorApplication app = new SensorApplication();
    }

}
