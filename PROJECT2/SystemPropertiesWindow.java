import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.Timer;


public class SystemPropertiesWindow {
    public static void main(String[] args) {

        JFrame frame = new JFrame("System Properties");

        //create 6 diffents panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel();

        //set the layout of the frame
        frame.setLayout(new GridLayout(2, 3));

        //create 7 diffents labels
        JLabel l1 = new JLabel(new Date().toString(), JLabel.CENTER);
        //make the time label update with the current time every second
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new UpdateTime(l1), 0, 100);


        JLabel l2 = new JLabel("Java version: " + System.getProperty("java.version"), JLabel.CENTER);
        JLabel l3 = new JLabel("Java home: " + System.getProperty("java.home"), JLabel.CENTER);
        JLabel l4 = new JLabel("OS arch: " + System.getProperty("os.arch"), JLabel.CENTER);
        JLabel l5 = new JLabel("Username: " + System.getProperty("user.name"), JLabel.CENTER);
        JLabel l6 = new JLabel("CWD: " + System.getProperty("user.dir"), JLabel.CENTER);

        //add the labels to the panels
        p1.add(l1);
        p2.add(l2);
        p3.add(l3);
        p4.add(l4);
        p5.add(l5);
        p6.add(l6);


        //set the background color of the panels
        p1.setBackground(Color.gray);
        p2.setBackground(Color.lightGray);

        //add the panels to the frame
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);
        frame.add(p5);
        frame.add(p6);


        //close the frame with an event listener
        frame.addWindowListener(new MyWindowListener());

        //set the size of the frame
        frame.setSize(700, 360);

        //set the frame visible
        frame.setVisible(true);

    }

}
