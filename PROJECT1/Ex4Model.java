import javax.swing.*;
import java.awt.*;

public class Ex4Model {
    public static void main(String args[]){
        JFrame frame= new JFrame();
        //set the layout of the frame to GridLayout
        frame.setLayout(new GridLayout(2,1));

        //adding a title to the frame
        frame.setTitle("Ex4Model");

        //creating two panels for the frame
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        //setting the colors of the panels
        p1.setBackground(Color.GREEN);
        p2.setBackground(Color.YELLOW);

        //adding buttons to the p1
        p1.add(new JButton("New"));
        p1.add(new JButton("Open"));
        p1.add(new JButton("Save"));
        p1.add(new JButton("Exit"));

        //adding a textarea to p2
        JTextArea textArea = new JTextArea("");
        textArea.setPreferredSize(new Dimension(300, 150));
        p2.add(textArea);

        //adding the panels to the frame
        frame.add(p1);
        frame.add(p2);

        //setting the size of the frame
        frame.setSize(400, 400);

        //setting the frame to close on exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setting the frame to visible
        frame.setVisible(true);

    }
}
