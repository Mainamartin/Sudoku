
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

public class Challenge6 extends JFrame{
    JPanel  panelA, panelB, panelC, 
	    panelD, panelE, panelF, 
	    panelG, panelH, panelI;
	
    JMenuBar menubar;
    JMenuItem exit, next, pre, comfirm, reset,  F1, c1, c2, c3, c4, c5, c6, c7;
    JMenu challenge;
    JLabel
            Al4, Al5, Al7, Al9, 
            Bl1, Bl9,
            Cl1, Cl8,
            Dl2, Dl4, Dl5, Dl7,  
            El2, El8, El9,  
            Fl2, Fl3, Fl4, Fl9,
            Gl3, Gl5, Gl6, Gl9, 
            Hl1, Hl4, Hl7, Hl8, 
            Il2, Il6, Il9 ;
    
    JTextField 
            At1, At2, At3, At6, At8,
            Bt2, Bt3, Bt4, Bt5, Bt6, Bt7, Bt8,
            Ct2, Ct3, Ct4, Ct5, Ct6, Ct7, Ct9,
            Dt1, Dt3, Dt6, Dt8, Dt9,
            Et1, Et3, Et4, Et5, Et6, Et7,
            Ft1, Ft5, Ft6, Ft7, Ft8, 
            Gt1, Gt2, Gt4, Gt7, Gt8,
            Ht2, Ht3, Ht5, Ht6, Ht9, 
            It1, It3, It4, It5, It7, It8;
    
    public Challenge6(){
        setSize(364, 350);
		setTitle("Challenge   6");
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
		At3 = new JTextField();
		Al4 = new JLabel("  8");
		Al5 = new  JLabel("  3");
		At6 = new JTextField();
		Al7 = new JLabel("  4");
		At8 = new JTextField();
		Al9 = new JLabel("  2");
		panelA.add(At1);
		panelA.add(At2);
		panelA.add(At3);
		panelA.add(Al4);
		panelA.add(Al5);
		panelA.add(At6);
		panelA.add(Al7);
		panelA.add(At8);
		panelA.add(Al9);
		add(panelA);
		
		
		panelB = new JPanel();
		Bl1 = new JLabel("  8");
		Bt2 = new JTextField();
		Bt3 = new JTextField();
		Bt4 = new JTextField();
		Bt5 = new JTextField();
		Bt6 = new JTextField();
		Bt7 = new JTextField();
		Bt8 = new JTextField();
		Bl9 = new JLabel("  6");
		panelB.add(Bl1);
		panelB.add(Bt2);
		panelB.add(Bt3);
		panelB.add(Bt4);
		panelB.add(Bt5);
		panelB.add(Bt6);
		panelB.add(Bt7);
		panelB.add(Bt8);
		panelB.add(Bl9);
		add(panelB);
		
		
		panelC = new JPanel();
		Cl1 = new JLabel("  6");
		Ct2 = new JTextField();
		Ct3 = new JTextField();
		Ct4 = new JTextField(); 
		Ct5 = new JTextField();
		Ct6 = new JTextField();
		Ct7 = new JTextField();
		Cl8 = new JLabel("  5");
		Ct9 = new JTextField();
		panelC.add(Cl1);
		panelC.add(Ct2);
		panelC.add(Ct3);
		panelC.add(Ct4);
		panelC.add(Ct5);
		panelC.add(Ct6);
		panelC.add(Ct7);
		panelC.add(Cl8);
		panelC.add(Ct9);
		add(panelC);
		
		
		panelD = new JPanel();
		Dt1 = new JTextField();
		Dl2 = new JLabel("  6");
		Dt3 = new JTextField();
		Dl4 = new JLabel("  2");
		Dl5 = new JLabel("  8");
		Dt6 = new JTextField();
		Dl7 = new JLabel("  5");
		Dt8 = new JTextField();
		Dt9 = new JTextField();
		panelD.add(Dt1);
		panelD.add(Dl2);
		panelD.add(Dt3);
		panelD.add(Dl4);
		panelD.add(Dl5);
		panelD.add(Dt6);
		panelD.add(Dl7);
		panelD.add(Dt8);
		panelD.add(Dt9);
		add(panelD);
		
		
		panelE = new JPanel();
		Et1 = new JTextField();
		El2= new JLabel(" 5");
		Et3 = new JTextField();
		Et4 = new JTextField();
		Et5 = new JTextField();
		Et6 = new JTextField();
		Et7 = new JTextField();
		El8 = new JLabel(" 3");
		El9 = new JLabel(" 4");
		panelE.add(Et1);
		panelE.add(El2);
		panelE.add(Et3);
		panelE.add(Et4);
		panelE.add(Et5);
		panelE.add(Et6);
		panelE.add(Et7);
		panelE.add(El8);
		panelE.add(El9);
		add(panelE);
		
		
		panelF = new JPanel();
		Ft1 = new JTextField();
		Fl2 = new JLabel("  4");
		Fl3 = new JLabel("  1");
		Fl4 = new JLabel("  5");
		Ft5 = new JTextField();
		Ft6 = new JTextField();
		Ft7 = new JTextField();
		Ft8 = new JTextField();
		Fl9 = new JLabel("  6");
		panelF.add(Ft1);
		panelF.add(Fl2);
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
		Gl3 = new JLabel("  8");
		Gt4 = new JTextField();
		Gl5 = new JLabel("  9");
		Gl6 = new JLabel("  5");
		Gt7 = new JTextField();
		Gt8 = new JTextField();
		Gl9 = new JLabel("  1");
		panelG.add(Gt1);
		panelG.add(Gt2);
		panelG.add(Gl3);
		panelG.add(Gt4);
		panelG.add(Gl5);
		panelG.add(Gl6);
		panelG.add(Gt7);
		panelG.add(Gt8);
		panelG.add(Gl9);
		add(panelG);
		
		
		panelH = new JPanel();
		Hl1 = new JLabel("  4");
		Ht2 = new JTextField();
		Ht3 = new JTextField();
		Hl4 = new JLabel("  7");
		Ht5 = new JTextField();
		Ht6 = new JTextField();
		Hl7 = new JLabel("  3");
		Hl8 = new JLabel("  8");
		Ht9 = new JTextField();
		panelH.add(Hl1);
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
		It3= new  JTextField();
		It4 = new JTextField();
		It5 = new JTextField();
		Il6 = new JLabel("  8");
		It7 = new JTextField();
		It8 = new JTextField();
		Il9 = new JLabel("  2");
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
        dispose();
        new Challenge4();
    }
    private void C_5(ActionEvent evt){
        dispose();
        new Challenge5();
    }
    private void C_6(ActionEvent evt){
        String alert = "Challenge Six";
        Classes.ALERT(alert);
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
            Al4, Al5, Al7, Al9, 
            Bl1, Bl9,
            Cl1, Cl8,
            Dl2, Dl4, Dl5, Dl7,  
            El2, El8, El9,  
            Fl2, Fl3, Fl4, Fl9,
            Gl3, Gl5, Gl6, Gl9, 
            Hl1, Hl4, Hl7, Hl8, 
            Il2, Il6, Il9 
          };
    
    JTextField [] list = {
           At1, At2, At3, At6, At8,
            Bt2, Bt3, Bt4, Bt5, Bt6, Bt7, Bt8,
            Ct2, Ct3, Ct4, Ct5, Ct6, Ct7, Ct9,
            Dt1, Dt3, Dt6, Dt8, Dt9,
            Et1, Et3, Et4, Et5, Et6, Et7,
            Ft1, Ft5, Ft6, Ft7, Ft8, 
            Gt1, Gt2, Gt4, Gt7, Gt8,
            Ht2, Ht3, Ht5, Ht6, Ht9, 
            It1, It3, It4, It5, It7, It8
    };
    
     Classes.LABEL_PROPS(label);
        Classes.TEXTFIELD_PROPS(list);
        Classes.JPANEL_LAYOUT(panel);
        Classes.JPANEL_LEVEL6(panel);

    }
    
	private void pre(ActionEvent evt){
		
		dispose();
                new Challenge5();
	
	}
        private void next(ActionEvent evt){
		
	dispose();
        new Challenge7();
	
	}
    private void resetActionPerformed(ActionEvent evt) {
    JTextField[] list = {
                   At1, At2, At3, At6, At8,
            Bt2, Bt3, Bt4, Bt5, Bt6, Bt7, Bt8,
            Ct2, Ct3, Ct4, Ct5, Ct6, Ct7, Ct9,
            Dt1, Dt3, Dt6, Dt8, Dt9,
            Et1, Et3, Et4, Et5, Et6, Et7,
            Ft1, Ft5, Ft6, Ft7, Ft8, 
            Gt1, Gt2, Gt4, Gt7, Gt8,
            Ht2, Ht3, Ht5, Ht6, Ht9, 
            It1, It3, It4, It5, It7, It8
		};
		
		Classes.RESET(list);
		
	}
    private void CONFIRM(){
        
        int
            at1, at2, at3, at6, at8,
            bt2, bt3, bt4, bt5, bt6, bt7, bt8,
            ct2, ct3, ct4, ct5, ct6, ct7, ct9,
            dt1, dt3, dt6, dt8, dt9,
            et1, et3, et4, et5, et6, et7,
            ft1, ft5, ft6, ft7, ft8, 
            gt1, gt2, gt4, gt7, gt8,
            ht2, ht3, ht5, ht6, ht9, 
            it1, it3, it4, it5, it7, it8
           ;
                    
    JTextField [] list = {
            At1, At2, At3, At6, At8,
            Bt2, Bt3, Bt4, Bt5, Bt6, Bt7, Bt8,
            Ct2, Ct3, Ct4, Ct5, Ct6, Ct7, Ct9,
            Dt1, Dt3, Dt6, Dt8, Dt9,
            Et1, Et3, Et4, Et5, Et6, Et7,
            Ft1, Ft5, Ft6, Ft7, Ft8, 
            Gt1, Gt2, Gt4, Gt7, Gt8,
            Ht2, Ht3, Ht5, Ht6, Ht9, 
            It1, It3, It4, It5, It7, It8
    };
    
        int [] gettext = {	
                        at1 = Integer.parseInt(At1.getText()),at2 = Integer.parseInt(At2.getText()),at3 = Integer.parseInt(At3.getText()),
                        at6 = Integer.parseInt(At6.getText()),at8 = Integer.parseInt(At8.getText()),bt2 = Integer.parseInt(Bt2.getText()),	
                        bt3 = Integer.parseInt(Bt3.getText()),bt4 = Integer.parseInt(Bt4.getText()),bt5 = Integer.parseInt(Bt5.getText()),
                        bt6 = Integer.parseInt(Bt6.getText()),bt7 = Integer.parseInt(Bt7.getText()),bt8 = Integer.parseInt(Bt8.getText()),
                        ct2 = Integer.parseInt(Ct2.getText()),ct3 = Integer.parseInt(Ct3.getText()),ct4 = Integer.parseInt(Ct4.getText()),
                        ct5 = Integer.parseInt(Ct5.getText()),ct6 = Integer.parseInt(Ct6.getText()),ct7 = Integer.parseInt(Ct7.getText()),
                        ct9 = Integer.parseInt(Ct9.getText()),dt1 = Integer.parseInt(Dt1.getText()),dt3 = Integer.parseInt(Dt3.getText()),
                        dt6 = Integer.parseInt(Dt6.getText()),dt8 = Integer.parseInt(Dt8.getText()),dt9 = Integer.parseInt(Dt9.getText()),
                        et1 = Integer.parseInt(Et1.getText()),et3 = Integer.parseInt(Et3.getText()),et4 = Integer.parseInt(Et4.getText()),
                        et5 = Integer.parseInt(Et5.getText()),et6 = Integer.parseInt(Et6.getText()),et7 = Integer.parseInt(Et7.getText()),
                        ft1 = Integer.parseInt(Ft1.getText()),ft5 = Integer.parseInt(Ft5.getText()),ft6 = Integer.parseInt(Ft6.getText()),
                        ft7 = Integer.parseInt(Ft7.getText()),ft8 = Integer.parseInt(Ft8.getText()),gt1 = Integer.parseInt(Gt1.getText()),
                        gt2 = Integer.parseInt(Gt2.getText()),gt4 = Integer.parseInt(Gt4.getText()),gt7 = Integer.parseInt(Gt7.getText()),
                        gt8 = Integer.parseInt(Gt8.getText()),ht2 = Integer.parseInt(Ht2.getText()),ht3 = Integer.parseInt(Ht3.getText()),
                        ht5 = Integer.parseInt(Ht5.getText()),ht6 = Integer.parseInt(Ht6.getText()),ht9 = Integer.parseInt(Ht9.getText()),
                        it1 = Integer.parseInt(It1.getText()),it3 = Integer.parseInt(It3.getText()),it4 = Integer.parseInt(It4.getText()),
                        it5 = Integer.parseInt(It5.getText()),it7 = Integer.parseInt(It7.getText()),it8 = Integer.parseInt(It8.getText()) 
                };
        boolean check = false;
        
          int [] correctvalues = {
            1, 5, 9, 6, 7, 
            4, 3, 5, 2, 7, 1, 9, 
            2, 7, 1, 9, 4, 8, 3, 
            9, 3, 4, 1, 7, 
            2, 8, 6, 7, 1, 9, 
            7, 3, 9, 2, 8, 
            6, 2, 3, 7, 4, 
            1, 9, 6, 2, 5, 
            3, 5, 4, 1, 9, 6
    };
     
		Classes.CONFIRM(list, gettext, correctvalues, check );
                if(check == true){
                    
                }
    }
    public static void main(String[] args){
        new Challenge6();
    }
}
