/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_view;

import elgc_tools.Util;
import elgc_bean.ElgcGruposalgado;
import elgc_dao.Elgc_Gruposalgado_DAO;
import java.util.List;
/**
 *
 * @author u09894615139
 */
public class JDlg_elgcGruposalgado extends javax.swing.JDialog {

    Elgc_Gruposalgado_DAO elgc_Gruposalgado_DAO;
    ElgcGruposalgado elgcGruposalgado;
    Elgc_GruposalgadoController elgcGruposalgadoController;
    JDlg_elgcGruposalgadoIA jDlg_elgcGruposalgadoIA;

    public JDlg_elgcGruposalgado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("GRUPO");
        setLocationRelativeTo(null);
        
        jDlg_elgcGruposalgadoIA = new JDlg_elgcGruposalgadoIA(null, true); //Para o uso dos metodos, declaração para utilizar embaixo
        elgcGruposalgadoController = new Elgc_GruposalgadoController();
        elgc_Gruposalgado_DAO = new Elgc_Gruposalgado_DAO();
        
        List lista = elgc_Gruposalgado_DAO.listAll();
        elgcGruposalgadoController.setList(lista);
        jTable1.setModel(elgcGruposalgadoController);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jBtnElgcIncluir = new javax.swing.JButton();
        jBtnElgcExcluir = new javax.swing.JButton();
        jBtnElgcAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(102, 163, 194));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));

        jBtnElgcIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elgc_imagens/incluir.png"))); // NOI18N
        jBtnElgcIncluir.setText("Incluir");
        jBtnElgcIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElgcIncluirActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnElgcIncluir);

        jBtnElgcExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elgc_imagens/Excluir.png"))); // NOI18N
        jBtnElgcExcluir.setText("Exlcuir");
        jBtnElgcExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElgcExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnElgcExcluir);

        jBtnElgcAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elgc_imagens/alterar.png"))); // NOI18N
        jBtnElgcAlterar.setText("Alterar");
        jBtnElgcAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElgcAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnElgcAlterar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnElgcIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcIncluirActionPerformed
        jDlg_elgcGruposalgadoIA.setTitle("Inclusão");
        jDlg_elgcGruposalgadoIA.setVisible(true);
        
        List lista = elgc_Gruposalgado_DAO.listAll();
        elgcGruposalgadoController.setList(lista);
        jTable1.setModel(elgcGruposalgadoController);
    }//GEN-LAST:event_jBtnElgcIncluirActionPerformed

    private void jBtnElgcExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcExcluirActionPerformed
       if (Util.perguntar("Deseja excluir o Grupo?") == true) {
            int sel = jTable1.getSelectedRow();
            elgcGruposalgado = elgcGruposalgadoController.getBean(sel);
            elgc_Gruposalgado_DAO.delete(elgcGruposalgado);
            //atualizar a lista no jtable
            List lista = elgc_Gruposalgado_DAO.listAll();
            elgcGruposalgadoController.setList(lista);
        } else {
            Util.mensagem("Exclusão cancelada.");
        }
    }//GEN-LAST:event_jBtnElgcExcluirActionPerformed

    private void jBtnElgcAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcAlterarActionPerformed
        jDlg_elgcGruposalgadoIA.setTitle("Alteração");
        
        int sel = jTable1.getSelectedRow();
        elgcGruposalgado = elgcGruposalgadoController.getBean(sel);
        jDlg_elgcGruposalgadoIA.beanView(elgcGruposalgado);
        
        jDlg_elgcGruposalgadoIA.setVisible(true);
        List lista = elgc_Gruposalgado_DAO.listAll();
        elgcGruposalgadoController.setList(lista);
    }//GEN-LAST:event_jBtnElgcAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlg_elgcGruposalgado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcGruposalgado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcGruposalgado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcGruposalgado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlg_elgcGruposalgado dialog = new JDlg_elgcGruposalgado(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnElgcAlterar;
    private javax.swing.JButton jBtnElgcExcluir;
    private javax.swing.JButton jBtnElgcIncluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
