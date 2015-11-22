/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastros;

import Controller.PaiDAO;
import Model.Pai;
import Util.Classes.LowerDocument;
import Util.Classes.TableConfig;
import Util.Classes.UpperDocument;
import Util.Classes.ValidarCGCCPF;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Tadeu
 */
public class Frm_CadPai extends javax.swing.JFrame {

    PaiDAO paiDAO;
    Pai pai;

    public Frm_CadPai() {
        initComponents();
        setVisible(true);
        setEnabledButtons(true);
        listaPessoas();
        setFieldsCase();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_novo = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_cpf = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        chx_nonoDigito = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_filtro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_pais = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btn_editar = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro dos Pais");
        setResizable(false);

        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/adicionar.png"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cancelar.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/salvar.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Nome *:");

        txt_codigo.setEnabled(false);

        jLabel4.setText("Código :");

        jLabel5.setText("Telefone*:");

        try {
            txt_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_telefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setText("CPF *:");

        try {
            txt_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setText("Email:");

        txt_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_emailFocusLost(evt);
            }
        });

        chx_nonoDigito.setText("9 digito");
        chx_nonoDigito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chx_nonoDigitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(txt_telefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(chx_nonoDigito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_nome))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chx_nonoDigito))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Filtro:");

        txt_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroKeyReleased(evt);
            }
        });

        tb_pais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_pais.getTableHeader().setReorderingAllowed(false);
        tb_pais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_paisMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_pais);
        if (tb_pais.getColumnModel().getColumnCount() > 0) {
            tb_pais.getColumnModel().getColumn(0).setMinWidth(80);
            tb_pais.getColumnModel().getColumn(0).setPreferredWidth(80);
            tb_pais.getColumnModel().getColumn(0).setMaxWidth(80);
            tb_pais.getColumnModel().getColumn(2).setMinWidth(120);
            tb_pais.getColumnModel().getColumn(2).setPreferredWidth(120);
            tb_pais.getColumnModel().getColumn(2).setMaxWidth(120);
            tb_pais.getColumnModel().getColumn(3).setMinWidth(120);
            tb_pais.getColumnModel().getColumn(3).setPreferredWidth(120);
            tb_pais.getColumnModel().getColumn(3).setMaxWidth(120);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/alterar.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_apagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/excluir.png"))); // NOI18N
        btn_apagar.setText("Apagar");
        btn_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar)
                    .addComponent(btn_apagar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        setEnabledButtons(false);
        txt_nome.requestFocus();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        setEnabledButtons(true);
        limparCampos();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if (txt_nome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome Inválido!");
            txt_nome.requestFocus();
        } else {
            if (txt_telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Telefone Inválido!");
                txt_telefone.requestFocus();
            } else {
                salvar();
            }
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased
        TableConfig.filtrar(tb_pais, txt_filtro);
    }//GEN-LAST:event_txt_filtroKeyReleased

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        if (tb_pais.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Selecione 1 linha de cada vez para Editar!");
        } else {
            try {
                pai = new Pai();
                paiDAO = new PaiDAO();
                pai = paiDAO.findByCodigo(Integer.parseInt(tb_pais.getValueAt(tb_pais.getSelectedRow(), 0).toString()));
                setPaiNaTela(pai);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao carregar os dados do pai!\n" + e);
            }
            setEnabledButtons(false);
            txt_nome.requestFocus();
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        if (tb_pais.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Selecione 1 linha de cada vez para Apagar!");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente apagar o pai " + tb_pais.getValueAt(tb_pais.getSelectedRow(), 0).toString(), "", 0, 0) == 0) {
                removePessoa(tb_pais.getValueAt(tb_pais.getSelectedRow(), 0).toString());
            }
        }
    }//GEN-LAST:event_btn_apagarActionPerformed

    private void txt_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusLost
        btn_salvar.requestFocus();
    }//GEN-LAST:event_txt_emailFocusLost

    private void chx_nonoDigitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chx_nonoDigitoActionPerformed
        if (chx_nonoDigito.isSelected()) {
            try {
                txt_telefone.setValue(null);
                MaskFormatter cpf = new MaskFormatter("(##) #####-####");
                txt_telefone.setFormatterFactory(
                        new DefaultFormatterFactory(cpf));
                txt_telefone.requestFocus();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir o nono digito!\n" + e);
            }
        } else {
            try {
                txt_telefone.setValue(null);
                MaskFormatter cpf = new MaskFormatter("(##) ####-####");
                txt_telefone.setFormatterFactory(
                        new DefaultFormatterFactory(cpf));
                txt_telefone.requestFocus();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir o nono digito!\n" + e);
            }
        }
    }//GEN-LAST:event_chx_nonoDigitoActionPerformed

    private void tb_paisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_paisMousePressed
        if (tb_pais.getSelectedRowCount() == 1) {
            paiDAO = new PaiDAO();
            setPaiNaTela(paiDAO.findByCodigo(Integer.parseInt(tb_pais.getValueAt(tb_pais.getSelectedRow(), 0).toString())));
        }
    }//GEN-LAST:event_tb_paisMousePressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_CadPai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_CadPai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_CadPai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_CadPai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Frm_CadPai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JCheckBox chx_nonoDigito;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_pais;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JFormattedTextField txt_cpf;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JFormattedTextField txt_telefone;
    // End of variables declaration//GEN-END:variables

    private void setEnabledFields(boolean b) {
        txt_nome.setEnabled(b);
        txt_cpf.setEnabled(b);
        txt_email.setEnabled(b);
        txt_telefone.setEnabled(b);
        txt_filtro.setEnabled(!b);
        chx_nonoDigito.setEnabled(b);
    }

    private void setEnabledButtons(boolean b) {
        btn_novo.setEnabled(b);
        btn_editar.setEnabled(b);
        btn_apagar.setEnabled(b);
        btn_salvar.setEnabled(!b);
        btn_cancelar.setEnabled(!b);
        tb_pais.setEnabled(b);
        setEnabledFields(!b);
    }

    private void salvar() {
        paiDAO = new PaiDAO();
        try {
            pai = new Pai();
            if (!txt_codigo.getText().isEmpty()) {
                pai.setCodpai(Integer.parseInt(txt_codigo.getText()));
            }
            pai.setNome(txt_nome.getText().trim());
            if (!txt_cpf.getText().replace(".", "").replace("-", "").trim().isEmpty()) {
                pai.setCpf(txt_cpf.getText());
            }else{
                pai.setCpf("");
            }
            if (!txt_email.getText().isEmpty()) {
                pai.setEmail(txt_email.getText().trim());
            } else {
                pai.setEmail("");
            }
            pai.setFone(txt_telefone.getText());
            paiDAO.salvar(pai);
            JOptionPane.showMessageDialog(null, "Pai salvo com sucesso!\n");
            limparCampos();
        } catch (Exception ex) {
            if (ex.toString().contains("com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException")) {
                JOptionPane.showMessageDialog(null, "Já existe um pai cadastrado com este CPF!");
                txt_cpf.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar Pai!\n" + ex);
            }
        } finally {
            listaPessoas();
        }
    }

    private void limparCampos() {
        txt_codigo.setText(null);
        txt_nome.setText(null);
        txt_cpf.setText(null);
        txt_email.setText(null);
        txt_telefone.setText(null);
        txt_filtro.setText(null);
        chx_nonoDigito.setSelected(false);
        setEnabledButtons(true);
    }

    private void listaPessoas() {
        try {
            TableConfig.limpaTabela(tb_pais);
            paiDAO = new PaiDAO();
            for (Pai pessoa : paiDAO.listar()) {
                String[] linha = new String[]{pessoa.getCodpai().toString(),
                    pessoa.getNome(), pessoa.getCpf(), pessoa.getFone()};
                TableConfig.getModel(tb_pais).addRow(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar as Séries!\n" + e);
        }
    }

    private void removePessoa(String codigo) {
        try {
            paiDAO = new PaiDAO();
            paiDAO.remover(paiDAO.findByCodigo(Integer.parseInt(tb_pais.getValueAt(tb_pais.getSelectedRow(), 2).toString())));
            TableConfig.getModel(tb_pais).removeRow(tb_pais.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Pessoa removida com sucesso!\n");
            setEnabledButtons(true);
        } catch (Exception e) {
            if (e.toString().contains("MySQLIntegrityConstraintViolationException") == true) {
                JOptionPane.showMessageDialog(null, "Impossivel excluír este pai porque o mesmo tem alunos vinculados!\n");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao remover o Pai!\n" + e);
            }
        }
    }

    private void setFieldsCase() {
        txt_nome.setDocument(new UpperDocument(255));
        txt_email.setDocument(new LowerDocument(255));
    }

    private void trataNonoDigito() {
        if (chx_nonoDigito.isSelected()) {
            try {
                txt_telefone.setValue(null);
                MaskFormatter cpf = new MaskFormatter("(##) #####-####");
                txt_telefone.setFormatterFactory(
                        new DefaultFormatterFactory(cpf));
                txt_telefone.requestFocus();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir o nono digito!\n" + e);
            }
        } else {
            try {
                txt_telefone.setValue(null);
                MaskFormatter cpf = new MaskFormatter("(##) ####-####");
                txt_telefone.setFormatterFactory(
                        new DefaultFormatterFactory(cpf));
                txt_telefone.requestFocus();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir o nono digito!\n" + e);
            }
        }
    }

    private void setPaiNaTela(Pai pai) {
        txt_codigo.setText(pai.getCodpai().toString());
        txt_nome.setText(pai.getNome());
        if (pai.getFone().replace("(", "").replace(")", "").replace("-", "").replace(" ", "").length() < 11) {
            chx_nonoDigito.setSelected(false);
            trataNonoDigito();
            if (pai.getFone().replace("(", "").replace(")", "").replace("-", "").replace(" ", "").length() == 8) {
                txt_telefone.setText("34" + pai.getFone().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
            } else {
                if (pai.getFone().replace("(", "").replace(")", "").replace("-", "").replace(" ", "").length() == 10) {
                    txt_telefone.setText(pai.getFone().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
                }
            }
        } else {
            chx_nonoDigito.setSelected(true);
            trataNonoDigito();
            txt_telefone.setText(pai.getFone().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
        }
        txt_cpf.setText(pai.getCpf().replace(".", "").replace("/", "").replace("-", ""));
        if (!pai.getEmail().isEmpty()) {
            txt_email.setText(pai.getEmail());
        }
    }
}
