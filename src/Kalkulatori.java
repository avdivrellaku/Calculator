/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Kalkulatori extends javax.swing.JFrame {

    double numri, rezultati;
    int veprimi;

    public Kalkulatori() {
        initComponents();
    }

    public void veprimet() {
        switch (veprimi) {
            case 1: //Mbledhja
                rezultati = numri + Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(rezultati));
                break;
                
            case 2: //Zbritja
                rezultati = numri - Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(rezultati));
                break;
                        
            case 3: //Shumezimi
                rezultati = numri * Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(rezultati));
                break; 
                
             case 4: //Pjesetimi
                rezultati = numri / Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(rezultati));
                break;    
                
             case 5: //Modulimi
                rezultati = numri % Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(rezultati));
                break;   
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        butoni9 = new javax.swing.JButton();
        butoni8 = new javax.swing.JButton();
        butoni7 = new javax.swing.JButton();
        butoni4 = new javax.swing.JButton();
        butoni5 = new javax.swing.JButton();
        butoni6 = new javax.swing.JButton();
        butoni1 = new javax.swing.JButton();
        butoni2 = new javax.swing.JButton();
        butoni3 = new javax.swing.JButton();
        butoni0 = new javax.swing.JButton();
        butonibaraz = new javax.swing.JButton();
        butonipik = new javax.swing.JButton();
        butonipjestim = new javax.swing.JButton();
        butoniminus = new javax.swing.JButton();
        butonishumzim = new javax.swing.JButton();
        butoniplus = new javax.swing.JButton();
        butoniC = new javax.swing.JButton();
        butonifshij = new javax.swing.JButton();
        butoniperqind = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulatori");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        butoni9.setBackground(new java.awt.Color(102, 102, 102));
        butoni9.setFont(new java.awt.Font("Koenig-Type Mager", 1, 24)); // NOI18N
        butoni9.setForeground(new java.awt.Color(255, 255, 255));
        butoni9.setText("9");
        butoni9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoni9ActionPerformed(evt);
            }
        });

        butoni8.setBackground(new java.awt.Color(102, 102, 102));
        butoni8.setFont(new java.awt.Font("Koenig-Type Mager", 1, 24)); // NOI18N
        butoni8.setForeground(new java.awt.Color(255, 255, 255));
        butoni8.setText("8");
        butoni8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoni8ActionPerformed(evt);
            }
        });

        butoni7.setBackground(new java.awt.Color(102, 102, 102));
        butoni7.setFont(new java.awt.Font("Koenig-Type Mager", 1, 24)); // NOI18N
        butoni7.setForeground(new java.awt.Color(255, 255, 255));
        butoni7.setText("7");
        butoni7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoni7ActionPerformed(evt);
            }
        });

        butoni4.setBackground(new java.awt.Color(102, 102, 102));
        butoni4.setFont(new java.awt.Font("Koenig-Type Mager", 1, 24)); // NOI18N
        butoni4.setForeground(new java.awt.Color(255, 255, 255));
        butoni4.setText("4");
        butoni4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoni4ActionPerformed(evt);
            }
        });

        butoni5.setBackground(new java.awt.Color(102, 102, 102));
        butoni5.setFont(new java.awt.Font("Koenig-Type Mager", 1, 24)); // NOI18N
        butoni5.setForeground(new java.awt.Color(255, 255, 255));
        butoni5.setText("5");
        butoni5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoni5ActionPerformed(evt);
            }
        });

        butoni6.setBackground(new java.awt.Color(102, 102, 102));
        butoni6.setFont(new java.awt.Font("Koenig-Type Mager", 1, 24)); // NOI18N
        butoni6.setForeground(new java.awt.Color(255, 255, 255));
        butoni6.setText("6");
        butoni6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoni6ActionPerformed(evt);
            }
        });

        butoni1.setBackground(new java.awt.Color(102, 102, 102));
        butoni1.setFont(new java.awt.Font("Koenig-Type Mager", 1, 24)); // NOI18N
        butoni1.setForeground(new java.awt.Color(255, 255, 255));
        butoni1.setText("1");
        butoni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoni1ActionPerformed(evt);
            }
        });

        butoni2.setBackground(new java.awt.Color(102, 102, 102));
        butoni2.setFont(new java.awt.Font("Koenig-Type Mager", 1, 24)); // NOI18N
        butoni2.setForeground(new java.awt.Color(255, 255, 255));
        butoni2.setText("2");
        butoni2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoni2ActionPerformed(evt);
            }
        });

        butoni3.setBackground(new java.awt.Color(102, 102, 102));
        butoni3.setFont(new java.awt.Font("Koenig-Type Mager", 1, 24)); // NOI18N
        butoni3.setForeground(new java.awt.Color(255, 255, 255));
        butoni3.setText("3");
        butoni3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoni3ActionPerformed(evt);
            }
        });

        butoni0.setBackground(new java.awt.Color(102, 102, 102));
        butoni0.setFont(new java.awt.Font("Koenig-Type Mager", 1, 24)); // NOI18N
        butoni0.setForeground(new java.awt.Color(255, 255, 255));
        butoni0.setText("0");
        butoni0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoni0ActionPerformed(evt);
            }
        });

        butonibaraz.setBackground(new java.awt.Color(255, 153, 0));
        butonibaraz.setFont(new java.awt.Font("Koenig-Type Mager", 1, 24)); // NOI18N
        butonibaraz.setForeground(new java.awt.Color(255, 255, 255));
        butonibaraz.setText("=");
        butonibaraz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonibarazActionPerformed(evt);
            }
        });

        butonipik.setBackground(new java.awt.Color(102, 102, 102));
        butonipik.setFont(new java.awt.Font("Koenig-Type Mager", 1, 24)); // NOI18N
        butonipik.setForeground(new java.awt.Color(255, 255, 255));
        butonipik.setText(".");
        butonipik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonipikActionPerformed(evt);
            }
        });

        butonipjestim.setBackground(new java.awt.Color(255, 153, 0));
        butonipjestim.setFont(new java.awt.Font("Koenig-Type Mager", 1, 24)); // NOI18N
        butonipjestim.setForeground(new java.awt.Color(255, 255, 255));
        butonipjestim.setText("/");
        butonipjestim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonipjestimActionPerformed(evt);
            }
        });

        butoniminus.setBackground(new java.awt.Color(255, 153, 0));
        butoniminus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        butoniminus.setForeground(new java.awt.Color(255, 255, 255));
        butoniminus.setText("-");
        butoniminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoniminusActionPerformed(evt);
            }
        });

        butonishumzim.setBackground(new java.awt.Color(255, 153, 0));
        butonishumzim.setFont(new java.awt.Font("Koenig-Type Mager", 1, 24)); // NOI18N
        butonishumzim.setForeground(new java.awt.Color(255, 255, 255));
        butonishumzim.setText("*");
        butonishumzim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonishumzimActionPerformed(evt);
            }
        });

        butoniplus.setBackground(new java.awt.Color(255, 153, 0));
        butoniplus.setFont(new java.awt.Font("Koenig-Type Mager", 1, 24)); // NOI18N
        butoniplus.setForeground(new java.awt.Color(255, 255, 255));
        butoniplus.setText("+");
        butoniplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoniplusActionPerformed(evt);
            }
        });

        butoniC.setBackground(new java.awt.Color(153, 153, 153));
        butoniC.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        butoniC.setForeground(new java.awt.Color(255, 255, 255));
        butoniC.setText("C");
        butoniC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoniCActionPerformed(evt);
            }
        });

        butonifshij.setBackground(new java.awt.Color(153, 153, 153));
        butonifshij.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        butonifshij.setForeground(new java.awt.Color(255, 255, 255));
        butonifshij.setText("<-");
        butonifshij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonifshijActionPerformed(evt);
            }
        });

        butoniperqind.setBackground(new java.awt.Color(153, 153, 153));
        butoniperqind.setFont(new java.awt.Font("Koenig-Type Mager", 1, 24)); // NOI18N
        butoniperqind.setForeground(new java.awt.Color(255, 255, 255));
        butoniperqind.setText("%");
        butoniperqind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoniperqindActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butoniC, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butoni7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butoni8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butonifshij, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(butoniperqind, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butoni9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(87, 87, 87))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(butoni0, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                        .addComponent(butonipik, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(butonibaraz, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(butoni1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(butoni2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(butoni4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(butoni5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(butoni6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(butoni3, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(butonipjestim, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(butonishumzim, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(butoniminus, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(butoniplus, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butoniC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butonifshij, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butoniperqind, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butoni9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butoni8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butoni7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butonipjestim, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butoni6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butoni5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butoni4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butonishumzim, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butoni1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butonibaraz, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butoniplus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butoni0, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butonipik, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(butoni2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butoniminus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butoni3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butoni6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoni6ActionPerformed
        jTextField1.setText(jTextField1.getText() + "6");
    }//GEN-LAST:event_butoni6ActionPerformed

    private void butoni0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoni0ActionPerformed
        jTextField1.setText(jTextField1.getText() + "0");
    }//GEN-LAST:event_butoni0ActionPerformed

    private void butoni3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoni3ActionPerformed
        jTextField1.setText(jTextField1.getText() + "3");
    }//GEN-LAST:event_butoni3ActionPerformed

    private void butoniplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoniplusActionPerformed
        numri = Double.parseDouble(jTextField1.getText());
        veprimi = 1;
        jTextField1.setText("");
        jLabel1.setText(numri + "+");
    }//GEN-LAST:event_butoniplusActionPerformed

    private void butoni9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoni9ActionPerformed
        jTextField1.setText(jTextField1.getText() + "9");
    }//GEN-LAST:event_butoni9ActionPerformed

    private void butoni5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoni5ActionPerformed
        jTextField1.setText(jTextField1.getText() + "5");
    }//GEN-LAST:event_butoni5ActionPerformed

    private void butonipikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonipikActionPerformed
        jTextField1.setText(jTextField1.getText() + ".");
    }//GEN-LAST:event_butonipikActionPerformed

    private void butoni2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoni2ActionPerformed
        jTextField1.setText(jTextField1.getText() + "2");
    }//GEN-LAST:event_butoni2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void butoniminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoniminusActionPerformed
        numri = Double.parseDouble(jTextField1.getText());
        veprimi = 2;
        jTextField1.setText("");
        jLabel1.setText(numri + "-");
    }//GEN-LAST:event_butoniminusActionPerformed

    private void butoni4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoni4ActionPerformed
        jTextField1.setText(jTextField1.getText() + "4");
    }//GEN-LAST:event_butoni4ActionPerformed

    private void butoniperqindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoniperqindActionPerformed
        numri = Double.parseDouble(jTextField1.getText());
        veprimi = 5;
        jTextField1.setText("");
        jLabel1.setText(numri + "%");
    }//GEN-LAST:event_butoniperqindActionPerformed

    private void butonishumzimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonishumzimActionPerformed
        numri = Double.parseDouble(jTextField1.getText());
        veprimi = 3;
        jTextField1.setText("");
        jLabel1.setText(numri + "*");
    }//GEN-LAST:event_butonishumzimActionPerformed

    private void butonipjestimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonipjestimActionPerformed
        numri = Double.parseDouble(jTextField1.getText());
        veprimi = 4;
        jTextField1.setText("");
        jLabel1.setText(numri + "/");
    }//GEN-LAST:event_butonipjestimActionPerformed

    private void butoniCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoniCActionPerformed
        jTextField1.setText("");
        jLabel1.setText("");
    }//GEN-LAST:event_butoniCActionPerformed

    private void butoni7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoni7ActionPerformed
        jTextField1.setText(jTextField1.getText() + "7");
    }//GEN-LAST:event_butoni7ActionPerformed

    private void butonibarazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonibarazActionPerformed
        veprimet();
        jLabel1.setText("");
    }//GEN-LAST:event_butonibarazActionPerformed

    private void butoni8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoni8ActionPerformed
        jTextField1.setText(jTextField1.getText() + "8");
    }//GEN-LAST:event_butoni8ActionPerformed

    private void butoni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoni1ActionPerformed
        jTextField1.setText(jTextField1.getText() + "1");
    }//GEN-LAST:event_butoni1ActionPerformed

    private void butonifshijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonifshijActionPerformed
        StringBuffer fshij = new StringBuffer(jTextField1.getText());
        fshij.reverse();
        fshij.deleteCharAt(0);
        fshij.reverse();
        String x = new String(fshij);
        jTextField1.setText(x);
    }//GEN-LAST:event_butonifshijActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulatori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulatori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulatori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulatori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulatori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butoni0;
    private javax.swing.JButton butoni1;
    private javax.swing.JButton butoni2;
    private javax.swing.JButton butoni3;
    private javax.swing.JButton butoni4;
    private javax.swing.JButton butoni5;
    private javax.swing.JButton butoni6;
    private javax.swing.JButton butoni7;
    private javax.swing.JButton butoni8;
    private javax.swing.JButton butoni9;
    private javax.swing.JButton butoniC;
    private javax.swing.JButton butonibaraz;
    private javax.swing.JButton butonifshij;
    private javax.swing.JButton butoniminus;
    private javax.swing.JButton butoniperqind;
    private javax.swing.JButton butonipik;
    private javax.swing.JButton butonipjestim;
    private javax.swing.JButton butoniplus;
    private javax.swing.JButton butonishumzim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
