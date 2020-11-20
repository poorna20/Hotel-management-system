
package hotel.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*:

import net.proteanit.sql.*;

public class Room extends JFrame implements ActionListener {
    
    JTable t1;
    JButton b1,b2;
    
    Room(){
        
        t1=new JTable();
        t1.setBounds(0,40,500,400);
        add(t1);
        
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/room.jpg"));
                Image i3 = i1.getImage().getScaledInstance(400, 400,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l15 = new JLabel(i2);
                l15.setBounds(460,0,500,600);
                add(l15);
   
        
        
        JLabel l1=new JLabel("Room No.");
        l1.setBounds(10,10,100,20);
        add(l1);
        
        JLabel l2=new JLabel("Availability");
        l2.setBounds(120,10,60,20);
        add(l2);
        
        JLabel l3=new JLabel("Status");
        l3.setBounds(230,10,60,20);
        add(l3);
        
        JLabel l4=new JLabel("Price");
        l4.setBounds(300,10,60,20);
        add(l4);
        
        JLabel l5=new JLabel("Bed type");
        l5.setBounds(400,10,60,20);
        add(l5);
        
        
        b1=new JButton("Display data");
        b1.setBounds(100,460,120,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Back");
        b2.setBounds(250,460,120,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this)
        add(b2);
        
        
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        setBounds(450,200,1040,600);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==b1){
            try{
                conn c=new conn();
                String str="select * from room";
                ResultSet rs=c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e)
            
        }
        else if (ae.getSource()==b2){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
        
    }
    
    public static void main(String[] args){
        new Room().setVisible(true);
    }
    
}
