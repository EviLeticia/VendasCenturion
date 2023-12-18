/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_view;

import elgc_bean.ElgcProduto;
import elgc_dao.Elgc_Produto_DAO;
import elgc_tools.Util;
/**
 *
 * @author u09894615139
 */
public class JDlg_elgcProdutoIA extends javax.swing.JDialog {

    ElgcProduto elgcProduto;
    Elgc_Produto_DAO elgc_Produto_DAO;
    /**
     * Creates new form JDlg_elgcProduto
     */
    public JDlg_elgcProdutoIA(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("PRODUTOS");
    }

     public ElgcProduto viewBean() {
       elgcProduto = new ElgcProduto();
       
       elgcProduto.setIdelgcProduto(Util.strInt(jTxtElgcCodigo.getText()));
       elgcProduto.setElgcNomeproduto(jTxtElgcNomeproduto.getText());
       elgcProduto.setElgcValoruni(Util.strDouble(jTxtValorUnitario.getText()));
       elgcProduto.setElgcEntrega(jTxtElgcEntrega.getText());
       elgcProduto.setElgcRetiradalocal(jTxtElgcRetirada.getText());
       elgcProduto.setElgcAcompanhamento(jTxElgctAcompanhamento.getText());
        return elgcProduto;
    }
    public void beanView(ElgcProduto elgcProduto){
        jTxtElgcCodigo.setText(Util.intStr(elgcProduto.getIdelgcProduto()));
        jTxtElgcNomeproduto.setText(elgcProduto.getElgcNomeproduto());
        jTxtElgcEntrega.setText(elgcProduto.getElgcEntrega());
        jTxtElgcRetirada.setText(elgcProduto.getElgcRetiradalocal());
        jTxElgctAcompanhamento.setText(elgcProduto.getElgcAcompanhamento());
        jTxtValorUnitario.setText(Util.doubleStr(elgcProduto.getElgcValoruni()));
        

      
              }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBtnElgcOk = new javax.swing.JButton();
        jBtnElgcCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtElgcCodigo = new javax.swing.JTextField();
        jTxtElgcEntrega = new javax.swing.JTextField();
        jTxtElgcNomeproduto = new javax.swing.JTextField();
        jTxtElgcRetirada = new javax.swing.JTextField();
        jTxtValorUnitario = new javax.swing.JTextField();
        jTxElgctAcompanhamento = new javax.swing.JTextField();

        jLabel7.setText("Código");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 163, 194));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jBtnElgcOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elgc_imagens/ok.png"))); // NOI18N
        jBtnElgcOk.setText("Ok");
        jBtnElgcOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElgcOkActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnElgcOk);

        jBtnElgcCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elgc_imagens/cancelar.png"))); // NOI18N
        jBtnElgcCancelar.setText("Cancelar");
        jBtnElgcCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElgcCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnElgcCancelar);

        jLabel1.setText("Código");

        jLabel2.setText("Entrega");

        jLabel3.setText("Valor Unitário");

        jLabel4.setText("Nome do Produto");

        jLabel5.setText("Retirada");

        jLabel6.setText("Acompanhamentos");

        jTxtElgcCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtElgcCodigoActionPerformed(evt);
            }
        });

        jTxtElgcEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtElgcEntregaActionPerformed(evt);
            }
        });

        jTxtElgcNomeproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtElgcNomeprodutoActionPerformed(evt);
            }
        });

        jTxtElgcRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtElgcRetiradaActionPerformed(evt);
            }
        });

        jTxtValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtValorUnitarioActionPerformed(evt);
            }
        });

        jTxElgctAcompanhamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxElgctAcompanhamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(226, 226, 226))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(176, 176, 176))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtElgcCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtElgcEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtElgcNomeproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jTxtElgcRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxElgctAcompanhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtElgcCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtElgcEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtElgcNomeproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtElgcRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxElgctAcompanhamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnElgcOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcOkActionPerformed
        elgcProduto = viewBean();
        elgc_Produto_DAO = new Elgc_Produto_DAO();
        if (getTitle().toUpperCase().substring(0, 1).equals("I")) {
          elgc_Produto_DAO.insert(elgcProduto);
        } else {            
          elgc_Produto_DAO.update(elgcProduto);
        }
        setVisible(false);
    }//GEN-LAST:event_jBtnElgcOkActionPerformed

    private void jBtnElgcCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jBtnElgcCancelarActionPerformed

    private void jTxtElgcCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtElgcCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtElgcCodigoActionPerformed

    private void jTxtElgcEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtElgcEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtElgcEntregaActionPerformed

    private void jTxtElgcNomeprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtElgcNomeprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtElgcNomeprodutoActionPerformed

    private void jTxtElgcRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtElgcRetiradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtElgcRetiradaActionPerformed

    private void jTxtValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtValorUnitarioActionPerformed

    private void jTxElgctAcompanhamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxElgctAcompanhamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxElgctAcompanhamentoActionPerformed

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
            java.util.logging.Logger.getLogger(JDlg_elgcProdutoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcProdutoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcProdutoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcProdutoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlg_elgcProdutoIA dialog = new JDlg_elgcProdutoIA(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnElgcCancelar;
    private javax.swing.JButton jBtnElgcOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTxElgctAcompanhamento;
    private javax.swing.JTextField jTxtElgcCodigo;
    private javax.swing.JTextField jTxtElgcEntrega;
    private javax.swing.JTextField jTxtElgcNomeproduto;
    private javax.swing.JTextField jTxtElgcRetirada;
    private javax.swing.JTextField jTxtValorUnitario;
    // End of variables declaration//GEN-END:variables
}
