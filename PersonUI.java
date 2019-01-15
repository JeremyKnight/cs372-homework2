/**
 * This class creates the personUI that is used to dicplay a person
 * @author Jeremy Knight
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PersonUI extends JPanel{
    Person person;
    //the info panel unfortunutly never worked
    JPanel infoPanel;

    /**
    * initialize the personUI
    */
    public PersonUI(Person person) {

        this.person = person;
        infoPanel = new JPanel();

        JLabel JLabel1 = new JLabel(person.getName());
        //JLabel JLabel2 = new JLabel((String)person.getAge());
        //JLabel JLabel3 = new JLabel((String)person.getPhoneNumber());

        infoPanel.add(JLabel1);
        //infoPanel.add(JLabel2);
        //infoPanel.add(JLabel3);

        infoPanel.setBackground(new Color(0, 0, 0, 0));

        MouseListener mouse = new MouseListener(){
        
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mouse realesed in " + person.getName());
            }
        
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mouse pressed in " + person.getName());
            }
        
            @Override
            public void mouseExited(MouseEvent e) {
                infoPanel.setBackground(new Color(0, 0, 0, 0));

                System.out.println("mouse exited in " + person.getName());
            }
        
            @Override
            public void mouseEntered(MouseEvent e) {
                infoPanel.setBackground(new Color(0, 0, 0, 255));

                System.out.println("mouse entered in " + person.getName());
            }
        
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouse clicked in " + person.getName());
            }

            
        };
        this.addMouseListener(mouse);
    }




    
}