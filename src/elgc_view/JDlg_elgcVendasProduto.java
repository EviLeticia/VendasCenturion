/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_view;

import elgc_bean.ElgcVendas;
import elgc_bean.ElgcVendasProduto;
import elgc_bean.ElgcProduto;
import elgc_dao.Elgc_VendasProduto_DAO;
import elgc_dao.Elgc_Vendas_DAO;
import elgc_dao.Elgc_Produto_DAO;
import java.util.List;
import elgc_tools.Util;

/**
 *
 * @author Lenovo
 */
public class JDlg_elgcVendasProduto extends javax.swing.JDialog {

    public ElgcVendas elgcVendas;
    public ElgcProduto elgcProduto;
    public ElgcVendasProduto elgcVendasProduto;
    public Elgc_Vendas_DAO elgc_Vendas_DAO;
    public Elgc_Produto_DAO elgc_Produto_DAO;
    public Elgc_VendasProduto_DAO elgc_VendasProduto_DAO;
    public JDlg_elgcVendas jDlg_elgcVendas;
    public Elgc_VendasProdutoControle elgc_VendasProdutoControle;

    /**
     * Creates new form JDlg_elgcVendasProduto
     */
    public JDlg_elgcVendasProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("PRODUTOS DO PEDIDO");

        Util.habilitar(false, jTxtElgcTotal);

        elgc_Produto_DAO = new Elgc_Produto_DAO();
        List lista = elgc_Produto_DAO.listAll();
        for (int i = 0; i < lista.size(); i++) {
            elgcProduto = (ElgcProduto) lista.get(i);
            jCboElgcProdutos.addItem(elgcProduto);
        }
    }
        

    public void setTelaAnterior(JDlg_elgcVendas jDlg_elgcVendas) {
        this.jDlg_elgcVendas = jDlg_elgcVendas;

    }

    public void beanView(ElgcVendasProduto elgcVendasProduto) {
        jTxtElgcQuantidade.setText((elgcVendasProduto.getElgcQuantidade()));
        jCboElgcProdutos.setSelectedItem(elgcVendasProduto.getElgcProduto());
        jTxtElgcValorUnitario.setText(Util.doubleStr(elgcVendasProduto.getElgcValoruni()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtElgcValorUnitario = new javax.swing.JTextField();
        jTxtElgcTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtElgcQuantidade = new javax.swing.JTextField();
        jBtnCancelar = new javax.swing.JButton();
        jBtnOk = new javax.swing.JButton();
        jCboElgcProdutos = new javax.swing.JComboBox<ElgcProduto>();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("Produto");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Produto");

        jLabel3.setText("Quantidade");

        jLabel4.setText("Valor Unitario");

        jTxtElgcValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtElgcValorUnitarioActionPerformed(evt);
            }
        });
        jTxtElgcValorUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtElgcValorUnitarioKeyReleased(evt);
            }
        });

        jLabel5.setText("Total");

        jTxtElgcQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtElgcQuantidadeActionPerformed(evt);
            }
        });
        jTxtElgcQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtElgcQuantidadeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtElgcQuantidadeKeyReleased(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elgc_imagens/cancelar_1.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elgc_imagens/ok.png"))); // NOI18N
        jBtnOk.setText("OK");
        jBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkActionPerformed(evt);
            }
        });

        jCboElgcProdutos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCboElgcProdutosItemStateChanged(evt);
            }
        });
        jCboElgcProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboElgcProdutosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 102, 255));
        jLabel6.setText("Vendas Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBtnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnCancelar)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTxtElgcQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jTxtElgcValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(272, 272, 272))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jTxtElgcTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jCboElgcProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel6)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCboElgcProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtElgcQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtElgcValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtElgcTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnOk))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtElgcValorUnitarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtElgcValorUnitarioKeyReleased
        if (jTxtElgcValorUnitario.getText().isEmpty() == false) {
            double unitario = Util.strDouble(jTxtElgcValorUnitario.getText());
            double quantidade = Util.strDouble(jTxtElgcQuantidade.getText());
            jTxtElgcTotal.setText(Util.doubleStr(quantidade * unitario));
        } else {
            jTxtElgcTotal.setText("00");

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtElgcValorUnitarioKeyReleased

    private void jTxtElgcQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtElgcQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtElgcQuantidadeActionPerformed

    private void jTxtElgcQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtElgcQuantidadeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtElgcQuantidadeKeyPressed

    private void jTxtElgcQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtElgcQuantidadeKeyReleased
        if (jTxtElgcQuantidade.getText().isEmpty() == false) {
            double unitario = Util.strDouble(jTxtElgcValorUnitario.getText());
            double quantidade = Util.strDouble(jTxtElgcQuantidade.getText());
            jTxtElgcTotal.setText(Util.doubleStr(quantidade * unitario));
        } else {
            jTxtElgcTotal.setText("00");

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtElgcQuantidadeKeyReleased

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:

        Util.mensagem("Cancelamento realizado");
        setVisible(false);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkActionPerformed
        elgcVendasProduto = new ElgcVendasProduto();
        elgcVendasProduto.setElgcProduto((ElgcProduto) jCboElgcProdutos.getSelectedItem());
        elgcVendasProduto.setElgcQuantidade((jTxtElgcQuantidade.getText()));
        elgcVendasProduto.setElgcValoruni(Util.strDouble(jTxtElgcValorUnitario.getText()));
        if (getTitle().toUpperCase().substring(0, 1).equals("I")) {
            jDlg_elgcVendas.elgc_VendasProdutoControle.addBean(elgcVendasProduto);
        } else {
            jDlg_elgcVendas.elgc_VendasProdutoControle.updateBean(jDlg_elgcVendas.getSelectedRowProd(), elgcVendasProduto);
        }
        setVisible(false);
    }//GEN-LAST:event_jBtnOkActionPerformed

    private void jCboElgcProdutosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCboElgcProdutosItemStateChanged
        jTxtElgcQuantidade.setText("1");
        elgcProduto = (ElgcProduto) jCboElgcProdutos.getSelectedItem();
        jTxtElgcValorUnitario.setText(Util.doubleStr(elgcProduto.getElgcValoruni()));
        jTxtElgcTotal.setText(jTxtElgcValorUnitario.getText());
    }//GEN-LAST:event_jCboElgcProdutosItemStateChanged

    private void jCboElgcProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboElgcProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboElgcProdutosActionPerformed

    private void jTxtElgcValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtElgcValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtElgcValorUnitarioActionPerformed

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
            java.util.logging.Logger.getLogger(JDlg_elgcVendasProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcVendasProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcVendasProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcVendasProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlg_elgcVendasProduto dialog = new JDlg_elgcVendasProduto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnOk;
    private javax.swing.JComboBox<ElgcProduto> jCboElgcProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTxtElgcQuantidade;
    private javax.swing.JTextField jTxtElgcTotal;
    private javax.swing.JTextField jTxtElgcValorUnitario;
    // End of variables declaration//GEN-END:variables
}
