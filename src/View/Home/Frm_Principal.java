package View.Home;

import Util.Classes.GeraRelatorios;
import View.Cadastros.Frm_CadAluno;
import View.Cadastros.Frm_CadLivro;
import View.Cadastros.Frm_CadMae;
import View.Cadastros.Frm_CadPai;
import View.Cadastros.Frm_CadResponsavel;
import View.Cadastros.Frm_CadSerie;
import java.awt.Event;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Frm_Principal extends javax.swing.JFrame {

    public static Frm_Principal j = null;
    int tentativas;
    GeraRelatorios geraRelatorios;
    public Frm_Principal() {
        initComponents();
        setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fundo = new javax.swing.JPanel();
        pnl_atalhos = new javax.swing.JPanel();
        pnl_cadCliente = new javax.swing.JPanel();
        atalhoCadastroCliente = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnl_aberturaAtendimento = new javax.swing.JPanel();
        atalhoAbrirAtendimento = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnl_aberturaAtendimento1 = new javax.swing.JPanel();
        atalhoAbrirAtendimento1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Menu_barra = new javax.swing.JMenuBar();
        menu_cadastros = new javax.swing.JMenu();
        item_cadAluno = new javax.swing.JMenuItem();
        item_cadLivro = new javax.swing.JMenuItem();
        item_cadPai = new javax.swing.JMenuItem();
        item_cadMae = new javax.swing.JMenuItem();
        item_cadResponsavel = new javax.swing.JMenuItem();
        item_cadSerie = new javax.swing.JMenuItem();
        menu_relatorios = new javax.swing.JMenu();
        item_RelAlunosBySerie = new javax.swing.JMenuItem();
        item_RelAlunosByResponsavel = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CorujaApp 1.0");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        pnl_atalhos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        atalhoCadastroCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atalhoCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cadCliente.png"))); // NOI18N
        atalhoCadastroCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atalhoCadastroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atalhoCadastroClienteMousePressed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cadastro de Aluno");

        javax.swing.GroupLayout pnl_cadClienteLayout = new javax.swing.GroupLayout(pnl_cadCliente);
        pnl_cadCliente.setLayout(pnl_cadClienteLayout);
        pnl_cadClienteLayout.setHorizontalGroup(
            pnl_cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atalhoCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addGroup(pnl_cadClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );
        pnl_cadClienteLayout.setVerticalGroup(
            pnl_cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atalhoCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        atalhoAbrirAtendimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atalhoAbrirAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/contrato.png"))); // NOI18N
        atalhoAbrirAtendimento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atalhoAbrirAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atalhoAbrirAtendimentoMousePressed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Emitir Contrato");

        javax.swing.GroupLayout pnl_aberturaAtendimentoLayout = new javax.swing.GroupLayout(pnl_aberturaAtendimento);
        pnl_aberturaAtendimento.setLayout(pnl_aberturaAtendimentoLayout);
        pnl_aberturaAtendimentoLayout.setHorizontalGroup(
            pnl_aberturaAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_aberturaAtendimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_aberturaAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atalhoAbrirAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_aberturaAtendimentoLayout.setVerticalGroup(
            pnl_aberturaAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_aberturaAtendimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atalhoAbrirAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        atalhoAbrirAtendimento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atalhoAbrirAtendimento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/responsavel.png"))); // NOI18N
        atalhoAbrirAtendimento1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atalhoAbrirAtendimento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atalhoAbrirAtendimento1MousePressed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cadastrar Responsável");

        javax.swing.GroupLayout pnl_aberturaAtendimento1Layout = new javax.swing.GroupLayout(pnl_aberturaAtendimento1);
        pnl_aberturaAtendimento1.setLayout(pnl_aberturaAtendimento1Layout);
        pnl_aberturaAtendimento1Layout.setHorizontalGroup(
            pnl_aberturaAtendimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_aberturaAtendimento1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_aberturaAtendimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atalhoAbrirAtendimento1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_aberturaAtendimento1Layout.setVerticalGroup(
            pnl_aberturaAtendimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_aberturaAtendimento1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atalhoAbrirAtendimento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_atalhosLayout = new javax.swing.GroupLayout(pnl_atalhos);
        pnl_atalhos.setLayout(pnl_atalhosLayout);
        pnl_atalhosLayout.setHorizontalGroup(
            pnl_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_atalhosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_cadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_aberturaAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_aberturaAtendimento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(783, Short.MAX_VALUE))
        );
        pnl_atalhosLayout.setVerticalGroup(
            pnl_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_atalhosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnl_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_cadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_aberturaAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_aberturaAtendimento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_atalhos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fundoLayout.createSequentialGroup()
                .addComponent(pnl_atalhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(471, Short.MAX_VALUE))
        );

        menu_cadastros.setText("Cadastros");

        item_cadAluno.setText("Aluno");
        item_cadAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item_cadAlunoMousePressed(evt);
            }
        });
        item_cadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadAlunoActionPerformed(evt);
            }
        });
        menu_cadastros.add(item_cadAluno);

        item_cadLivro.setText("Livro");
        item_cadLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadLivroActionPerformed(evt);
            }
        });
        menu_cadastros.add(item_cadLivro);

        item_cadPai.setText("Pai");
        item_cadPai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadPaiActionPerformed(evt);
            }
        });
        menu_cadastros.add(item_cadPai);

        item_cadMae.setText("Mãe");
        item_cadMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadMaeActionPerformed(evt);
            }
        });
        menu_cadastros.add(item_cadMae);

        item_cadResponsavel.setText("Responsável");
        item_cadResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadResponsavelActionPerformed(evt);
            }
        });
        menu_cadastros.add(item_cadResponsavel);

        item_cadSerie.setText("Série");
        item_cadSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadSerieActionPerformed(evt);
            }
        });
        menu_cadastros.add(item_cadSerie);

        Menu_barra.add(menu_cadastros);

        menu_relatorios.setText("Relatorios");

        item_RelAlunosBySerie.setText("Alunos por Série");
        item_RelAlunosBySerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_RelAlunosBySerieActionPerformed(evt);
            }
        });
        menu_relatorios.add(item_RelAlunosBySerie);

        item_RelAlunosByResponsavel.setText("Alunos por Responsável");
        item_RelAlunosByResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_RelAlunosByResponsavelActionPerformed(evt);
            }
        });
        menu_relatorios.add(item_RelAlunosByResponsavel);

        Menu_barra.add(menu_relatorios);

        setJMenuBar(Menu_barra);

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

        setSize(new java.awt.Dimension(1269, 676));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == Event.ESCAPE) {
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente Sair?", "Saindo", 0) == 0) {
                Frm_Login f = new Frm_Login();
                dispose();
            }
        }
    }//GEN-LAST:event_formKeyPressed

    private void item_RelAlunosBySerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_RelAlunosBySerieActionPerformed
        try {
            Map parametros= new HashMap();
            geraRelatorios.imprimirRelatorioSQLNoRelatorio(null, null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro"+e);
        }
    }//GEN-LAST:event_item_RelAlunosBySerieActionPerformed

    private void atalhoCadastroClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoCadastroClienteMousePressed
        Frm_CadAluno f= new Frm_CadAluno();
    }//GEN-LAST:event_atalhoCadastroClienteMousePressed

    private void atalhoAbrirAtendimentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoAbrirAtendimentoMousePressed
        Frm_Contrato f= new Frm_Contrato();
    }//GEN-LAST:event_atalhoAbrirAtendimentoMousePressed

    private void item_cadAlunoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_cadAlunoMousePressed
    }//GEN-LAST:event_item_cadAlunoMousePressed

    private void item_cadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadLivroActionPerformed
        Frm_CadLivro f = new Frm_CadLivro();
    }//GEN-LAST:event_item_cadLivroActionPerformed

    private void item_cadPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadPaiActionPerformed
        Frm_CadPai f= new Frm_CadPai();
    }//GEN-LAST:event_item_cadPaiActionPerformed

    private void item_cadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadAlunoActionPerformed
        Frm_CadAluno f= new Frm_CadAluno();
    }//GEN-LAST:event_item_cadAlunoActionPerformed

    private void item_cadResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadResponsavelActionPerformed
        Frm_CadResponsavel f = new Frm_CadResponsavel();
    }//GEN-LAST:event_item_cadResponsavelActionPerformed

    private void item_cadSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadSerieActionPerformed
        Frm_CadSerie f= new Frm_CadSerie();
    }//GEN-LAST:event_item_cadSerieActionPerformed

    private void item_RelAlunosByResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_RelAlunosByResponsavelActionPerformed
    }//GEN-LAST:event_item_RelAlunosByResponsavelActionPerformed

    private void atalhoAbrirAtendimento1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoAbrirAtendimento1MousePressed
        Frm_CadResponsavel f = new Frm_CadResponsavel();
    }//GEN-LAST:event_atalhoAbrirAtendimento1MousePressed

    private void item_cadMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadMaeActionPerformed
        Frm_CadMae f= new Frm_CadMae();
    }//GEN-LAST:event_item_cadMaeActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Principal();
            }
        });
        //Listener que capitura o evento "minimizar"

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu_barra;
    private javax.swing.JLabel atalhoAbrirAtendimento;
    private javax.swing.JLabel atalhoAbrirAtendimento1;
    private javax.swing.JLabel atalhoCadastroCliente;
    private javax.swing.JMenuItem item_RelAlunosByResponsavel;
    private javax.swing.JMenuItem item_RelAlunosBySerie;
    private javax.swing.JMenuItem item_cadAluno;
    private javax.swing.JMenuItem item_cadLivro;
    private javax.swing.JMenuItem item_cadMae;
    private javax.swing.JMenuItem item_cadPai;
    private javax.swing.JMenuItem item_cadResponsavel;
    private javax.swing.JMenuItem item_cadSerie;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu menu_cadastros;
    private javax.swing.JMenu menu_relatorios;
    private javax.swing.JPanel pnl_aberturaAtendimento;
    private javax.swing.JPanel pnl_aberturaAtendimento1;
    private javax.swing.JPanel pnl_atalhos;
    private javax.swing.JPanel pnl_cadCliente;
    private javax.swing.JPanel pnl_fundo;
    // End of variables declaration//GEN-END:variables

}