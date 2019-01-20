
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

public class Challenge5 extends JFrame{
    JPanel  panelA, panelB, panelC, 
	    panelD, panelE, panelF, 
	    panelG, panelH, panelI;
	
    JMenuBar menubar;
    JMenuItem exit, next, pre, comfirm, reset,  F1, c1, c2, c3, c4, c5, c6, c7;
    JMenu challenge;
    JLabel
            Al1, Al3, Al5, Al8, 
            Bl3, Bl4, Bl6, Bl9,
            Cl2, Cl3, Cl4, Cl7, Cl8,
            Dl6, Dl7,
            El2, El4, El7, El8,  
            Fl1, Fl3, Fl6,
            Gl2, Gl8, Gl9,
            Hl4, Hl8,
            Il2, Il4, Il6 ;
    
    JTextField 
            At2, At4, At6, At7, At9, 
            Bt1, Bt2, Bt5, Bt7, Bt8,
            Ct1, Ct5, Ct6, Ct9,
            Dt1, Dt2, Dt3, Dt4, Dt5, Dt8, Dt9, 
            Et1, Et3, Et5, Et6, Et9,
            Ft2, Ft4, Ft5, Ft7, Ft8, Ft9,  
            Gt1, Gt3, Gt4, Gt5, Gt6, Gt7, 
            Ht1, Ht2, Ht3, Ht5, Ht6, Ht7, Ht9, 
            It1, It3, It5, It7, It8, It9;
    
    public Challenge5(){
        setSize(364, 350);
		setTitle("Challenge   5");
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
		Al1 = new JLabel("  7");
		At2 = new JTextField();
		Al3 = new JLabel("  4");
		At4 = new JTextField();
		Al5 = new  JLabel("  8");
		At6 = new JTextField();
		At7 = new JTextField();
		Al8 = new JLabel("  5");
		At9 = new JTextField();
		panelA.add(Al1);
		panelA.add(At2);
		panelA.add(Al3);
		panelA.add(At4);
		panelA.add(Al5);
		panelA.add(At6);
		panelA.add(At7);
		panelA.add(Al8);
		panelA.add(At9);
		add(panelA);
		
		
		panelB = new JPanel();
		Bt1 = new JTextField();
		Bt2 = new JTextField();
		Bl3 = new JLabel("  8");
		Bl4 = new JLabel("  9");
		Bt5 = new JTextField();
		Bl6 = new JLabel("  3");
		Bt7 = new JTextField();
		Bt8 = new JTextField();
		Bl9 = new JLabel("  4");
		panelB.add(Bt1);
		panelB.add(Bt2);
		panelB.add(Bl3);
		panelB.add(Bl4);
		panelB.add(Bt5);
		panelB.add(Bl6);
		panelB.add(Bt7);
		panelB.add(Bt8);
		panelB.add(Bl9);
		add(panelB);
		
		
		panelC = new JPanel();
		Ct1 = new JTextField();
		Cl2 = new JLabel("  9");
		Cl3 = new JLabel("  3");
		Cl4 = new JLabel("  1");
		Ct5 = new JTextField(); 
		Ct6 = new JTextField();
		Cl7 = new JLabel("  8");
		Cl8 = new JLabel("  2");
		Ct9 = new JTextField();
		panelC.add(Ct1);
		panelC.add(Cl2);
		panelC.add(Cl3);
		panelC.add(Cl4);
		panelC.add(Ct5);
		panelC.add(Ct6);
		panelC.add(Cl7);
		panelC.add(Cl8);
		panelC.add(Ct9);
		add(panelC);
		
		
		panelD = new JPanel();
		Dt1 = new JTextField();
		Dt2 = new JTextField();
		Dt3 = new JTextField();
		Dt4 = new JTextField();
		Dt5 = new JTextField();
		Dl6 = new JLabel("  6");
		Dl7 = new JLabel("  9");
		Dt8 = new JTextField();
		Dt9 = new JTextField();
		panelD.add(Dt1);
		panelD.add(Dt2);
		panelD.add(Dt3);
		panelD.add(Dt4);
		panelD.add(Dt5);
		panelD.add(Dl6);
		panelD.add(Dl7);
		panelD.add(Dt8);
		panelD.add(Dt9);
		add(panelD);
		
		
		panelE = new JPanel();
		Et1 = new JTextField();
		El2 = new JLabel(" 1");
		Et3 = new JTextField();
		El4 = new JLabel(" 3");
		Et5 = new JTextField();
		Et6 = new JTextField();
		El7 = new JLabel(" 7");
		El8 = new JLabel(" 6");
		Et9 = new JTextField();
		panelE.add(Et1);
		panelE.add(El2);
		panelE.add(Et3);
		panelE.add(El4);
		panelE.add(Et5);
		panelE.add(Et6);
		panelE.add(El7);
		panelE.add(El8);
		panelE.add(Et9);
		add(panelE);
		
		
		panelF = new JPanel();
		Fl1 = new JLabel("  7");
		Ft2 = new JTextField();
		Fl3 = new JLabel("  2");
		Ft4 = new JTextField();
		Ft5 = new JTextField();
		Fl6 = new JLabel("  9");
		Ft7 = new JTextField();
		Ft8 = new JTextField();
		Ft9 = new JTextField();
		panelF.add(Fl1);
		panelF.add(Ft2);
		panelF.add(Fl3);
		panelF.add(Ft4);
		panelF.add(Ft5);
		panelF.add(Fl6);
		panelF.add(Ft7);
		panelF.add(Ft8);
		panelF.add(Ft9);
		add(panelF);
		
		
		panelG = new JPanel();
		Gt1 = new JTextField();
		Gl2 = new JLabel("  9");
		Gt3 = new JTextField();
		Gt4 = new JTextField();
		Gt5 = new JTextField();
		Gt6 = new JTextField();
		Gt7 = new JTextField();
		Gl8 = new JLabel("  6");
		Gl9 = new JLabel("  3");
		panelG.add(Gt1);
		panelG.add(Gl2);
		panelG.add(Gt3);
		panelG.add(Gt4);
		panelG.add(Gt5);
		panelG.add(Gt6);
		panelG.add(Gt7);
		panelG.add(Gl8);
		panelG.add(Gl9);
		add(panelG);
		
		
		panelH = new JPanel();
		Ht1 = new JTextField();
		Ht2 = new JTextField();
		Ht3 = new JTextField();
		Hl4 = new JLabel("  5");
		Ht5 = new JTextField();
		Ht6 = new JTextField();
		Ht7 = new JTextField();
		Hl8 = new JLabel("  4");
		Ht9 = new JTextField();
		panelH.add(Ht1);
		panelH.add(Ht2);
		panelH.add(Ht3);
		panelH.add(Hl4);
		panelH.add(Ht5);
		panelH.add(Ht6);
		panelH.add(Ht7);
		panelH.add(Hl8);
		panelH.add(Ht9);
		add(panelH);
		
		
		panelI = new JPanel();
		It1 = new JTextField();
		Il2 = new JLabel("  7");
		It3= new JTextField();
		Il4 = new JLabel("  6");
		It5 = new JTextField();
		Il6 = new JLabel("  8");
		It7 = new JTextField();
		It8 = new JTextField();
		It9 = new JTextField();
		panelI.add(It1);
		panelI.add(Il2);
		panelI.add(It3);
		panelI.add(Il4);
		panelI.add(It5);
		panelI.add(Il6);
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
        dispose();
        new Challenge3();
    }
    private void C_4(ActionEvent evt){
        dispose();
        new Challenge4();
    }
    private void C_5(ActionEvent evt){
        String alert = "Challenge Five";
        Classes.ALERT(alert);
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
            Al1, Al3, Al5, Al8, 
            Bl3, Bl4, Bl6, Bl9,
            Cl2, Cl3, Cl4, Cl7, Cl8,
            Dl6, Dl7,
            El2, El4, El7, El8,  
            Fl1, Fl3, Fl6,
            Gl2, Gl8, Gl9,
            Hl4, Hl8,
            Il2, Il4, Il6
          };
    
    JTextField [] list = {
            At2, At4, At6, At7, At9, 
            Bt1, Bt2, Bt5, Bt7, Bt8,
            Ct1, Ct5, Ct6, Ct9,
            Dt1, Dt2, Dt3, Dt4, Dt5, Dt8, Dt9, 
            Et1, Et3, Et5, Et6, Et9,
            Ft2, Ft4, Ft5, Ft7, Ft8, Ft9,  
            Gt1, Gt3, Gt4, Gt5, Gt6, Gt7, 
            Ht1, Ht2, Ht3, Ht5, Ht6, Ht7, Ht9, 
            It1, It3, It5, It7, It8, It9
    };
    
     Classes.LABEL_PROPS(label);
        Classes.TEXTFIELD_PROPS(list);
        Classes.JPANEL_LAYOUT(panel);
        Classes.JPANEL_LEVEL5(panel);

    }
    
	private void pre(ActionEvent evt){
            dispose();
            new Challenge4();
	}
        private void next(ActionEvent evt){
		
	dispose();
        new Challenge6();
	
	}
    private void resetActionPerformed(ActionEvent evt) {
    JTextField[] list = {
            At2, At4, At6, At7, At9, 
            Bt1, Bt2, Bt5, Bt7, Bt8,
            Ct1, Ct5, Ct6, Ct9,
            Dt1, Dt2, Dt3, Dt4, Dt5, Dt8, Dt9, 
            Et1, Et3, Et5, Et6, Et9,
            Ft2, Ft4, Ft5, Ft7, Ft8, Ft9,  
            Gt1, Gt3, Gt4, Gt5, Gt6, Gt7, 
            Ht1, Ht2, Ht3, Ht5, Ht6, Ht7, Ht9, 
            It1, It3, It5, It7, It8, It9
		};
		
		Classes.RESET(list);
		
	}
    private void CONFIRM(){
        
        int  at2, at4, at6, at7, at9, 
            bt1, bt2, bt5, bt7, bt8,
            ct1, ct5, ct6, ct9,
            dt1, dt2, dt3, dt4, dt5, dt8, dt9, 
            et1, et3, et5, et6, et9,
            ft2, ft4, ft5, ft7, ft8, ft9,  
            gt1, gt3, gt4, gt5, gt6, gt7, 
            ht1, ht2, ht3, ht5, ht6, ht7, ht9, 
            it1, it3, it5, it7, it8, it9
           ;
                    
    JTextField [] list = {
            At2, At4, At6, At7, At9, 
            Bt1, Bt2, Bt5, Bt7, Bt8,
            Ct1, Ct5, Ct6, Ct9,
            Dt1, Dt2, Dt3, Dt4, Dt5, Dt8, Dt9, 
            Et1, Et3, Et5, Et6, Et9,
            Ft2, Ft4, Ft5, Ft7, Ft8, Ft9,  
            Gt1, Gt3, Gt4, Gt5, Gt6, Gt7, 
            Ht1, Ht2, Ht3, Ht5, Ht6, Ht7, Ht9, 
            It1, It3, It5, It7, It8, It9
    };
    
        int [] gettext = {	
                        at2 = Integer.parseInt(At2.getText()),at4 = Integer.parseInt(At4.getText()),at6 = Integer.parseInt(At6.getText()),
                        at7 = Integer.parseInt(At7.getText()),at9 = Integer.parseInt(At9.getText()),bt1 = Integer.parseInt(Bt1.getText()),	
                        bt2 = Integer.parseInt(Bt2.getText()),bt5 = Integer.parseInt(Bt5.getText()),bt7 = Integer.parseInt(Bt7.getText()),
                        bt8 = Integer.parseInt(Bt8.getText()),ct1 = Integer.parseInt(Ct1.getText()),ct5 = Integer.parseInt(Ct5.getText()),
                        ct6 = Integer.parseInt(Ct6.getText()),ct9 = Integer.parseInt(Ct9.getText()),dt1 = Integer.parseInt(Dt1.getText()),
                        dt2 = Integer.parseInt(Dt2.getText()),dt3 = Integer.parseInt(Dt3.getText()),dt4 = Integer.parseInt(Dt4.getText()),
                        dt5 = Integer.parseInt(Dt5.getText()),dt8 = Integer.parseInt(Dt8.getText()),dt9 = Integer.parseInt(Dt9.getText()),
                        et1 = Integer.parseInt(Et1.getText()),et3 = Integer.parseInt(Et3.getText()),et5 = Integer.parseInt(Et5.getText()),
                        et6 = Integer.parseInt(Et6.getText()),et9 = Integer.parseInt(Et9.getText()),ft2 = Integer.parseInt(Ft2.getText()),
                        ft4 = Integer.parseInt(Ft4.getText()),ft5 = Integer.parseInt(Ft5.getText()),ft7 = Integer.parseInt(Ft7.getText()),
                        ft8 = Integer.parseInt(Ft8.getText()),ft9 = Integer.parseInt(Ft9.getText()),gt1 = Integer.parseInt(Gt1.getText()),
                        gt3 = Integer.parseInt(Gt3.getText()),gt4 = Integer.parseInt(Gt4.getText()),gt5 = Integer.parseInt(Gt5.getText()),
                        gt6 = Integer.parseInt(Gt6.getText()),gt7 = Integer.parseInt(Gt7.getText()),ht1 = Integer.parseInt(Ht1.getText()),
                        ht2 = Integer.parseInt(Ht2.getText()),ht3 = Integer.parseInt(Ht3.getText()),ht5 = Integer.parseInt(Ht5.getText()),
                        ht6 = Integer.parseInt(Ht6.getText()),ht7 = Integer.parseInt(Ht7.getText()),ht9 = Integer.parseInt(Ht9.getText()),
                        it1 = Integer.parseInt(It1.getText()),it3 = Integer.parseInt(It3.getText()),it5 = Integer.parseInt(It5.getText()),
                        it7 = Integer.parseInt(It7.getText()),it8 = Integer.parseInt(It8.getText()),it9 = Integer.parseInt(It9.getText()),
                        
                };
        boolean check = false;
        
          int [] correctvalues = {
              1, 6, 2, 3, 9, 
              6, 2, 5, 1, 7, 
              5, 4, 7, 6, 
              5, 3, 8, 2, 7, 4, 1, 
              4, 9, 8, 5, 2, 
              6, 4, 1, 3, 8, 5, 
              1, 5, 4, 2, 7, 8, 
              8, 3, 6, 9, 1, 2, 7, 
              2, 4, 3, 9, 5, 1
          
          };
     
		Classes.CONFIRM(list, gettext, correctvalues, check );
                if(check == true){
                    
                }
    }
    public static void main(String[] args){
        new Challenge5();
    }
}
