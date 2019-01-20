package StageOne;
import Modules.Classes;
import StageFive.*;
import StageOne.*;
import StageTwo.*;
import StageThree.*;
import StageFour.*;


import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;





public class sudoku2 extends JFrame{
	
	JPanel	 panelA, panelB, panelC, 
			 panelD, panelE, panelF, 
			 panelG, panelH, panelI;
	
	JMenuBar menubar;
	
	JMenu exit, game, comfirm, reset, stage, F1, sone, stwo, sthree, sfour, sfive ;
	
	JMenuItem exi,f1, next, pre, rese,  comfir,  
	s1lev1, s1lev2, s1lev3, s1lev4, s1lev5, s1lev6, s1lev7, s1lev8, s1lev9, s1lev10, 
	s2lev1, s2lev2, s2lev3, s2lev4, s2lev5, s2lev6, s2lev7, s2lev8, s2lev9, s2lev10,
	s3lev1, s3lev2, s3lev3, s3lev4, s3lev5, s3lev6, s3lev7, s3lev8, s3lev9, s3lev10, 
	s4lev1, s4lev2, s4lev3, s4lev4, s4lev5, s4lev6, s4lev7, s4lev8, s4lev9, s4lev10, 
	s5lev1, s5lev2, s5lev3, s5lev4, s5lev5, s5lev6, s5lev7, s5lev8, s5lev9, s5lev10
	;
	
	JTextField 
		At1, At3, At4, At8,
		Bt1, Bt2, Bt3, Bt4, Bt5, Bt6, Bt7, Bt9,
		Ct1, Ct3, Ct6, Ct8,  
		Dt2, Dt3, Dt5, Dt6, Dt7, Dt9,
		Et2, Et3,Et5, Et6, Et7, Et9,
		Ft5, Ft8,
		Gt1, Gt2, Gt4, Gt7, Gt9,
		Ht1, Ht2, Ht3, Ht4, Ht6, Ht7, Ht9,
		It2, It3, It6, It7, It9
		;
	
	JPanel A, B, C, D, E, F, G, H, I;

	
	 JLabel
	 	Al2, Al5, Al6, Al7, Al9,
	 	Bl8,
	 	Cl2, Cl4, Cl5, Cl7, Cl9,
	 	Dl1, Dl4, Dl8, 
	 	El1, El4, El8,
	 	Fl1, Fl2, Fl3,  Fl4, Fl6, Fl7, Fl9, 
	 	Gl3, Gl5, Gl6, Gl8,
	 	Hl5, Hl8, 
	 	Il1, Il4, Il5, Il8;

	 
	 /** Constructor */
	 
	public sudoku2() {
		setSize(350, 350);
		setTitle("Level   2");
		setResizable(false);
		setLayout(new GridLayout(3, 3));
		menubar = new JMenuBar();
		setJMenuBar(menubar);

		
		exi = new JMenuItem("Exit");
		exi.addActionListener((java.awt.event.ActionEvent evt) -> {
                    exiActionPerformed(evt);
                });
		
		next = new JMenuItem("Next");
		next.addActionListener((java.awt.event.ActionEvent evt) -> {
                    next(evt);
                });
		


		pre = new JMenuItem("Previous");
		pre.addActionListener((java.awt.event.ActionEvent evt) -> {
                    pre(evt);
                });
		
		rese = new JMenuItem("Reset");
		rese.addActionListener((java.awt.event.ActionEvent evt) -> {
                    reseActionPerformed(evt);
                });
		
		comfir = new JMenuItem("Comfirm");
		comfir.addActionListener(this::confirActionPerformed);
		
		s1lev1 = new JMenuItem("Level  1");
		s1lev1.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s1lev1(evt);
                });
		
		s1lev2 = new JMenuItem("Level  2");
		s1lev2.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s1lev2(evt);
                });
		
		s1lev3 = new JMenuItem("Level  3");
		s1lev3.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s1lev3(evt);
                });
		
		s1lev4 = new JMenuItem("Level  4");
		s1lev4.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s1lev4(evt);
                });
		
		s1lev5 = new JMenuItem("Level  5");
		s1lev5.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s1lev5(evt);
                });
		
		s1lev6 = new JMenuItem("Level  6");
		s1lev6.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s1lev6(evt);
                });
		
		s1lev7 = new JMenuItem("Level  7");
		s1lev7.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s1lev7(evt);
                });
		
		s1lev8 = new JMenuItem("Level  8");
		s1lev8.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s1lev8(evt);
                });
		
		s1lev9 = new JMenuItem("Level  9");
		s1lev9.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s1lev9(evt);
                });
		
		s1lev10 = new JMenuItem("Level  10");
		s1lev10.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s1lev10(evt);
                });
		
		
		s2lev1 = new JMenuItem("Level  1");
		s2lev1.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s2lev1(evt);
                });
		
		s2lev2 = new JMenuItem("Level  2");
		s2lev2.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s2lev2(evt);
                });
		
		s2lev3 = new JMenuItem("Level  3");
		s2lev3.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s2lev3(evt);
                });
		
		s2lev4 = new JMenuItem("Level  4");
		s2lev4.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s2lev4(evt);
                });
		
		s2lev5 = new JMenuItem("Level  5");
		s2lev5.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s2lev5(evt);
                });
		
		s2lev6 = new JMenuItem("Level  6");
		s2lev6.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s2lev6(evt);
                });
		
		s2lev7 = new JMenuItem("Level  7");
		s2lev7.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s2lev7(evt);
                });
		
		s2lev8 = new JMenuItem("Level  8");
		s2lev8.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s2lev8(evt);
                });
		
		s2lev9 = new JMenuItem("Level  9");
		s2lev9.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s2lev9(evt);
                });
		
		s2lev10 = new JMenuItem("Level  10");
		s2lev10.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s2lev10(evt);
                });
		

		
		s3lev1 = new JMenuItem("Level  1");
		s3lev1.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s3lev1(evt);
                });
		
		s3lev2 = new JMenuItem("Level  2");
		s3lev2.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s3lev2(evt);
                });
		
		s3lev3 = new JMenuItem("Level  3");
		s3lev3.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s3lev3(evt);
                });
		
		s3lev4 = new JMenuItem("Level  4");
		s3lev4.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s3lev4(evt);
                });
		
		s3lev5 = new JMenuItem("Level  5");
		s3lev5.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s3lev5(evt);
                });
		
		s3lev6 = new JMenuItem("Level  6");
		s3lev6.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s3lev6(evt);
                });
		
		s3lev7 = new JMenuItem("Level  7");
		s3lev7.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s3lev7(evt);
                });
	
		s3lev8 = new JMenuItem("Level  8");
		s3lev8.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s3lev8(evt);
                });
		
		s3lev9 = new JMenuItem("Level  9");
		s3lev9.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s3lev9(evt);
                });
		
		s3lev10 = new JMenuItem("Level  10");
		s3lev10.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s3lev10(evt);
                });
		

		
		s4lev1 = new JMenuItem("Level  1");
		s4lev1.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s4lev1(evt);
                });
		
		s4lev2 = new JMenuItem("Level  2");
		s4lev2.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s4lev2(evt);
                });
		
		s4lev3 = new JMenuItem("Level  3");
		s4lev3.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s4lev3(evt);
                });
		
		s4lev4 = new JMenuItem("Level  4");
		s4lev4.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s4lev4(evt);
                });
		
		s4lev5 = new JMenuItem("Level  5");
		s4lev5.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s4lev5(evt);
                });
		
		
		s4lev6 = new JMenuItem("Level  6");
		s4lev6.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s4lev6(evt);
                });
		
		s4lev7 = new JMenuItem("Level  7");
		s4lev7.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s4lev7(evt);
                });
		
		s4lev8 = new JMenuItem("Level  8");
		s4lev8.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s4lev8(evt);
                });
		
		s4lev9 = new JMenuItem("Level  9");
		s4lev9.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s4lev9(evt);
                });
		
		s4lev10 = new JMenuItem("Level  10");
		s4lev10.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s4lev10(evt);
                });
		

		
		s5lev1 = new JMenuItem("Level  1");
		s5lev1.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s5lev1(evt);
                });
		
		s5lev2 = new JMenuItem("Level  2");
		s5lev2.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s5lev2(evt);
                });
		
		s5lev3 = new JMenuItem("Level  3");
		s5lev3.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s5lev3(evt);
                });
		
		s5lev4 = new JMenuItem("Level  4");
		s5lev4.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s5lev4(evt);
                });
		
		s5lev5 = new JMenuItem("Level  5");
		s5lev5.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s5lev5(evt);
                });
		
		s5lev6 = new JMenuItem("Level  6");
		s5lev6.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s5lev6(evt);
                });
		
		s5lev7 = new JMenuItem("Level  7");
		s5lev7.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s5lev7(evt);
                });
		
		s5lev8 = new JMenuItem("Level  8");
		s5lev8.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s5lev8(evt);
                });
		
		s5lev9 = new JMenuItem("Level  9");
		s5lev9.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s5lev9(evt);
                });
		
		s5lev10 = new JMenuItem("Level  10");
		s5lev10.addActionListener((java.awt.event.ActionEvent evt) -> {
                    s5lev10(evt);
                });
                
		sone = new JMenu("Stage  1");
		sone.add(s1lev1);
		sone.add(s1lev2);
		sone.add(s1lev3);
		sone.add(s1lev4);
		sone.add(s1lev5);
		sone.add(s1lev6);
		sone.add(s1lev7);
		sone.add(s1lev8);
		sone.add(s1lev9);
		sone.add(s1lev10);
		
		stwo = new JMenu("Stage  2");
		stwo.add(s2lev1);
		stwo.add(s2lev2);
		stwo.add(s2lev3);
		stwo.add(s2lev4);
		stwo.add(s2lev5);
		stwo.add(s2lev6);
		stwo.add(s2lev7);
		stwo.add(s2lev8);
		stwo.add(s2lev9);
		stwo.add(s2lev10);
		
		sthree = new JMenu("Stage  3");
		sthree.add(s3lev1);
		sthree.add(s3lev2);
		sthree.add(s3lev3);
		sthree.add(s3lev4);
		sthree.add(s3lev5);
		sthree.add(s3lev6);
		sthree.add(s3lev7);
		sthree.add(s3lev8);
		sthree.add(s3lev9);
		sthree.add(s3lev10);
		
		sfour = new JMenu("Stage  4");
		sfour.add(s4lev1);
		sfour.add(s4lev2);
		sfour.add(s4lev3);
		sfour.add(s4lev4);
		sfour.add(s4lev5);
		sfour.add(s4lev6);
		sfour.add(s4lev7);
		sfour.add(s4lev8);
		sfour.add(s4lev9);
		sfour.add(s4lev10);
		
		
		sfive = new JMenu("Stage  5");
		sfive.add(s5lev1);
		sfive.add(s5lev2);
		sfive.add(s5lev3);
		sfive.add(s5lev4);
		sfive.add(s5lev5);
		sfive.add(s5lev6);
		sfive.add(s5lev7);
		sfive.add(s5lev8);
		sfive.add(s5lev9);
		sfive.add(s5lev10);

		
		f1 = new JMenuItem("Help");
		f1.addActionListener((java.awt.event.ActionEvent evt) -> {
                    F1ActionPerformed(evt);
                });
		
		stage = new JMenu("Select Stage");
		stage.add(sone);
		stage.add(stwo);
		stage.add(sthree);
		stage.add(sfour);
		stage.add(sfive);
		
		exit = new JMenu("EXIT");
		exit.add(exi);
		
		F1 = new JMenu("HELP");
		F1.add(f1);
		
		game = new JMenu("GAME");
		game.add(next);
		game.add(pre);
	
		
		reset = new JMenu("RESET");
		reset.add(rese);
		
		comfirm = new JMenu("COMFIRM");
		comfirm.add(comfir);
		
		
		menubar.add(exit);
		menubar.add(F1);
		menubar.add(game);
		menubar.add(reset);
		menubar.add(comfirm);
		menubar.add(stage);
		
		panelA = new JPanel();
		At1 = new JTextField();
		Al2 = new JLabel("  7");
		At3 = new JTextField();
		At4 = new JTextField();
		Al5 = new JLabel("  9");
		Al6 = new JLabel("  3");
		Al7 = new JLabel("  1");
		At8 = new JTextField();
		Al9 = new JLabel("  5");
		panelA.add(At1);
		panelA.add(Al2);
		panelA.add(At3);
		panelA.add(At4);
		panelA.add(Al5);
		panelA.add(Al6);
		panelA.add(Al7);
		panelA.add(At8);
		panelA.add(Al9);
		add(panelA);
		
		
		panelB = new JPanel();
		Bt1 = new JTextField();
		Bt2 = new JTextField();
		Bt3 = new JTextField();
		Bt4 = new JTextField();
		Bt5 = new JTextField();
		Bt6 = new JTextField();
		Bt7 = new JTextField();
		Bl8 = new JLabel("  7");
		Bt9 = new JTextField();
		panelB.add(Bt1);
		panelB.add(Bt2);
		panelB.add(Bt3);
		panelB.add(Bt4);
		panelB.add(Bt5);
		panelB.add(Bt6);
		panelB.add(Bt7);
		panelB.add(Bl8);
		panelB.add(Bt9);
		add(panelB);
		
		
		panelC = new JPanel();
		Ct1 = new JTextField();
		Cl2 = new JLabel("  5");
		Ct3 = new JTextField();
		Cl4 = new JLabel("  1");
		Cl5 = new JLabel("  6");
		Ct6 = new JTextField();
		Cl7 = new JLabel("  4");
		Ct8 = new JTextField();
		Cl9 = new JLabel("  3");
		panelC.add(Ct1);
		panelC.add(Cl2);
		panelC.add(Ct3);
		panelC.add(Cl4);
		panelC.add(Cl5);
		panelC.add(Ct6);
		panelC.add(Cl7);
		panelC.add(Ct8);
		panelC.add(Cl9);
		add(panelC);
		
		
		panelD = new JPanel();
		Dl1 = new JLabel("  9");
		Dt2 = new JTextField();
		Dt3 = new JTextField();
		Dl4 = new JLabel("  4");
		Dt5 = new JTextField();
		Dt6 = new JTextField();
		Dt7 = new JTextField();
		Dl8 = new JLabel("  1");
		Dt9 = new JTextField();
		panelD.add(Dl1);
		panelD.add(Dt2);
		panelD.add(Dt3);
		panelD.add(Dl4);
		panelD.add(Dt5);
		panelD.add(Dt6);
		panelD.add(Dt7);
		panelD.add(Dl8);
		panelD.add(Dt9);
		add(panelD);
		

		
		panelE = new JPanel();
		El1 = new JLabel("  2");
		Et2 = new JTextField();
		Et3 = new JTextField();
		El4 = new JLabel("  3");
		Et5 = new JTextField();
		Et6 = new JTextField();
		Et7 = new JTextField();
		El8 = new JLabel("  4");
		Et9 = new JTextField();
		panelE.add(El1);
		panelE.add(Et2);
		panelE.add(Et3);
		panelE.add(El4);
		panelE.add(Et5);
		panelE.add(Et6);
		panelE.add(Et7);
		panelE.add(El8);
		panelE.add(Et9);
		add(panelE);
		
		
		panelF = new JPanel();
		Fl1 = new JLabel("  8");
		Fl2 = new JLabel("  3");
		Fl3 = new JLabel("  4");
		Fl4 = new JLabel("  6");
		Ft5 = new JTextField();
		Fl6 = new JLabel("  1");
		Fl7 = new JLabel("  9");
		Ft8 = new JTextField();
		Fl9 = new JLabel("  5");
		panelF.add(Fl1);
		panelF.add(Fl2);
		panelF.add(Fl3);
		panelF.add(Fl4);
		panelF.add(Ft5);
		panelF.add(Fl6);
		panelF.add(Fl7);
		panelF.add(Ft8);
		panelF.add(Fl9);
		add(panelF);
		
		
		panelG = new JPanel();
		Gt1 = new JTextField();
		Gt2 = new JTextField();
		Gl3 = new JLabel("  8");
		Gt4 = new JTextField();
		Gl5 = new JLabel("  6");
		Gl6 = new JLabel("  1");
		Gt7 = new JTextField();
		Gl8 = new JLabel("  4");
		Gt9 = new JTextField();
		panelG.add(Gt1);
		panelG.add(Gt2);
		panelG.add(Gl3);
		panelG.add(Gt4);
		panelG.add(Gl5);
		panelG.add(Gl6);
		panelG.add(Gt7);
		panelG.add(Gl8);
		panelG.add(Gt9);
		add(panelG);
		
		
		panelH = new JPanel();
		Ht1 = new JTextField();
		Ht2 = new JTextField();
		Ht3 = new JTextField();
		Ht4 = new JTextField();
		Hl5 = new JLabel("  9");
		Ht6 = new JTextField();
		Ht7 = new JTextField();
		Hl8 = new JLabel("  8");
		Ht9 = new JTextField();
		panelH.add(Ht1);
		panelH.add(Ht2);
		panelH.add(Ht3);
		panelH.add(Ht4);
		panelH.add(Hl5);
		panelH.add(Ht6);
		panelH.add(Ht7);
		panelH.add(Hl8);
		panelH.add(Ht9);
		add(panelH);
		
		
		panelI = new JPanel();
		Il1 = new JLabel("  5");
		It2 = new JTextField();
		It3 = new JTextField();
		Il4 = new JLabel("  7");
		Il5 = new JLabel("  8");
		It6 = new JTextField();
		It7 = new JTextField();
		Il8 = new JLabel("  1");
		It9 = new JTextField();
		panelI.add(Il1);
		panelI.add(It2);
		panelI.add(It3);
		panelI.add(Il4);
		panelI.add(Il5);
		panelI.add(It6);
		panelI.add(It7);
		panelI.add(Il8);
		panelI.add(It9);
		add(panelI);
		
		
		PLAY();
		
		
		java.awt.Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

		
	}

	
	private void exiActionPerformed(ActionEvent evt) {
		System.exit(0);
	}
	
	private void reseActionPerformed(ActionEvent evt) {
		RESET();
	}
	
	private void PLAY() {
		
		JLabel [] label = {
				 Al2, Al5, Al6, Al7, Al9, Bl8, Cl2, Cl4, Cl5, Cl7, Cl9,
				 Dl1, Dl4, Dl8, El1, El4, El8,
				 Fl1, Fl2, Fl3,  Fl4, Fl6, Fl7, Fl9, 
				 Gl3, Gl5, Gl6, Gl8, Hl5, Hl8, Il1, Il4, Il5, Il8
		};
		
            Classes.LABEL_PROPS(label);
		
		JTextField[] list = {
				At1, At3, At4, At8, 
				Bt1, Bt2, Bt3, Bt4, Bt5, Bt6, Bt7, Bt9,
				Ct1, Ct3, Ct6, Ct8,
				Dt2, Dt3, Dt5, Dt6, Dt7, Dt9,
				Et2, Et3, Et5, Et6, Et7, Et9,
				Ft5, Ft8, 
				Gt1, Gt2, Gt4, Gt7, Gt9, 
				Ht1, Ht2, Ht3, Ht4, Ht6, Ht7, Ht9,
				It2, It3, It6, It7, It9
		};
		
            Classes.TEXTFIELD_PROPS(list);
		
		JMenuItem[] menuitem = {
				exi,f1, next, pre, rese,  comfir,  
				s1lev1, s1lev2, s1lev3, s1lev4, s1lev5, s1lev6, s1lev7, s1lev8, s1lev9, s1lev10, 
				s2lev1, s2lev2, s2lev3, s2lev4, s2lev5, s2lev6, s2lev7, s2lev8, s2lev9, s2lev10,
				s3lev1, s3lev2, s3lev3, s3lev4, s3lev5, s3lev6, s3lev7, s3lev8, s3lev9, s3lev10, 
				s4lev1, s4lev2, s4lev3, s4lev4, s4lev5, s4lev6, s4lev7, s4lev8, s4lev9, s4lev10, 
				s5lev1, s5lev2, s5lev3, s5lev4, s5lev5, s5lev6, s5lev7, s5lev8, s5lev9, s5lev10
					
		};
		
            Classes.LEVELS_PROPS(menuitem);
		
		JMenu [] jmenu = {
				exit, game, comfirm, reset, stage, F1,  sone, stwo, sthree, sfour, sfive 
				};
		
            Classes.JMENU_FOREGROUND(jmenu);
		
		JPanel[] panel= {
				 panelA, panelB, panelC,
				 panelD, panelE, panelF,
				 panelG, panelH, panelI
		};
		
            Classes.JPANEL_LEVEL2(panel);
            Classes.JPANEL_LAYOUT(panel);
	}
	

	private void confirActionPerformed(ActionEvent evt) {
		CONFIRM();
	}
	private void s1lev1(ActionEvent evt) {
		
		dispose();
		
		new sudoku1();
		
	}
	private void s1lev2(ActionEvent evt) {
		
		String alert = " Level 2 Stage One";
	Classes.ALERT(alert);
		
	}



	private void s1lev3(ActionEvent evt) {
		
		dispose();
		
		new sudoku3();
		
		
	}


	private void s1lev4(ActionEvent evt) {
		dispose();
		
		new sudoku4();
	}

	private void s1lev5(ActionEvent evt) {
		
		dispose();
		
		 new sudoku5();
	
		
	}

	private void s1lev10(ActionEvent evt) {
		
            dispose();
		
	    new sudoku10();
	
		
	}

	private void s1lev6(ActionEvent evt) {

	dispose();

	 new sudoku6();
	

	}

	private void s1lev7(ActionEvent evt) {

	dispose();
         new sudoku7();
	

	}

	private void s1lev8(ActionEvent evt) {

	dispose();
        new sudoku8();
	

	}

	private void s1lev9(ActionEvent evt) {

	dispose();
         new sudoku9();
        }
private void s2lev1(ActionEvent evt) {
		dispose();
                new sudoku11();
	}

	private void s2lev2(ActionEvent evt) {
		dispose();
                new sudoku12();
	}



	private void s2lev3(ActionEvent evt) {
		dispose();
                new sudoku13();
	}


	private void s2lev4(ActionEvent evt) {
		dispose();
                new sudoku14();
	}

	private void s2lev5(ActionEvent evt) {
		dispose();
                new sudoku15();
	}

	private void s2lev6(ActionEvent evt) {

		dispose();
                new sudoku16();;
	}

	private void s2lev7(ActionEvent evt) {

		dispose();
                new sudoku17();
	}

	private void s2lev8(ActionEvent evt) {

		dispose();
                new sudoku18();
	}

	private void s2lev9(ActionEvent evt) {

		dispose();
                new sudoku19();
	}
	private void s2lev10(ActionEvent evt) {

		dispose();
                new sudoku20();
	}

	private void s3lev1(ActionEvent evt) {
		dispose();
                new sudoku21();
	}

	private void s3lev2(ActionEvent evt) {
		dispose();
                new sudoku22();
	}



	private void s3lev3(ActionEvent evt) {

		dispose();
                new sudoku23();
	}


	private void s3lev4(ActionEvent evt) {
		dispose();
                new sudoku24();
	}

	private void s3lev5(ActionEvent evt) {
		dispose();
                new sudoku25();

	}

	private void s3lev6(ActionEvent evt) {
		dispose();
                new sudoku26();;

	}

	private void s3lev7(ActionEvent evt) {
		dispose();
                new sudoku27();
	}

	private void s3lev8(ActionEvent evt) {
		dispose();
                new sudoku28();

	}

	private void s3lev9(ActionEvent evt) {
		dispose();
                new sudoku29();
	}
	private void s3lev10(ActionEvent evt) {
		dispose();
                new sudoku30();
	}
	private void s4lev1(ActionEvent evt) {
		dispose();
                new sudoku31();
	}

	private void s4lev2(ActionEvent evt) {
		dispose();
                new sudoku32();
	}



	private void s4lev3(ActionEvent evt) {
		dispose();
                new sudoku33();

	}


	private void s4lev4(ActionEvent evt) {
		dispose();
                new sudoku34();
	}

	private void s4lev5(ActionEvent evt) {

		dispose();
                new sudoku35();

	}

	private void s4lev6(ActionEvent evt) {
		dispose();
                new sudoku36();

	}

	private void s4lev7(ActionEvent evt) {
		dispose();
                new sudoku37();
	}

	private void s4lev8(ActionEvent evt) {
		dispose();
                new sudoku38();
	}

	private void s4lev9(ActionEvent evt) {

		dispose();
                new sudoku39();
	}
	private void s4lev10(ActionEvent evt) {

		dispose();
                new sudoku40();
	}
	private void s5lev1(ActionEvent evt) {
		dispose();
                new sudoku41();
	}

	private void s5lev2(ActionEvent evt) {
		dispose();
                new sudoku42();

	}

	private void s5lev3(ActionEvent evt) {
		dispose();
                new sudoku43();

	}


	private void s5lev4(ActionEvent evt) {
		dispose();
                new sudoku44();
	}

	private void s5lev5(ActionEvent evt) {

		dispose();
                new sudoku45();
	}

	private void s5lev6(ActionEvent evt) {

		dispose();
                new sudoku46();;

	}

	private void s5lev7(ActionEvent evt) {
		dispose();
                new sudoku47();

	}

	private void s5lev8(ActionEvent evt) {
		dispose();
                new sudoku48();
	}

	private void s5lev9(ActionEvent evt) {
		dispose();
                new sudoku49();

	}
	private void s5lev10(ActionEvent evt) {
		dispose();
                new sudoku50();

	}
private void F1ActionPerformed(ActionEvent evt) {
                    Classes.HELP();
	
}
	private void next(ActionEvent evt) {
		dispose();
		sudoku3 s3 = new sudoku3();
		s3.setVisible(true);
	}
	
	private void pre(ActionEvent evt){
		dispose();
		sudoku1 s1 = new sudoku1();
		s1.setVisible(true);
	}
	
	private void RESET() {
		 JTextField[] list = {
					At1, At3, At4, At8, 
					Bt1, Bt2, Bt3, Bt4, Bt5, Bt6, Bt7, Bt9,
					Ct1, Ct3, Ct6, Ct8,
					Dt2, Dt3, Dt5, Dt6, Dt7, Dt9,
					Et2, Et3, Et5, Et6, Et7, Et9,
					Ft5, Ft8, 
					Gt1, Gt2, Gt4, Gt7, Gt9, 
					Ht1, Ht2, Ht3, Ht4, Ht6, Ht7, Ht9,
					It2, It3, It6, It7, It9
			};
		 
		 
		for(int i = 0; i < list.length; i++) {
			  list[i].setText(null);
		  }	
		
	}
	
	
	private void CONFIRM() {
		 JTextField[] list = {
					At1, At3, At4, At8, 
					Bt1, Bt2, Bt3, Bt4, Bt5, Bt6, Bt7, Bt9,
					Ct1, Ct3, Ct6, Ct8,
					Dt2, Dt3, Dt5, Dt6, Dt7, Dt9,
					Et2, Et3, Et5, Et6, Et7, Et9,
					Ft5, Ft8, 
					Gt1, Gt2, Gt4, Gt7, Gt9, 
					Ht1, Ht2, Ht3, Ht4, Ht6, Ht7, Ht9,
					It2, It3, It6, It7, It9
			};
		 
		int at1, at3, at4, at8,
		bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt9,
		ct1, ct3, ct6, ct8, 
		dt2, dt3, dt5, dt6, dt7, dt9, 
		et2, et3, et5, et6, et7, et9, 
		ft5, ft8, 
		gt1, gt2, gt4, gt7, gt9, 
		ht1, ht2, ht3, ht4, ht6, ht7, ht9, 
		it2, it3, it6, it7, it9;
		
		 int correctvalues[] = {
					6, 4, 8, 2,
					9, 3, 1, 5, 2, 4, 6, 8,
					2, 8, 7, 9,
					5, 7, 8, 2, 3, 6,
					1, 6, 5, 9, 8, 7,
					7, 2,
					7, 3, 5, 2, 9,
					1, 6, 2, 4, 3, 7, 5,
					4, 9, 2, 3, 6
			};

		int gettext[] =   {
				at1 = Integer.parseInt(At1.getText()), at3 = Integer.parseInt(At3.getText()), at4 = Integer.parseInt(At4.getText()),
				at8 = Integer.parseInt(At8.getText()), bt1 = Integer.parseInt(Bt1.getText()), bt2 = Integer.parseInt(Bt2.getText()),
				bt3 = Integer.parseInt(Bt3.getText()), bt4 = Integer.parseInt(Bt4.getText()), bt5 = Integer.parseInt(Bt5.getText()), 
				bt6 = Integer.parseInt(Bt6.getText()), bt7 = Integer.parseInt(Bt7.getText()), bt9 = Integer.parseInt(Bt9.getText()),
				ct1 = Integer.parseInt(Ct1.getText()), ct3 = Integer.parseInt(Ct3.getText()), ct6 = Integer.parseInt(Ct6.getText()),
				ct8 = Integer.parseInt(Ct8.getText()),dt2 = Integer.parseInt(Dt2.getText()), dt3 = Integer.parseInt(Dt3.getText()),
				dt5 = Integer.parseInt(Dt5.getText()), dt6 = Integer.parseInt(Dt6.getText()), dt7 = Integer.parseInt(Dt7.getText()),
				dt9 = Integer.parseInt(Dt9.getText()),et2 = Integer.parseInt(Et2.getText()), et3 = Integer.parseInt(Et3.getText()),
				et5 = Integer.parseInt(Et5.getText()), et6 = Integer.parseInt(Et6.getText()), et7 = Integer.parseInt(Et7.getText()),
				et9 = Integer.parseInt(Et9.getText()),ft5 = Integer.parseInt(Ft5.getText()),ft8 = Integer.parseInt(Ft8.getText()), 
				gt1 = Integer.parseInt(Gt1.getText()), gt2 = Integer.parseInt(Gt2.getText()), gt4 = Integer.parseInt(Gt4.getText()),
				gt7 = Integer.parseInt(Gt7.getText()), gt9 = Integer.parseInt(Gt9.getText()), ht1 = Integer.parseInt(Ht1.getText()), 
				ht2 = Integer.parseInt(Ht2.getText()), ht3 = Integer.parseInt(Ht3.getText()), ht4 = Integer.parseInt(Ht4.getText()),
				ht6 = Integer.parseInt(Ht6.getText()), ht7 = Integer.parseInt(Ht7.getText()), ht9 = Integer.parseInt(Ht9.getText()),
				it2 = Integer.parseInt(It2.getText()), it3 = Integer.parseInt(It3.getText()), it6 = Integer.parseInt(It6.getText()),
				it7 = Integer.parseInt(It7.getText()), it9 = Integer.parseInt(It9.getText()),
		};
		boolean check = false;
            Classes.CONFIRM(list, gettext, correctvalues, check);
	}
	
	
	
	public static void main(String[] args) {
		new sudoku2();
	}


	
}
