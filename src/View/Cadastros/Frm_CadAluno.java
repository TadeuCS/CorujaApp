/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastros;

import Controller.AlunoDAO;
import Controller.PessoaDAO;
import Controller.ResponsavelDAO;
import Controller.SerieDAO;
import Model.Aluno;
import Model.Pessoa;
import Model.Responsavel;
import Model.Serie;
import Util.Classes.Data;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Frm_CadAluno extends javax.swing.JFrame {

    SerieDAO serieDAO;
    PessoaDAO pessoaDAO;
    ResponsavelDAO responsavelDAO;
    AlunoDAO alunoDAO;
    Aluno aluno;
    List<Responsavel> responsaveis = new ArrayList<>();
    List<Pessoa> pais = new ArrayList<>();
    List<Pessoa> maes = new ArrayList<>();

    public Frm_CadAluno() {
        initComponents();
        setVisible(true);
        setEnabledFields(false);
        setEnabledButtons(true);
        carregaSeries();
        carregaPais();
        carregaResponsavel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        pnl_fundo = new javax.swing.JPanel();
        pnl_cadastroAluno = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JFormattedTextField();
        txt_dataNascimento = new javax.swing.JFormattedTextField();
        txt_codigo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbx_pai = new javax.swing.JComboBox();
        txt_endereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbx_mae = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbx_responsavel = new javax.swing.JComboBox();
        txt_bairro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbx_serie = new javax.swing.JComboBox();
        txt_cidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        pnl_pesquisaAluno = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txt_filtro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_alunos = new javax.swing.JTable();
        btn_selecionar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Aluno");
        setResizable(false);

        pnl_cadastroAluno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Código:");

        jLabel10.setText("Email:");

        jLabel11.setText("Telefone:");

        try {
            txt_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_telefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            txt_dataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_dataNascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_codigo.setEnabled(false);

        jLabel13.setText("Data Nascimento *:");

        jLabel14.setText("Pai:");

        jLabel2.setText("Nome *:");

        jLabel4.setText("Endereço :*");

        jLabel15.setText("Mãe:");

        jLabel16.setText("Responsavel *:");

        jLabel17.setText("Série *:");

        jLabel6.setText("Bairro *:");

        jLabel8.setText("Cidade *:");

        jLabel9.setText(" Estado *:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 12, Short.MAX_VALUE)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addComponent(jLabel17)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_cidade)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbx_responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_bairro)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(cbx_serie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbx_pai, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbx_mae, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_endereco, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbx_pai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(cbx_mae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(cbx_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(cbx_responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_cadastroAlunoLayout = new javax.swing.GroupLayout(pnl_cadastroAluno);
        pnl_cadastroAluno.setLayout(pnl_cadastroAlunoLayout);
        pnl_cadastroAlunoLayout.setHorizontalGroup(
            pnl_cadastroAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadastroAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_cadastroAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_cadastroAlunoLayout.createSequentialGroup()
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_cadastroAlunoLayout.setVerticalGroup(
            pnl_cadastroAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_cadastroAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_cadastroAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        pnl_pesquisaAluno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setText("Filtro:");

        tb_alunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Responsavel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_alunos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_alunos);
        if (tb_alunos.getColumnModel().getColumnCount() > 0) {
            tb_alunos.getColumnModel().getColumn(0).setMinWidth(80);
            tb_alunos.getColumnModel().getColumn(0).setPreferredWidth(80);
            tb_alunos.getColumnModel().getColumn(0).setMaxWidth(80);
            tb_alunos.getColumnModel().getColumn(2).setMinWidth(110);
            tb_alunos.getColumnModel().getColumn(2).setPreferredWidth(110);
            tb_alunos.getColumnModel().getColumn(2).setMaxWidth(110);
        }

        btn_selecionar.setText("Selecionar");

        btn_editar.setText("Editar");

        btn_apagar.setText("Apagar");

        javax.swing.GroupLayout pnl_pesquisaAlunoLayout = new javax.swing.GroupLayout(pnl_pesquisaAluno);
        pnl_pesquisaAluno.setLayout(pnl_pesquisaAlunoLayout);
        pnl_pesquisaAlunoLayout.setHorizontalGroup(
            pnl_pesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pesquisaAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_pesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnl_pesquisaAlunoLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 362, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pesquisaAlunoLayout.createSequentialGroup()
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_pesquisaAlunoLayout.setVerticalGroup(
            pnl_pesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pesquisaAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_pesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_pesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_selecionar)
                    .addGroup(pnl_pesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_editar)
                        .addComponent(btn_apagar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_cadastroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_pesquisaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_cadastroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_pesquisaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        setEnabledFields(true);
        setEnabledButtons(false);
        txt_nome.requestFocus();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        setEnabledFields(false);
        setEnabledButtons(true);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        validaCampos();
    }//GEN-LAST:event_btn_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_CadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_CadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_CadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_CadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_CadAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_selecionar;
    private javax.swing.JComboBox cbx_mae;
    private javax.swing.JComboBox cbx_pai;
    private javax.swing.JComboBox cbx_responsavel;
    private javax.swing.JComboBox cbx_serie;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnl_cadastroAluno;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JPanel pnl_pesquisaAluno;
    private javax.swing.JTable tb_alunos;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JFormattedTextField txt_dataNascimento;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JFormattedTextField txt_telefone;
    // End of variables declaration//GEN-END:variables

    private void setEnabledFields(boolean tipo) {
        txt_nome.setEnabled(tipo);
        cbx_serie.setEnabled(tipo);
        cbx_pai.setEnabled(tipo);
        cbx_mae.setEnabled(tipo);
        txt_endereco.setEnabled(tipo);
        txt_bairro.setEnabled(tipo);
        txt_cidade.setEnabled(tipo);
        txt_estado.setEnabled(tipo);
        txt_email.setEnabled(tipo);
        txt_telefone.setEnabled(tipo);
        txt_dataNascimento.setEnabled(tipo);
        cbx_responsavel.setEnabled(tipo);
        limpaCampos();
    }

    private void setEnabledButtons(boolean tipo) {
        btn_novo.setEnabled(tipo);
        btn_editar.setEnabled(tipo);
        btn_apagar.setEnabled(tipo);
        btn_salvar.setEnabled(!tipo);
        btn_cancelar.setEnabled(!tipo);
    }

    private void limpaCampos() {
        txt_codigo.setText(null);
        txt_nome.setText(null);
        txt_endereco.setText(null);
        txt_bairro.setText(null);
        txt_cidade.setText(null);
        txt_estado.setText(null);
        txt_email.setText(null);
        txt_telefone.setText(null);
        txt_dataNascimento.setText(null);
        txt_filtro.setText(null);
    }

    private void carregaSeries() {
        try {
            cbx_serie.removeAllItems();
            serieDAO = new SerieDAO();
                for (Serie serie : serieDAO.listar()) {
                    cbx_serie.addItem(serie.getNome());
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao carregar as Series!\n" + e);
        }
    }

    private void carregaPais() {
        try {
            cbx_pai.removeAllItems();
            cbx_mae.removeAllItems();
            pessoaDAO = new PessoaDAO();
            for (Pessoa pessoa : pessoaDAO.listar()) {
                if (pessoa.getSexo().equals('F') == true) {
                    cbx_mae.addItem(pessoa.getNome());
                    maes.add(pessoa);
                } else {
                    if (pessoa.getSexo().equals('M') == true) {
                        cbx_pai.addItem(pessoa.getNome());
                        pais.add(pessoa);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao carregar os Pais!\n" + e);
        }
    }

    private void carregaResponsavel() {
        try {
            cbx_responsavel.removeAllItems();
            responsavelDAO = new ResponsavelDAO();
            responsaveis = responsavelDAO.listar();
            for (Responsavel responsavel : responsaveis) {
                cbx_responsavel.addItem(responsavel.getNome());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao carregar as Responsaveis!\n" + e);
        }
    }

    private void validaCampos() {
        try {
            if (txt_nome.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome inválido!");
                txt_nome.requestFocus();
            } else {
                if (cbx_serie.getSelectedItem().toString().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Série inválida!");
                    cbx_serie.requestFocus();
                } else {
                    if (txt_endereco.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Endereço inválido!");
                        txt_endereco.requestFocus();
                    } else {
                        if (txt_bairro.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Bairro inválido!");
                            txt_bairro.requestFocus();
                        } else {
                            if (txt_cidade.getText().isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Cidade inválida!");
                                txt_cidade.requestFocus();
                            } else {
                                if (txt_estado.getText().isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Estado inválido!");
                                    txt_estado.requestFocus();
                                } else {
                                    if (txt_dataNascimento.getText().replace("/", "").trim().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Data de Nascimento inválida!");
                                        txt_dataNascimento.requestFocus();
                                    } else {
                                        if (cbx_responsavel.getSelectedItem().toString().isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "Responsável inválido!");
                                            cbx_responsavel.requestFocus();
                                        } else {
                                            salvar();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (txt_codigo.getText().isEmpty()) {

            }
        } catch (Exception e) {
        }
    }

    private void salvar() {
        try {
            serieDAO = new SerieDAO();
            pessoaDAO = new PessoaDAO();
            responsavelDAO = new ResponsavelDAO();
            alunoDAO = new AlunoDAO();
            aluno = new Aluno();
            aluno.setNome(txt_nome.getText());
            aluno.setCodserie(serieDAO.buscar(cbx_serie.getSelectedItem().toString()));
            aluno.setCodpai(pais.get(cbx_pai.getSelectedIndex()));
            aluno.setCodpai(maes.get(cbx_mae.getSelectedIndex()));
            aluno.setEndereco(txt_endereco.getText());
            aluno.setBairro(txt_bairro.getText());
            if (!txt_email.getText().isEmpty()) {
                aluno.setEmail(txt_email.getText());
            }
            aluno.setCidade(txt_cidade.getText());
            aluno.setUf(txt_estado.getText());
            aluno.setCodresponsavel(responsaveis.get(cbx_responsavel.getSelectedIndex()));
            if (!txt_telefone.getText().isEmpty()) {
                aluno.setFone(txt_telefone.getText());
            }
            aluno.setDtNascimento(Data.getDataByTexto(txt_dataNascimento.getText(), "dd/MM/yyyy"));
            alunoDAO.salvar(aluno);
            JOptionPane.showMessageDialog(null, "Aluno Salvo com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o Aluno!\n" + e);
        }
    }

}
