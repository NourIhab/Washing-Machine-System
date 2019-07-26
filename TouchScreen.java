
package view;

import esper.Configure;
import events.DoorLocking;
import events.DoorUnlocking;
import events.PowerEvent;
import events.PressStart;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TouchScreen extends javax.swing.JFrame {

    
    public TouchScreen() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        currentTempTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        waterLevelTxt = new javax.swing.JTextField();
        onBtn = new javax.swing.JButton();
        temp30c = new javax.swing.JRadioButton();
        temp40c = new javax.swing.JRadioButton();
        temp50c = new javax.swing.JRadioButton();
        proQCK = new javax.swing.JRadioButton();
        proSTND = new javax.swing.JRadioButton();
        proHVY = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        offBtn = new javax.swing.JButton();
        machineStatus = new javax.swing.JTextField();
        safetyButton = new javax.swing.JButton();
        startBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ledStatusTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Temperature");

        currentTempTxt.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        currentTempTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        currentTempTxt.setText("0");
        currentTempTxt.setEnabled(false);
        currentTempTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentTempTxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Water Level");

        waterLevelTxt.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        waterLevelTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        waterLevelTxt.setText("0");
        waterLevelTxt.setEnabled(false);
        waterLevelTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterLevelTxtActionPerformed(evt);
            }
        });

        onBtn.setText("ON");
        onBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(temp30c);
        temp30c.setText("30 Celsius ");

        buttonGroup1.add(temp40c);
        temp40c.setText("40 Celsius");
        temp40c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temp40cActionPerformed(evt);
            }
        });

        buttonGroup1.add(temp50c);
        temp50c.setText("50 Celsius");

        buttonGroup2.add(proQCK);
        proQCK.setText("Quick Wash");

        buttonGroup2.add(proSTND);
        proSTND.setText("Standard Wash");

        buttonGroup2.add(proHVY);
        proHVY.setText("Heavy Duty Wash");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Tempreture");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Program ");

        offBtn.setText("OFF");
        offBtn.setEnabled(false);
        offBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offBtnActionPerformed(evt);
            }
        });

        safetyButton.setText("SAFETY LOCK");
        safetyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                safetyButtonActionPerformed(evt);
            }
        });

        startBtn.setText("START");
        startBtn.setEnabled(false);
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("LED Status");

        ledStatusTxt.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ledStatusTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ledStatusTxt.setText("OFF");
        ledStatusTxt.setEnabled(false);
        ledStatusTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ledStatusTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(offBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(onBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(safetyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ledStatusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(currentTempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(waterLevelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(machineStatus))
                            .addGap(8, 8, 8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(temp30c)
                                        .addComponent(temp40c)
                                        .addComponent(temp50c)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(proHVY)
                                            .addComponent(proSTND)
                                            .addComponent(proQCK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(startBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(currentTempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(waterLevelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ledStatusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(temp30c)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(temp40c)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(temp50c))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(proQCK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(proSTND)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(proHVY)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(machineStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(onBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(offBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(safetyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBtnActionPerformed
        Configure.sendEvent(new PowerEvent(true));
    }//GEN-LAST:event_onBtnActionPerformed

    private void temp40cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temp40cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temp40cActionPerformed

    private void offBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offBtnActionPerformed
        Configure.sendEvent(new PowerEvent(false));
        Configure.sendEvent(new DoorUnlocking(true));
    }//GEN-LAST:event_offBtnActionPerformed

    private void safetyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_safetyButtonActionPerformed
        Configure.sendEvent(new DoorLocking(true));
    }//GEN-LAST:event_safetyButtonActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        int userChoice=getUserChoice();
        Configure.sendEvent(new PressStart(userChoice));    
    }//GEN-LAST:event_startBtnActionPerformed

    private void currentTempTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentTempTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentTempTxtActionPerformed

    private void ledStatusTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ledStatusTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ledStatusTxtActionPerformed

    private void waterLevelTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterLevelTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waterLevelTxtActionPerformed
    
    public int getUserChoice()
    {
        if(getProSTND().isSelected()&&getTemp30c().isSelected())
        {
            return 11;
        }
        else if(getProSTND().isSelected()&&getTemp40c().isSelected())
        {
            return 12; 
        }
        else if(getProSTND().isSelected()&&getTemp50c().isSelected())
        {
            return 13; 
        }
        else if(getProQCK().isSelected()&&getTemp30c().isSelected())
        {
            return 1; 
        }
        else if(getProQCK().isSelected()&&getTemp40c().isSelected())
        {
            return 2;
        }
        else if(getProQCK().isSelected()&&getTemp50c().isSelected())
        {
            return 3; 
        }
        else if(getProHVY().isSelected()&&getTemp30c().isSelected())
        {
            return 111;
        }
        else if(getProHVY().isSelected()&&getTemp40c().isSelected())
        {
            return 112;
        }
        else if(getProHVY().isSelected()&&getTemp50c().isSelected())
        {
            return 113;
        }
        else
            return 0;
    }

    public JTextField getLedStatusTxt() {
        return ledStatusTxt;
    }
    
    public JTextField getCurrentTempTxt() {
        return currentTempTxt;
    }

    public JTextField getMachineStatus() {
        return machineStatus;
    }

    public JTextField getWaterLevelTxt() {
        return waterLevelTxt;
    }

    public JButton getOffBtn() {
        return offBtn;
    }

    public JButton getOnBtn() {
        return onBtn;
    }

    public JButton getSafetyButton() {
        return safetyButton;
    }

    public JButton getStartBtn() {
        return startBtn;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public JRadioButton getProHVY() {
        return proHVY;
    }

    public JRadioButton getProQCK() {
        return proQCK;
    }

    public JRadioButton getProSTND() {
        return proSTND;
    }

    public JRadioButton getTemp30c() {
        return temp30c;
    }

    public JRadioButton getTemp40c() {
        return temp40c;
    }

    public JRadioButton getTemp50c() {
        return temp50c;
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField currentTempTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField ledStatusTxt;
    private javax.swing.JTextField machineStatus;
    private javax.swing.JButton offBtn;
    private javax.swing.JButton onBtn;
    private javax.swing.JRadioButton proHVY;
    private javax.swing.JRadioButton proQCK;
    private javax.swing.JRadioButton proSTND;
    private javax.swing.JButton safetyButton;
    private javax.swing.JButton startBtn;
    private javax.swing.JRadioButton temp30c;
    private javax.swing.JRadioButton temp40c;
    private javax.swing.JRadioButton temp50c;
    private javax.swing.JTextField waterLevelTxt;
    // End of variables declaration//GEN-END:variables
}
