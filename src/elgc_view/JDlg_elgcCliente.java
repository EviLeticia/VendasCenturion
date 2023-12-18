/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_view;

import elgc_tools.Util;
import elgc_bean.ElgcCliente;
import elgc_dao.Elgc_Cliente_DAO;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author u09894615139
 */
public class JDlg_elgcCliente extends javax.swing.JDialog {

    private boolean incluindo;
    MaskFormatter mascaraCpf;
    MaskFormatter mascaraDataNascimento;
    MaskFormatter mascaraCep;
    MaskFormatter mascaraRg;

    ElgcCliente elgcCliente;
    Elgc_Cliente_DAO elgc_Cliente_DAO;

    /**
     * Creates new form JDlg_elgcCliente
     */
    public JDlg_elgcCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("CLIENTE");
        setLocationRelativeTo(null);
        Util.habilitar(false, jBtnElgcAlterar, jBtnElgcExcluir, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jFmtElgcCpf, jFmtElgcRg, jTxtElgcBairro, jTxtElgcRua, jTxtElgcNumcasa, jFmtElgcCep, jTxtElgcSexo, jTxtElgcApelido, jTxtElgcObservacoes, jFmtElgcDatanascimento, jTxtElgcTelefonefixo, jTxtElgcCelular, jCboElgcEstadocivil, jBtnElgcConfirmar, jBtnElgcCancelar, jTxtElgcNome);
        Util.habilitar(true, jBtnElgcIncluir, jBtnElgcPesquisar);

        elgcCliente = new ElgcCliente();
        elgc_Cliente_DAO = new Elgc_Cliente_DAO();
        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraDataNascimento = new MaskFormatter("##/##/####");
            mascaraCep = new MaskFormatter("#####-###");
            mascaraRg = new MaskFormatter("#.###.###");
        } catch (ParseException ex) {
            Logger.getLogger(JDlg_elgcCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtElgcCpf.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));
        jFmtElgcDatanascimento.setFormatterFactory(new DefaultFormatterFactory(mascaraDataNascimento));
        jFmtElgcCep.setFormatterFactory(new DefaultFormatterFactory(mascaraCep));
        jFmtElgcRg.setFormatterFactory(new DefaultFormatterFactory(mascaraRg));
    }

    public ElgcCliente viewBean() {
        elgcCliente = new ElgcCliente();

        elgcCliente.setIdelgcCliente(Util.strInt(jTxtElgcCodigoCliente.getText()));
        elgcCliente.setElgcNome(jTxtElgcEstadoCivil.getText());
        elgcCliente.setElgcCpf(jFmtElgcCpf.getText());
        elgcCliente.setElgcRg(jFmtElgcRg.getText());
        elgcCliente.setElgcBairro(jTxtElgcBairro.getText());
        elgcCliente.setElgcRua(jTxtElgcRua.getText());
        elgcCliente.setElgcNumero(jTxtElgcNumcasa.getText());
        elgcCliente.setElgcCep(jFmtElgcCep.getText());
        elgcCliente.setElgcSexo(jTxtElgcSexo.getText());
        elgcCliente.setElgcApelido(jTxtElgcApelido.getText());
        elgcCliente.setElgcObservacoes(jTxtElgcObservacoes.getText());
        elgcCliente.setElgcDatanascimento(Util.strDate(jFmtElgcDatanascimento.getText()));
        elgcCliente.setElgcTelefonefixo(jTxtElgcTelefonefixo.getText());
        elgcCliente.setElgcCelular(jTxtElgcCelular.getText());
        elgcCliente.setElgcEstadocivil(jTxtElgcEstadoCivil.getText());

        return elgcCliente;
    }

    public void beanView(ElgcCliente elgcCliente) {
        jTxtElgcCodigoCliente.setText(Util.intStr(elgcCliente.getIdelgcCliente()));
        jTxtElgcEstadoCivil.setText(elgcCliente.getElgcNome());
        jTxtElgcApelido.setText(elgcCliente.getElgcApelido());
        jFmtElgcCpf.setText(elgcCliente.getElgcCpf());
        jFmtElgcRg.setText(elgcCliente.getElgcRg());
        jTxtElgcBairro.setText(elgcCliente.getElgcBairro());
        jTxtElgcNumcasa.setText(elgcCliente.getElgcNumero());
        jFmtElgcCep.setText(elgcCliente.getElgcCep());
        jTxtElgcSexo.setText(elgcCliente.getElgcSexo());
        jTxtElgcApelido.setText(elgcCliente.getElgcApelido());
        jTxtElgcObservacoes.setText(elgcCliente.getElgcObservacoes());
        jFmtElgcDatanascimento.setText(Util.datestr(elgcCliente.getElgcDatanascimento()));
        jTxtElgcTelefonefixo.setText(elgcCliente.getElgcTelefonefixo());
        jTxtElgcCelular.setText(elgcCliente.getElgcCelular());
        jTxtElgcEstadoCivil.setText(elgcCliente.getElgcEstadocivil());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jCboElgcEstadocivil = new javax.swing.JComboBox<>();
        jBtnElgcConfirmar = new javax.swing.JButton();
        jBtnElgcCancelar = new javax.swing.JButton();
        jBtnElgcPesquisar = new javax.swing.JButton();
        jBtnElgcIncluir = new javax.swing.JButton();
        jBtnElgcAlterar = new javax.swing.JButton();
        jBtnElgcExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTxtElgcEstadoCivil = new javax.swing.JTextField();
        jTxtElgcCodigoCliente = new javax.swing.JTextField();
        jFmtElgcCpf = new javax.swing.JFormattedTextField();
        jFmtElgcRg = new javax.swing.JFormattedTextField();
        jTxtElgcBairro = new javax.swing.JTextField();
        jTxtElgcNumcasa = new javax.swing.JTextField();
        jTxtElgcRua = new javax.swing.JTextField();
        jFmtElgcCep = new javax.swing.JFormattedTextField();
        jTxtElgcCelular = new javax.swing.JTextField();
        jTxtElgcApelido = new javax.swing.JTextField();
        jTxtElgcObservacoes = new javax.swing.JTextField();
        jFmtElgcDatanascimento = new javax.swing.JFormattedTextField();
        jTxtElgcSexo = new javax.swing.JTextField();
        jTxtElgcTelefonefixo = new javax.swing.JTextField();
        jTxtElgcNome = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        jLabel16.setText("jLabel1");

        jCboElgcEstadocivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCboElgcEstadocivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboElgcEstadocivilActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        jLabel3.setText("CPF");

        jLabel4.setText("RG");

        jLabel5.setText("Bairro");

        jLabel6.setText("Rua");

        jLabel7.setText("Número da casa");

        jLabel8.setText("CEP");

        jLabel9.setText("Sexo");

        jLabel10.setText("Apelido");

        jLabel11.setText("Observações");

        jLabel12.setText("Data de Nascimento");

        jLabel13.setText("Telefone Fixo");

        jLabel14.setText("Celular");

        jLabel15.setText("Estado Civil");

        jTxtElgcEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtElgcEstadoCivilActionPerformed(evt);
            }
        });

        jTxtElgcNumcasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtElgcNumcasaActionPerformed(evt);
            }
        });

        jFmtElgcCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtElgcCepActionPerformed(evt);
            }
        });

        jTxtElgcSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtElgcSexoActionPerformed(evt);
            }
        });

        jTxtElgcNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtElgcNomeActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(102, 102, 255));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 255));
        jLabel17.setText("CLIENTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTxtElgcBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFmtElgcRg, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFmtElgcCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnElgcIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnElgcAlterar))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jTxtElgcNome, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel6))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTxtElgcNumcasa, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtElgcSexo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtElgcApelido, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jFmtElgcCep, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(60, 60, 60)
                                            .addComponent(jBtnElgcExcluir)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                                            .addComponent(jBtnElgcConfirmar)))
                                    .addGap(28, 28, 28))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtElgcCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTxtElgcRua))))
                        .addGap(51, 51, 51)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addComponent(jTxtElgcTelefonefixo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnElgcCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnElgcPesquisar))
                    .addComponent(jLabel11)
                    .addComponent(jTxtElgcObservacoes)
                    .addComponent(jLabel13)
                    .addComponent(jFmtElgcDatanascimento)
                    .addComponent(jLabel14)
                    .addComponent(jTxtElgcCelular))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtElgcEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(437, 437, 437)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtElgcObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtElgcDatanascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtElgcCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtElgcRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtElgcNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtElgcNumcasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFmtElgcCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jFmtElgcRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtElgcBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jTxtElgcTelefonefixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtElgcCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(4, 4, 4)
                                .addComponent(jFmtElgcCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtElgcSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jTxtElgcApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jTxtElgcEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void jBtnElgcConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcConfirmarActionPerformed
        elgcCliente = viewBean();
        elgc_Cliente_DAO = new Elgc_Cliente_DAO();
        if (incluindo == true) {
            elgc_Cliente_DAO.insert(elgcCliente);
        } else {
            elgc_Cliente_DAO.update(elgcCliente);
        }

        Util.habilitar(false, jTxtElgcNome, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jFmtElgcCpf, jFmtElgcRg, jTxtElgcBairro, jTxtElgcRua, jTxtElgcNumcasa, jFmtElgcCep, jTxtElgcSexo, jTxtElgcApelido, jTxtElgcObservacoes, jFmtElgcDatanascimento, jTxtElgcTelefonefixo, jTxtElgcCelular, jCboElgcEstadocivil, jBtnElgcConfirmar, jBtnElgcCancelar);
        Util.habilitar(true, jBtnElgcIncluir, jBtnElgcAlterar, jBtnElgcExcluir, jBtnElgcPesquisar);
        Util.limparCampos(jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jFmtElgcCpf, jFmtElgcRg, jTxtElgcBairro, jTxtElgcRua, jTxtElgcNumcasa, jFmtElgcCep, jTxtElgcSexo, jTxtElgcApelido, jTxtElgcObservacoes, jFmtElgcDatanascimento, jTxtElgcTelefonefixo, jTxtElgcCelular, jCboElgcEstadocivil);
    }//GEN-LAST:event_jBtnElgcConfirmarActionPerformed

    private void jBtnElgcCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcCancelarActionPerformed
        Util.habilitar(false, jBtnElgcAlterar, jBtnElgcExcluir, jTxtElgcCodigoCliente, jTxtElgcNome, jTxtElgcEstadoCivil, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jFmtElgcCpf, jFmtElgcRg, jTxtElgcBairro, jTxtElgcRua, jTxtElgcNumcasa, jFmtElgcCep, jTxtElgcSexo, jTxtElgcApelido, jTxtElgcObservacoes, jFmtElgcDatanascimento, jTxtElgcTelefonefixo, jTxtElgcCelular, jCboElgcEstadocivil, jBtnElgcConfirmar, jBtnElgcCancelar);
        Util.habilitar(true, jBtnElgcIncluir, jBtnElgcPesquisar);
        Util.mensagem("Operação Cancelada");
        Util.limparCampos(jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jFmtElgcCpf, jFmtElgcRg, jTxtElgcBairro, jTxtElgcRua, jTxtElgcNumcasa, jFmtElgcCep, jTxtElgcSexo, jTxtElgcApelido, jTxtElgcObservacoes, jFmtElgcDatanascimento, jTxtElgcTelefonefixo, jTxtElgcCelular, jCboElgcEstadocivil);
    }//GEN-LAST:event_jBtnElgcCancelarActionPerformed

    private void jBtnElgcPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcPesquisarActionPerformed
        Util.habilitar(false, jBtnElgcIncluir, jTxtElgcNome, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jFmtElgcCpf, jFmtElgcRg, jTxtElgcBairro, jTxtElgcRua, jTxtElgcNumcasa, jFmtElgcCep, jTxtElgcSexo, jTxtElgcApelido, jTxtElgcObservacoes, jFmtElgcDatanascimento, jTxtElgcTelefonefixo, jTxtElgcCelular, jCboElgcEstadocivil, jBtnElgcConfirmar, jBtnElgcPesquisar);
        Util.habilitar(true, jBtnElgcCancelar, jBtnElgcAlterar, jBtnElgcExcluir);
        JDlg_elgcClientePesquisar jDlg_elgcClientePesquisar = new JDlg_elgcClientePesquisar(null, true);
        jDlg_elgcClientePesquisar.setTelaAnterior(this);
        jDlg_elgcClientePesquisar.setVisible(true);
    }//GEN-LAST:event_jBtnElgcPesquisarActionPerformed

    private void jBtnElgcIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcIncluirActionPerformed
        Util.habilitar(true, jTxtElgcNome, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jFmtElgcCpf, jFmtElgcRg, jTxtElgcBairro, jTxtElgcRua, jTxtElgcNumcasa, jFmtElgcCep, jTxtElgcSexo, jTxtElgcApelido, jTxtElgcObservacoes, jFmtElgcDatanascimento, jTxtElgcTelefonefixo, jTxtElgcCelular, jCboElgcEstadocivil, jBtnElgcConfirmar, jBtnElgcCancelar);
        Util.habilitar(false, jBtnElgcIncluir, jBtnElgcAlterar, jBtnElgcExcluir, jBtnElgcPesquisar);
        Util.limparCampos(jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jFmtElgcCpf, jFmtElgcRg, jTxtElgcBairro, jTxtElgcRua, jTxtElgcNumcasa, jFmtElgcCep, jTxtElgcSexo, jTxtElgcApelido, jTxtElgcObservacoes, jFmtElgcDatanascimento, jTxtElgcTelefonefixo, jTxtElgcCelular, jCboElgcEstadocivil);
        incluindo = true;
    }//GEN-LAST:event_jBtnElgcIncluirActionPerformed

    private void jBtnElgcAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcAlterarActionPerformed
        Util.habilitar(true, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jFmtElgcCpf, jFmtElgcRg, jTxtElgcBairro, jTxtElgcRua, jTxtElgcNumcasa, jFmtElgcCep, jTxtElgcSexo, jTxtElgcApelido, jTxtElgcObservacoes, jFmtElgcDatanascimento, jTxtElgcTelefonefixo, jTxtElgcCelular, jCboElgcEstadocivil, jBtnElgcConfirmar, jBtnElgcCancelar, jTxtElgcNome);
        incluindo = false;
    }//GEN-LAST:event_jBtnElgcAlterarActionPerformed

    private void jBtnElgcExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElgcExcluirActionPerformed
        if (Util.perguntar("Deseja excluir o registro?") == true) {
            elgcCliente = viewBean();
            elgc_Cliente_DAO.delete(elgcCliente);
        } else {

            Util.mensagem("Exclusão cancelada.");
        }
        Util.limparCampos(jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jFmtElgcCpf, jFmtElgcRg, jTxtElgcBairro, jTxtElgcRua, jTxtElgcNumcasa, jFmtElgcCep, jTxtElgcSexo, jTxtElgcApelido, jTxtElgcObservacoes, jFmtElgcDatanascimento, jTxtElgcTelefonefixo, jTxtElgcCelular, jCboElgcEstadocivil);
        Util.habilitar(false, jTxtElgcNome, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jTxtElgcCodigoCliente, jTxtElgcEstadoCivil, jFmtElgcCpf, jFmtElgcRg, jTxtElgcBairro, jTxtElgcRua, jTxtElgcNumcasa, jFmtElgcCep, jTxtElgcSexo, jTxtElgcApelido, jTxtElgcObservacoes, jFmtElgcDatanascimento, jTxtElgcTelefonefixo, jTxtElgcCelular, jCboElgcEstadocivil, jBtnElgcConfirmar, jBtnElgcCancelar);
        Util.habilitar(true, jBtnElgcIncluir, jBtnElgcAlterar, jBtnElgcExcluir, jBtnElgcPesquisar);

    }//GEN-LAST:event_jBtnElgcExcluirActionPerformed

    private void jTxtElgcNumcasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtElgcNumcasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtElgcNumcasaActionPerformed

    private void jTxtElgcSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtElgcSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtElgcSexoActionPerformed

    private void jFmtElgcCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtElgcCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtElgcCepActionPerformed

    private void jCboElgcEstadocivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboElgcEstadocivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboElgcEstadocivilActionPerformed

    private void jTxtElgcEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtElgcEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtElgcEstadoCivilActionPerformed

    private void jTxtElgcNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtElgcNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtElgcNomeActionPerformed

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
            java.util.logging.Logger.getLogger(JDlg_elgcCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlg_elgcCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlg_elgcCliente dialog = new JDlg_elgcCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jCboElgcEstadocivil;
    private javax.swing.JFormattedTextField jFmtElgcCep;
    private javax.swing.JFormattedTextField jFmtElgcCpf;
    private javax.swing.JFormattedTextField jFmtElgcDatanascimento;
    private javax.swing.JFormattedTextField jFmtElgcRg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtElgcApelido;
    private javax.swing.JTextField jTxtElgcBairro;
    private javax.swing.JTextField jTxtElgcCelular;
    private javax.swing.JTextField jTxtElgcCodigoCliente;
    private javax.swing.JTextField jTxtElgcEstadoCivil;
    private javax.swing.JTextField jTxtElgcNome;
    private javax.swing.JTextField jTxtElgcNumcasa;
    private javax.swing.JTextField jTxtElgcObservacoes;
    private javax.swing.JTextField jTxtElgcRua;
    private javax.swing.JTextField jTxtElgcSexo;
    private javax.swing.JTextField jTxtElgcTelefonefixo;
    // End of variables declaration//GEN-END:variables
}
