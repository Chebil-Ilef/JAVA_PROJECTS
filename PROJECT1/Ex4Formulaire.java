import javax.swing.*;
import java.awt.*;

public class Ex4Formulaire {
    public static void main(String args[]) {

        JFrame frame = new JFrame();
        // set the layout of the frame to BorderLayout
        frame.setLayout(new BorderLayout());

        // adding four panels to the frame
        JPanel pNorth = new JPanel();
        JPanel pCenter = new JPanel();
        JPanel pCommandes = new JPanel();

        // adjusting the size of the panels
        pNorth.setPreferredSize(new Dimension(400, 200));
        pCenter.setPreferredSize(new Dimension(600, 20));
        pCommandes.setPreferredSize(new Dimension(400, 100));

        // adding two panels to pNorth
        JPanel c1 = new JPanel();
        JPanel c2 = new JPanel();
        c1.setPreferredSize(new Dimension(200, 50));
        c2.setPreferredSize(new Dimension(200, 50));
        pNorth.setLayout(new BoxLayout(pNorth, BoxLayout.Y_AXIS)); // Use BoxLayout for stacking panels vertically
        pNorth.add(c1);
        pNorth.add(c2);

        // adding 3 labels and textfields to c1
        c1.setLayout(new GridLayout(3, 2)); // Use GridLayout for arranging components in a grid
        JLabel labelNom = new JLabel("Nom");
        JTextField textFieldNom = new JTextField(10);
        c1.add(labelNom);
        c1.add(textFieldNom);

        JLabel labelPrenom = new JLabel("Prenom");
        JTextField textFieldPrenom = new JTextField(10);
        c1.add(labelPrenom);
        c1.add(textFieldPrenom);

        JLabel labelAdresse = new JLabel("Adresse");
        JTextField textFieldAdresse = new JTextField(10);
        c1.add(labelAdresse);
        c1.add(textFieldAdresse);

        // setting the colors of the panels
        c1.setBackground(Color.GREEN);
        c2.setBackground(Color.GREEN);

        // adding a two choice buttons to c2 with a label
        c2.setLayout(new FlowLayout(FlowLayout.CENTER)); // Use FlowLayout with left alignment
        c2.add(new JLabel("Sexe", JLabel.LEFT));
        JRadioButton m = new JRadioButton("Masculin");
        m.setBackground(Color.GREEN);
        m.setSize(200, 25);
        c2.add(m);
        JRadioButton f = new JRadioButton("Feminin");
        f.setBackground(Color.GREEN);
        f.setSize(200, 25);
        c2.add(f);

        // adding a label filiere and a combobox to pCenter
        pCenter.setLayout(new FlowLayout(FlowLayout.LEFT)); // Use FlowLayout with left alignment
        pCenter.add(new JLabel("Filiere", JLabel.LEFT));

        // Create a nested panel for the JComboBox
        JPanel comboBoxPanel = new JPanel();
        comboBoxPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        comboBoxPanel.setPreferredSize(new Dimension(100, 20)); // Set preferred size

        // Use JComboBox for a drop-down list
        JComboBox<String> filiere = new JComboBox<String>();
        filiere.addItem("GL");
        filiere.addItem("RT");
        filiere.addItem("IIA");
        filiere.addItem("IMI");
        filiere.setPreferredSize(comboBoxPanel.getPreferredSize()); // Set the preferred size of the JComboBox
        comboBoxPanel.add(filiere); // Add the JComboBox to the nested panel

        pCenter.add(comboBoxPanel); // Add the nested panel to the pCenter





        // adding three buttons to pCommandes
        pCommandes.setLayout(new FlowLayout(FlowLayout.CENTER)); // Use FlowLayout with center alignment
        pCommandes.add(new JButton("Clear"));
        pCommandes.add(new JButton("Envoyer"));
        pCommandes.add(new JButton("Quit"));

        // setting the colors of the panels
        pCenter.setBackground(Color.YELLOW);
        pCommandes.setBackground(Color.CYAN);

        // adding panels to the frame
        frame.add(pNorth, BorderLayout.NORTH);
        frame.add(pCenter, BorderLayout.CENTER);
        frame.add(pCommandes, BorderLayout.SOUTH);

        // setting the size of the frame
        frame.setSize(600, 400);

        // setting the frame to close on exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // setting the frame to visible
        frame.setVisible(true);
    }
}
