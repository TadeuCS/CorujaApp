package View.Home;

import View.Cadastros.Frm_CadAluno;
import java.awt.Event;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Frm_Principal extends javax.swing.JFrame {

    public static Frm_Principal j = null;
    int tentativas;

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
        jMenu1 = new javax.swing.JMenu();
        item_cadUsuario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        item_cadConvenio = new javax.swing.JMenuItem();
        item_cadConvenio1 = new javax.swing.JMenuItem();
        Menu_Utilitários = new javax.swing.JMenu();
        item_AlterarSenha = new javax.swing.JMenuItem();
        item_AlterarSenha1 = new javax.swing.JMenuItem();
        item_trocaUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OftalSIS 1.0");
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
                .addComponent(atalhoCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        atalhoAbrirAtendimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atalhoAbrirAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/abrirAtendimento.png"))); // NOI18N
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
                .addComponent(atalhoAbrirAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        atalhoAbrirAtendimento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
                .addComponent(atalhoAbrirAtendimento1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
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
                .addContainerGap(475, Short.MAX_VALUE))
        );

        jMenu1.setText("Cadastros");

        item_cadUsuario.setText("Aluno");
        item_cadUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item_cadUsuarioMousePressed(evt);
            }
        });
        item_cadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(item_cadUsuario);

        jMenuItem1.setText("Livro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Pai/Mãe");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        item_cadConvenio.setText("Responsável");
        item_cadConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadConvenioActionPerformed(evt);
            }
        });
        jMenu1.add(item_cadConvenio);

        item_cadConvenio1.setText("Série");
        item_cadConvenio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadConvenio1ActionPerformed(evt);
            }
        });
        jMenu1.add(item_cadConvenio1);

        Menu_barra.add(jMenu1);

        Menu_Utilitários.setText("Relatorios");

        item_AlterarSenha.setText("Alunos por Série");
        item_AlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_AlterarSenhaActionPerformed(evt);
            }
        });
        Menu_Utilitários.add(item_AlterarSenha);

        item_AlterarSenha1.setText("Alunos por Responsável");
        item_AlterarSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_AlterarSenha1ActionPerformed(evt);
            }
        });
        Menu_Utilitários.add(item_AlterarSenha1);

        item_trocaUsuario.setText("Quitação de Débitos");
        item_trocaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_trocaUsuarioActionPerformed(evt);
            }
        });
        Menu_Utilitários.add(item_trocaUsuario);

        Menu_barra.add(Menu_Utilitários);

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

    private void item_trocaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_trocaUsuarioActionPerformed
    }//GEN-LAST:event_item_trocaUsuarioActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == Event.ESCAPE) {
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente Sair?", "Saindo", 0) == 0) {
                dispose();
            }
        }
    }//GEN-LAST:event_formKeyPressed

    private void item_AlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_AlterarSenhaActionPerformed
    }//GEN-LAST:event_item_AlterarSenhaActionPerformed

    private void atalhoCadastroClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoCadastroClienteMousePressed
        Frm_CadAluno f= new Frm_CadAluno();
    }//GEN-LAST:event_atalhoCadastroClienteMousePressed

    private void atalhoAbrirAtendimentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoAbrirAtendimentoMousePressed
    }//GEN-LAST:event_atalhoAbrirAtendimentoMousePressed

    private void item_cadUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_cadUsuarioMousePressed
    }//GEN-LAST:event_item_cadUsuarioMousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void item_cadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadUsuarioActionPerformed
        Frm_CadAluno f= new Frm_CadAluno();
    }//GEN-LAST:event_item_cadUsuarioActionPerformed

    private void item_cadConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadConvenioActionPerformed
    }//GEN-LAST:event_item_cadConvenioActionPerformed

    private void item_cadConvenio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadConvenio1ActionPerformed
    }//GEN-LAST:event_item_cadConvenio1ActionPerformed

    private void item_AlterarSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_AlterarSenha1ActionPerformed
    }//GEN-LAST:event_item_AlterarSenha1ActionPerformed

    private void atalhoAbrirAtendimento1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoAbrirAtendimento1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_atalhoAbrirAtendimento1MousePressed

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
    private javax.swing.JMenu Menu_Utilitários;
    private javax.swing.JMenuBar Menu_barra;
    private javax.swing.JLabel atalhoAbrirAtendimento;
    private javax.swing.JLabel atalhoAbrirAtendimento1;
    private javax.swing.JLabel atalhoCadastroCliente;
    private javax.swing.JMenuItem item_AlterarSenha;
    private javax.swing.JMenuItem item_AlterarSenha1;
    private javax.swing.JMenuItem item_cadConvenio;
    private javax.swing.JMenuItem item_cadConvenio1;
    private javax.swing.JMenuItem item_cadUsuario;
    private javax.swing.JMenuItem item_trocaUsuario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel pnl_aberturaAtendimento;
    private javax.swing.JPanel pnl_aberturaAtendimento1;
    private javax.swing.JPanel pnl_atalhos;
    private javax.swing.JPanel pnl_cadCliente;
    private javax.swing.JPanel pnl_fundo;
    // End of variables declaration//GEN-END:variables

}