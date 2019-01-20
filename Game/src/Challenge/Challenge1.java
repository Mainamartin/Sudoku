
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

public class Challenge1 extends JFrame{
    JPanel  panelA, panelB, panelC, 
	    panelD, panelE, panelF, 
	    panelG, panelH, panelI;
	
    JMenuBar menubar;
    JMenuItem exit, next, pre, comfirm, reset,  F1, c1, c2, c3, c4, c5, c6, c7;
    JMenu challenge;
    JLabel
            Al5, Al6, Al7, 
            Bl1, Bl7, Bl8,
            Cl1, CL2, Cl3, Cl5,
            Dl2, Dl8, Dl9, 
            El2, El6, 
            Fl1, Fl4, Fl8, Fl9,
            Gl4, Gl6, Gl7,
            Hl2, Hl3, Hl4, Hl5, 
            Il3, Il6, Il7, Il9 ;
    
    JTextField 
            At1, At2, At3, At4, At8, At9, 
            Bt2, Bt3, Bt4, Bt5, Bt6, Bt9,
            Ct4, Ct6, Ct7, Ct8, Ct9,
            Dt1, Dt3, Dt4, Dt5, Dt6, Dt7, 
            Et1, Et3, Et4, Et5, Et7, Et8, Et9,
            Ft2, Ft3, Ft5, Ft6, Ft7, 
            Gt1, Gt2, Gt3, Gt5, Gt8, Gt9, 
            Ht1, Ht6, Ht7, Ht8, Ht9, 
            It1, It2, It4, It5, It8;
    
    public Challenge1(){
        setSize(364, 350);
		setTitle("Challenge   1");
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
		At4 = new JTextField();
		Al5 = new  JLabel("  8");
		Al6 = new JLabel("  2");
		Al7 = new JLabel("  1");
		At8 = new JTextField();
		At9 = new JTextField();
		panelA.add(At1);
		panelA.add(At2);
		panelA.add(At3);
		panelA.add(At4);
		panelA.add(Al5);
		panelA.add(Al6);
		panelA.add(Al7);
		panelA.add(At8);
		panelA.add(At9);
		add(panelA);
		
		
		panelB = new JPanel();
		Bl1 = new JLabel("  8");
		Bt2 = new JTextField();
		Bt3 = new JTextField();
		Bt4 = new JTextField();
		Bt5 = new JTextField();
		Bt6 = new JTextField();
		Bl7 = new JLabel("  5");
		Bl8 = new JLabel("  2");
		Bt9 = new JTextField();
		panelB.add(Bl1);
		panelB.add(Bt2);
		panelB.add(Bt3);
		panelB.add(Bt4);
		panelB.add(Bt5);
		panelB.add(Bt6);
		panelB.add(Bl7);
		panelB.add(Bl8);
		panelB.add(Bt9);
		add(panelB);
		
		
		panelC = new JPanel();
		Cl1 = new JLabel("  7");
		CL2 = new JLabel("  2");
		Cl3 = new JLabel("  5");
		Ct4 = new JTextField(); 
		Cl5 = new JLabel("  9");
		Ct6 = new JTextField();
		Ct7 = new JTextField();
		Ct8 = new JTextField();
		Ct9 = new JTextField();
		panelC.add(Cl1);
		panelC.add(CL2);
		panelC.add(Cl3);
		panelC.add(Ct4);
		panelC.add(Cl5);
		panelC.add(Ct6);
		panelC.add(Ct7);
		panelC.add(Ct8);
		panelC.add(Ct9);
		add(panelC);
		
		
		panelD = new JPanel();
		Dt1 = new JTextField();
		Dl2 = new JLabel("  7");
		Dt3 = new JTextField();
		Dt4 = new JTextField();
		Dt5 = new JTextField();
		Dt6 = new JTextField();
		Dt7 = new JTextField();
		Dl8 = new JLabel("  2");
		Dl9 = new JLabel("  4");
		panelD.add(Dt1);
		panelD.add(Dl2);
		panelD.add(Dt3);
		panelD.add(Dt4);
		panelD.add(Dt5);
		panelD.add(Dt6);
		panelD.add(Dt7);
		panelD.add(Dl8);
		panelD.add(Dl9);
		add(panelD);
		
		
		panelE = new JPanel();
		Et1 = new JTextField();
		El2= new JLabel(" 1");
		Et3 = new JTextField();
		Et4 = new JTextField();
		Et5 = new JTextField();
		El6 = new JLabel(" 6");
		Et7 = new JTextField();
		Et8 = new JTextField();
		Et9 = new JTextField();
		panelE.add(Et1);
		panelE.add(El2);
		panelE.add(Et3);
		panelE.add(Et4);
		panelE.add(Et5);
		panelE.add(El6);
		panelE.add(Et7);
		panelE.add(Et8);
		panelE.add(Et9);
		add(panelE);
		
		
		panelF = new JPanel();
		Fl1 = new JLabel("  9");
		Ft2 = new JTextField();
		Ft3 = new JTextField();
		Fl4 = new JLabel("  4");
		Ft5 = new JTextField();
		Ft6 = new JTextField();
		Ft7 = new JTextField();
		Fl8 = new JLabel("  8");
		Fl9 = new JLabel("  6");
		panelF.add(Fl1);
		panelF.add(Ft2);
		panelF.add(Ft3);
		panelF.add(Fl4);
		panelF.add(Ft5);
		panelF.add(Ft6);
		panelF.add(Ft7);
		panelF.add(Fl8);
		panelF.add(Fl9);
		add(panelF);
		
		
		panelG = new JPanel();
		Gt1 = new JTextField();
		Gt2 = new JTextField();
		Gt3 = new JTextField();
		Gl4 = new JLabel("  2");
		Gt5 = new JTextField();
		Gl6 = new JLabel("  5");
		Gl7 = new JLabel("  7");
		Gt8 = new JTextField();
		Gt9 = new JTextField();
		panelG.add(Gt1);
		panelG.add(Gt2);
		panelG.add(Gt3);
		panelG.add(Gl4);
		panelG.add(Gt5);
		panelG.add(Gl6);
		panelG.add(Gl7);
		panelG.add(Gt8);
		panelG.add(Gt9);
		add(panelG);
		
		
		panelH = new JPanel();
		Ht1 = new JTextField();
		Hl2 = new JLabel("  3");
		Hl3 = new JLabel("  5");
		Hl4 = new JLabel("  1");
		Hl5 = new JLabel("  4");
		Ht6 = new JTextField();
		Ht7 = new JTextField();
		Ht8 = new JTextField();
		Ht9 = new JTextField();
		panelH.add(Ht1);
		panelH.add(Hl2);
		panelH.add(Hl3);
		panelH.add(Hl4);
		panelH.add(Hl5);
		panelH.add(Ht6);
		panelH.add(Ht7);
		panelH.add(Ht8);
		panelH.add(Ht9);
		add(panelH);
		
		
		panelI = new JPanel();
		It1 = new JTextField();
		It2 = new JTextField();
		Il3= new JLabel("  4");
		It4 = new JTextField();
		It5 = new JTextField();
		Il6 = new JLabel("  3");
		Il7 = new JLabel("  5");
		It8 = new JTextField();
		Il9 = new JLabel("  9");
		panelI.add(It1);
		panelI.add(It2);
		panelI.add(Il3);
		panelI.add(It4);
		panelI.add(It5);
		panelI.add(Il6);
		panelI.add(Il7);
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
        String alert = "Challenge One";
        Classes.ALERT(alert);
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
            Al5, Al6, Al7, 
            Bl1, Bl7, Bl8,
            Cl1, CL2, Cl3, Cl5,
            Dl2, Dl8, Dl9, 
            El2, El6, 
            Fl1, Fl4, Fl8, Fl9,
            Gl4, Gl6, Gl7,
            Hl2, Hl3, Hl4, Hl5, 
            Il3, Il6, Il7, Il9 
          };
    
    JTextField [] list = {
            At1, At2, At3, At4, At8, At9, 
            Bt2, Bt3, Bt4, Bt5, Bt6, Bt9,
            Ct4, Ct6, Ct7, Ct8, Ct9,
            Dt1, Dt3, Dt4, Dt5, Dt6, Dt7, 
            Et1, Et3, Et4, Et5, Et7, Et8, Et9,
            Ft2, Ft3, Ft5, Ft6, Ft7, 
            Gt1, Gt2, Gt3, Gt5, Gt8, Gt9, 
            Ht1, Ht6, Ht7, Ht8, Ht9, 
            It1, It2, It4, It5, It8
    };
    
     Classes.LABEL_PROPS(label);
        Classes.TEXTFIELD_PROPS(list);
        Classes.JPANEL_LAYOUT(panel);
        Classes.JPANEL_LEVEL1(panel);

    }
    
	private void pre(ActionEvent evt){
		
		JOptionPane.showMessageDialog(null, "This is the First Challenge", "Alert!", JOptionPane.PLAIN_MESSAGE);
	
	}
        private void next(ActionEvent evt){
		
	dispose();
        new Challenge2();
	
	}
    private void resetActionPerformed(ActionEvent evt) {
    JTextField[] list = {
                    At1, At2, At3, At4, At8, At9, 
                    Bt2, Bt3, Bt4, Bt5, Bt6, Bt9,
                    Ct4, Ct6, Ct7, Ct8, Ct9,
                    Dt1, Dt3, Dt4, Dt5, Dt6, Dt7, 
                    Et1, Et3, Et4, Et5, Et7, Et8, Et9,
                    Ft2, Ft3, Ft5, Ft6, Ft7, 
                    Gt1, Gt2, Gt3, Gt5, Gt8, Gt9, 
                    Ht1, Ht6, Ht7, Ht8, Ht9, 
                    It1, It2, It4, It5, It8
		};
		
		Classes.RESET(list);
		
	}
    private void CONFIRM(){
        
        int at1, at2, at3, at4, at8, at9,
            bt2, bt3,  bt4, bt5, bt6, bt9,
            ct4, ct6, ct7, ct8, ct9,
            dt1, dt3, dt4, dt5, dt6, dt7, 
            et1, et3, et4, et5, et7, et8, et9,
            ft2, ft3, ft5, ft6, ft7, 
            gt1, gt2, gt3, gt5, gt8, gt9, 
            ht1, ht6, ht7, ht8, ht9, 
            it1, it2, it4, it5, it8
           ;
                    
    JTextField [] list = {
            At1, At2, At3, At4, At8, At9, 
            Bt2, Bt3, Bt4, Bt5, Bt6, Bt9,
            Ct4, Ct6, Ct7, Ct8, Ct9,
            Dt1, Dt3, Dt4, Dt5, Dt6, Dt7, 
            Et1, Et3, Et4, Et5, Et7, Et8, Et9,
            Ft2, Ft3, Ft5, Ft6, Ft7, 
            Gt1, Gt2, Gt3, Gt5, Gt8, Gt9, 
            Ht1, Ht6, Ht7, Ht8, Ht9, 
            It1, It2, It4, It5, It8
    };
    
        int [] gettext = {	
                        at1 = Integer.parseInt(At1.getText()),at2 = Integer.parseInt(At2.getText()),at3 = Integer.parseInt(At3.getText()),
                        at4 = Integer.parseInt(At4.getText()),at8 = Integer.parseInt(At8.getText()),at9 = Integer.parseInt(At9.getText()),	
                        bt2 = Integer.parseInt(Bt2.getText()),bt3 = Integer.parseInt(Bt3.getText()),bt4 = Integer.parseInt(Bt4.getText()),
                        bt5 = Integer.parseInt(Bt5.getText()),bt6 = Integer.parseInt(Bt6.getText()),bt9 = Integer.parseInt(Bt9.getText()),
                        ct4 = Integer.parseInt(Ct4.getText()),ct6 = Integer.parseInt(Ct6.getText()),ct7 = Integer.parseInt(Ct7.getText()),
                        ct8 = Integer.parseInt(Ct8.getText()),ct9 = Integer.parseInt(Ct9.getText()),dt1 = Integer.parseInt(Dt1.getText()),
                        dt3 = Integer.parseInt(Dt3.getText()),dt4 = Integer.parseInt(Dt4.getText()),dt5 = Integer.parseInt(Dt5.getText()),
                        dt6 = Integer.parseInt(Dt6.getText()),dt7 = Integer.parseInt(Dt7.getText()),et1 = Integer.parseInt(Et1.getText()),
                        et3 = Integer.parseInt(Et3.getText()),et4 = Integer.parseInt(Et4.getText()),et5 = Integer.parseInt(Et5.getText()),
                        et7 = Integer.parseInt(Et7.getText()),et8 = Integer.parseInt(Et8.getText()),et9 = Integer.parseInt(Et9.getText()),
                        ft2 = Integer.parseInt(Ft2.getText()),ft3 = Integer.parseInt(Ft3.getText()),ft5 = Integer.parseInt(Ft5.getText()),
                        ft6 = Integer.parseInt(Ft6.getText()),ft7 = Integer.parseInt(Ft7.getText()),gt1 = Integer.parseInt(Gt1.getText()),
                        gt2 = Integer.parseInt(Gt2.getText()),gt3 = Integer.parseInt(Gt3.getText()),gt5 = Integer.parseInt(Gt5.getText()),
                        gt8 = Integer.parseInt(Gt8.getText()),gt9 = Integer.parseInt(Gt9.getText()),ht1 = Integer.parseInt(Ht1.getText()),
                        ht6 = Integer.parseInt(Ht6.getText()),ht7 = Integer.parseInt(Ht7.getText()),ht8 = Integer.parseInt(Ht8.getText()),
                        ht9 = Integer.parseInt(Ht9.getText()),it1 = Integer.parseInt(It1.getText()),it2 = Integer.parseInt(It2.getText()),
                        it4 = Integer.parseInt(It4.getText()),it5 = Integer.parseInt(It5.getText()),it8 = Integer.parseInt(It8.getText()),
                        it8 = Integer.parseInt(It8.getText()) 
                };
        boolean check = false;
        
          int [] correctvalues = {
        4, 3, 9, 5, 6, 7,
        6, 1, 3, 7, 4, 9, 
        6, 1, 3, 4, 8, 
        3, 6, 8, 5, 1, 9, 
        4, 8, 2, 9, 7, 5, 3, 
        5, 2, 3, 7, 1, 
        6, 1, 8, 9, 4, 3, 
        9, 7, 6, 8, 2, 
        2, 7, 4, 6, 1
    };
     
		Classes.CONFIRM(list, gettext, correctvalues, check );
                if(check == true){
                    
                }
    }
    public static void main(String[] args){
        new Challenge1();
    }
}
