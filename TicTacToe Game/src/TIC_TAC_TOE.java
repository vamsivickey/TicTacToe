
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class TIC_TAC_TOE extends javax.swing.JFrame {
    
    private String startGame="X";
    private int xCount=0;
    private int oCount=0;
    /**
     * Creates new form TIC_TAC_TOE
     */
    public TIC_TAC_TOE() {
        initComponents();
    }
    
    private void gameScore()
    {
      playerxxx.setText(String.valueOf(xCount));
      playerooo.setText(String.valueOf(oCount));
    }

    private void choose_a_Player()
    {
     if (startGame.equalsIgnoreCase("X"))
      { 
          startGame="O";
      }
     else
     { 
         startGame="X";
     }
    
    }
    
    private void WinningGame()
    {
      String b1=txtbtn1.getText();
      String b2=txtbtn2.getText();
      String b3=txtbtn3.getText();
      
      String b4=txtbtn4.getText();
      String b5=txtbtn5.getText();
      String b6=txtbtn6.getText();
         
      String b7=txtbtn7.getText();
      String b8=txtbtn8.getText();
      String b9=txtbtn9.getText();
      
      if(b1 == ("X") && b2 == ("X") && b3==("X"))
      {
          JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",
                  JOPtionPane.INFORMATION_MESSAGE);
          xCount++;
          gameScore();
          
          txtbtn1.setBackground(Color.ORANGE);
          txtbtn2.setBackground(Color.ORANGE);
          txtbtn3.setBackground(Color.ORANGE);
      }
      if(b4 == ("X") && b5 == ("X") && b6==("X"))
      {
          JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",
                  JOPtionPane.INFORMATION_MESSAGE);
          xCount++;
          gameScore();
          
          txtbtn4.setBackground(Color.ORANGE);
          txtbtn5.setBackground(Color.ORANGE);
          txtbtn6.setBackground(Color.ORANGE);
      }
      if(b7 == ("X") && b8 == ("X") && b9==("X"))
      {
          JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",
                  JOPtionPane.INFORMATION_MESSAGE);
          xCount++;
          gameScore();
          
          txtbtn7.setBackground(Color.ORANGE);
          txtbtn8.setBackground(Color.ORANGE);
          txtbtn9.setBackground(Color.ORANGE);
      }
      if(b1 == ("X") && b4 == ("X") && b7==("X"))
      {
          JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",
                  JOPtionPane.INFORMATION_MESSAGE);
          xCount++;
          gameScore();
          
          txtbtn1.setBackground(Color.ORANGE);
          txtbtn4.setBackground(Color.ORANGE);
          txtbtn7.setBackground(Color.ORANGE);
      }
      if(b2 == ("X") && b5 == ("X") && b8==("X"))
      {
          JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",
                  JOPtionPane.INFORMATION_MESSAGE);
          xCount++;
          gameScore();
          
          txtbtn2.setBackground(Color.ORANGE);
          txtbtn5.setBackground(Color.ORANGE);
          txtbtn8.setBackground(Color.ORANGE);
      }
      if(b3 == ("X") && b6 == ("X") && b9==("X"))
      {
          JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",
                  JOPtionPane.INFORMATION_MESSAGE);
          xCount++;
          gameScore();
          
          txtbtn3.setBackground(Color.ORANGE);
          txtbtn6.setBackground(Color.ORANGE);
          txtbtn9.setBackground(Color.ORANGE);
      }
       if(b1 == ("X") && b5 == ("X") && b9==("X"))
      {
          JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",
                  JOPtionPane.INFORMATION_MESSAGE);
          xCount++;
          gameScore();
          
          txtbtn1.setBackground(Color.ORANGE);
          txtbtn5.setBackground(Color.ORANGE);
          txtbtn9.setBackground(Color.ORANGE);
      }
           if(b3 == ("X") && b5 == ("X") && b7==("X"))
      {
          JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",
                  JOPtionPane.INFORMATION_MESSAGE);
          xCount++;
          gameScore();
          
          txtbtn3.setBackground(Color.ORANGE);
          txtbtn5.setBackground(Color.ORANGE);
          txtbtn7.setBackground(Color.ORANGE);
      }
      
    }
    
    
     private void WinningGame1()
    {
      String b1=txtbtn1.getText();
      String b2=txtbtn2.getText();
      String b3=txtbtn3.getText();
      
      String b4=txtbtn4.getText();
      String b5=txtbtn5.getText();
      String b6=txtbtn6.getText();
         
      String b7=txtbtn7.getText();
      String b8=txtbtn8.getText();
      String b9=txtbtn9.getText();
      
      if(b1 == ("O") && b2 == ("O") && b3==("O"))
      {
          JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",
                  JOPtionPane.INFORMATION_MESSAGE);
          oCount++;
          gameScore();
          
          txtbtn1.setBackground(Color.ORANGE);
          txtbtn2.setBackground(Color.ORANGE);
          txtbtn3.setBackground(Color.ORANGE);
      }
      if(b4 == ("O") && b5 == ("O") && b6==("O"))
      {
          JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",
                  JOPtionPane.INFORMATION_MESSAGE);
          oCount++;
          gameScore();
          
          txtbtn4.setBackground(Color.ORANGE);
          txtbtn5.setBackground(Color.ORANGE);
          txtbtn6.setBackground(Color.ORANGE);
      }
      if(b7 == ("O") && b8 == ("O") && b9==("O"))
      {
          JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",
                  JOPtionPane.INFORMATION_MESSAGE);
          oCount++;
          gameScore();
          
          txtbtn7.setBackground(Color.ORANGE);
          txtbtn8.setBackground(Color.ORANGE);
          txtbtn9.setBackground(Color.ORANGE);
      }
      if(b1 == ("O") && b4 == ("O") && b7==("O"))
      {
          JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",
                  JOPtionPane.INFORMATION_MESSAGE);
          oCount++;
          gameScore();
          
          txtbtn1.setBackground(Color.ORANGE);
          txtbtn4.setBackground(Color.ORANGE);
          txtbtn7.setBackground(Color.ORANGE);
      }
      if(b2 == ("O") && b5 == ("O") && b8==("O"))
      {
          JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",
                  JOPtionPane.INFORMATION_MESSAGE);
          oCount++;
          gameScore();
          
          txtbtn2.setBackground(Color.ORANGE);
          txtbtn5.setBackground(Color.ORANGE);
          txtbtn8.setBackground(Color.ORANGE);
      }
      if(b3 == ("O") && b6 == ("O") && b9==("O"))
      {
          JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",
                  JOPtionPane.INFORMATION_MESSAGE);
          oCount++;
          gameScore();
          
          txtbtn3.setBackground(Color.ORANGE);
          txtbtn6.setBackground(Color.ORANGE);
          txtbtn9.setBackground(Color.ORANGE);
      }
       if(b1 == ("O") && b5 == ("O") && b9==("O"))
      {
          JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",
                  JOPtionPane.INFORMATION_MESSAGE);
          oCount++;
          gameScore();
          
          txtbtn1.setBackground(Color.ORANGE);
          txtbtn5.setBackground(Color.ORANGE);
          txtbtn9.setBackground(Color.ORANGE);
      }
           if(b3 == ("O") && b5 == ("O") && b7==("O"))
      {
          JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",
                  JOPtionPane.INFORMATION_MESSAGE);
          oCount++;
          gameScore();
          
          txtbtn3.setBackground(Color.ORANGE);
          txtbtn5.setBackground(Color.ORANGE);
          txtbtn7.setBackground(Color.ORANGE);
      }
      
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn8 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playero = new javax.swing.JLabel();
        playerooo = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playerxxx = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(255, 51, 51));
        txtexit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtexit.setForeground(new java.awt.Color(255, 255, 255));
        txtexit.setText("Exit");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(0, 51, 204));
        txtreset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtreset.setForeground(new java.awt.Color(255, 255, 255));
        txtreset.setText("Reset");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));

        playero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playero.setText("Player O:");

        playerooo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerooo.setText("xxxxx");

        playerx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerx.setText("Player X:");

        playerxxx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerxxx.setText("xxxxx");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 85, Short.MAX_VALUE)
                        .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        txtbtn2.setText(startGame);
        
     if (startGame.equalsIgnoreCase("X"))
      { 
       txtbtn2.setForeground(Color.RED);
      }
     else
     { 
       txtbtn2.setForeground(Color.blue);
     }
        choose_a_Player();
        WinningGame();
        WinningGame1();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
       
         txtbtn3.setText(startGame);
        
     if (startGame.equalsIgnoreCase("X"))
      { 
       txtbtn3.setForeground(Color.RED);
      }
     else
     { 
       txtbtn3.setForeground(Color.blue);
     }
        choose_a_Player();
        WinningGame();
        WinningGame1();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
      
         txtbtn1.setText(startGame);
        
     if (startGame.equalsIgnoreCase("X"))
      { 
       txtbtn1.setForeground(Color.RED);
      }
     else
     { 
       txtbtn1.setForeground(Color.blue);
     }
        choose_a_Player();
        WinningGame();
        WinningGame1();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
         txtbtn6.setText(startGame);
        
     if (startGame.equalsIgnoreCase("X"))
      { 
       txtbtn6.setForeground(Color.RED);
      }
     else
     { 
       txtbtn6.setForeground(Color.blue);
     }
        choose_a_Player();
        WinningGame();
        WinningGame1();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
                         
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtresetActionPerformed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
       JFrame frame=new JFrame("Exit");
       
       if(JOptionPane.showConfirmDialog(frame,"Confirm if you want Exit",
               "Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
       {
        System.exit(0);
       }
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
         txtbtn4.setText(startGame);
        
     if (startGame.equalsIgnoreCase("X"))
      { 
       txtbtn4.setForeground(Color.RED);
      }
     else
     { 
       txtbtn4.setForeground(Color.blue);
     }
        choose_a_Player();// TODO add your handling code here:
        WinningGame();
        WinningGame1();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
      txtbtn5.setText(startGame);
        
     if (startGame.equalsIgnoreCase("X"))
      { 
       txtbtn5.setForeground(Color.RED);
      }
     else
     { 
       txtbtn5.setForeground(Color.blue);
     }
        choose_a_Player();
        WinningGame();
        WinningGame1();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
         txtbtn7.setText(startGame);
        
     if (startGame.equalsIgnoreCase("X"))
      { 
       txtbtn7.setForeground(Color.RED);
      }
     else
     { 
       txtbtn7.setForeground(Color.blue);
     }
        choose_a_Player();
        WinningGame();
        WinningGame1();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
       txtbtn8.setText(startGame);
        
     if (startGame.equalsIgnoreCase("X"))
      { 
       txtbtn8.setForeground(Color.RED);
      }
     else
     { 
       txtbtn8.setForeground(Color.blue);
     }
        choose_a_Player();
        WinningGame();
        WinningGame1();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
         txtbtn9.setText(startGame);
        
     if (startGame.equalsIgnoreCase("X"))
      { 
       txtbtn9.setForeground(Color.RED);
      }
     else
     { 
       txtbtn9.setForeground(Color.blue);
     }
        choose_a_Player();
        WinningGame();
        WinningGame1();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerooo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxxx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    // End of variables declaration//GEN-END:variables
}
