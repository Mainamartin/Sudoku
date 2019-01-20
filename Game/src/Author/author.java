
package Author;

import Modules.Classes;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class author extends JFrame{
    JLabel pic, Head;
    JTextArea about;
    JButton ok;
    public author(){
        setLayout(null);
        setSize(500, 300);
        setTitle("About the Programmer");
        setResizable(false);
        
        
        pic =  new JLabel();
        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Author/Author.png"))); 
        pic.setBounds(20, 42, 200, 200);
        
        Head = new JLabel("Martin Maina");
        Head.setBounds(10, 0, 200, 40);
        Head.setForeground(Classes.green);
        Head.setFont(Classes.handwritinghead);
        Head.setBorder(Classes.labelBorder);
        
        
        about = new JTextArea();
        about.setText("Martin loves programming for fun and of \ncourse"
                + " making something meaningful.\n Get to him? : mail martinmaina806@gmail.com"
                );
        about.setEditable(false);
        about.setBackground(Classes.lightGray);
        about.setForeground(Classes.black);
        about.setFont(Classes.handwritingsmall);
        about.setBounds(230, 50, 270, 150);
        ok = new JButton("Ok");
        ok.addActionListener((ActionEvent evt) -> {
            OK(evt);
        });
        ok.setForeground(Classes.blue);
        ok.setBounds(270, 220, 80, 30);
        add(pic);
        add(Head);
        add(about);
        add(ok);
        setVisible(true);
        java.awt.Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
	
    }
    private void OK(ActionEvent evt){
        dispose();
    }
    
    public static void main(String[] args){
        new author();
    }
    
}
