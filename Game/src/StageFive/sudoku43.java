package StageFive;
//this is same as level 41
import Modules.Classes;
import StageOne.*;
import StageTwo.*;
import StageThree.*;
import StageFour.*;
import StageFive.*;
import Help.hElp;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class sudoku43 extends JFrame{
	JPanel panelA, panelB, panelC, panelD, panelE, panelF, panelG, panelH, panelI;
	JMenuBar menubar;
	
	JMenu exit, game, comfirm, reset, stage, F1, sone, stwo, sthree, sfour, sfive ;
	
	JMenuItem exi,f1, next, pre,  rese, comfir,  
	s1lev1, s1lev2, s1lev3, s1lev4, s1lev5, s1lev6, s1lev7, s1lev8, s1lev9, s1lev10, 
	s2lev1, s2lev2, s2lev3, s2lev4, s2lev5, s2lev6, s2lev7, s2lev8, s2lev9, s2lev10,
	s3lev1, s3lev2, s3lev3, s3lev4, s3lev5, s3lev6, s3lev7, s3lev8, s3lev9, s3lev10, 
	s4lev1, s4lev2, s4lev3, s4lev4, s4lev5, s4lev6, s4lev7, s4lev8, s4lev9, s4lev10, 
	s5lev1, s5lev2, s5lev3, s5lev4, s5lev5, s5lev6, s5lev7, s5lev8, s5lev9, s5lev10
	;
	
	JTextField At2, At3, At4, At5, At6, At7, 
	Bt6, Bt7, Bt9,
	Ct1, Ct3, Ct5, Ct6, Ct8, Ct9,
	Dt1, Dt4, Dt5, Dt7,
	Et1, Et4, Et5, Et6, Et9,
	Ft3, Ft5, Ft7, Ft9,
	Gt1, Gt2, Gt5, Gt9,
	Ht1, Ht3, Ht4,
	It4, It5, It7;
	JLabel Al1, Al8, Al9,  Bl1, Bl2, Bl3, Bl4, Bl5, Bl8, Cl2, Cl4, Cl7,  
	Dl2, Dl3, Dl6, Dl8, Dl9, El2, El3, El7, El8, Fl1, Fl2, Fl4, Fl6, Fl8, 
	Gl3, Gl4, Gl6, Gl7, Gl8,Hl2, Hl5, Hl6, Hl7, Hl8, Hl9, Il1, Il2, Il3, Il6, Il8, Il9;
	
	
	public sudoku43(){
		setSize(364, 350);
		setTitle("Level   43");
		setResizable(false);
		setLayout(new GridLayout(3, 3));
		menubar = new JMenuBar();
		setJMenuBar(menubar);

		
		exi = new JMenuItem("Exit");
		exi.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exiActionPerformed(evt);
			}
		});
		
		next = new JMenuItem("Next");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				next(evt);
			}
		});
		


		pre = new JMenuItem("Previous");
		pre.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				pre(evt);
			}
		});
		
		rese = new JMenuItem("Reset");
		rese.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				reseActionPerformed(evt);
			}
		});
		
		comfir = new JMenuItem("Comfirm");
		comfir.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				comfirActionPerformed(evt);
			}
		});
		
		s1lev1 = new JMenuItem("Level  1");
		s1lev1.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s1lev1(evt);
			}
		});
		
		s1lev2 = new JMenuItem("Level  2");
		s1lev2.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s1lev2(evt);
			}
		});
		
		s1lev3 = new JMenuItem("Level  3");
		s1lev3.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s1lev3(evt);
			}
		});
		
		s1lev4 = new JMenuItem("Level  4");
		s1lev4.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s1lev4(evt);
			}
		});
		
		s1lev5 = new JMenuItem("Level  5");
		s1lev5.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s1lev5(evt);
			}
		});
		
		s1lev6 = new JMenuItem("Level  6");
		s1lev6.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s1lev6(evt);
			}
		});
		
		s1lev7 = new JMenuItem("Level  7");
		s1lev7.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s1lev7(evt);
			}
		});
		
		s1lev8 = new JMenuItem("Level  8");
		s1lev8.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s1lev8(evt);
			}
		});
		
		s1lev9 = new JMenuItem("Level  9");
		s1lev9.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s1lev9(evt);
			}
		});
		
		s1lev10 = new JMenuItem("Level  10");
		s1lev10.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s1lev10(evt);
			}
		});
		
		
		s2lev1 = new JMenuItem("Level  1");
		s2lev1.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s2lev1(evt);
			}
		});
		
		s2lev2 = new JMenuItem("Level  2");
		s2lev2.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s2lev2(evt);
			}
		});
		
		s2lev3 = new JMenuItem("Level  3");
		s2lev3.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s2lev3(evt);
			}
		});
		
		s2lev4 = new JMenuItem("Level  4");
		s2lev4.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s2lev4(evt);
			}
		});
		
		s2lev5 = new JMenuItem("Level  5");
		s2lev5.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s2lev5(evt);
			}
		});
		
		s2lev6 = new JMenuItem("Level  6");
		s2lev6.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s2lev6(evt);
			}
		});
		
		s2lev7 = new JMenuItem("Level  7");
		s2lev7.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s2lev7(evt);
			}
		});
		
		s2lev8 = new JMenuItem("Level  8");
		s2lev8.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s2lev8(evt);
			}
		});
		
		s2lev9 = new JMenuItem("Level  9");
		s2lev9.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s2lev9(evt);
			}
		});
		
		s2lev10 = new JMenuItem("Level  10");
		s2lev10.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s2lev10(evt);
			}
		});
		

		
		s3lev1 = new JMenuItem("Level  1");
		s3lev1.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s3lev1(evt);
			}
		});
		
		s3lev2 = new JMenuItem("Level  2");
		s3lev2.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s3lev2(evt);
			}
		});
		
		s3lev3 = new JMenuItem("Level  3");
		s3lev3.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s3lev3(evt);
			}
		});
		
		s3lev4 = new JMenuItem("Level  4");
		s3lev4.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s3lev4(evt);
			}
		});
		
		s3lev5 = new JMenuItem("Level  5");
		s3lev5.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s3lev5(evt);
			}
		});
		
		s3lev6 = new JMenuItem("Level  6");
		s3lev6.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s3lev6(evt);
			}
		});
		
		s3lev7 = new JMenuItem("Level  7");
		s3lev7.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s3lev7(evt);
			}
		});
	
		s3lev8 = new JMenuItem("Level  8");
		s3lev8.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s3lev8(evt);
			}
		});
		
		s3lev9 = new JMenuItem("Level  9");
		s3lev9.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s3lev9(evt);
			}
		});
		
		s3lev10 = new JMenuItem("Level  10");
		s3lev10.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s3lev10(evt);
			}
		});
		

		
		s4lev1 = new JMenuItem("Level  1");
		s4lev1.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s4lev1(evt);
			}
		});
		
		s4lev2 = new JMenuItem("Level  2");
		s4lev2.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s4lev2(evt);
			}
		});
		
		s4lev3 = new JMenuItem("Level  3");
		s4lev3.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s4lev3(evt);
			}
		});
		
		s4lev4 = new JMenuItem("Level  4");
		s4lev4.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s4lev4(evt);
			}
		});
		
		s4lev5 = new JMenuItem("Level  5");
		s4lev5.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s4lev5(evt);
			}
		});
		
		
		s4lev6 = new JMenuItem("Level  6");
		s4lev6.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s4lev6(evt);
			}
		});
		
		s4lev7 = new JMenuItem("Level  7");
		s4lev7.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s4lev7(evt);
			}
		});
		
		s4lev8 = new JMenuItem("Level  8");
		s4lev8.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s4lev8(evt);
			}
		});
		
		s4lev9 = new JMenuItem("Level  9");
		s4lev9.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s4lev9(evt);
			}
		});
		
		s4lev10 = new JMenuItem("Level  10");
		s4lev10.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s4lev10(evt);
			}
		});
		

		
		s5lev1 = new JMenuItem("Level  1");
		s5lev1.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s5lev1(evt);
			}
		});
		
		s5lev2 = new JMenuItem("Level  2");
		s5lev2.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s5lev2(evt);
			}
		});
		
		s5lev3 = new JMenuItem("Level  3");
		s5lev3.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s5lev3(evt);
			}
		});
		
		s5lev4 = new JMenuItem("Level  4");
		s5lev4.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s5lev4(evt);
			}
		});
		
		s5lev5 = new JMenuItem("Level  5");
		s5lev5.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s5lev5(evt);
			}
		});
		
		s5lev6 = new JMenuItem("Level  6");
		s5lev6.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s5lev6(evt);
			}
		});
		
		s5lev7 = new JMenuItem("Level  7");
		s5lev7.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s5lev7(evt);
			}
		});
		
		s5lev8 = new JMenuItem("Level  8");
		s5lev8.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s5lev8(evt);
			}
		});
		
		s5lev9 = new JMenuItem("Level  9");
		s5lev9.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s5lev9(evt);
			}
		});
		
		s5lev10 = new JMenuItem("Level  10");
		s5lev10.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s5lev10(evt);
			}
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
		f1.addActionListener( new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				F1ActionPerformed(evt);
			}
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
		Al1 = new JLabel("  6");
		At2 = new JTextField();
		At3 = new JTextField();
		At4 = new JTextField();
		At5 = new JTextField();
		At6 = new JTextField();
		At7 = new JTextField();
		Al8 = new JLabel("  7");
		Al9 = new JLabel("  2");
		panelA.add(Al1);
		panelA.add(At2);
		panelA.add(At3);
		panelA.add(At4);
		panelA.add(At5);
		panelA.add(At6);
		panelA.add(At7);
		panelA.add(Al8);
		panelA.add(Al9);
		add(panelA);

		

		panelB = new JPanel();
		Bl1 = new JLabel("  2");
		Bl2 = new JLabel("  1");
		Bl3 = new JLabel("  9");
		Bl4 = new JLabel("  4");
		Bl5 = new JLabel("  7");
		Bt6 = new JTextField();
		Bt7 = new JTextField();
		Bl8 = new JLabel("  6");
		Bt9 = new JTextField();
		panelB.add(Bl1);
		panelB.add(Bl2);
		panelB.add(Bl3);
		panelB.add(Bl4);
		panelB.add(Bl5);
		panelB.add(Bt6);
		panelB.add(Bt7);
		panelB.add(Bl8);
		panelB.add(Bt9);
		add(panelB);

		panelC = new JPanel();
		Ct1 = new JTextField();
		Cl2 = new JLabel("  8");
		Ct3 = new JTextField();
		Cl4 = new JLabel("  3");
		Ct5 = new JTextField();
		Ct6 = new JTextField();
		Cl7 = new JLabel("  9");
		Ct8 = new JTextField();
		Ct9 = new JTextField();
		panelC.add(Ct1);
		panelC.add(Cl2);
		panelC.add(Ct3);
		panelC.add(Cl4);
		panelC.add(Ct5);
		panelC.add(Ct6);
		panelC.add(Cl7);
		panelC.add(Ct8);
		panelC.add(Ct9);
		add(panelC);

		panelD = new JPanel();
		Dt1 = new JTextField();
		Dl2 = new JLabel("  1");
		Dl3 = new JLabel("  3");
		Dt4 = new JTextField();
		Dt5 = new JTextField();
		Dl6 = new JLabel("  8");
		Dt7 = new JTextField();
		Dl8 = new JLabel("  9");
		Dl9 = new JLabel("  5");
		panelD.add(Dt1);
		panelD.add(Dl2);
		panelD.add(Dl3);
		panelD.add(Dt4);
		panelD.add(Dt5);
		panelD.add(Dl6);
		panelD.add(Dt7);
		panelD.add(Dl8);
		panelD.add(Dl9);
		add(panelD);

		panelE = new JPanel();
		Et1 = new JTextField();
		El2 = new JLabel("  5");
		El3 = new JLabel("  6");
		Et4 = new JTextField();
		Et5 = new JTextField();
		Et6 = new JTextField();
		El7 = new JLabel("  1");
		El8 = new JLabel("  2");
		Et9 = new JTextField();
		panelE.add(Et1);
		panelE.add(El2);
		panelE.add(El3);
		panelE.add(Et4);
		panelE.add(Et5);
		panelE.add(Et6);
		panelE.add(El7);
		panelE.add(El8);
		panelE.add(Et9);
		add(panelE);

		panelF = new JPanel();
		Fl1 = new JLabel("  7");
		Fl2 = new JLabel("  2");
		Ft3 = new JTextField();
		Fl4 = new JLabel("  1");
		Ft5 = new JTextField();
		Fl6 = new JLabel("  5");
		Ft7 = new JTextField();
		Fl8 = new JLabel("  3");
		Ft9 = new JTextField();
		panelF.add(Fl1);
		panelF.add(Fl2);
		panelF.add(Ft3);
		panelF.add(Fl4);
		panelF.add(Ft5);
		panelF.add(Fl6);
		panelF.add(Ft7);
		panelF.add(Fl8);
		panelF.add(Ft9);
		add(panelF);

		panelG = new JPanel();
		Gt1 = new JTextField();
		Gt2 = new JTextField();
		Gl3 = new JLabel("  7");
		Gl4 = new JLabel("  5");
		Gt5 = new JTextField();
		Gl6 = new JLabel("  1");
		Gl7 = new JLabel("  3");
		Gl8 = new JLabel("  2");
		Gt9 = new JTextField();
		panelG.add(Gt1);
		panelG.add(Gt2);
		panelG.add(Gl3);
		panelG.add(Gl4);
		panelG.add(Gt5);
		panelG.add(Gl6);
		panelG.add(Gl7);
		panelG.add(Gl8);
		panelG.add(Gt9);
		add(panelG);
		
		panelH = new JPanel();
		Ht1 = new JTextField();
		Hl2 = new JLabel("  4");
		Ht3 = new JTextField();
		Ht4 = new JTextField();
		Hl5 = new JLabel("  3");
		Hl6 = new JLabel("  2");
		Hl7 = new JLabel("  9");
		Hl8 = new JLabel("  8");
		Hl9 = new JLabel("  5");
		panelH.add(Ht1);
		panelH.add(Hl2);
		panelH.add(Ht3);
		panelH.add(Ht4);
		panelH.add(Hl5);
		panelH.add(Hl6);
		panelH.add(Hl7);
		panelH.add(Hl8);
		panelH.add(Hl9);
		add(panelH);
	panelI = new JPanel();
	Il1 = new JLabel("  2");
	Il2 = new JLabel("  5");
	Il3 = new JLabel("  3");
	It4 = new JTextField();
	It5 = new JTextField();
	Il6 = new JLabel("  8");
	It7 = new JTextField();
	Il8 = new JLabel("  7");
	Il9 = new JLabel("  1");
	panelI.add(Il1);
	panelI.add(Il2);
	panelI.add(Il3);
	panelI.add(It4);
	panelI.add(It5);
	panelI.add(Il6);
	panelI.add(It7);
	panelI.add(Il8);
	panelI.add(Il9);
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
			Al1, Al8, Al9,  Bl1, Bl2, Bl3, Bl4, Bl5, Bl8, Cl2, Cl4, Cl7,  
			Dl2, Dl3, Dl6, Dl8, Dl9, El2, El3, El7, El8, Fl1, Fl2, Fl4, Fl6, Fl8, 
			Gl3, Gl4, Gl6, Gl7, Gl8,Hl2, Hl5, Hl6, Hl7, Hl8, Hl9, Il1, Il2, Il3, Il6, Il8, Il9
			
			
	};
Classes.LABEL_PROPS(label);
	JTextField[] list = {
			At2, At3, At4, At5, At6, At7, 
			Bt6, Bt7, Bt9,
			Ct1, Ct3, Ct5, Ct6, Ct8, Ct9,
			Dt1, Dt4, Dt5, Dt7,
			Et1, Et4, Et5, Et6, Et9,
			Ft3, Ft5, Ft7, Ft9,
			Gt1, Gt2, Gt5, Gt9,
			Ht1, Ht3, Ht4,
			It4, It5, It7
	};
Classes.TEXTFIELD_PROPS(list);
		
	JMenuItem [] menuitem= { exi,f1, next, pre,  rese, comfir,  
	s1lev1, s1lev2, s1lev3, s1lev4, s1lev5, s1lev6, s1lev7, s1lev8, s1lev9, s1lev10, 
	s2lev1, s2lev2, s2lev3, s2lev4, s2lev5, s2lev6, s2lev7, s2lev8, s2lev9, s2lev10,
	s3lev1, s3lev2, s3lev3, s3lev4, s3lev5, s3lev6, s3lev7, s3lev8, s3lev9, s3lev10, 
	s4lev1, s4lev2, s4lev3, s4lev4, s4lev5, s4lev6, s4lev7, s4lev8, s4lev9, s4lev10, 
	s5lev1, s5lev2, s5lev3, s5lev4, s5lev5, s5lev6, s5lev7, s5lev8, s5lev9, s5lev10
	};Classes.LEVELS_PROPS(menuitem);
	JMenu [] jmenu = {
			exit, game, comfirm, reset, stage, F1,  sone, stwo, sthree, sfour, sfive 
			};
	Classes.JMENU_FOREGROUND(jmenu);
	
	JPanel[] panel= {
			 panelA, panelB, panelC,
			 panelD, panelE, panelF,
			 panelG, panelH, panelI
	};
	Classes.JPANEL_LEVEL3(panel);Classes.JPANEL_LAYOUT(panel);
}
private void comfirActionPerformed(ActionEvent evt) {
	COMFIRM();
}
	private void s1lev1(ActionEvent evt) {
		
		dispose();
		
		new sudoku1();
		
	}
	private void s1lev2(ActionEvent evt) {
		
		dispose();
		
		new sudoku2();
		
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
                new sudoku33();
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
		String alert = " Level 3 Stage Five";
	Classes.ALERT(alert);

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
	 new sudoku44();
	
}
private void pre(ActionEvent evt){
	dispose();
	new sudoku42();
	
}
	private void RESET() {

	JTextField [] list = {
			At2, At3, At4, At5, At6, At7, 
			Bt6, Bt7, Bt9,
			Ct1, Ct3, Ct5, Ct6, Ct8, Ct9,
			Dt1, Dt4, Dt5, Dt7,
			Et1, Et4, Et5, Et6, Et9,
			Ft3, Ft5, Ft7, Ft9,
			Gt1, Gt2, Gt5, Gt9,
			Ht1, Ht3, Ht4,
			It4, It5, It7
			};
	
	for(int i = 0; i < list.length; i++) {
		  list[i].setText(null);
	  }	
}

	private void COMFIRM() {
		
	int at2, at3, at4, at5, at6, at7, 
	bt6, bt7, bt9, 
	ct1, ct3, ct5, ct6, ct8, ct9, 
	dt1, dt4, dt5, dt7, 
	et1, et4, et5, et6, et9, 
	ft3, ft5, ft7, ft9, 
	gt1, gt2, gt5, gt9, 
	ht1, ht3, ht4, 
	it4, it5, it7;

	JTextField [] list = {
			At2, At3, At4, At5, At6, At7, 
			Bt6, Bt7, Bt9,
			Ct1, Ct3, Ct5, Ct6, Ct8, Ct9,
			Dt1, Dt4, Dt5, Dt7,
			Et1, Et4, Et5, Et6, Et9,
			Ft3, Ft5, Ft7, Ft9,
			Gt1, Gt2, Gt5, Gt9,
			Ht1, Ht3, Ht4,
			It4, It5, It7
			};
	
	int [] correctvalues = {
            3, 4, 1, 5, 9, 8, 
            8, 5, 3, 
            5, 7, 6, 2, 1, 4, 
            4, 2, 6, 7, 
            8, 3, 9, 7, 4, 
            9, 4, 8, 6, 
            9, 8, 4, 6, 
            6, 1, 7, 
            6, 9, 4  
        };
                        
	
	int [] gettext = {	
			at2 = Integer.parseInt(At2.getText()),at3 = Integer.parseInt(At3.getText()),at4 = Integer.parseInt(At4.getText()),
			at5 = Integer.parseInt(At5.getText()),at6 = Integer.parseInt(At6.getText()),at7 = Integer.parseInt(At7.getText()),
			bt6 = Integer.parseInt(Bt6.getText()),bt7 = Integer.parseInt(Bt7.getText()), bt9 = Integer.parseInt(Bt9.getText()),
			ct1 = Integer.parseInt(Ct1.getText()),ct3 = Integer.parseInt(Ct3.getText()),ct5 = Integer.parseInt(Ct5.getText()),
			ct6 = Integer.parseInt(Ct6.getText()),ct8 = Integer.parseInt(Ct8.getText()),ct9 = Integer.parseInt(Ct9.getText()),
			dt1 = Integer.parseInt(Dt1.getText()),dt4 = Integer.parseInt(Dt4.getText()),dt5 = Integer.parseInt(Dt5.getText()),
			dt7 = Integer.parseInt(Dt7.getText()),et1 = Integer.parseInt(Et1.getText()),et4 = Integer.parseInt(Et4.getText()),
			et5 = Integer.parseInt(Et5.getText()),et6 = Integer.parseInt(Et6.getText()),et9 = Integer.parseInt(Et9.getText()),
			ft3 = Integer.parseInt(Ft3.getText()),ft5 = Integer.parseInt(Ft5.getText()),ft7 = Integer.parseInt(Ft7.getText()),
			ft9 = Integer.parseInt(Ft9.getText()),gt1 = Integer.parseInt(Gt1.getText()),gt2 = Integer.parseInt(Gt2.getText()),
			gt5 = Integer.parseInt(Gt5.getText()),gt9 = Integer.parseInt(Gt9.getText()),ht1 = Integer.parseInt(Ht1.getText()),
			ht3 = Integer.parseInt(Ht3.getText()),ht4 = Integer.parseInt(Ht4.getText()),it4 = Integer.parseInt(It4.getText()),
			it5 = Integer.parseInt(It5.getText()),it7 = Integer.parseInt(It7.getText())
	};
        boolean check = false;
	Classes.CONFIRM(list, gettext, correctvalues, check);
        
        if(check == true){
             new sudoku44();
            
        }
	}

public static void main(String[] args) {
	new sudoku43();
}

}
