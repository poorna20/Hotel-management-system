
package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem i1,i2,i3,i4;
    
    public Dashboard(){
        mb=new JMenuBar();
        add (mb);
        
        m1=new JMenu("Hotel Management");
        mb.add(m1);
        m1.setForeground(Color.BLACK);
        m1.setFont(new Font("serif",Font.PLAIN,20));
        
        ImageIcon im  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/main.jpg"));
        Image im2=im.getImage().getScaledInstance(1950,1000,Image.SCALE_DEFAULT);
        ImageIcon im3=new ImageIcon(im2);
        JLabel l1=new JLabel(im3);
        l1.setBounds(0,0,1950,1000);
        add(l1);        
        
        m2=new JMenu("Admin");
        mb.add(m2);
        m2.setForeground(Color.BLACK);
        m2.setFont(new Font("serif",Font.PLAIN,20));
        
        i1=new JMenuItem("Reception");
        m1.add(i1);
        i1.addActionListener(this);
        
        i2=new JMenuItem("Add Employee");
        m2.add(i2);
        i2.addActionListener(this);
        
        i3=new JMenuItem("Add Rooms");
        m2.add(i3);
        i3.addActionListener(this);
        
        i4=new JMenuItem("Add Driver");
        m2.add(i4);
        i4.addActionListener(this);
                
        mb.setBounds(0,0,1950,60);
        
        JLabel l3=new JLabel("Hablis Hotels");
        l3.setFont((new Font("javassoul", Font.PLAIN,80)));
        l3.setForeground(Color.RED);
        l3.setBounds(600,200,700,110);
        l1.add(l3);

        JLabel l2=new JLabel("Come, Stay, Enjoy your day!");
        l2.setFont((new Font("javassoul", Font.PLAIN,30)));
        l2.setForeground(Color.ORANGE);
        l2.setBounds(630,300,700,50);
        l1.add(l2);
        
        setLayout(null);
        setBounds(0,0,1950,1000);
        setVisible(true);
        
    }
    
 
    public void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals("Reception")){
            new Reception().setVisible(true);

        }else if (ae.getActionCommand().equals("Add Employee")){
            new AddEmployee().setVisible(true);
        }else if (ae.getActionCommand().equals("Add Rooms")){
            new AddRooms().setVisible(true);
        }else if (ae.getActionCommand().equals("Add Driver")){
            new AddDrivers().setVisible(true);
        }
    
    }
    public static void main(String[] args){
        new Dashboard().setVisible(true);
    }

}