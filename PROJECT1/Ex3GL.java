import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowListener;

public class Ex3GL {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton b1 = new JButton("one");
        JButton b2 = new JButton("two");
        JButton b3 = new JButton("three");
        JButton b4 = new JButton("four");
        JButton b5 = new JButton("five");
        JButton b6 = new JButton("six");

        //setting the frame to GridLayout
        frame.setLayout(new GridLayout(2, 3));

        //NOTE:
        // when the buttons are added to the GridLayout, their preferred sizes are overridden,
        // and the grid cells are distributed equally to accommodate the buttons.
        //solution: use an intermediate panel for each button and set the layout of that panel

        //panels for each button
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel();

        //adding the buttons to the panels and setting their preferred sizes
        b1.setPreferredSize(new Dimension(100, 50));
        p1.add(b1);

        b2.setPreferredSize(new Dimension(100, 100));
        p2.add(b2);

        b3.setPreferredSize(new Dimension(100, 45));
        p3.add(b3);

        b4.setPreferredSize(new Dimension(150, 40));
        p4.add(b4);

        b5.setPreferredSize(new Dimension(60, 60));
        p5.add(b5);


        b6.setPreferredSize(new Dimension(100, 100));
        p6.add(b6);

        //adding the panels to the frame
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);
        frame.add(p5);
        frame.add(p6);

        //setting the frame size
        frame.setSize(400, 400);

        //setting the frame to close on exit
        frame.addWindowListener(new MyWindowListener());

        //setting the frame to visible
        frame.setVisible(true);
    }
}
