
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    private Object listModel;


    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textX = new javax.swing.JTextField();
        textY = new javax.swing.JTextField();
        varSoma = new javax.swing.JButton();
        varSub = new javax.swing.JButton();
        varMult = new javax.swing.JButton();
        varDiv = new javax.swing.JButton();
        lblRes = new javax.swing.JLabel();
        lblRest = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        varGuardarResul = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        varList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textX.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textX.setBorder(null);

        textY.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textY.setBorder(null);

        varSoma.setText("+");
        varSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varSomaActionPerformed(evt);
            }
        });

        varSub.setText("-");
        varSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varSubActionPerformed(evt);
            }
        });

        varMult.setText("x");
        varMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varMultActionPerformed(evt);
            }
        });

        varDiv.setText("÷");
        varDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varDivActionPerformed(evt);
            }
        });

        lblRes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblRest.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setText("Resto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        varGuardarResul.setText("Guardar Resultado");
        varGuardarResul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varGuardarResulActionPerformed(evt);
            }
        });

        varList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(varList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textX, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textY, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(varMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(varSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(varDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(varSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(varGuardarResul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textX, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varSoma)
                    .addComponent(varSub)
                    .addComponent(textY, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varGuardarResul))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(varMult)
                            .addComponent(varDiv))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblRes, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(lblRest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void varSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varSomaActionPerformed
        float x = Float.parseFloat(textX.getText()), y = Float.parseFloat(textY.getText());
        float soma = x + y;
        lblRes.setText(Float.toString(soma));
    }//GEN-LAST:event_varSomaActionPerformed

    private void varSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varSubActionPerformed
        float x = Float.parseFloat(textX.getText()), y = Float.parseFloat(textY.getText());
        float sub = x - y;
        lblRes.setText(Float.toString(sub));
    }//GEN-LAST:event_varSubActionPerformed

    private void varMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varMultActionPerformed
        float x = Float.parseFloat(textX.getText()), y = Float.parseFloat(textY.getText());
        float mult = x * y;
        lblRes.setText(Float.toString(mult));
    }//GEN-LAST:event_varMultActionPerformed

    private void varDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varDivActionPerformed
        float x = Float.parseFloat(textX.getText()), y = Float.parseFloat(textY.getText());
        float div = x / y;
        lblRes.setText(Float.toString(div));    
    }//GEN-LAST:event_varDivActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        float x = Float.parseFloat(textX.getText()), y = Float.parseFloat(textY.getText());
        float rest = x % y;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void varGuardarResulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varGuardarResulActionPerformed
        
    }//GEN-LAST:event_varGuardarResulActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRes;
    private javax.swing.JLabel lblRest;
    private javax.swing.JTextField textX;
    private javax.swing.JTextField textY;
    private javax.swing.JButton varDiv;
    private javax.swing.JButton varGuardarResul;
    private javax.swing.JList<String> varList;
    private javax.swing.JButton varMult;
    private javax.swing.JButton varSoma;
    private javax.swing.JButton varSub;
    // End of variables declaration//GEN-END:variables
}
