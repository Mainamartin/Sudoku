
package game;


import Author.author;
import Challenge.Challenge1;
import Help.hElp;
import StageOne.sudoku1;
import Modules.Classes;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Game extends JFrame{
    JPanel panelA, panelB, panelC, panelD;
    JDesktopPane pane;
    JMenuBar menubar;
    JMenuItem exit,  Help;
    JButton easy, help, challenge, author; 
    
    public Game(){
      
        setSize(300, 300);
        setTitle("Sudoku Pro");
        setResizable(false);
        setLayout(new GridLayout(2, 2));
        
        easy = new JButton("Start");
        easy.addActionListener((ActionEvent evt) -> {
            easyAction(evt);
        });
        
        help = new JButton("Help");
        help.addActionListener((ActionEvent evt) -> {
            HelpAction(evt);
        });
        challenge = new JButton("Challenge");
        challenge.addActionListener((ActionEvent evt) -> {
            challengeA(evt);
        });
        author = new JButton("Author");
        author.addActionListener((ActionEvent evt) -> {
            authorAction(evt);
        });
        panelA = new JPanel();
        panelA.setSize(100, 100);
        panelA.add(easy);
        panelB = new JPanel();
        panelB.setSize(100, 100);
        panelB.add(help);
        panelC = new JPanel();
        panelC.add(challenge);
        panelC.setSize(100, 100);
        panelD = new JPanel();
        panelD.add(author);
        panelD.setSize(100, 100);
       
        add(panelA);
        add(panelB);
        add(panelC);
        add(panelD);

        setVisible(true);

        PLAY();
        java.awt.Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	 
    }
    
    private void exitWhat(ActionEvent evt){
        System.exit(0);
    }
  
    private void HelpAction(ActionEvent evt){
        hElp h = new hElp();
        h.setVisible(true);
    }
    private void authorAction(ActionEvent evt){
        author a = new author();
        a.setVisible(true);
    }
    private void easyAction(ActionEvent evt){
        dispose();
        sudoku1 s = new sudoku1();
        s.setVisible(true);
    }
   
    private void challengeA(ActionEvent evt){
        dispose();
        new Challenge1();
    }
    private void PLAY(){
        JButton[] but ={ easy, help, challenge, author}; 
        JPanel[] panel = {
          panelA, panelB, panelC, panelD  
        };
        Classes.JPANEL_LEVEL10(panel);
        Classes.BUTTONS_HOME(but);
    }
    public static void main(String[] args) {
            new Game();
    }
    
}
