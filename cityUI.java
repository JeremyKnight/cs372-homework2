/**
 * this class creates the cityUI and creates how the city is supposed to look
 * @author Jeremy Knight
 */

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class cityUI extends JFrame {
    /**
     * initializes the city, and how it looks
     */
    JPanel jp1;
    JPanel jp2;

    public cityUI() {
        
        setTitle("Jeremy's city");
        setSize(500, 500);

        jp1 = new JPanel();
        jp2 = new JPanel();
        JLabel label1 = new JLabel("City Hall");
        JLabel label2 = new JLabel("School");

        jp1.setBackground(Color.darkGray);
        jp1.add(label1);
        jp1.setLayout(new GridBagLayout());
        
        jp2.setBackground(Color.darkGray);
        jp2.add(label2);
        jp2.setLayout(new GridBagLayout());

        createPersons(jp1);
        createPersons(jp2);
        
        JPanel panel = new JPanel(new GridLayout(1,4,100,4));

        panel.add(jp1);
        panel.add(jp2);

        this.getContentPane().add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        MouseListener mouse = new MouseListener() {
        
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mouse has been realesed");
            }
        
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mouse has been pressed");
            }
        
            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("mouse exited at: " + e.getX());
            }
        
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("mouse entered at: " + e.getX());
            }
        
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getX()<=200){
                    jp1.setBackground(Color.GRAY);
                    jp2.setBackground(Color.DARK_GRAY);
                } else if(e.getX()>=300) {
                    jp2.setBackground(Color.gray);
                    jp1.setBackground(Color.DARK_GRAY);
                } else{
                    jp1.setBackground(Color.DARK_GRAY);
                    jp2.setBackground(Color.DARK_GRAY);
                }
                System.out.println("Mouse has been clicked");
            }
        };

        this.addMouseListener(mouse);
    }

    /**
     * @param panel persons are added to type person.
     */
    private void createPersons(JPanel panel) {
        for(int y=0; y<11; y++) {
            for(int x=0; x<4; x++) {
                Person person = new Person("bob", 22, 8053287866L);
                PersonUI p = new PersonUI(person);
                p.setBackground(Color.darkGray);
                //panel.add(p);
                p.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                //p.add(new JLabel(person.getName()));

                GridBagConstraints gbc = new GridBagConstraints();

                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.gridx = x;
            
                gbc.gridy = y+1;
            
                //gbc.weightx = 5.0;
                //gbc.weighty = 5.0;
                gbc.insets = new Insets(10, 10, 0, 10);
                //gbc.insets = new Insets(0, 0, 0, 5);
                //gbc.insets = new Insets(top, left, bottom, right)
                //gbc.gridwidth = 5;
                //gbc.gridheight= 5;

                panel.add(p, gbc);
            }
        }
    }

    
}