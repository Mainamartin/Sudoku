
package Challenge;

import Modules.Classes;
import StageOne.sudoku2;
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

public class Challenge3 extends JFrame{
    JPanel  panelA, panelB, panelC, 
	    panelD, panelE, panelF, 
	    panelG, panelH, panelI;
	
    JMenuBar menubar;
    JMenuItem exit, next, pre, comfirm, reset,  F1, c1, c2, c3, c4, c5, c6, c7;
    JMenu challenge;
    JLabel
            Al3, Al6, Al7, 
            Bl1, Bl4, Bl8, Bl9,
            Cl2, Cl4, Cl5, Cl7,
            Dl1, Dl4, Dl8, Dl9,  
            El2, El3, El6,
            Fl4, Fl6, Fl9,
            Gl2, Gl5, Gl8,
            Hl4, Hl7, Hl8,
            Il2, Il3, Il4;
    
    JTextField 
            At1, At2, At4, At5,  At8, At9, 
            Bt2, Bt3, Bt5, Bt6, Bt7,
            Ct1, Ct3, Ct6, Ct8, Ct9,
            Dt2, Dt3, Dt5, Dt6, Dt7, 
            Et1, Et4, Et5, Et7, Et8, Et9,
            Ft1, Ft2, Ft3, Ft5, Ft7, Ft8, 
            Gt1, Gt3, Gt4, Gt6, Gt7, Gt9, 
            Ht1, Ht2, Ht3, Ht5, Ht6, Ht9, 
            It1, It5, It6, It7, It8, It9;
    
    public Challenge3(){
        setSize(364, 350);
		setTitle("Challenge   3");
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
		
		next = new JMenuItem("Next");
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
		At1 = new JTextField();
		At2 = new JTextField();
		Al3 = new  JLabel("  8");
		At4 = new JTextField();
		At5 = new JTextField();
		Al6 = new JLabel("  3");
		Al7 = new JLabel("  2");
		At8 = new JTextField();
		At9 = new JTextField();
		panelA.add(At1);
		panelA.add(At2);
		panelA.add(Al3);
		panelA.add(At4);
		panelA.add(At5);
		panelA.add(Al6);
		panelA.add(Al7);
		panelA.add(At8);
		panelA.add(At9);
		add(panelA);
		
		
		panelB = new JPanel();
		Bl1 = new JLabel("  7");
		Bt2 = new JTextField();
		Bt3 = new JTextField();
		Bl4 = new JLabel("  6");
		Bt5 = new JTextField();
		Bt6 = new JTextField();
		Bt7 = new JTextField();
		Bl8 = new JLabel("  9");
		Bl9 = new JLabel("  5");
		panelB.add(Bl1);
		panelB.add(Bt2);
		panelB.add(Bt3);
		panelB.add(Bl4);
		panelB.add(Bt5);
		panelB.add(Bt6);
		panelB.add(Bt7);
		panelB.add(Bl8);
		panelB.add(Bl9);
		add(panelB);
		
		
		panelC = new JPanel();
		Ct1 = new JTextField();
		Cl2 = new JLabel("  3");
		Ct3 = new JTextField();
		Cl4 = new JLabel("  7");
		Cl5 = new JLabel("  4");
		Ct6 = new JTextField();
		Cl7 = new JLabel("  1");
		Ct8 = new JTextField();
		Ct9 = new JTextField();
		panelC.add(Ct1);
		panelC.add(Cl2);
		panelC.add(Ct3);
		panelC.add(Cl4);
		panelC.add(Cl5);
		panelC.add(Ct6);
		panelC.add(Cl7);
		panelC.add(Ct8);
		panelC.add(Ct9);
		add(panelC);
		
		
		panelD = new JPanel();
		Dl1 = new JLabel("  7");
		Dt2 = new  JTextField();
		Dt3 = new  JTextField();
		Dl4 = new JLabel("  1");
		Dt5 = new JTextField();
		Dt6 = new JTextField();
		Dt7 = new JTextField();
		Dl8 = new JLabel("  8");
		Dl9 = new JLabel("  2");
		panelD.add(Dl1);
		panelD.add(Dt2);
		panelD.add(Dt3);
		panelD.add(Dl4);
		panelD.add(Dt5);
		panelD.add(Dt6);
		panelD.add(Dt7);
		panelD.add(Dl8);
		panelD.add(Dl9);
		add(panelD);
		
		
		panelE = new JPanel();
		Et1 = new JTextField();
		El2= new JLabel("  8");
		El3 = new JLabel("  1");
		Et4 = new JTextField();
		Et5 = new JTextField();
		El6 = new JLabel(" 7");
		Et7 = new JTextField();
		Et8 = new JTextField();
		Et9 = new JTextField();
		panelE.add(Et1);
		panelE.add(El2);
		panelE.add(El3);
		panelE.add(Et4);
		panelE.add(Et5);
		panelE.add(El6);
		panelE.add(Et7);
		panelE.add(Et8);
		panelE.add(Et9);
		add(panelE);
		
		
		panelF = new JPanel();
		Ft1 = new JTextField();
		Ft2 = new JTextField();
		Ft3 = new JTextField();
		Fl4 = new JLabel("  4");
		Ft5 = new JTextField();
		Fl6 = new JLabel("  3");
		Ft7 = new JTextField();
		Ft8 = new JTextField();
		Fl9 = new JLabel("  7");
		panelF.add(Ft1);
		panelF.add(Ft2);
		panelF.add(Ft3);
		panelF.add(Fl4);
		panelF.add(Ft5);
		panelF.add(Fl6);
		panelF.add(Ft7);
		panelF.add(Ft8);
		panelF.add(Fl9);
		add(panelF);
		
		
		panelG = new JPanel();
		Gt1 = new JTextField();
		Gl2 = new JLabel(" 9");
		Gt3 = new JTextField();
		Gt4 = new JTextField();
		Gl5 = new JLabel("  2");
		Gt6 = new JTextField();
		Gt7 = new JTextField();
		Gl8 = new  JLabel("  4");
		Gt9 = new JTextField();
		panelG.add(Gt1);
		panelG.add(Gl2);
		panelG.add(Gt3);
		panelG.add(Gt4);
		panelG.add(Gl5);
		panelG.add(Gt6);
		panelG.add(Gt7);
		panelG.add(Gl8);
		panelG.add(Gt9);
		add(panelG);
		
		
		panelH = new JPanel();
		Ht1 = new JTextField();
		Ht2 = new JTextField();
		Ht3 = new JTextField();
		Hl4 = new JLabel("  1");
		Ht5 = new JTextField();
		Ht6 = new JTextField();
		Hl7 = new JLabel("  5");
		Hl8 = new JLabel("  6");
		Ht9 = new JTextField();
		panelH.add(Ht1);
		panelH.add(Ht2);
		panelH.add(Ht3);
		panelH.add(Hl4);
		panelH.add(Ht5);
		panelH.add(Ht6);
		panelH.add(Hl7);
		panelH.add(Hl8);
		panelH.add(Ht9);
		add(panelH);
		
		
		panelI = new JPanel();
		It1 = new JTextField();
		Il2 = new JLabel("  7");
		Il3= new JLabel("  4");
		Il4 = new JLabel("  3");
		It5 = new JTextField();
		It6 = new JTextField();
		It7 = new JTextField();
		It8 = new JTextField();
		It9 = new JTextField();
		panelI.add(It1);
		panelI.add(Il2);
		panelI.add(Il3);
		panelI.add(Il4);
		panelI.add(It5);
		panelI.add(It6);
		panelI.add(It7);
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
        String alert = "Challenge Three";
        Classes.ALERT(alert);
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
        dispose();
        new Challenge7();
    }
    private void PLAY(){
         JPanel[] panel = {
             panelA, panelB, panelC, 
	     panelD, panelE, panelF, 
	     panelG, panelH, panelI
            };
          JLabel[] label = {
            
            Al3, Al6, Al7, 
            Bl1, Bl4, Bl8, Bl9,
            Cl2, Cl4, Cl5, Cl7,
            Dl1, Dl4, Dl8, Dl9,  
            El2, El3, El6,
            Fl4, Fl6, Fl9,
            Gl2, Gl5, Gl8,
            Hl4, Hl7, Hl8,
            Il2, Il3, Il4 
          };
    
    JTextField [] list = {
            At1, At2, At4, At5,  At8, At9, 
            Bt2, Bt3, Bt5, Bt6, Bt7,
            Ct1, Ct3, Ct6, Ct8, Ct9,
            Dt2, Dt3, Dt5, Dt6, Dt7, 
            Et1, Et4, Et5, Et7, Et8, Et9,
            Ft1, Ft2, Ft3, Ft5, Ft7, Ft8, 
            Gt1, Gt3, Gt4, Gt6, Gt7, Gt9, 
            Ht1, Ht2, Ht3, Ht5, Ht6, Ht9, 
            It1, It5, It6, It7, It8, It9
    };
    
     Classes.LABEL_PROPS(label);
        Classes.TEXTFIELD_PROPS(list);
        Classes.JPANEL_LAYOUT(panel);
        Classes.JPANEL_LEVEL3(panel);

    }
    
	private void pre(ActionEvent evt){
            
            dispose();
            new Challenge2();
            
	}
        
	private void next(ActionEvent evt){
                dispose();
		new Challenge4();
	
	}
    private void resetActionPerformed(ActionEvent evt) {
    JTextField[] list = {
            At1, At2, At4, At5,  At8, At9, 
            Bt2, Bt3, Bt5, Bt6, Bt7,
            Ct1, Ct3, Ct6, Ct8, Ct9,
            Dt2, Dt3, Dt5, Dt6, Dt7, 
            Et1, Et4, Et5, Et7, Et8, Et9,
            Ft1, Ft2, Ft3, Ft5, Ft7, Ft8, 
            Gt1, Gt3, Gt4, Gt6, Gt7, Gt9, 
            Ht1, Ht2, Ht3, Ht5, Ht6, Ht9, 
            It1, It5, It6, It7, It8, It9
    };
		
		Classes.RESET(list);
		
	}
    private void CONFIRM(){
        
        int  at1, at2, at4, at5,  at8, at9, 
            bt2, bt3, bt5, bt6, bt7,
            ct1, ct3, ct6, ct8, ct9,
            dt2, dt3, dt5, dt6, dt7, 
            et1, et4, et5, et7, et8, et9,
            ft1, ft2, ft3, ft5, ft7, ft8, 
            gt1, gt3, gt4, gt6, gt7, gt9, 
            ht1, ht2, ht3, ht5, ht6, ht9, 
            it1, it5, it6, it7, it8, it9
           ;
                    
    JTextField [] list = {
          At1, At2, At4, At5,  At8, At9, 
            Bt2, Bt3, Bt5, Bt6, Bt7,
            Ct1, Ct3, Ct6, Ct8, Ct9,
            Dt2, Dt3, Dt5, Dt6, Dt7, 
            Et1, Et4, Et5, Et7, Et8, Et9,
            Ft1, Ft2, Ft3, Ft5, Ft7, Ft8, 
            Gt1, Gt3, Gt4, Gt6, Gt7, Gt9, 
            Ht1, Ht2, Ht3, Ht5, Ht6, Ht9, 
            It1, It5, It6, It7, It8, It9
    };
    
        int [] gettext = {	
                        at1 = Integer.parseInt(At1.getText()),at2 = Integer.parseInt(At2.getText()),at4 = Integer.parseInt(At4.getText()),at5 = Integer.parseInt(At5.getText()),
                        at8 = Integer.parseInt(At8.getText()),at9 = Integer.parseInt(At9.getText()),bt2 = Integer.parseInt(Bt2.getText()),	
                        bt3 = Integer.parseInt(Bt3.getText()),bt5 = Integer.parseInt(Bt5.getText()),bt6 = Integer.parseInt(Bt6.getText()),
                        bt7 = Integer.parseInt(Bt7.getText()),ct1 = Integer.parseInt(Ct1.getText()),
                        ct3 = Integer.parseInt(Ct3.getText()),ct6 = Integer.parseInt(Ct6.getText()),ct8 = Integer.parseInt(Ct8.getText()),
                        ct9 = Integer.parseInt(Ct9.getText()),dt2 = Integer.parseInt(Dt2.getText()),dt3 = Integer.parseInt(Dt3.getText()),
                        dt5 = Integer.parseInt(Dt5.getText()),dt6 = Integer.parseInt(Dt6.getText()),dt7 = Integer.parseInt(Dt7.getText()),
                        et1 = Integer.parseInt(Et1.getText()),et4 = Integer.parseInt(Et4.getText()),et5 = Integer.parseInt(Et5.getText()),
                        et7 = Integer.parseInt(Et7.getText()),et8 = Integer.parseInt(Et8.getText()),et9 = Integer.parseInt(Et9.getText()),
                        ft1 = Integer.parseInt(Ft1.getText()),ft2 = Integer.parseInt(Ft2.getText()),ft3 = Integer.parseInt(Ft3.getText()),
                        ft5 = Integer.parseInt(Ft5.getText()),ft7 = Integer.parseInt(Ft7.getText()),ft8 = Integer.parseInt(Ft8.getText()),
                        gt1 = Integer.parseInt(Gt1.getText()),gt3 = Integer.parseInt(Gt3.getText()),gt4 = Integer.parseInt(Gt4.getText()),
                        gt6 = Integer.parseInt(Gt6.getText()),gt7 = Integer.parseInt(Gt7.getText()),gt9 = Integer.parseInt(Gt9.getText()),
                        ht1 = Integer.parseInt(Ht1.getText()),ht2 = Integer.parseInt(Ht2.getText()),ht3 = Integer.parseInt(Ht3.getText()),
                        ht5 = Integer.parseInt(Ht5.getText()),ht6 = Integer.parseInt(Ht6.getText()),ht9 = Integer.parseInt(Ht9.getText()),
                        it1 = Integer.parseInt(It1.getText()),it5 = Integer.parseInt(It5.getText()),it6 = Integer.parseInt(It6.getText()),
                        it7 = Integer.parseInt(It7.getText()),it8 = Integer.parseInt(It8.getText()),it9 = Integer.parseInt(It9.getText()),
                       
                };
        boolean check = false;
        
          int [] correctvalues = {
              6, 1, 9, 5, 7, 4, 
              4, 2, 1, 8, 3, 
              9, 5, 2, 6, 8, 
              3, 5, 6, 9, 4, 
              4, 2, 5, 9, 3, 6, 
              2, 9, 6, 8, 5, 1, 
              5, 1, 8, 6, 3, 7, 
              8, 2, 3, 7, 4, 9, 
              6, 5, 9, 8, 2, 1
              
    };
     
		Classes.CONFIRM(list, gettext, correctvalues, check );
                if(check == true){
                    new Challenge4();
                }
    }
    public static void main(String[] args){
        new Challenge3();
    }
}
