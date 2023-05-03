
import javax.swing.*;
import java.awt.*;

public class Ex2BL {
    public static void main(String args[]) {
        JFrame frame=new JFrame();

        JPanel p=new JPanel();
        JButton north=new JButton("North");
        north.setBackground(Color.GRAY);
        JButton south=new JButton("South");
        south.setBackground(Color.YELLOW);
        JButton east=new JButton("East");
        JButton west=new JButton("West");
        JButton center=new JButton("Center");


        //setting the panel to borderlayout BEFORE ADDING THE BUTTONS!!
        p.setLayout(new BorderLayout());

        //adding the buttons to the panel with borderlayout
        p.add(north, BorderLayout.NORTH);
        p.add(south, BorderLayout.SOUTH);
        p.add(east, BorderLayout.EAST);
        p.add(west, BorderLayout.WEST);
        p.add(center, BorderLayout.CENTER);

        //adding the panel to the frame
        frame.add(p);

        //setting the size of the frame
        frame.setSize(350, 300);

        /*setting the frame to close on exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/

        //Closing with a window listener
        frame.addWindowListener(new MyWindowListener());

        //setting the frame to visible
        frame.setVisible(true);


    }
}
