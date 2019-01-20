
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

public class Challenge2 extends JFrame{
    JPanel  panelA, panelB, panelC, 
	    panelD, panelE, panelF, 
	    panelG, panelH, panelI;
	
    JMenuBar menubar;
    JMenuItem exit, next, pre, comfirm, reset,  F1, c1, c2, c3, c4, c5, c6, c7;
    JMenu challenge;
    JLabel
            Al2, Al6, Al7, 
            Bl2, Bl5, Bl7,
            Cl3, Cl5, Cl9,
            Dl1, Dl3, Dl5, Dl6,  
            El6, El7, El8, El9, 
            Fl2, Fl3, Fl8,
            Gl2, Gl7, Gl8,
            Hl4, Hl5, Hl9,
            Il1, Il2, Il4, Il7 ;
    
    JTextField 
            At1, At3, At4, At5,  At8, At9, 
            Bt1, Bt3, Bt4, Bt6, Bt8, Bt9,
            Ct1, Ct2, Ct4, Ct6, Ct7, Ct8,
            Dt2, Dt4, Dt7, Dt8, Dt9, 
            Et1, Et2, Et3, Et4, Et5,
            Ft1, Ft4, Ft5, Ft6, Ft7, Ft9, 
            Gt1, Gt3, Gt4, Gt5, Gt6, Gt9, 
            Ht1, Ht2, Ht3, Ht6, Ht7, Ht8, 
            It3, It5, It6, It8, It9;
    
    public Challenge2(){
        setSize(364, 350);
		setTitle("Challenge   2");
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
		Al2 = new  JLabel("  2");
		At3 = new JTextField();
		At4 = new JTextField();
		At5 = new JTextField();
		Al6 = new JLabel("  6");
		Al7 = new JLabel("  8");
		At8 = new JTextField();
		At9 = new JTextField();
		panelA.add(At1);
		panelA.add(Al2);
		panelA.add(At3);
		panelA.add(At4);
		panelA.add(At5);
		panelA.add(Al6);
		panelA.add(Al7);
		panelA.add(At8);
		panelA.add(At9);
		add(panelA);
		
		
		panelB = new JPanel();
		Bt1 = new JTextField();
		Bl2 = new JLabel("  3");
		Bt3 = new JTextField();
		Bt4 = new JTextField();
		Bl5 = new JLabel("  9");
		Bt6 = new JTextField();
		Bl7 = new JLabel("  7");
		Bt8 = new  JTextField();
		Bt9 = new JTextField();
		panelB.add(Bt1);
		panelB.add(Bl2);
		panelB.add(Bt3);
		panelB.add(Bt4);
		panelB.add(Bl5);
		panelB.add(Bt6);
		panelB.add(Bl7);
		panelB.add(Bt8);
		panelB.add(Bt9);
		add(panelB);
		
		
		panelC = new JPanel();
		Ct1 = new JTextField();
		Ct2 = new JTextField();
		Cl3 = new JLabel("  1");
		Ct4 = new JTextField(); 
		Cl5 = new JLabel("  5");
		Ct6 = new JTextField();
		Ct7 = new JTextField();
		Ct8 = new JTextField();
		Cl9 = new JLabel("  9");
		panelC.add(Ct1);
		panelC.add(Ct2);
		panelC.add(Cl3);
		panelC.add(Ct4);
		panelC.add(Cl5);
		panelC.add(Ct6);
		panelC.add(Ct7);
		panelC.add(Ct8);
		panelC.add(Cl9);
		add(panelC);
		
		
		panelD = new JPanel();
		Dl1 = new JLabel("  9");
		Dt2 = new  JTextField();
		Dl3 = new JLabel("  4");
		Dt4 = new JTextField();
		Dl5 = new JLabel("  8");
		Dl6 = new JLabel("  3");
		Dt7 = new JTextField();
		Dt8 = new JTextField();
		Dt9 = new JTextField();
		panelD.add(Dl1);
		panelD.add(Dt2);
		panelD.add(Dl3);
		panelD.add(Dt4);
		panelD.add(Dl5);
		panelD.add(Dl6);
		panelD.add(Dt7);
		panelD.add(Dt8);
		panelD.add(Dt9);
		add(panelD);
		
		
		panelE = new JPanel();
		Et1 = new JTextField();
		Et2= new JTextField();
		Et3 = new JTextField();
		Et4 = new JTextField();
		Et5 = new JTextField();
		El6 = new JLabel(" 7");
		El7 = new JLabel(" 9");
		El8 = new JLabel(" 5");
		El9 = new JLabel(" 1");
		panelE.add(Et1);
		panelE.add(Et2);
		panelE.add(Et3);
		panelE.add(Et4);
		panelE.add(Et5);
		panelE.add(El6);
		panelE.add(El7);
		panelE.add(El8);
		panelE.add(El9);
		add(panelE);
		
		
		panelF = new JPanel();
		Ft1 = new JTextField();
		Fl2 = new JLabel("  2");
		Fl3 = new JLabel("  5");
		Ft4 = new JTextField();
		Ft5 = new JTextField();
		Ft6 = new JTextField();
		Ft7 = new JTextField();
		Fl8 = new JLabel("  3");
		Ft9 = new JTextField();
		panelF.add(Ft1);
		panelF.add(Fl2);
		panelF.add(Fl3);
		panelF.add(Ft4);
		panelF.add(Ft5);
		panelF.add(Ft6);
		panelF.add(Ft7);
		panelF.add(Fl8);
		panelF.add(Ft9);
		add(panelF);
		
		
		panelG = new JPanel();
		Gt1 = new JTextField();
		Gl2 = new JLabel(" 3");
		Gt3 = new JTextField();
		Gt4 = new JTextField();
		Gt5 = new JTextField();
		Gt6 = new JTextField();
		Gl7 = new JLabel("  7");
		Gl8 = new  JLabel("  4");
		Gt9 = new JTextField();
		panelG.add(Gt1);
		panelG.add(Gl2);
		panelG.add(Gt3);
		panelG.add(Gt4);
		panelG.add(Gt5);
		panelG.add(Gt6);
		panelG.add(Gl7);
		panelG.add(Gl8);
		panelG.add(Gt9);
		add(panelG);
		
		
		panelH = new JPanel();
		Ht1 = new JTextField();
		Ht2 = new JTextField();
		Ht3 = new JTextField();
		Hl4 = new JLabel("  8");
		Hl5 = new JLabel("  4");
		Ht6 = new JTextField();
		Ht7 = new JTextField();
		Ht8 = new JTextField();
		Hl9 = new JLabel("  9");
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
		Il1 = new JLabel("  9");
		Il2 = new JLabel("  1");
		It3= new JTextField();
		Il4 = new JLabel("  2");
		It5 = new JTextField();
		It6 = new JTextField();
		Il7 = new JLabel("  5");
		It8 = new JTextField();
		It9 = new JTextField();
		panelI.add(Il1);
		panelI.add(Il2);
		panelI.add(It3);
		panelI.add(Il4);
		panelI.add(It5);
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
        String alert = "Challenge Two";
        Classes.ALERT(alert);
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
             Al2, Al6, Al7, 
            Bl2, Bl5, Bl7,
            Cl3, Cl5, Cl9,
            Dl1, Dl3, Dl5, Dl6,  
            El6, El7, El8, El9, 
            Fl2, Fl3, Fl8,
            Gl2, Gl7, Gl8,
            Hl4, Hl5, Hl9,
            Il1, Il2, Il4, Il7 
          };
    
    JTextField [] list = {
              At1, At3, At4, At5,  At8, At9, 
            Bt1, Bt3, Bt4, Bt6, Bt8, Bt9,
            Ct1, Ct2, Ct4, Ct6, Ct7, Ct8,
            Dt2, Dt4, Dt7, Dt8, Dt9, 
            Et1, Et2, Et3, Et4, Et5,
            Ft1, Ft4, Ft5, Ft6, Ft7, Ft9, 
            Gt1, Gt3, Gt4, Gt5, Gt6, Gt9, 
            Ht1, Ht2, Ht3, Ht6, Ht7, Ht8, 
            It3, It5, It6, It8, It9
    };
    
     Classes.LABEL_PROPS(label);
        Classes.TEXTFIELD_PROPS(list);
        Classes.JPANEL_LAYOUT(panel);
        Classes.JPANEL_LEVEL2(panel);

    }
    
	private void pre(ActionEvent evt){
            
            dispose();
            Challenge1 s = new Challenge1();
            s.setVisible(true);
		
	
	}
        
	private void next(ActionEvent evt){
                dispose();
		new Challenge3();
	
	}
    private void resetActionPerformed(ActionEvent evt) {
    JTextField[] list = {
                    At1, At3, At4, At5,  At8, At9, 
            Bt1, Bt3, Bt4, Bt6, Bt8, Bt9,
            Ct1, Ct2, Ct4, Ct6, Ct7, Ct8,
            Dt2, Dt4, Dt7, Dt8, Dt9, 
            Et1, Et2, Et3, Et4, Et5,
            Ft1, Ft4, Ft5, Ft6, Ft7, Ft9, 
            Gt1, Gt3, Gt4, Gt5, Gt6, Gt9, 
            Ht1, Ht2, Ht3, Ht6, Ht7, Ht8, 
            It3, It5, It6, It8, It9
    };
		
		Classes.RESET(list);
		
	}
    private void CONFIRM(){
        
        int  at1, at3, at4, at5,  at8, at9, 
            bt1, bt3, bt4, bt6, bt8, bt9,
            ct1, ct2, ct4, ct6, ct7, ct8,
            dt2, dt4, dt7, dt8, dt9, 
            et1, et2, et3, et4, et5,
            ft1, ft4, ft5, ft6, ft7, ft9, 
            gt1, gt3, gt4, gt5, gt6, gt9, 
            ht1, ht2, ht3, ht6, ht7, ht8, 
            it3, it5, it6, it8, it9
           ;
                    
    JTextField [] list = {
            At1, At3, At4, At5,  At8, At9, 
            Bt1, Bt3, Bt4, Bt6, Bt8, Bt9,
            Ct1, Ct2, Ct4, Ct6, Ct7, Ct8,
            Dt2, Dt4, Dt7, Dt8, Dt9, 
            Et1, Et2, Et3, Et4, Et5,
            Ft1, Ft4, Ft5, Ft6, Ft7, Ft9, 
            Gt1, Gt3, Gt4, Gt5, Gt6, Gt9, 
            Ht1, Ht2, Ht3, Ht6, Ht7, Ht8, 
            It3, It5, It6, It8, It9
    };
    
        int [] gettext = {	
                        at1 = Integer.parseInt(At1.getText()),at3 = Integer.parseInt(At3.getText()),at4 = Integer.parseInt(At4.getText()),
                        at5 = Integer.parseInt(At5.getText()),at8 = Integer.parseInt(At8.getText()),at9 = Integer.parseInt(At9.getText()),	
                        bt1 = Integer.parseInt(Bt1.getText()),bt3 = Integer.parseInt(Bt3.getText()),bt4 = Integer.parseInt(Bt4.getText()),
                        bt6 = Integer.parseInt(Bt6.getText()),bt8 = Integer.parseInt(Bt8.getText()),bt9 = Integer.parseInt(Bt9.getText()),
                        ct1 = Integer.parseInt(Ct1.getText()),ct1 = Integer.parseInt(Ct2.getText()),ct4 = Integer.parseInt(Ct4.getText()),
                        ct6 = Integer.parseInt(Ct6.getText()),ct7 = Integer.parseInt(Ct7.getText()),ct8 = Integer.parseInt(Ct8.getText()),dt2 = Integer.parseInt(Dt2.getText()),
                        dt4 = Integer.parseInt(Dt4.getText()),dt7 = Integer.parseInt(Dt7.getText()),
                        dt8 = Integer.parseInt(Dt8.getText()),dt9 = Integer.parseInt(Dt9.getText()),et1 = Integer.parseInt(Et1.getText()),
                        et2 = Integer.parseInt(Et2.getText()),et3 = Integer.parseInt(Et3.getText()),et4 = Integer.parseInt(Et4.getText()),
                        et5 = Integer.parseInt(Et5.getText()),ft1 = Integer.parseInt(Ft1.getText()),ft4 = Integer.parseInt(Ft4.getText()),
                        ft5 = Integer.parseInt(Ft5.getText()),ft6 = Integer.parseInt(Ft6.getText()),ft7 = Integer.parseInt(Ft7.getText()),
                        ft9 = Integer.parseInt(Ft9.getText()),gt1 = Integer.parseInt(Gt1.getText()),gt3 = Integer.parseInt(Gt3.getText()),
                        gt4 = Integer.parseInt(Gt4.getText()),gt5 = Integer.parseInt(Gt5.getText()),gt6 = Integer.parseInt(Gt6.getText()),
                        gt9 = Integer.parseInt(Gt9.getText()),ht1 = Integer.parseInt(Ht1.getText()),ht2 = Integer.parseInt(Ht2.getText()),
                        ht3 = Integer.parseInt(Ht3.getText()),ht6 = Integer.parseInt(Ht6.getText()),ht7 = Integer.parseInt(Ht7.getText()),
                        ht8 = Integer.parseInt(Ht8.getText()),it3 = Integer.parseInt(It3.getText()),it5 = Integer.parseInt(It5.getText()),
                        it6 = Integer.parseInt(It6.getText()),it6 = Integer.parseInt(It6.getText()),it9 = Integer.parseInt(It9.getText()),
                       
                };
        boolean check = false;
        
          int [] correctvalues = {
            4, 9, 3, 7, 5, 1, 
            5, 8, 1, 4, 6, 2, 
            6, 7, 8, 2, 3, 4, 
            1, 5, 2, 6, 7, 
            3, 8, 6, 4, 2, 
            7, 1, 9, 6, 4, 8, 
            6, 8, 1, 9, 5, 2, 
            2, 7, 5, 3, 6, 1, 
            4, 6, 7, 8, 3
              
    };
     
		Classes.CONFIRM(list, gettext, correctvalues, check );
                if(check == true){
                    
                }
    }
    public static void main(String[] args){
        new Challenge2();
    }
}
