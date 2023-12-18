/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_query;

import elgc_bean.ElgcGruposalgado;
import elgc_dao.Elgc_Gruposalgado_DAO;
import elgc_tools.Util;
import java.util.List;
import elgc_view.Elgc_GruposalgadoController;

/**
 *
 * @author Lenovo
 */
public class JDlg_elgcConsultaGruposalgado extends javax.swing.JDialog {

    public ElgcGruposalgado elgcGruposalgado;
    Elgc_Gruposalgado_DAO elgc_Gruposalgado_DAO;
    Elgc_GruposalgadoController elgc_GruposalgadoController;

    public JDlg_elgcConsultaGruposalgado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("CONSULTA SALGADO");

        elgc_GruposalgadoController = new Elgc_GruposalgadoController();
        elgc_Gruposalgado_DAO = new Elgc_Gruposalgado_DAO();
        List lista = elgc_Gruposalgado_DAO.listAll();
        elgc_GruposalgadoController.setList(lista);
        jELGCTable.setModel(elgc_GruposalgadoController);
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
        jELGCTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jBtnElgcConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtElgcTiposalgado = new javax.swing.JTextField();
        jTxtElgcTiporecheio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jELGCTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jELGCTable);

        jPanel1.setBackground(new java.awt.Color(102, 163, 194));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        jBtnElgcConsultar.setBackground(new java.awt.Color(204, 204, 255));
        jBtnElgcConsultar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBtnElgcConsultar.setForeground(new java.awt.Color(204, 204, 255));
        jBtnElgcConsultar.setText("CONSULTAR");
        jBtnElgcConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElgcConsultarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de Salgado");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de Recheio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTxtElgcTiposalgado, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxtElgcTiporecheio, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(jBtnElgcConsultar)
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtElgcTiposalgado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtElgcTiporecheio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnElgcConsultar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnElgcConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcConsultarActionPerformed
        // Verifica se ambos os campos de texto (tipo de salgado e tipo de recheio) estão vazios.
        if (jTxtElgcTiposalgado.getText().equals("") && jTxtElgcTiporecheio.getText().equals("")) {
            // Se ambos estiverem vazios, obtém a lista completa de grupos de salgado e a define no controle.
            List lista = elgc_Gruposalgado_DAO.listAll();
            elgc_GruposalgadoController.setList(lista);
        } else {
            // Caso pelo menos um dos campos não esteja vazio.

            // Verifica se ambos os campos (tipo de salgado e tipo de recheio) têm valores.
            if (!jTxtElgcTiposalgado.getText().equals("") && !jTxtElgcTiporecheio.getText().equals("")) {
                // Se ambos tiverem valores, obtém a lista filtrada por tipo de salgado e tipo de recheio.
                List lista = elgc_Gruposalgado_DAO.listSalgadoRecheio(jTxtElgcTiposalgado.getText(), Util.strInt(jTxtElgcTiporecheio.getText()));
                elgc_GruposalgadoController.setList(lista);
            } else {
                // Se apenas um dos campos tem valor.

                // Verifica se o campo de tipo de salgado não está vazio.
                if (!jTxtElgcTiposalgado.getText().equals("")) {
                    // Se o campo de tipo de salgado tiver valor, obtém a lista filtrada por tipo de salgado.
                    List lista = elgc_Gruposalgado_DAO.listTiposalgado(jTxtElgcTiposalgado.getText());
                    elgc_GruposalgadoController.setList(lista);
                } else {
                    // Se apenas o campo de tipo de recheio tem valor.

                    // Verifica se o campo de tipo de recheio não está vazio.
                    if (!jTxtElgcTiporecheio.getText().equals("")) {
                        // Se o campo de tipo de recheio tiver valor, converte para inteiro e obtém a lista filtrada por tipo de recheio.
                        List lista = elgc_Gruposalgado_DAO.listTiporecheio(Util.strInt(jTxtElgcTiporecheio.getText()));
                        elgc_GruposalgadoController.setList(lista);
                    }
                }
            }
        }

    }//GEN-LAST:event_jBtnElgcConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlg_elgcConsultaGruposalgado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcConsultaGruposalgado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcConsultaGruposalgado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcConsultaGruposalgado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlg_elgcConsultaGruposalgado dialog = new JDlg_elgcConsultaGruposalgado(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnElgcConsultar;
    private javax.swing.JTable jELGCTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtElgcTiporecheio;
    private javax.swing.JTextField jTxtElgcTiposalgado;
    // End of variables declaration//GEN-END:variables
}
