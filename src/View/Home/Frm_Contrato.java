/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Home;

import Controller.ResponsavelDAO;
import Model.Responsavel;
import Util.Classes.TableConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Frm_Contrato extends javax.swing.JFrame {

    ResponsavelDAO responsavelDAO;
    List<Responsavel> responsaveis = new ArrayList<>();
    Map parameters;
    public Frm_Contrato() {
        initComponents();
        setVisible(true);
        grupoBotoes.add(rbt_total);
        grupoBotoes.add(rbt_parcial);
        listaResponsaveis();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotoes = new javax.swing.ButtonGroup();
        pnl_fundo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_responsaveis = new javax.swing.JTable();
        btn_inserir = new javax.swing.JButton();
        btn_remover = new javax.swing.JButton();
        btn_inserirTodos = new javax.swing.JButton();
        btn_removerTodos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_filtro = new javax.swing.JTextField();
        txt_filtro2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_responsaveis2 = new javax.swing.JTable();
        btn_gerar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rbt_total = new javax.swing.JRadioButton();
        rbt_parcial = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_dataParcela = new javax.swing.JFormattedTextField();
        txt_dataMatricula = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Emissão de Contratos");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tb_responsaveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_responsaveis.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_responsaveis);
        if (tb_responsaveis.getColumnModel().getColumnCount() > 0) {
            tb_responsaveis.getColumnModel().getColumn(0).setMinWidth(80);
            tb_responsaveis.getColumnModel().getColumn(0).setPreferredWidth(80);
            tb_responsaveis.getColumnModel().getColumn(0).setMaxWidth(80);
            tb_responsaveis.getColumnModel().getColumn(2).setMinWidth(100);
            tb_responsaveis.getColumnModel().getColumn(2).setPreferredWidth(100);
            tb_responsaveis.getColumnModel().getColumn(2).setMaxWidth(100);
            tb_responsaveis.getColumnModel().getColumn(2).setHeaderValue("CPF");
            tb_responsaveis.getColumnModel().getColumn(3).setMinWidth(80);
            tb_responsaveis.getColumnModel().getColumn(3).setPreferredWidth(80);
            tb_responsaveis.getColumnModel().getColumn(3).setMaxWidth(80);
            tb_responsaveis.getColumnModel().getColumn(3).setHeaderValue("Telefone");
        }

        btn_inserir.setText(">");
        btn_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirActionPerformed(evt);
            }
        });

        btn_remover.setText("<");
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });

        btn_inserirTodos.setText(">>");
        btn_inserirTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirTodosActionPerformed(evt);
            }
        });

        btn_removerTodos.setText("<<");
        btn_removerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerTodosActionPerformed(evt);
            }
        });

        jLabel3.setText("Filtro *:");

        txt_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroKeyReleased(evt);
            }
        });

        txt_filtro2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtro2KeyReleased(evt);
            }
        });

        jLabel4.setText("Filtro *:");

        tb_responsaveis2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_responsaveis2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tb_responsaveis2);
        if (tb_responsaveis2.getColumnModel().getColumnCount() > 0) {
            tb_responsaveis2.getColumnModel().getColumn(0).setMinWidth(80);
            tb_responsaveis2.getColumnModel().getColumn(0).setPreferredWidth(80);
            tb_responsaveis2.getColumnModel().getColumn(0).setMaxWidth(80);
            tb_responsaveis2.getColumnModel().getColumn(2).setMinWidth(100);
            tb_responsaveis2.getColumnModel().getColumn(2).setPreferredWidth(100);
            tb_responsaveis2.getColumnModel().getColumn(2).setMaxWidth(100);
            tb_responsaveis2.getColumnModel().getColumn(2).setHeaderValue("CPF");
            tb_responsaveis2.getColumnModel().getColumn(3).setMinWidth(80);
            tb_responsaveis2.getColumnModel().getColumn(3).setPreferredWidth(80);
            tb_responsaveis2.getColumnModel().getColumn(3).setMaxWidth(80);
            tb_responsaveis2.getColumnModel().getColumn(3).setHeaderValue("Telefone");
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_inserir, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(btn_remover, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(btn_inserirTodos, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(btn_removerTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtro2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(223, Short.MAX_VALUE))
                    .addComponent(jScrollPane3)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_inserirTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_removerTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txt_filtro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))))
                .addContainerGap())
        );

        btn_gerar.setText("Gerar");
        btn_gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Relatório"));

        rbt_total.setText("Total");

        rbt_parcial.setText("Parcial");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbt_total)
                .addGap(18, 18, 18)
                .addComponent(rbt_parcial)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbt_total)
                    .addComponent(rbt_parcial))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Parâmetros do Relatório"));

        jLabel1.setText("Data Parecela *:");

        try {
            txt_dataParcela.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_dataParcela.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            txt_dataMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_dataMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Data Matricula *:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_dataParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_dataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_dataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_dataParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_fundoLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_gerar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_gerar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased
        TableConfig.filtrar(tb_responsaveis, txt_filtro);
    }//GEN-LAST:event_txt_filtroKeyReleased

    private void txt_filtro2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtro2KeyReleased
        TableConfig.filtrar(tb_responsaveis2, txt_filtro2);
    }//GEN-LAST:event_txt_filtro2KeyReleased

    private void btn_inserirTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirTodosActionPerformed
        try {
            while (tb_responsaveis.getRowCount() > 0) {
                String[] linha = new String[]{
                    tb_responsaveis.getValueAt(0, 0).toString(),
                    tb_responsaveis.getValueAt(0, 1).toString(),
                    tb_responsaveis.getValueAt(0, 2).toString(),
                    tb_responsaveis.getValueAt(0, 3).toString()};
                addResponsavel(tb_responsaveis.getValueAt(0, 0).toString());
                TableConfig.getModel(tb_responsaveis2).addRow(linha);
                TableConfig.getModel(tb_responsaveis).removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir responsaveis na lista!\n" + e);
        }
    }//GEN-LAST:event_btn_inserirTodosActionPerformed

    private void btn_removerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerTodosActionPerformed
        while (tb_responsaveis2.getRowCount() > 0) {
            String[] linha = new String[]{
                tb_responsaveis2.getValueAt(0, 0).toString(),
                tb_responsaveis2.getValueAt(0, 1).toString(),
                tb_responsaveis2.getValueAt(0, 2).toString(),
                tb_responsaveis2.getValueAt(0, 3).toString()};
            removeResponsavel(tb_responsaveis2.getValueAt(0, 0).toString());
            TableConfig.getModel(tb_responsaveis).addRow(linha);
            TableConfig.getModel(tb_responsaveis2).removeRow(0);
        }
    }//GEN-LAST:event_btn_removerTodosActionPerformed

    private void btn_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirActionPerformed
        if (tb_responsaveis.getSelectedRowCount() == 1) {
            String[] linha = new String[]{
                tb_responsaveis.getValueAt(tb_responsaveis.getSelectedRow(), 0).toString(),
                tb_responsaveis.getValueAt(tb_responsaveis.getSelectedRow(), 1).toString(),
                tb_responsaveis.getValueAt(tb_responsaveis.getSelectedRow(), 2).toString(),
                tb_responsaveis.getValueAt(tb_responsaveis.getSelectedRow(), 3).toString()};
            addResponsavel(tb_responsaveis.getValueAt(0, 0).toString());
            TableConfig.getModel(tb_responsaveis2).addRow(linha);
            TableConfig.getModel(tb_responsaveis).removeRow(tb_responsaveis.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione apelas 1 linha!");
        }
    }//GEN-LAST:event_btn_inserirActionPerformed

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
        if (tb_responsaveis2.getSelectedRowCount() == 1) {
            String[] linha = new String[]{
                tb_responsaveis2.getValueAt(tb_responsaveis2.getSelectedRow(), 0).toString(),
                tb_responsaveis2.getValueAt(tb_responsaveis2.getSelectedRow(), 1).toString(),
                tb_responsaveis2.getValueAt(tb_responsaveis2.getSelectedRow(), 2).toString(),
                tb_responsaveis2.getValueAt(tb_responsaveis2.getSelectedRow(), 3).toString()};
            removeResponsavel(tb_responsaveis2.getValueAt(0, 0).toString());
            TableConfig.getModel(tb_responsaveis).addRow(linha);
            TableConfig.getModel(tb_responsaveis2).removeRow(tb_responsaveis2.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione apelas 1 linha!");
        }
    }//GEN-LAST:event_btn_removerActionPerformed

    private void btn_gerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerarActionPerformed
        gerarRelatorioByList(responsaveis);
    }//GEN-LAST:event_btn_gerarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Frm_Contrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gerar;
    private javax.swing.JButton btn_inserir;
    private javax.swing.JButton btn_inserirTodos;
    private javax.swing.JButton btn_remover;
    private javax.swing.JButton btn_removerTodos;
    private javax.swing.ButtonGroup grupoBotoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JRadioButton rbt_parcial;
    private javax.swing.JRadioButton rbt_total;
    private javax.swing.JTable tb_responsaveis;
    private javax.swing.JTable tb_responsaveis2;
    private javax.swing.JFormattedTextField txt_dataMatricula;
    private javax.swing.JFormattedTextField txt_dataParcela;
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_filtro2;
    // End of variables declaration//GEN-END:variables

    private void listaResponsaveis() {
        try {
            TableConfig.limpaTabela(tb_responsaveis);
            responsavelDAO = new ResponsavelDAO();
            for (Responsavel resp : responsavelDAO.listar()) {
                String[] linha = new String[]{resp.getCodresponsavel().toString(), resp.getNome(), resp.getCpf(), resp.getFone()};
                TableConfig.getModel(tb_responsaveis).addRow(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os Responsaveis!\n" + e);
        }
    }

    private void addResponsavel(String codResponsavel) {
        try {
            responsavelDAO = new ResponsavelDAO();
            responsaveis.add(responsavelDAO.buscarByCodigo(Integer.parseInt(codResponsavel)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar o Responsavel!\n" + e);
        }
    }
    private void removeResponsavel(String codResponsavel) {
        try {
            responsavelDAO = new ResponsavelDAO();
            responsaveis.remove(responsavelDAO.buscarByCodigo(Integer.parseInt(codResponsavel)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover o Responsavel!\n" + e);
        }
    }

    private void gerarRelatorioByList(List<Responsavel> responsaveis) {
        if(!responsaveis.isEmpty()){
        }
    }

    private void carregaParametros() {
        try {
           parameters=new HashMap();
        } catch (Exception e) {
        }
    }
}
