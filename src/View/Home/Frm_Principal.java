package View.Home;

import View.Cadastros.Frm_CadAluno;
import View.Cadastros.Frm_CadLivro;
import View.Cadastros.Frm_CadMae;
import View.Cadastros.Frm_CadPai;
import View.Cadastros.Frm_CadResponsavel;
import View.Cadastros.Frm_CadSerie;
import View.Relatorios.Frm_RelAlunosByResponsavel;
import View.Relatorios.Frm_RelAlunosBySerie;
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
        atalho1 = new javax.swing.JPanel();
        atalhoCadastroCliente = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        atalho2 = new javax.swing.JPanel();
        atalhoAbrirAtendimento = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        atalho3 = new javax.swing.JPanel();
        atalhoAbrirAtendimento1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        atalho4 = new javax.swing.JPanel();
        atalhoAbrirAtendimento2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        atalho5 = new javax.swing.JPanel();
        atalhoAbrirAtendimento3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
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

        javax.swing.GroupLayout atalho1Layout = new javax.swing.GroupLayout(atalho1);
        atalho1.setLayout(atalho1Layout);
        atalho1Layout.setHorizontalGroup(
            atalho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atalho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atalhoCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addGroup(atalho1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );
        atalho1Layout.setVerticalGroup(
            atalho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho1Layout.createSequentialGroup()
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

        javax.swing.GroupLayout atalho2Layout = new javax.swing.GroupLayout(atalho2);
        atalho2.setLayout(atalho2Layout);
        atalho2Layout.setHorizontalGroup(
            atalho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atalho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atalhoAbrirAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        atalho2Layout.setVerticalGroup(
            atalho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho2Layout.createSequentialGroup()
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

        javax.swing.GroupLayout atalho3Layout = new javax.swing.GroupLayout(atalho3);
        atalho3.setLayout(atalho3Layout);
        atalho3Layout.setHorizontalGroup(
            atalho3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atalho3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atalhoAbrirAtendimento1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        atalho3Layout.setVerticalGroup(
            atalho3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atalhoAbrirAtendimento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        atalhoAbrirAtendimento2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atalhoAbrirAtendimento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cadPai.png"))); // NOI18N
        atalhoAbrirAtendimento2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atalhoAbrirAtendimento2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atalhoAbrirAtendimento2MousePressed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cadastrar Pais");

        javax.swing.GroupLayout atalho4Layout = new javax.swing.GroupLayout(atalho4);
        atalho4.setLayout(atalho4Layout);
        atalho4Layout.setHorizontalGroup(
            atalho4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atalho4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atalhoAbrirAtendimento2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        atalho4Layout.setVerticalGroup(
            atalho4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atalhoAbrirAtendimento2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        atalhoAbrirAtendimento3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atalhoAbrirAtendimento3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cadMae.png"))); // NOI18N
        atalhoAbrirAtendimento3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atalhoAbrirAtendimento3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atalhoAbrirAtendimento3MousePressed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Cadastrar Mães");

        javax.swing.GroupLayout atalho5Layout = new javax.swing.GroupLayout(atalho5);
        atalho5.setLayout(atalho5Layout);
        atalho5Layout.setHorizontalGroup(
            atalho5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atalho5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atalhoAbrirAtendimento3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        atalho5Layout.setVerticalGroup(
            atalho5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atalhoAbrirAtendimento3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_atalhosLayout = new javax.swing.GroupLayout(pnl_atalhos);
        pnl_atalhos.setLayout(pnl_atalhosLayout);
        pnl_atalhosLayout.setHorizontalGroup(
            pnl_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_atalhosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atalho1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atalho2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atalho3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atalho4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atalho5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(467, Short.MAX_VALUE))
        );
        pnl_atalhosLayout.setVerticalGroup(
            pnl_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_atalhosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnl_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(atalho1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atalho2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atalho3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atalho4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atalho5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        Frm_RelAlunosBySerie f= new Frm_RelAlunosBySerie();
    }//GEN-LAST:event_item_RelAlunosBySerieActionPerformed

    private void atalhoCadastroClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoCadastroClienteMousePressed
        Frm_CadAluno f = new Frm_CadAluno();
    }//GEN-LAST:event_atalhoCadastroClienteMousePressed

    private void atalhoAbrirAtendimentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoAbrirAtendimentoMousePressed
        Frm_Contrato f = new Frm_Contrato();
    }//GEN-LAST:event_atalhoAbrirAtendimentoMousePressed

    private void item_cadAlunoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_cadAlunoMousePressed
    }//GEN-LAST:event_item_cadAlunoMousePressed

    private void item_cadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadLivroActionPerformed
        Frm_CadLivro f = new Frm_CadLivro();
    }//GEN-LAST:event_item_cadLivroActionPerformed

    private void item_cadPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadPaiActionPerformed
        Frm_CadPai f = new Frm_CadPai();
    }//GEN-LAST:event_item_cadPaiActionPerformed

    private void item_cadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadAlunoActionPerformed
        Frm_CadAluno f = new Frm_CadAluno();
    }//GEN-LAST:event_item_cadAlunoActionPerformed

    private void item_cadResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadResponsavelActionPerformed
        Frm_CadResponsavel f = new Frm_CadResponsavel();
    }//GEN-LAST:event_item_cadResponsavelActionPerformed

    private void item_cadSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadSerieActionPerformed
        Frm_CadSerie f = new Frm_CadSerie();
    }//GEN-LAST:event_item_cadSerieActionPerformed

    private void item_RelAlunosByResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_RelAlunosByResponsavelActionPerformed
        Frm_RelAlunosByResponsavel f=new Frm_RelAlunosByResponsavel();
    }//GEN-LAST:event_item_RelAlunosByResponsavelActionPerformed

    private void atalhoAbrirAtendimento1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoAbrirAtendimento1MousePressed
        Frm_CadResponsavel f = new Frm_CadResponsavel();
    }//GEN-LAST:event_atalhoAbrirAtendimento1MousePressed

    private void item_cadMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadMaeActionPerformed
        Frm_CadMae f = new Frm_CadMae();
    }//GEN-LAST:event_item_cadMaeActionPerformed

    private void atalhoAbrirAtendimento2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoAbrirAtendimento2MousePressed
        Frm_CadPai f= new Frm_CadPai();
    }//GEN-LAST:event_atalhoAbrirAtendimento2MousePressed

    private void atalhoAbrirAtendimento3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoAbrirAtendimento3MousePressed
        Frm_CadMae f = new Frm_CadMae();
    }//GEN-LAST:event_atalhoAbrirAtendimento3MousePressed

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
    private javax.swing.JPanel atalho1;
    private javax.swing.JPanel atalho2;
    private javax.swing.JPanel atalho3;
    private javax.swing.JPanel atalho4;
    private javax.swing.JPanel atalho5;
    private javax.swing.JLabel atalhoAbrirAtendimento;
    private javax.swing.JLabel atalhoAbrirAtendimento1;
    private javax.swing.JLabel atalhoAbrirAtendimento2;
    private javax.swing.JLabel atalhoAbrirAtendimento3;
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu menu_cadastros;
    private javax.swing.JMenu menu_relatorios;
    private javax.swing.JPanel pnl_atalhos;
    private javax.swing.JPanel pnl_fundo;
    // End of variables declaration//GEN-END:variables

}
