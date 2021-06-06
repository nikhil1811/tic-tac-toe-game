package tictactoe;

import java.awt.Color;
import javax.swing.UIManager;

public class TicTacToe extends javax.swing.JFrame {

    boolean player = true;
    static boolean reset;

    //static char array[][] = new char[3][3];
    char array[][] = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    int count = 0;
    javax.swing.JButton undoBt;

    public TicTacToe() {
        initComponents();
        gamePanel.setVisible(false);
        chance.setVisible(false);
        note1.setVisible(false);
        note2.setVisible(false);
        restart.setVisible(false);
        undo.setVisible(false);
        
        if(reset){
            start.doClick();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        gamePanel = new javax.swing.JPanel();
        b00 = new javax.swing.JButton();
        b01 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b02 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        chance = new javax.swing.JLabel();
        note1 = new javax.swing.JLabel();
        note2 = new javax.swing.JLabel();
        restart = new javax.swing.JButton();
        undo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");

        start.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        gamePanel.setBackground(new java.awt.Color(255, 255, 0));
        gamePanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        gamePanel.setOpaque(false);

        b00.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b00.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        b00.setContentAreaFilled(false);
        b00.setPreferredSize(new java.awt.Dimension(80, 80));
        b00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b00ActionPerformed(evt);
            }
        });

        b01.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b01.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        b01.setContentAreaFilled(false);
        b01.setPreferredSize(new java.awt.Dimension(80, 80));
        b01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b01ActionPerformed(evt);
            }
        });

        b10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        b10.setContentAreaFilled(false);
        b10.setPreferredSize(new java.awt.Dimension(80, 80));
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b21.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b21.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        b21.setContentAreaFilled(false);
        b21.setPreferredSize(new java.awt.Dimension(80, 80));
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });

        b20.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        b20.setContentAreaFilled(false);
        b20.setPreferredSize(new java.awt.Dimension(80, 80));
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });

        b22.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b22.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        b22.setContentAreaFilled(false);
        b22.setPreferredSize(new java.awt.Dimension(80, 80));
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });

        b12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        b12.setContentAreaFilled(false);
        b12.setPreferredSize(new java.awt.Dimension(80, 80));
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        b11.setContentAreaFilled(false);
        b11.setPreferredSize(new java.awt.Dimension(80, 80));
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b02.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b02.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        b02.setContentAreaFilled(false);
        b02.setPreferredSize(new java.awt.Dimension(80, 80));
        b02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b02ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setOpaque(true);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setOpaque(true);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOpaque(true);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOpaque(true);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setOpaque(true);

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setOpaque(true);

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator7.setOpaque(true);

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator8.setOpaque(true);

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, 0)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator4)
                    .addComponent(b01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator7))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(b12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, 0)
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePanelLayout.createSequentialGroup()
                                        .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(gamePanelLayout.createSequentialGroup()
                                        .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        chance.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        chance.setForeground(new java.awt.Color(255, 255, 255));
        chance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chance.setText("Player 1 chance :");

        note1.setText("Player1 : X");
        note1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                note1MouseClicked(evt);
            }
        });

        note2.setText("Player2 : O");

        restart.setText("Restart");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        undo.setText("undo");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(note1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(note2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chance, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                    .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(restart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(undo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(note1)
                .addGap(2, 2, 2)
                .addComponent(note2)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(chance)
                .addGap(30, 30, 30)
                .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(restart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(undo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        start.setVisible(false);
        chance.setVisible(true);
        gamePanel.setVisible(true);
        restart.setVisible(true);
        //undo.setVisible(true);
        note1.setVisible(true);
        note2.setVisible(true);
    }//GEN-LAST:event_startActionPerformed

    private void printChar(javax.swing.JButton jb, int i, int j) {
        if (player) {
            count++;
            jb.setText("X");
            player = !player;
            chance.setText("Player 2 chance :");
            array[i][j] = 'x';
            if (count >= 3) {
                if (checkWinner()) {
                    won("Player 1 Won");
                }
            }
        } else {
            jb.setText("0");
            player = !player;
            chance.setText("Player 1 chance :");
            array[i][j] = '0';
            if (count >= 3) {
                if (checkWinner()) {
                    won("Player 2 Won");
                }
            }
        }
        undoBt = jb;
        jb.setEnabled(false);
        jb.setForeground(Color.BLACK);

    }

    private boolean checkWinner() {
        if ((array[0][0] == array[0][1] && array[0][0] == array[0][2] && array[0][0] != ' ')
                || (array[1][0] == array[1][1] && array[1][0] == array[1][2] && array[1][0] != ' ')
                || (array[2][0] == array[2][1] && array[2][0] == array[2][2] && array[2][0] != ' ')
                || (array[0][0] == array[1][0] && array[0][0] == array[2][0] && array[0][0] != ' ')
                || (array[0][1] == array[1][1] && array[0][1] == array[2][1] && array[0][1] != ' ')
                || (array[0][2] == array[1][2] && array[0][2] == array[2][2] && array[0][2] != ' ')
                || (array[0][0] == array[1][1] && array[0][0] == array[2][2] && array[0][0] != ' ')
                || (array[0][2] == array[1][1] && array[0][2] == array[2][0] && array[0][2] != ' ')) {
            return true;
        }
        return false;
    }

    private void won(String winner) {
        gamePanel.setVisible(false);
        note1.setVisible(false);
        note2.setVisible(false);
        chance.setText(winner);
        undo.setVisible(false);
    }

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        printChar(b10, 1, 0);
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        printChar(b11, 1, 1);
    }//GEN-LAST:event_b11ActionPerformed

    private void b00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b00ActionPerformed
        printChar(b00, 0, 0);
    }//GEN-LAST:event_b00ActionPerformed

    private void b01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b01ActionPerformed
        printChar(b01, 0, 1);
    }//GEN-LAST:event_b01ActionPerformed

    private void b02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b02ActionPerformed
        printChar(b02, 0, 2);
    }//GEN-LAST:event_b02ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        printChar(b12, 1, 2);
    }//GEN-LAST:event_b12ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        printChar(b20, 2, 0);
    }//GEN-LAST:event_b20ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        printChar(b21, 2, 1);
    }//GEN-LAST:event_b21ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        printChar(b22, 2, 2);
    }//GEN-LAST:event_b22ActionPerformed

    private void note1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_note1MouseClicked
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }//GEN-LAST:event_note1MouseClicked

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        reset = true;
        TicTacToe newGame = new TicTacToe();
        newGame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_restartActionPerformed

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
        undoBt.setText("");
        undoBt.setEnabled(true);
        player = !player;
        count--;
        if(player)
            chance.setText("Player 1 chance :");
        else 
            chance.setText("Player 2 chance :");
    }//GEN-LAST:event_undoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b00;
    private javax.swing.JButton b01;
    private javax.swing.JButton b02;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JLabel chance;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel note1;
    private javax.swing.JLabel note2;
    private javax.swing.JButton restart;
    private javax.swing.JButton start;
    private javax.swing.JButton undo;
    // End of variables declaration//GEN-END:variables
}
