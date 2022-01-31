/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx_calc;

import java.text.DecimalFormat;

/**
 *
 * @author Emmynem
 */
public class PointFourDecimals_Pips_Calc extends javax.swing.JFrame {

    /**
     * Creates new form EURUSDCalc
     */
    public PointFourDecimals_Pips_Calc() {
        initComponents();
    }

    public void Calculate() {
        RawPipsCalc RPC = new RawPipsCalc();
        DecimalFormat df = new DecimalFormat("#.####");

        String PipsText = EnterPipsTextField.getText();
        String PriceText = EnterPriceTextField.getText();

        try {
            int Pips = Integer.parseInt(PipsText);
            double Price = Double.parseDouble(PriceText);
            int len = PriceText.length();
            RPC.setPips(Pips);
            RPC.setPrice(Price);
            if (len > 6) {
                ErrorLabel.setText("Price must be point(.) 4 decimals E.g (0.0000)");
                ResultLabel.setText(null);
            } else {

                double Result = RPC.PointFourDecimals_pipValue();
                String strResult = df.format(Result);
                ErrorLabel.setText(null);
                ResultLabel.setText("New Value = " + strResult);
            }

        } catch (NumberFormatException e) {
            ErrorLabel.setText("Wrong Input, Must be decimal numbers.");
            ResultLabel.setText(null);
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

        MainPanel = new javax.swing.JPanel();
        PointFourDecimalsLabel = new javax.swing.JLabel();
        EnterPipsLabel = new javax.swing.JLabel();
        EnterPriceLabel = new javax.swing.JLabel();
        EnterPipsTextField = new javax.swing.JTextField();
        EnterPriceTextField = new javax.swing.JTextField();
        CalculateButton = new javax.swing.JButton();
        ResultLabel = new javax.swing.JLabel();
        ErrorLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Point Four Decimals Pips Pairs");
        setMaximumSize(new java.awt.Dimension(700, 540));
        setMinimumSize(new java.awt.Dimension(700, 540));
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(204, 204, 204));
        MainPanel.setMaximumSize(new java.awt.Dimension(700, 540));
        MainPanel.setMinimumSize(new java.awt.Dimension(700, 540));

        PointFourDecimalsLabel.setFont(new java.awt.Font("BEYNO", 0, 24)); // NOI18N
        PointFourDecimalsLabel.setForeground(new java.awt.Color(204, 0, 0));
        PointFourDecimalsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PointFourDecimalsLabel.setText("Point Four Decimals Pairs");
        PointFourDecimalsLabel.setToolTipText("Pips Calculator");
        PointFourDecimalsLabel.setPreferredSize(new java.awt.Dimension(100, 19));

        EnterPipsLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        EnterPipsLabel.setForeground(new java.awt.Color(255, 255, 255));
        EnterPipsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnterPipsLabel.setText("Enter Amount of Pips");

        EnterPriceLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        EnterPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        EnterPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnterPriceLabel.setText("Enter Price");

        EnterPipsTextField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        CalculateButton.setBackground(new java.awt.Color(0, 153, 153));
        CalculateButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        CalculateButton.setForeground(new java.awt.Color(204, 255, 204));
        CalculateButton.setText("Calculate");
        CalculateButton.setToolTipText("Calculate");
        CalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateButtonActionPerformed(evt);
            }
        });

        ResultLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        ResultLabel.setForeground(new java.awt.Color(204, 255, 204));
        ResultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ErrorLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        ErrorLabel.setForeground(new java.awt.Color(204, 0, 51));
        ErrorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        BackButton.setBackground(new java.awt.Color(255, 51, 0));
        BackButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        BackButton.setForeground(new java.awt.Color(204, 255, 204));
        BackButton.setText("<<< Back");
        BackButton.setToolTipText("Go back to last page .");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ResetButton.setBackground(new java.awt.Color(255, 0, 0));
        ResetButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        ResetButton.setForeground(new java.awt.Color(204, 255, 204));
        ResetButton.setText("Reset");
        ResetButton.setToolTipText("Reset Values");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addComponent(PointFourDecimalsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EnterPipsTextField)
                                    .addComponent(EnterPipsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EnterPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EnterPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))
                        .addGap(57, 57, 57))))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(CalculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(PointFourDecimalsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(EnterPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EnterPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(EnterPipsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EnterPipsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CalculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(ResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(ErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PipsCalc().setVisible(true);
            }
        });
    }//GEN-LAST:event_BackButtonActionPerformed

    private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateButtonActionPerformed
        // TODO add your handling code here:
        Calculate();
    }//GEN-LAST:event_CalculateButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // TODO add your handling code here:
        EnterPipsTextField.setText(null);
        EnterPriceTextField.setText(null);
        ErrorLabel.setText(null);
        ResultLabel.setText(null);
    }//GEN-LAST:event_ResetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PointFourDecimals_Pips_Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PointFourDecimals_Pips_Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PointFourDecimals_Pips_Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PointFourDecimals_Pips_Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PointFourDecimals_Pips_Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CalculateButton;
    private javax.swing.JLabel EnterPipsLabel;
    private javax.swing.JTextField EnterPipsTextField;
    private javax.swing.JLabel EnterPriceLabel;
    private javax.swing.JTextField EnterPriceTextField;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel PointFourDecimalsLabel;
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel ResultLabel;
    // End of variables declaration//GEN-END:variables
}
