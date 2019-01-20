
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

public class Challenge4 extends JFrame{
    JPanel  panelA, panelB, panelC, 
	    panelD, panelE, panelF, 
	    panelG, panelH, panelI;
	
    JMenuBar menubar;
    JMenuItem exit, next, pre, comfirm, reset,  F1, c1, c2, c3, c4, c5, c6, c7;
    JMenu challenge;
    JLabel
            Al1, Al4, Al7, 
            Bl2, Bl3, Bl7, Bl9,
            Cl3, Cl4, Cl5,
            Dl2, Dl4, Dl6, Dl9, 
            El1, El2, El6, El8, 
            Fl2, Fl4, Fl7,
            Gl3, Gl5, Gl8,
            Hl4, Hl5, Hl9,
            Il2, Il6, Il9 ;
    
    JTextField 
            At2, At3, At5, At6, At8, At9, 
            Bt1, Bt4, Bt5, Bt6, Bt8,
            Ct1, Ct2, Ct6, Ct7, Ct8, Ct9,
            Dt1, Dt3, Dt5, Dt7, Dt8, 
            Et3, Et4, Et5, Et7, Et9,
            Ft1, Ft3, Ft5, Ft6, Ft8, Ft9, 
            Gt1, Gt2, Gt4, Gt6, Gt7, Gt9, 
            Ht1, Ht2, Ht3, Ht6, Ht7, Ht8, 
            It1, It3, It4, It5, It7, It8;
    
    public Challenge4(){
        setSize(364, 350);
		setTitle("Challenge   4");
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
		Al1 = new JLabel("  9");
		At2 = new JTextField();
		At3 = new JTextField();
		Al4 = new JLabel("  2");
		At5 = new JTextField();
		At6 = new JTextField();
		Al7 = new JLabel("  6");
		At8 = new JTextField();
		At9 = new JTextField();
		panelA.add(Al1);
		panelA.add(At2);
		panelA.add(At3);
		panelA.add(Al4);
		panelA.add(At5);
		panelA.add(At6);
		panelA.add(Al7);
		panelA.add(At8);
		panelA.add(At9);
		add(panelA);
		
		
		panelB = new JPanel();
		Bt1 = new JTextField();
		Bl2 = new JLabel("  4");
		Bl3 = new JLabel("  1");
		Bt4 = new JTextField();
		Bt5 = new JTextField();
		Bt6 = new JTextField();
		Bl7 = new JLabel("  8");
		Bt8 = new JTextField();
		Bl9 = new JLabel("  5");
		panelB.add(Bt1);
		panelB.add(Bl2);
		panelB.add(Bl3);
		panelB.add(Bt4);
		panelB.add(Bt5);
		panelB.add(Bt6);
		panelB.add(Bl7);
		panelB.add(Bt8);
		panelB.add(Bl9);
		add(panelB);
		
		
		panelC = new JPanel();
		Ct1 = new JTextField(); 
		Ct2 = new JTextField(); 
		Cl3 = new JLabel("  7");
		Cl4 = new JLabel("  6");
		Cl5 = new JLabel("  8");
		Ct6 = new JTextField();
		Ct7 = new JTextField();
		Ct8 = new JTextField();
		Ct9 = new JTextField();
		panelC.add(Ct1);
		panelC.add(Ct2);
		panelC.add(Cl3);
		panelC.add(Cl4);
		panelC.add(Cl5);
		panelC.add(Ct6);
		panelC.add(Ct7);
		panelC.add(Ct8);
		panelC.add(Ct9);
		add(panelC);
		
		
		panelD = new JPanel();
		Dt1 = new JTextField();
		Dl2 = new JLabel("  6");
		Dt3 = new JTextField();
		Dl4 = new JLabel("  8");
		Dt5 = new JTextField();
		Dl6 = new JLabel("  7");
		Dt7 = new JTextField();
		Dt8 = new JTextField();
		Dl9 = new JLabel("  2");
		panelD.add(Dt1);
		panelD.add(Dl2);
		panelD.add(Dt3);
		panelD.add(Dl4);
		panelD.add(Dt5);
		panelD.add(Dl6);
		panelD.add(Dt7);
		panelD.add(Dt8);
		panelD.add(Dl9);
		add(panelD);
		
		
		panelE = new JPanel();
		El1 = new JLabel("  1");
		El2= new JLabel(" 8");
		Et3 = new JTextField();
		Et4 = new JTextField();
		Et5 = new JTextField();
		El6 = new JLabel(" 2");
		Et7 = new JTextField();
		El8 = new JLabel("  3");
		Et9 = new JTextField();
		panelE.add(El1);
		panelE.add(El2);
		panelE.add(Et3);
		panelE.add(Et4);
		panelE.add(Et5);
		panelE.add(El6);
		panelE.add(Et7);
		panelE.add(El8);
		panelE.add(Et9);
		add(panelE);
		
		
		panelF = new JPanel();
		Ft1 = new  JTextField();
		Fl2 = new JLabel("  2");
		Ft3 = new JTextField();
		Fl4 = new JLabel("  4");
		Ft5 = new JTextField();
		Ft6 = new JTextField();
		Fl7 = new JLabel("  1");
		Ft8 = new JTextField();
		Ft9 = new JTextField();
		panelF.add(Ft1);
		panelF.add(Fl2);
		panelF.add(Ft3);
		panelF.add(Fl4);
		panelF.add(Ft5);
		panelF.add(Ft6);
		panelF.add(Fl7);
		panelF.add(Ft8);
		panelF.add(Ft9);
		add(panelF);
		
		
		panelG = new JPanel();
		Gt1 = new JTextField();
		Gt2 = new JTextField();
		Gl3 = new JLabel("  3");
		Gt4 = new JTextField();
		Gl5 = new JLabel("  5");
		Gt6 = new JTextField();
		Gt7 = new JTextField();
		Gl8 = new JLabel("  2");
		Gt9 = new JTextField();
		panelG.add(Gt1);
		panelG.add(Gt2);
		panelG.add(Gl3);
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
		Hl4 = new JLabel("  2");
		Hl5 = new JLabel("  7");
		Ht6 = new JTextField();
		Ht7 = new JTextField();
		Ht8 = new JTextField();
		Hl9 = new JLabel("  3");
		panelH.add(Ht1);
		panelH.add(Ht2);
		panelH.add(Ht3);
		panelH.add(Hl4);
		panelH.add(Hl5);
		panelH.add(Ht6);
		panelH.add(Ht7);
		panelH.add(Ht8);
		panelH.add(Hl9);
		add(panelH);
		
		
		panelI = new JPanel();
		It1 = new JTextField();
		Il2 = new JLabel("  7");
		It3 = new JTextField();
		It4 = new JTextField();
		It5 = new JTextField();
		Il6 = new JLabel("  9");
		It7 = new JTextField();
		It8 = new JTextField();
		Il9 = new JLabel("  6");
		panelI.add(It1);
		panelI.add(Il2);
		panelI.add(It3);
		panelI.add(It4);
		panelI.add(It5);
		panelI.add(Il6);
		panelI.add(It7);
		panelI.add(It8);
		panelI.add(Il9);
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
        new Challenge3();
    }
    private void C_4(ActionEvent evt){
        String alert = "Challenge Four";
        Classes.ALERT(alert);
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
            Al1, Al4, Al7, 
            Bl2, Bl3, Bl7, Bl9,
            Cl3, Cl4, Cl5,
            Dl2, Dl4, Dl6, Dl9, 
            El1, El2, El6, El8, 
            Fl2, Fl4, Fl7,
            Gl3, Gl5, Gl8,
            Hl4, Hl5, Hl9,
            Il2, Il6, Il9  
          };
    
    JTextField [] list = {
           At2, At3, At5, At6, At8, At9, 
            Bt1, Bt4, Bt5, Bt6, Bt8,
            Ct1, Ct2, Ct6, Ct7, Ct8, Ct9,
            Dt1, Dt3, Dt5, Dt7, Dt8, 
            Et3, Et4, Et5, Et7, Et9,
            Ft1, Ft3, Ft5, Ft6, Ft8, Ft9, 
            Gt1, Gt2, Gt4, Gt6, Gt7, Gt9, 
            Ht1, Ht2, Ht3, Ht6, Ht7, Ht8, 
            It1, It3, It4, It5, It7, It8
    };
    
     Classes.LABEL_PROPS(label);
        Classes.TEXTFIELD_PROPS(list);
        Classes.JPANEL_LAYOUT(panel);
        Classes.JPANEL_LEVEL4(panel);

    }
    
	private void pre(ActionEvent evt){
		
		dispose();
                new Challenge3();
	
	}
        private void next(ActionEvent evt){
		
	dispose();
        new Challenge5();
	
	}
    private void resetActionPerformed(ActionEvent evt) {
    JTextField[] list = {
            At2, At3, At5, At6, At8, At9, 
            Bt1, Bt4, Bt5, Bt6, Bt8,
            Ct1, Ct2, Ct6, Ct7, Ct8, Ct9,
            Dt1, Dt3, Dt5, Dt7, Dt8, 
            Et3, Et4, Et5, Et7, Et9,
            Ft1, Ft3, Ft5, Ft6, Ft8, Ft9, 
            Gt1, Gt2, Gt4, Gt6, Gt7, Gt9, 
            Ht1, Ht2, Ht3, Ht6, Ht7, Ht8, 
            It1, It3, It4, It5, It7, It8
		};
		
		Classes.RESET(list);
		
	}
    private void CONFIRM(){
        
        int  at2, at3, at5, at6, at8, at9, 
            bt1, bt4, bt5, bt6, bt8,
            ct1, ct2, ct6, ct7, ct8, ct9,
            dt1, dt3, dt5, dt7, dt8, 
            et3, et4, et5, et7, et9,
            ft1, ft3, ft5, ft6, ft8, ft9, 
            gt1, gt2, gt4, gt6, gt7, gt9, 
            ht1, ht2, ht3, ht6, ht7, ht8, 
            it1, it3, it4, it5, it7, it8
           ;
                    
    JTextField [] list = {
            At2, At3, At5, At6, At8, At9, 
            Bt1, Bt4, Bt5, Bt6, Bt8,
            Ct1, Ct2, Ct6, Ct7, Ct8, Ct9,
            Dt1, Dt3, Dt5, Dt7, Dt8, 
            Et3, Et4, Et5, Et7, Et9,
            Ft1, Ft3, Ft5, Ft6, Ft8, Ft9, 
            Gt1, Gt2, Gt4, Gt6, Gt7, Gt9, 
            Ht1, Ht2, Ht3, Ht6, Ht7, Ht8, 
            It1, It3, It4, It5, It7, It8
    };
    
        int [] gettext = {	
            at2 = Integer.parseInt(At2.getText()), at3 = Integer.parseInt(At3.getText()), at5 = Integer.parseInt(At5.getText()), 
            at6 = Integer.parseInt(At6.getText()), at8 = Integer.parseInt(At8.getText()), at9 = Integer.parseInt(At9.getText()),
            bt1 = Integer.parseInt(Bt1.getText()), bt4 = Integer.parseInt(Bt4.getText()), bt5 = Integer.parseInt(Bt5.getText()),
            bt6 = Integer.parseInt(Bt6.getText()), bt8 = Integer.parseInt(Bt8.getText()), ct1 = Integer.parseInt(Ct1.getText()),
            ct2 = Integer.parseInt(Ct2.getText()), ct6 = Integer.parseInt(Ct6.getText()), ct7 = Integer.parseInt(Ct7.getText()),
            ct8 = Integer.parseInt(Ct8.getText()), ct9 = Integer.parseInt(Ct9.getText()), dt1 = Integer.parseInt(Dt1.getText()),
            dt3 = Integer.parseInt(Dt3.getText()), dt5 = Integer.parseInt(Dt5.getText()), dt7 = Integer.parseInt(Dt7.getText()),
            dt8 = Integer.parseInt(Dt8.getText()), et3 = Integer.parseInt(Et3.getText()), et4 = Integer.parseInt(Et4.getText()),
            et5 = Integer.parseInt(Et5.getText()), et7 = Integer.parseInt(Et7.getText()), et9 = Integer.parseInt(Et9.getText()),
            ft1 = Integer.parseInt(Ft1.getText()), ft3 = Integer.parseInt(Ft3.getText()), ft5 = Integer.parseInt(Ft5.getText()),
            ft6 = Integer.parseInt(Ft6.getText()), ft8 = Integer.parseInt(Ft8.getText()), ft9 = Integer.parseInt(Ft9.getText()),
            gt1 = Integer.parseInt(Gt1.getText()), gt2 = Integer.parseInt(Gt2.getText()), gt4 = Integer.parseInt(Gt4.getText()),
            gt6 = Integer.parseInt(Gt6.getText()), gt7 = Integer.parseInt(Gt7.getText()), gt9 = Integer.parseInt(Gt9.getText()),
            ht1 = Integer.parseInt(Ht1.getText()), ht2 = Integer.parseInt(Ht2.getText()), ht3 = Integer.parseInt(Ht3.getText()),
            ht6 = Integer.parseInt(Ht6.getText()), ht7 = Integer.parseInt(Ht7.getText()), ht8 = Integer.parseInt(Ht8.getText()),
            it1 = Integer.parseInt(It1.getText()), it3 = Integer.parseInt(It3.getText()), it4 = Integer.parseInt(It4.getText()), 
            it5 = Integer.parseInt(It5.getText()), it7 = Integer.parseInt(It7.getText()), it8 = Integer.parseInt(It8.getText())
            };
        boolean check = false;
        
          int [] correctvalues = {
              3, 8, 4, 5, 7, 1, 
              6, 3, 9, 7, 2, 
              2, 5, 1, 9, 3, 4, 
              3, 4, 1, 5, 9, 
              9, 5, 6, 7, 4, 
              7, 5, 9, 3, 6, 8, 
              4, 8, 1, 6, 7, 9, 
              9, 1, 6, 8, 4, 5, 
              5, 2, 3, 4, 8, 1, 
              
    };
     
		Classes.CONFIRM(list, gettext, correctvalues, check );
                if(check == true){
                    
                }
    }
    public static void main(String[] args){
        new Challenge4();
    }
}
