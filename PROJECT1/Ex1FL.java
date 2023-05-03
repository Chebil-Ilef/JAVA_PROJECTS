import javax.swing.*;
import java.awt.*;

class Ex1FL
{
    public static void main(String args[])
    {
        JFrame frame=new JFrame();
        JButton b1=new JButton("one");
        JButton b2=new JButton("two");
        JButton b3=new JButton("three");
        JButton b4=new JButton("four");
        JButton b5=new JButton("five");

        b1.setPreferredSize(new Dimension(100, 50));
        //Set the color of the button
        b1.setBackground(Color.GRAY);
        b2.setPreferredSize(new Dimension(100, 100));
        b3.setPreferredSize(new Dimension(100, 45));
        b4.setPreferredSize(new Dimension(150, 40));
        b5.setPreferredSize(new Dimension(60, 60));
        b5.setBackground(Color.YELLOW);

        //adding the buttons to the frame
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);

        //set the color of the frame
        frame.getContentPane().setBackground(Color.BLUE);

        //setting the frame to flowlayout
        frame.setLayout(new FlowLayout());

        //setting the size of the frame
        frame.setSize(350, 300);

        //setting the frame to close on exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setting the frame to visible
        frame.setVisible(true);
    }
}