package StageOne;

import Modules.Classes;
import StageOne.*;
import StageTwo.*;
import StageThree.*;
import StageFour.*;
import StageFive.*;
import Help.hElp;

import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class sudoku9 extends JFrame{
	JPanel panelA, panelB, panelC, panelD, panelE, panelF, panelG, panelH, panelI;
	JMenuBar menubar;
	JMenu exit, game, comfirm, reset, stage, F1, sone, stwo, sthree, sfour, sfive ;
	
	JMenuItem exi, next, pre,  comfir, rese, f1, 
	s1lev1, s1lev2, s1lev3, s1lev4, s1lev5, s1lev6, s1lev7, s1lev8, s1lev9, s1lev10, 
	s2lev1, s2lev2, s2lev3, s2lev4, s2lev5, s2lev6, s2lev7, s2lev8, s2lev9, s2lev10,
	s3lev1, s3lev2, s3lev3, s3lev4, s3lev5, s3lev6, s3lev7, s3lev8, s3lev9, s3lev10, 
	s4lev1, s4lev2, s4lev3, s4lev4, s4lev5, s4lev6, s4lev7, s4lev8, s4lev9, s4lev10, 
	s5lev1, s5lev2, s5lev3, s5lev4, s5lev5, s5lev6, s5lev7, s5lev8, s5lev9, s5lev10
	;
	
	JTextField At1, At2, At3, At4, At5, At8, Bt2, Bt5, Bt7, Bt8, Bt9, Ct1, Ct2, Ct3, Ct5, Ct6, Ct8, Dt1, Dt3, Dt5, Dt6, Dt9, Et2, Et4, Et6, Et7, Et9, Ft1, Ft3, Ft4, Ft5, Ft7, 
	Gt2, Gt3, Gt4, Gt6, Gt7, Gt8, Ht2, Ht5, Ht8, It1, It2, It4, It6, It8, It9;
	JLabel Al6, Al7, Al9, Bl1, Bl3, Bl4, Bl6, Cl4, Cl7, Cl9, Dl2, Dl4, Dl7, Dl8, El1, El3, El5, El8, Fl2, Fl6, Fl8, Fl9, Gl1, Gl5, Gl9, Hl1, Hl3, Hl4, Hl6, Hl7, Hl9, Il3, Il5, Il7;
	
	public sudoku9(){
		setSize(350, 350);
		setTitle("Level 9 ");
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
		At1 = new JTextField();
		At2 = new JTextField();
		At3 = new JTextField();
		At4 = new JTextField();
		At5 = new JTextField();
		Al6 = new JLabel("  8");
		Al7 = new JLabel("  4");
		At8 = new JTextField();
		Al9 = new JLabel("  1");
		panelA.add(At1);
		panelA.add(At2);
		panelA.add(At3);
		panelA.add(At4);
		panelA.add(At5);
		panelA.add(Al6);
		panelA.add(Al7);
		panelA.add(At8);
		panelA.add(Al9);
		add(panelA);
		
		panelB = new JPanel();
		Bl1 = new JLabel("  1");
		Bt2 = new JTextField();
		Bl3 = new JLabel("  7");
		Bl4 = new JLabel("  5");
		Bt5 = new JTextField();
		Bl6 = new JLabel("  3");
		Bt7 = new JTextField();
		Bt8 = new JTextField();
		Bt9 = new JTextField();
		panelB.add(Bl1);
		panelB.add(Bt2);
		panelB.add(Bl3);
		panelB.add(Bl4);
		panelB.add(Bt5);
		panelB.add(Bl6);
		panelB.add(Bt7);
		panelB.add(Bt8);
		panelB.add(Bt9);
		add(panelB);
		
		panelC = new JPanel();
		Ct1 = new JTextField();
		Ct2 = new JTextField();
		Ct3 = new JTextField();
		Cl4 = new JLabel("  7");
		Ct5 = new JTextField();
		Ct6 = new JTextField();
		Cl7 = new JLabel("   5");
		Ct8 = new JTextField();
		Cl9 = new JLabel("   9");
		panelC.add(Ct1);
		panelC.add(Ct2);
		panelC.add(Ct3);
		panelC.add(Cl4);
		panelC.add(Ct5);
		panelC.add(Ct6);
		panelC.add(Cl7);
		panelC.add(Ct8);
		panelC.add(Cl9);
		add(panelC);
		
		panelD = new JPanel();
		Dt1 = new JTextField();
		Dl2 = new JLabel("   2");
		Dt3 = new JTextField();
		Dl4 = new JLabel("   3");
		Dt5 = new JTextField();
		Dt6 = new JTextField();
		Dl7 = new JLabel(" 5");
		Dl8 = new JLabel(" 1");
		Dt9 = new JTextField();
		panelD.add(Dt1);
		panelD.add(Dl2);
		panelD.add(Dt3);
		panelD.add(Dl4);
		panelD.add(Dt5);
		panelD.add(Dt6);
		panelD.add(Dl7);
		panelD.add(Dl8);
		panelD.add(Dt9);
		add(panelD);
		
		panelE = new JPanel();
		El1 = new JLabel("   7");
		Et2 = new JTextField();
		El3 = new JLabel("   1");
		Et4 = new JTextField();
		El5 = new JLabel("   8");
		Et6 = new JTextField();
		Et7 = new JTextField();
		El8 = new JLabel("   3");
		Et9 = new JTextField();
		panelE.add(El1);
		panelE.add(Et2);
		panelE.add(El3);
		panelE.add(Et4);
		panelE.add(El5);
		panelE.add(Et6);
		panelE.add(Et7);
		panelE.add(El8);
		panelE.add(Et9);
		add(panelE);
		
		panelF = new JPanel();
		Ft1 = new JTextField();
		Fl2 = new JLabel("   9");
		Ft3 = new JTextField();
		Ft4 = new JTextField();
		Ft5 = new JTextField();
		Fl6 = new JLabel("   7");
		Ft7 = new JTextField();
		Fl8 = new JLabel("   2");
		Fl9 = new JLabel("   4");
		panelF.add(Ft1);
		panelF.add(Fl2);
		panelF.add(Ft3);
		panelF.add(Ft4);
		panelF.add(Ft5);
		panelF.add(Fl6);
		panelF.add(Ft7);
		panelF.add(Fl8);
		panelF.add(Fl9);
		add(panelF);
		
		panelG = new JPanel();
		Gl1 = new JLabel("   1");
		Gt2 = new JTextField();
		Gt3 = new JTextField();
		Gt4 = new JTextField();
		Gl5 = new JLabel("  8");
		Gt6 = new JTextField();
		Gt7 = new JTextField();
		Gt8 = new JTextField();
		Gl9 = new JLabel("   2");
		panelG.add(Gl1);
		panelG.add(Gt2);
		panelG.add(Gt3);
		panelG.add(Gt4);
		panelG.add(Gl5);
		panelG.add(Gt6);
		panelG.add(Gt7);
		panelG.add(Gt8);
		panelG.add(Gl9);
		add(panelG);
		
		panelH = new JPanel();
		Hl1 = new JLabel("   4");
		Ht2 = new  JTextField();
		Hl3 = new JLabel("   2");
		Hl4 = new JLabel("   2");
		Ht5 = new JTextField();
		Hl6 = new JLabel("   5");
		Hl7 = new JLabel("   3");
		Ht8 = new JTextField();
		Hl9 = new JLabel("   8");
		panelH.add(Hl1);
		panelH.add(Ht2);
		panelH.add(Hl3);
		panelH.add(Hl4);
		panelH.add(Ht5);
		panelH.add(Hl6);
		panelH.add(Hl7);
		panelH.add(Ht8);
		panelH.add(Hl9);
		add(panelH);
		
		panelI = new JPanel();
		It1 = new JTextField();
		It2 = new JTextField();
		Il3 = new JLabel("   8");
		It4 = new JTextField();
		Il5 = new JLabel("   7");
		It6 = new JTextField();
		Il7 = new JLabel("   9");
		It8 = new JTextField();
		It9 = new JTextField();
		panelI.add(It1);
		panelI.add(It2);
		panelI.add(Il3);
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
	
	private void exiActionPerformed(ActionEvent evt) {
		System.exit(0);
	}
	
	private void reseActionPerformed(ActionEvent evt) {
		RESET();
	}
	private void PLAY() {
		JLabel [] label = {
				Al6, Al7, Al9,
				Bl1, Bl3, Bl4, Bl6,
				Cl4, Cl7, Cl9, 
				Dl2, Dl4, Dl7, Dl8,
				El1, El3, El5, El8,
				Fl2, Fl6, Fl8, Fl9,
				Gl1, Gl5, Gl9, 
				Hl1, Hl3, Hl4, Hl6, Hl7, Hl9,
				Il3, Il5, Il7
				
		};
		
		JTextField[] list = {
				At1, At2, At3, At4, At5, At8,
				 Bt2, Bt5, Bt7, Bt8, Bt9, 
				 Ct1, Ct2, Ct3, Ct5, Ct6, Ct8,
				 Dt1, Dt3, Dt5, Dt6, Dt9, 
				 Et2, Et4, Et6, Et7, Et9,
				 Ft1, Ft3, Ft4, Ft5, Ft7, 
				 Gt2, Gt3, Gt4, Gt6, Gt7, Gt8,
				 Ht2, Ht5, Ht8,
				 It1, It2, It4, It6, It8, It9
		};
		JMenu [] jmenu = {
				exit, game, comfirm, reset, stage, F1,  sone, stwo, sthree, sfour, sfive 
				};
		
			JMenuItem[] menuitem = {
				exi,f1, next, pre, rese,  comfir,  
				s1lev1, s1lev2, s1lev3, s1lev4, s1lev5, s1lev6, s1lev7, s1lev8, s1lev9, s1lev10, 
				s2lev1, s2lev2, s2lev3, s2lev4, s2lev5, s2lev6, s2lev7, s2lev8, s2lev9, s2lev10,
				s3lev1, s3lev2, s3lev3, s3lev4, s3lev5, s3lev6, s3lev7, s3lev8, s3lev9, s3lev10, 
				s4lev1, s4lev2, s4lev3, s4lev4, s4lev5, s4lev6, s4lev7, s4lev8, s4lev9, s4lev10, 
				s5lev1, s5lev2, s5lev3, s5lev4, s5lev5, s5lev6, s5lev7, s5lev8, s5lev9, s5lev10
					
		};
		JPanel[] panel = { panelA, panelB, panelC, 
		 panelD, panelE, panelF, 
		 panelG, panelH, panelI
		};
		
		Classes.LABEL_PROPS(label);
		Classes.TEXTFIELD_PROPS(list);
		Classes.LEVELS_PROPS(menuitem);
		Classes.JMENU_FOREGROUND(jmenu);
		Classes.JPANEL_LEVEL9(panel);
		Classes.JPANEL_LAYOUT(panel);
		
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

	String alert = "Stage one Level 9";
        Classes.ALERT(alert);
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

	new hElp();

	}
	private void next(ActionEvent evt) {
		dispose();
                new sudoku10();
		
	}
	private void pre(ActionEvent evt){
		dispose();
		sudoku8 s8 = new sudoku8();
		s8.setVisible(true);
	}
	private void RESET() {
		
		JTextField [] list = {
				 At1, At2, At3, At4, At5, At8,
				 Bt2, Bt5, Bt7, Bt8, Bt9, 
				 Ct1, Ct2, Ct3, Ct5, Ct6, Ct8,
				 Dt1, Dt3, Dt5, Dt6, Dt9, 
				 Et2, Et4, Et6, Et7, Et9,
				 Ft1, Ft3, Ft4, Ft5, Ft7, 
				 Gt2, Gt3, Gt4, Gt6, Gt7, Gt8,
				 Ht2, Ht5, Ht8,
				 It1, It2, It4, It6, It8, It9
		};
		
		for(int i = 0; i < list.length; i ++ ) {
			list[i].setText(null);
		}
	}
	
	private void COMFIRM() {
		int at1, at2, at3, at4, at5, at8, 
		bt2, bt5, bt7, bt8, bt9, 
		ct1, ct2, ct3, ct5, ct6, ct8, 
		dt1, dt3, dt5, dt6, dt9, 
		et2, et4, et6, et7, et9, 
		ft1, ft3, ft4, ft5, ft7, 
		gt2, gt3, gt4, gt6, gt7, gt8, 
		ht2, ht5, ht8, 
		it1, it2, it4, it6, it8, it9;
	
	
	JTextField [] list = {
			 At1, At2, At3, At4, At5, At8,
			 Bt2, Bt5, Bt7, Bt8, Bt9, 
			 Ct1, Ct2, Ct3, Ct5, Ct6, Ct8,
			 Dt1, Dt3, Dt5, Dt6, Dt9, 
			 Et2, Et4, Et6, Et7, Et9,
			 Ft1, Ft3, Ft4, Ft5, Ft7, 
			 Gt2, Gt3, Gt4, Gt6, Gt7, Gt8,
			 Ht2, Ht5, Ht8,
			 It1, It2, It4, It6, It8, It9
	};
	
	int [] correctvalues = {
			8, 7, 5, 6, 9, 2, 
			2, 3, 8, 4, 9, 
			9, 3, 4, 1, 8, 5, 
			4, 1, 6, 7, 9, 
			7, 1, 2, 4, 6, 
			6, 2, 5, 4, 1, 
			3, 6, 9, 8, 7, 1, 
			9, 1, 6, 
			4, 2, 3, 7, 9, 5
	};
	int [] gettext = {
			at1= Integer.parseInt(At1.getText()), at2= Integer.parseInt(At2.getText()), at3= Integer.parseInt(At3.getText()),
			at4= Integer.parseInt(At4.getText()),at5= Integer.parseInt(At5.getText()),at8= Integer.parseInt(At8.getText()),
			bt2= Integer.parseInt(Bt2.getText()),bt5= Integer.parseInt(Bt5.getText()),bt7= Integer.parseInt(Bt7.getText()),
			bt8= Integer.parseInt(Bt8.getText()),bt9= Integer.parseInt(Bt9.getText()),ct1= Integer.parseInt(Ct1.getText()),
			ct2= Integer.parseInt(Ct2.getText()),ct3= Integer.parseInt(Ct3.getText()),ct5= Integer.parseInt(Ct5.getText()),
			ct6= Integer.parseInt(Ct6.getText()),ct8= Integer.parseInt(Ct8.getText()),dt1= Integer.parseInt(Dt1.getText()),
			dt3= Integer.parseInt(Dt3.getText()),dt5= Integer.parseInt(Dt5.getText()),dt6= Integer.parseInt(Dt6.getText()),
			dt9= Integer.parseInt(Dt9.getText()),et2= Integer.parseInt(Et2.getText()),et4= Integer.parseInt(Et4.getText()),
			et6= Integer.parseInt(Et6.getText()), et7= Integer.parseInt(Et7.getText()),et9= Integer.parseInt(Et9.getText()),
			ft1= Integer.parseInt(Ft1.getText()),ft3= Integer.parseInt(Ft3.getText()),ft4= Integer.parseInt(Ft4.getText()),
			ft5= Integer.parseInt(Ft5.getText()),ft7= Integer.parseInt(Ft7.getText()),gt2= Integer.parseInt(Gt2.getText()),
			gt3= Integer.parseInt(Gt3.getText()),gt4= Integer.parseInt(Gt4.getText()),gt6= Integer.parseInt(Gt6.getText()),
			gt7= Integer.parseInt(Gt7.getText()),gt8= Integer.parseInt(Gt8.getText()),ht2= Integer.parseInt(Ht2.getText()),
			ht5= Integer.parseInt(Ht5.getText()),ht8= Integer.parseInt(Ht8.getText()),it1= Integer.parseInt(It1.getText()),
			it2= Integer.parseInt(It2.getText()),it4= Integer.parseInt(It4.getText()),it6= Integer.parseInt(It6.getText()),
			it8= Integer.parseInt(It8.getText()),it9= Integer.parseInt(It9.getText()),
	};
	boolean check = false;
	Classes.CONFIRM(list, gettext, correctvalues, check);
        if(check == true){
            dispose();
            new sudoku10();
        }
            
}
	
	public static void main(String[] args) {
		new sudoku9();
	}

}
