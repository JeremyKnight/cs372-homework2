/**
 * this class creates the cityUI and creates how the city is supposed to look
 */

import java.awt.*;
import javax.swing.*;

public class cityUI extends JFrame {
    /**
     * initializes the city, and how it looks
     */
    public cityUI() {
        /*
        //JFrame frame = new JFrame("Jeremy's City");
        setTitle("Jeremy's city");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        //setBounds(100, 100, 500, 500); 
        frame.setSize(500,500);
        setVisible(true);

        JPanel panel = new JPanel();

        setLayout(new BorderLayout());
        panel.add(new JButton("City Hall"),BorderLayout.NORTH);
        /*
        frame.add(new JButton("Walmart"),BorderLayout.SOUTH);
        frame.add(new JButton("School"),BorderLayout.WEST);
        frame.add(new JButton("Gym"),BorderLayout.EAST);
        frame.add(new JLabel("grass goes here"),BorderLayout.CENTER);
        */

        setTitle("Jeremy's city");
        setSize(400, 400);

        // Create JButton and JPanel
        JButton button1 = new JButton("City Hall");
        JButton button2 = new JButton("School");
        JButton button3 = new JButton("Walmart");
        JButton button4 = new JButton("Gym");

        //setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(button1, BorderLayout.WEST);
        panel.add(button2, BorderLayout.EAST);
        panel.add(button3, BorderLayout.NORTH);
        panel.add(button4, BorderLayout.SOUTH);


        // Add button to JPanel
        //panel.add(button);
        // And JPanel needs to be added to the JFrame itself!
        this.getContentPane().add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}