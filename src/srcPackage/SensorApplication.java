package srcPackage;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class SensorApplication extends JFrame
{

    public SensorApplication()
    {
        setTitle("Sensor Tracker");
        setLayout(new GridLayout(3, 1));

        JPanel temperaturePnl = new JPanel();
        temperaturePnl.setBorder(new TitledBorder("Temperature")); // instantiate temperature panel
        add(temperaturePnl);

        JPanel radiationPnl = new JPanel();
        radiationPnl.setBorder(new TitledBorder("Radiation")); // instantiate radiation panel
        add(radiationPnl);

        JPanel pressurePnl = new JPanel();
        pressurePnl.setBorder(new TitledBorder("Pressure")); // instantiate pressure panel
        add(pressurePnl);



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
