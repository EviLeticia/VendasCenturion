/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_view;

import elgc_tools.Util;
import elgc_bean.ElgcUsuarios;
import elgc_dao.Elgc_Usuarios_DAO;

/**
 *
 * @author Lenovo
 */
public class JDlg_elgcUsuarios extends javax.swing.JDialog {
    
    private boolean incluindo;
    public ElgcUsuarios elgcUsuarios;
    public Elgc_Usuarios_DAO elgc_Usuarios_DAO;

    /**
     * Creates new form JDlg_elgcUsuarios
     */
    public JDlg_elgcUsuarios(java.awt.Frame parent, boolean modal) {
        initComponents();
        setTitle("USUÁRIOS");
        setLocationRelativeTo(null);
        
        elgc_Usuarios_DAO = new Elgc_Usuarios_DAO();
        
       Util.habilitar(false,jBtnElgcAlterar,jBtnElgcExcluir, jTxtElgcCodigo, jTxtElgcNome,jCboElgcNivel, jPwdElgcSenha, jChbElgcAtivo, jBtnElgcConfirmar,jBtnElgcCancelar);
       Util.habilitar(true,jBtnElgcIncluir,jBtnElgcPesquisar);
       
    }

    public ElgcUsuarios viewBean(){
        
        elgcUsuarios = new ElgcUsuarios();
        
        elgcUsuarios.setIdelgcUsuarios(Util.strInt(jTxtElgcCodigo.getText()));
        elgcUsuarios.setElgcNome(jTxtElgcNome.getText());
        elgcUsuarios.setElgcSenha(jPwdElgcSenha.getText());
        elgcUsuarios.setElgcNivel(jCboElgcNivel.getSelectedIndex());
        elgcUsuarios.setElgcAtivo(jChbElgcAtivo.isSelected() == true ? "S" : "N");
        
    return elgcUsuarios;
    }
    
    public void beanView(ElgcUsuarios elgcUsuarios){
        jTxtElgcCodigo.setText(Util.intStr(elgcUsuarios.getIdelgcUsuarios()));
        jTxtElgcNome.setText(elgcUsuarios.getElgcNome());
        jPwdElgcSenha.setText(elgcUsuarios.getElgcSenha());
        jCboElgcNivel.setSelectedIndex(elgcUsuarios.getElgcNivel());
        if (elgcUsuarios.getElgcAtivo().equals("S") == true) {
            jChbElgcAtivo.setSelected(true);
        } else {
            jChbElgcAtivo.setSelected(false);
        }
      
              }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnElgcAlterar = new javax.swing.JButton();
        jBtnElgcExcluir = new javax.swing.JButton();
        jBtnElgcConfirmar = new javax.swing.JButton();
        jBtnElgcCancelar = new javax.swing.JButton();
        jBtnElgcPesquisar = new javax.swing.JButton();
        jBtnElgcIncluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTxtElgcNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtElgcCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPwdElgcSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jCboElgcNivel = new javax.swing.JComboBox<>();
        jChbElgcAtivo = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBtnElgcAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elgc_imagens/alterar.png"))); // NOI18N
        jBtnElgcAlterar.setText("Alterar");
        jBtnElgcAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElgcAlterarActionPerformed(evt);
            }
        });

        jBtnElgcExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elgc_imagens/Excluir.png"))); // NOI18N
        jBtnElgcExcluir.setText("Excluir");
        jBtnElgcExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElgcExcluirActionPerformed(evt);
            }
        });

        jBtnElgcConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elgc_imagens/confirmar.png"))); // NOI18N
        jBtnElgcConfirmar.setText("Confirmar");
        jBtnElgcConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElgcConfirmarActionPerformed(evt);
            }
        });

        jBtnElgcCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elgc_imagens/cancelar.png"))); // NOI18N
        jBtnElgcCancelar.setText("Cancelar");
        jBtnElgcCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElgcCancelarActionPerformed(evt);
            }
        });

        jBtnElgcPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elgc_imagens/pesquisar.png"))); // NOI18N
        jBtnElgcPesquisar.setText("Pesquisar");
        jBtnElgcPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElgcPesquisarActionPerformed(evt);
            }
        });

        jBtnElgcIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elgc_imagens/incluir.png"))); // NOI18N
        jBtnElgcIncluir.setText("Incluir");
        jBtnElgcIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElgcIncluirActionPerformed(evt);
            }
        });

        jLabel1.setText("Código");

        jTxtElgcNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtElgcNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome de Usuario");

        jTxtElgcCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtElgcCodigoActionPerformed(evt);
            }
        });

        jLabel3.setText("Senha");

        jLabel4.setText("Nível");

        jCboElgcNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administração", "Contabilidade", "Marketing", "Recursos Humanos" }));

        jChbElgcAtivo.setText("Ativo");

        jLabel17.setBackground(new java.awt.Color(102, 102, 255));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 255));
        jLabel17.setText("USUÁRIOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jTxtElgcNome)
                            .addComponent(jLabel2)
                            .addComponent(jTxtElgcCodigo)
                            .addComponent(jLabel3)
                            .addComponent(jPwdElgcSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnElgcIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnElgcAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnElgcExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnElgcConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnElgcCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnElgcPesquisar)
                        .addGap(10, 10, 10))))
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChbElgcAtivo)
                    .addComponent(jCboElgcNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtElgcCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboElgcNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtElgcNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChbElgcAtivo))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPwdElgcSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnElgcIncluir)
                    .addComponent(jBtnElgcAlterar)
                    .addComponent(jBtnElgcExcluir)
                    .addComponent(jBtnElgcConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnElgcCancelar)
                    .addComponent(jBtnElgcPesquisar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnElgcAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcAlterarActionPerformed
     Util.habilitar(true, jTxtElgcCodigo, jTxtElgcNome,jCboElgcNivel, jPwdElgcSenha, jChbElgcAtivo, jBtnElgcConfirmar,jBtnElgcCancelar);
     Util.habilitar(false, jBtnElgcIncluir, jBtnElgcExcluir, jBtnElgcAlterar, jBtnElgcPesquisar);
    incluindo = false;
    }//GEN-LAST:event_jBtnElgcAlterarActionPerformed

    private void jBtnElgcExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcExcluirActionPerformed
        if (Util.perguntar("Deseja excluir o registro?") == true) {
            elgcUsuarios = viewBean();
            elgc_Usuarios_DAO.delete(elgcUsuarios);
        } else {

            Util.mensagem("Exclusão cancelada.");
        }
        Util.limparCampos(jTxtElgcCodigo, jTxtElgcNome,jTxtElgcCodigo, jTxtElgcNome, jCboElgcNivel, jPwdElgcSenha, jChbElgcAtivo);
        Util.habilitar(false, jTxtElgcCodigo, jTxtElgcNome,jTxtElgcCodigo,jCboElgcNivel, jPwdElgcSenha, jChbElgcAtivo,jBtnElgcConfirmar,jBtnElgcCancelar);
        Util.habilitar(true,jBtnElgcIncluir,jBtnElgcAlterar,jBtnElgcExcluir,jBtnElgcPesquisar);
       
    }//GEN-LAST:event_jBtnElgcExcluirActionPerformed

    private void jBtnElgcConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcConfirmarActionPerformed
       elgcUsuarios = viewBean();        
        if (incluindo == true) {
            elgc_Usuarios_DAO.insert(elgcUsuarios);
        } else {
            elgc_Usuarios_DAO.update(elgcUsuarios);
        }     
        
       Util.habilitar(false, jTxtElgcCodigo, jTxtElgcNome,jTxtElgcCodigo,jCboElgcNivel, jPwdElgcSenha, jChbElgcAtivo,jBtnElgcConfirmar,jBtnElgcCancelar);
       Util.habilitar(true,jBtnElgcIncluir,jBtnElgcAlterar,jBtnElgcExcluir,jBtnElgcPesquisar);
       Util.limparCampos(jTxtElgcCodigo, jTxtElgcNome,jTxtElgcCodigo, jTxtElgcNome,jCboElgcNivel, jPwdElgcSenha, jChbElgcAtivo);
    }//GEN-LAST:event_jBtnElgcConfirmarActionPerformed

    private void jBtnElgcCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcCancelarActionPerformed
       Util.habilitar(false, jBtnElgcAlterar,jBtnElgcExcluir,jTxtElgcCodigo, jTxtElgcNome,jTxtElgcCodigo,jCboElgcNivel, jPwdElgcSenha, jChbElgcAtivo,jBtnElgcConfirmar,jBtnElgcCancelar);
       Util.habilitar(true,jBtnElgcIncluir,jBtnElgcPesquisar);
       Util.limparCampos(jTxtElgcCodigo, jTxtElgcNome,jTxtElgcCodigo, jTxtElgcNome,jCboElgcNivel, jPwdElgcSenha, jChbElgcAtivo);
       Util.mensagem("Operação Concluída");
    }//GEN-LAST:event_jBtnElgcCancelarActionPerformed

    private void jBtnElgcPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcPesquisarActionPerformed
         Util.habilitar(false, jBtnElgcIncluir,jBtnElgcPesquisar,jTxtElgcCodigo, jTxtElgcNome,jTxtElgcCodigo,jCboElgcNivel, jPwdElgcSenha, jChbElgcAtivo,jBtnElgcConfirmar);
       Util.habilitar(true,jBtnElgcAlterar,jBtnElgcExcluir,jBtnElgcCancelar);
        JDlg_elgcUsuariosPesquisar jDlg_elgcUsuariosPesquisar = new JDlg_elgcUsuariosPesquisar(null, true);
        jDlg_elgcUsuariosPesquisar.setTelaAnterior(this);        
        jDlg_elgcUsuariosPesquisar.setVisible(true);
    }//GEN-LAST:event_jBtnElgcPesquisarActionPerformed

    private void jBtnElgcIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcIncluirActionPerformed
       Util.habilitar(true, jTxtElgcCodigo, jTxtElgcNome,jTxtElgcCodigo, jTxtElgcNome,jCboElgcNivel, jPwdElgcSenha, jChbElgcAtivo,jBtnElgcConfirmar,jBtnElgcCancelar);
       Util.habilitar(false,jBtnElgcIncluir,jBtnElgcAlterar,jBtnElgcExcluir,jBtnElgcPesquisar);
       Util.limparCampos(jTxtElgcCodigo, jTxtElgcNome,jTxtElgcCodigo, jTxtElgcNome,jCboElgcNivel, jPwdElgcSenha, jChbElgcAtivo);
        incluindo = true;
    }//GEN-LAST:event_jBtnElgcIncluirActionPerformed

    private void jTxtElgcNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtElgcNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtElgcNomeActionPerformed

    private void jTxtElgcCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtElgcCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtElgcCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(JDlg_elgcUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlg_elgcUsuarios dialog = new JDlg_elgcUsuarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnElgcCancelar;
    private javax.swing.JButton jBtnElgcConfirmar;
    private javax.swing.JButton jBtnElgcExcluir;
    private javax.swing.JButton jBtnElgcIncluir;
    private javax.swing.JButton jBtnElgcPesquisar;
    private javax.swing.JComboBox<String> jCboElgcNivel;
    private javax.swing.JCheckBox jChbElgcAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPwdElgcSenha;
    private javax.swing.JTextField jTxtElgcCodigo;
    private javax.swing.JTextField jTxtElgcNome;
    // End of variables declaration//GEN-END:variables
}
