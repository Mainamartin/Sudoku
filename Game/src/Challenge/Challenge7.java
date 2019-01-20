
package Challenge;

import Modules.Classes;
import StageOne.sudoku2;
import game.Game;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Challenge7 extends JFrame{
    JPanel  panelA, panelB, panelC, 
	    panelD, panelE, panelF, 
	    panelG, panelH, panelI;
	
    JMenuBar menubar;
    JMenuItem exit, next, pre, comfirm, reset,  F1, c1, c2, c3, c4, c5, c6, c7;
    JMenu challenge;
    JLabel
            Al1, Al4, Al7, Al9, 
            Bl4, Bl6,
            Cl1, Cl3, Cl8,
            Dl1, Dl3, Dl5, Dl7, Dl9,  
            El1, El4, El5, El9,
            Fl3, Fl4, Fl9,
            Gl5, Gl8, Gl9,
            Hl1, Hl2, Hl6,
            Il2, Il5, Il7;
    
    JTextField 
            At2, At3, At5, At6, At8, 
            Bt1, Bt2, Bt3, Bt5, Bt7, Bt8, Bt9, 
            Ct2, Ct4, Ct5, Ct6, Ct7, Ct9, 
            Dt2, Dt4, Dt6, Dt8, 
            Et2, Et3, Et6, Et7, Et8, 
            Ft1, Ft2, Ft5, Ft6, Ft7, Ft8,
            Gt1, Gt2, Gt3, Gt4, Gt6, Gt7, 
            Ht3, Ht4, Ht5, Ht7, Ht8, Ht9, 
            It1, It3, It4, It6, It8, It9;
    
    public Challenge7(){
        setSize(364, 350);
		setTitle("Challenge   7");
		setResizable(false);
		setLayout(new GridLayout(3, 3));
		menubar = new JMenuBar();
		setJMenuBar(menubar);

		
		exit = new JMenuItem("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exitActionPerformed(evt);
			}
		});
		
		next = new JMenuItem("Home");
                next.setForeground(Classes.cyan);
		next.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				next(evt);
			}
		});
		


		pre = new JMenuItem("Prev");
		pre.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				pre(evt);
			}
		});
		
		reset = new JMenuItem("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				resetActionPerformed(evt);
			}
		});
		
		comfirm = new JMenuItem("Check");
		comfirm.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CONFIRMACTION(evt);
			}
		});
		c1 = new JMenuItem("Challenge  1");
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				C_1(evt);
			}
		});
		
		c2 = new JMenuItem("Challenge  2");
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				C_2(evt);
			}
		});
		
		c3 = new JMenuItem("Challenge  3");
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				C_3(evt);
			}
		});
		
		c4 = new JMenuItem("Challenge  4");
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				C_4(evt);
			}
		});
		
		c5 = new JMenuItem("Challenge  5");
		c5.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				C_5(evt);
			}
		});
		
		c6 = new JMenuItem("Challenge  6");
		c6.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				C_6(evt);
			}
		});
		
		c7 = new JMenuItem("Challenge  7");
		c7.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				C_7(evt);
			}
		});
                
                challenge = new JMenu("Challenge");
                challenge.add(c1);
                challenge.add(c2);
                challenge.add(c3);
                challenge.add(c4);
                challenge.add(c5);
                challenge.add(c6);
                challenge.add(c7);
                
                
                
                menubar.add(exit); 
                menubar.add(next);
                menubar.add(pre);
                menubar.add(reset);
                menubar.add(comfirm);
                menubar.add(challenge);
                
              panelA = new JPanel();
		Al1 = new JLabel("  8");
		At2 = new JTextField();
		At3 = new JTextField();
		Al4 = new JLabel("  5");
		At5 = new JTextField();
		At6 = new JTextField();
		Al7 = new JLabel("  3");
		At8 = new JTextField();
		Al9 = new JLabel("  6");
		panelA.add(Al1);
		panelA.add(At2);
		panelA.add(At3);
		panelA.add(Al4);
		panelA.add(At5);
		panelA.add(At6);
		panelA.add(Al7);
		panelA.add(At8);
		panelA.add(Al9);
		add(panelA);
		
		
		panelB = new JPanel();
		Bt1 = new JTextField();
		Bt2 = new JTextField();
		Bt3 = new JTextField();
		Bl4 = new JLabel("  6");
		Bt5 = new JTextField();
		Bl6 = new JLabel("  9");
		Bt7 = new JTextField();
		Bt8 = new JTextField();
		Bt9 = new JTextField();
		panelB.add(Bt1);
		panelB.add(Bt2);
		panelB.add(Bt3);
		panelB.add(Bl4);
		panelB.add(Bt5);
		panelB.add(Bl6);
		panelB.add(Bt7);
		panelB.add(Bt8);
		panelB.add(Bt9);
		add(panelB);
		
		
		panelC = new JPanel();
		Cl1 = new JLabel("  9");
		Ct2 = new JTextField();
		Cl3 = new JLabel("  3");
		Ct4 = new JTextField();
		Ct5 = new JTextField();
		Ct6 = new JTextField();
		Ct7 = new JTextField();
		Cl8 = new JLabel("  1");
		Ct9 = new JTextField();
		panelC.add(Cl1);
		panelC.add(Ct2);
		panelC.add(Cl3);
		panelC.add(Ct4);
		panelC.add(Ct5);
		panelC.add(Ct6);
		panelC.add(Ct7);
		panelC.add(Cl8);
		panelC.add(Ct9);
		add(panelC);
		
		
		panelD = new JPanel();
		Dl1 = new JLabel("  9");
		Dt2 = new  JTextField();
		Dl3 = new JLabel("  4");
		Dt4 = new JTextField();
		Dl5 = new JLabel("  5");
		Dt6 = new JTextField();
		Dl7 = new JLabel("  6");
		Dt8 = new JTextField();
		Dl9 = new JLabel("  1");
		panelD.add(Dl1);
		panelD.add(Dt2);
		panelD.add(Dl3);
		panelD.add(Dt4);
		panelD.add(Dl5);
		panelD.add(Dt6);
		panelD.add(Dl7);
		panelD.add(Dt8);
		panelD.add(Dl9);
		add(panelD);
		
		
		panelE = new JPanel();
		El1 = new JLabel(" 2");
		Et2= new JTextField();
		Et3 = new JTextField();
		El4 = new JLabel(" 7");
		El5 = new JLabel(" 1");
		Et6 = new JTextField();
		Et7 = new JTextField();
		Et8 = new JTextField();
		El9 = new JLabel(" 3");
		panelE.add(El1);
		panelE.add(Et2);
		panelE.add(Et3);
		panelE.add(El4);
		panelE.add(El5);
		panelE.add(Et6);
		panelE.add(Et7);
		panelE.add(Et8);
		panelE.add(El9);
		add(panelE);
		
		
		panelF = new JPanel();
		Ft1 = new JTextField();
		Ft2 = new JTextField();
		Fl3 = new JLabel("  6");
		Fl4 = new JLabel("  4");
		Ft5 = new JTextField();
		Ft6 = new JTextField();
		Ft7 = new JTextField();
		Ft8 = new JTextField();
		Fl9 = new JLabel("  2");
		panelF.add(Ft1);
		panelF.add(Ft2);
		panelF.add(Fl3);
		panelF.add(Fl4);
		panelF.add(Ft5);
		panelF.add(Ft6);
		panelF.add(Ft7);
		panelF.add(Ft8);
		panelF.add(Fl9);
		add(panelF);
		
		
		panelG = new JPanel();
		Gt1 = new JTextField();
		Gt2 = new JTextField();
		Gt3 = new JTextField();
		Gt4 = new JTextField();
		Gl5 = new JLabel("  2");
		Gt6 = new JTextField();
		Gt7 = new JTextField();
		Gl8 = new JLabel("  6");
		Gl9 = new JLabel(" 9");
		panelG.add(Gt1);
		panelG.add(Gt2);
		panelG.add(Gt3);
		panelG.add(Gt4);
		panelG.add(Gl5);
		panelG.add(Gt6);
		panelG.add(Gt7);
		panelG.add(Gl8);
		panelG.add(Gl9);
		add(panelG);
		
		
		panelH = new JPanel();
		Hl1 = new JLabel(" 5");
		Hl2 = new JLabel(" 2");
		Ht3 = new JTextField();
		Ht4 = new JTextField();
		Ht5 = new JTextField();
		Hl6 = new JLabel(" 1");
		Ht7 = new JTextField();
		Ht8 = new JTextField();
		Ht9 = new JTextField();
		panelH.add(Hl1);
		panelH.add(Hl2);
		panelH.add(Ht3);
		panelH.add(Ht4);
		panelH.add(Ht5);
		panelH.add(Hl6);
		panelH.add(Ht7);
		panelH.add(Ht8);
		panelH.add(Ht9);
		add(panelH);
		
		
		panelI = new JPanel();
		It1 = new JTextField();
		Il2 = new JLabel("  9");
		It3 = new JTextField();
		It4 = new JTextField();
		Il5 = new JLabel("  4");
		It6 = new JTextField();
		Il7 = new JLabel("  7");
		It8 = new JTextField();
		It9 = new JTextField();
		panelI.add(It1);
		panelI.add(Il2);
		panelI.add(It3);
		panelI.add(It4);
		panelI.add(Il5);
		panelI.add(It6);
		panelI.add(Il7);
		panelI.add(It8);
		panelI.add(It9);
		add(panelI);
                
                
                PLAY();
                
               
                java.awt.Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
    }
    
    private void exitActionPerformed(ActionEvent evt){
        System.exit(0);
        
        
    }
    private void CONFIRMACTION(ActionEvent evt){
        CONFIRM();
    }
    private void C_1(ActionEvent evt){
        dispose();
        new Challenge1();
    }
    private void C_2(ActionEvent evt){
        dispose();
        new Challenge2();
    }
    private void C_3(ActionEvent evt){
        dispose();
        new Challenge2();
    }
    private void C_4(ActionEvent evt){
        dispose();
        new Challenge4();
    }
    private void C_5(ActionEvent evt){
        dispose();
        new Challenge5();
    }
    private void C_6(ActionEvent evt){
        dispose();
        new Challenge6();
    }
    private void C_7(ActionEvent evt){
        String alert = "Challenge Seven";
        Classes.ALERT(alert);
    }
    private void PLAY(){
         JPanel[] panel = {
             panelA, panelB, panelC, 
	     panelD, panelE, panelF, 
	     panelG, panelH, panelI
            };
          JLabel[] label = {
            
            Al1, Al4, Al7, Al9, 
            Bl4, Bl6,
            Cl1, Cl3, Cl8,
            Dl1, Dl3, Dl5, Dl7, Dl9,  
            El1, El4, El5, El9,
            Fl3, Fl4, Fl9,
            Gl5, Gl8, Gl9,
            Hl1, Hl2, Hl6,
            Il2, Il5, Il7
          };
    
    JTextField [] list = {
            At2, At3, At5, At6, At8, 
            Bt1, Bt2, Bt3, Bt5, Bt7, Bt8, Bt9, 
            Ct2, Ct4, Ct5, Ct6, Ct7, Ct9, 
            Dt2, Dt4, Dt6, Dt8, 
            Et2, Et3, Et6, Et7, Et8, 
            Ft1, Ft2, Ft5, Ft6, Ft7, Ft8,
            Gt1, Gt2, Gt3, Gt4, Gt6, Gt7, 
            Ht3, Ht4, Ht5, Ht7, Ht8, Ht9, 
            It1, It3, It4, It6, It8, It9
    };
    
     Classes.LABEL_PROPS(label);
        Classes.TEXTFIELD_PROPS(list);
        Classes.JPANEL_LAYOUT(panel);
        Classes.JPANEL_LEVEL7(panel);

    }
    
	private void pre(ActionEvent evt){
            
            dispose();
             new Challenge6();
           
		
	
	}
        
	private void next(ActionEvent evt){
            
		dispose();
                new Game();
	
	}
    private void resetActionPerformed(ActionEvent evt) {
    JTextField[] list = {
           At2, At3, At5, At6, At8, 
            Bt1, Bt2, Bt3, Bt5, Bt7, Bt8, Bt9, 
            Ct2, Ct4, Ct5, Ct6, Ct7, Ct9, 
            Dt2, Dt4, Dt6, Dt8, 
            Et2, Et3, Et6, Et7, Et8, 
            Ft1, Ft2, Ft5, Ft6, Ft7, Ft8,
            Gt1, Gt2, Gt3, Gt4, Gt6, Gt7, 
            Ht3, Ht4, Ht5, Ht7, Ht8, Ht9, 
            It1, It3, It4, It6, It8, It9
    };
		
		Classes.RESET(list);
		
	}
    private void CONFIRM(){
        
        int  at2, at3, at5, at6, at8, 
            bt1, bt2, bt3, bt5, bt7, bt8, bt9, 
            ct2, ct4, ct5, ct6, ct7, ct9, 
            dt2, dt4, dt6, dt8, 
            et2, et3, et6, et7, et8, 
            ft1, ft2, ft5, ft6, ft7, ft8,
            gt1, gt2, gt3, gt4, gt6, gt7, 
            ht3, ht4, ht5, ht7, ht8, ht9, 
            it1, it3, it4, it6, it8, it9
           ;
                    
    JTextField [] list = {
            At2, At3, At5, At6, At8, 
            Bt1, Bt2, Bt3, Bt5, Bt7, Bt8, Bt9, 
            Ct2, Ct4, Ct5, Ct6, Ct7, Ct9, 
            Dt2, Dt4, Dt6, Dt8, 
            Et2, Et3, Et6, Et7, Et8, 
            Ft1, Ft2, Ft5, Ft6, Ft7, Ft8,
            Gt1, Gt2, Gt3, Gt4, Gt6, Gt7, 
            Ht3, Ht4, Ht5, Ht7, Ht8, Ht9, 
            It1, It3, It4, It6, It8, It9
    };
    
        int [] gettext = {	
                        at2 = Integer.parseInt(At2.getText()),at3 = Integer.parseInt(At3.getText()),at5 = Integer.parseInt(At5.getText()),at6 = Integer.parseInt(At6.getText()),
                        at8 = Integer.parseInt(At8.getText()),bt1 = Integer.parseInt(Bt1.getText()),bt2 = Integer.parseInt(Bt2.getText()),	
                        bt3 = Integer.parseInt(Bt3.getText()),bt5 = Integer.parseInt(Bt5.getText()),bt7 = Integer.parseInt(Bt7.getText()),
                        bt8 = Integer.parseInt(Bt8.getText()),bt9 = Integer.parseInt(Bt9.getText()),
                        ct2 = Integer.parseInt(Ct2.getText()),ct4 = Integer.parseInt(Ct4.getText()),ct5 = Integer.parseInt(Ct5.getText()),
                        ct6 = Integer.parseInt(Ct6.getText()),ct7 = Integer.parseInt(Ct7.getText()),ct9 = Integer.parseInt(Ct9.getText()),
                        dt2 = Integer.parseInt(Dt2.getText()),dt4 = Integer.parseInt(Dt4.getText()),dt6 = Integer.parseInt(Dt6.getText()),
                        dt8 = Integer.parseInt(Dt8.getText()),et2 = Integer.parseInt(Et2.getText()),et3 = Integer.parseInt(Et3.getText()),
                        et6 = Integer.parseInt(Et6.getText()),et7 = Integer.parseInt(Et7.getText()),et8 = Integer.parseInt(Et8.getText()),
                        ft1 = Integer.parseInt(Ft1.getText()),ft2 = Integer.parseInt(Ft2.getText()),ft5 = Integer.parseInt(Ft5.getText()),
                        ft6 = Integer.parseInt(Ft6.getText()),ft7 = Integer.parseInt(Ft7.getText()),ft8 = Integer.parseInt(Ft8.getText()),
                        gt1 = Integer.parseInt(Gt1.getText()),gt2 = Integer.parseInt(Gt2.getText()),gt3 = Integer.parseInt(Gt3.getText()),
                        gt4 = Integer.parseInt(Gt4.getText()),gt6 = Integer.parseInt(Gt6.getText()),gt7 = Integer.parseInt(Gt7.getText()),
                        ht3 = Integer.parseInt(Ht3.getText()),ht4 = Integer.parseInt(Ht4.getText()),ht5 = Integer.parseInt(Ht5.getText()),
                        ht7 = Integer.parseInt(Ht7.getText()),ht8 = Integer.parseInt(Ht8.getText()),ht9 = Integer.parseInt(Ht9.getText()),
                        it1 = Integer.parseInt(It1.getText()),it3 = Integer.parseInt(It3.getText()),it4 = Integer.parseInt(It4.getText()),
                        it6 = Integer.parseInt(It6.getText()),it8 = Integer.parseInt(It8.getText()),it9 = Integer.parseInt(It9.getText()),
                       
                };
        boolean check = false;
        
          int [] correctvalues = {
              4, 2, 1, 7, 9, 
              1, 7, 5, 3, 8, 4, 2, 
              6, 2, 8, 4, 5, 7, 
              3, 2, 8, 7, 
              5, 8, 6, 4, 9, 
              1, 7, 3, 9, 8, 5, 
              4, 8, 3, 7, 5, 1, 
              7, 9, 6, 3, 8, 4, 
              6, 1, 3, 8, 2, 5
              
    };
     
		Classes.CONFIRM(list, gettext, correctvalues, check );
                if(check == true){
                    
                }
    }
    public static void main(String[] args){
        new Challenge7();
    }
}
