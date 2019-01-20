
package Help;

import Modules.Classes;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class hElp extends JFrame {
    JLabel picone, picsol;
    JTextArea ta1, ta2;
   JScrollPane pane1, pane2;
   JButton exit;
    public hElp(){
        setLayout(null);
        setSize(695, 570);
        setTitle("Sudoku Pro Help Page");
        setResizable(false);
          
     
        picone = new javax.swing.JLabel();
        pane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        pane2 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTextArea();
        picsol = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        picone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Help/Help.png"))); // NOI18N
        picone.setBounds(50, 70, 210, 250);
        ta1.setEditable(false);
        ta1.setColumns(20);
        ta1.setRows(5);
        ta1.setText("1. There is only one valid solution to each Sudoku puzzle.\n   The only way the puzzle can be considered solved \n   correctly   is when all 81 boxes contain numbers and the\n   other Sudoku   rules have been followed.\n2. When you start a game of Sudoku, some blocks will be \n   pre-filled for you. You cannot change these numbers\n   in the  course of the game.\n3. Each column must contain all of the numbers 1 through 9 \n   and  no two numbers in the same column of a\n   Sudoku puzzle can be the same\n4.  Each row must contain all of the numbers 1 through 9  \n   and no two numbers in the same row of a Sudoku \n   puzzle can   be the same.\n 5. Each block must contain all of the numbers 1 through 9  \n   and no two numbers in the same block of a Sudoku \n   puzzle can  be the same. \n\n  Sudoku Solution When the rules are applied, the solved Sudoku \n   puzzle appears as shown: on the left");
        ta1.setFont(Classes.handwritingsmall);
        ta1.setForeground(Classes.blue);
        ta1.setBackground(Classes.cyan);
        ta1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 100, 100)));
        ta1.setBounds(270, 130, 420, 300);

        ta2.setEditable(false);
        ta2.setColumns(20);
        ta2.setRows(5);
        ta2.setText("A standard Sudoku puzzle consists of a grid of 9 blocks.      \nEach block contains 9 boxes arranged in 3 rows and 3 columns.\nConsider this example of an actual Sudoku puzzle:");
        ta2.setFont(Classes.handwritingsmall);
        ta2.setForeground(Classes.blue);
        ta2.setBackground(Classes.gray);
        ta2.setBounds(150, 10, 390, 50);

        picsol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Help/Sol.png"))); // NOI18N
        picsol.setBounds(50, 300, 210, 250);
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        exit.setBounds(550, 450, 80, 30);

        
        add(ta1);
        add(ta2);
        add(picone);
        add(picsol);
        add(exit);
        setVisible(true);
        java.awt.Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
	
    }
    private void exitActionPerformed(ActionEvent evt){
        dispose();
    }
    public static void main(String[] args){
        new hElp();
        
    }
}









//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Help;
//
//import game.Game;
//import java.awt.Dimension;
//
///**
// *
// * @author martin
// */
//public class hElp extends javax.swing.JFrame {
//
//    /**
//     * Creates new form HELP
//     */
//    public hElp() {
//        initComponents();
//        
//        
//        setSize(695, 670);
//        setTitle("Sudoku Pro Help Page");
//        setResizable(false);
//         setVisible(true);
//        java.awt.Toolkit toolkit = getToolkit();
//        Dimension size = toolkit.getScreenSize();
//        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
//        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
//	
//    }
//
//    /**
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
//    private void initComponents() {
//
//        jLabel2 = new javax.swing.JLabel();
//        jScrollPane1 = new javax.swing.JScrollPane();
//        jTextArea1 = new javax.swing.JTextArea();
//        jScrollPane2 = new javax.swing.JScrollPane();
//        jTextArea2 = new javax.swing.JTextArea();
//        jLabel1 = new javax.swing.JLabel();
//        jButton1 = new javax.swing.JButton();
//
//        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Help/Help.png"))); // NOI18N
//
//        jTextArea1.setEditable(false);
//        jTextArea1.setColumns(20);
//        jTextArea1.setRows(5);
//        jTextArea1.setText("1. There is only one valid solution to each Sudoku puzzle.\nThe only way the puzzle can be considered solved \ncorrectly   is when all 81 boxes contain numbers and the\n other Sudoku   rules have been followed.\n2. When you start a game of Sudoku, some blocks will be \n pre-filled for you. You cannot change these numbers\n in the  course of the game.\n3. Each column must contain all of the numbers 1 through 9 \nand  no two numbers in the same column of a\n Sudoku puzzle can be the same\n4.  Each row must contain all of the numbers 1 through 9  \nand no two numbers in the same row of a Sudoku \npuzzle can   be the same.\n 5. Each block must contain all of the numbers 1 through 9  \nand no two numbers in the same block of a Sudoku \npuzzle can  be the same.\n              \n\n Sudoku Solution When the rules are applied, the solved Sudoku puzzle appears as shown: ");
//        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        jScrollPane1.setViewportView(jTextArea1);
//
//        jTextArea2.setEditable(false);
//        jTextArea2.setColumns(20);
//        jTextArea2.setRows(5);
//        jTextArea2.setText("A standard Sudoku puzzle consists of a grid of 9 blocks.      \nEach block contains 9 boxes arranged in 3 rows and 3 columns.\nConsider this example of an actual Sudoku puzzle:");
//        jScrollPane2.setViewportView(jTextArea2);
//
//        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Help/Sol.png"))); // NOI18N
//
//        jButton1.setText("Exit");
//        jButton1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton1ActionPerformed(evt);
//            }
//        });
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
//        this.setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addGap(73, 73, 73)
//                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(18, 18, 18)
//                .addComponent(jLabel1))
//            .addGroup(layout.createSequentialGroup()
//                .addContainerGap()
//                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(65, 65, 65)
//                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
//            .addGroup(layout.createSequentialGroup()
//                .addGap(188, 188, 188)
//                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(jLabel2)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(layout.createSequentialGroup()
//                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addContainerGap())
//                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(27, 27, 27))))
//        );
//    }// </editor-fold>                        
//
//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//       Game g = new Game();
//       g.setVisible(true);
//    }                                        
//
//
//    // Variables declaration - do not modify                     
//    private javax.swing.JButton jButton1;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel jLabel2;
//    private javax.swing.JScrollPane jScrollPane1;
//    private javax.swing.JScrollPane jScrollPane2;
//    private javax.swing.JTextArea jTextArea1;
//    private javax.swing.JTextArea jTextArea2;
//    // End of variables declaration                   
//}
//