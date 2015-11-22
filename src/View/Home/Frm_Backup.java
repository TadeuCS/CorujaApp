/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Home;

import Util.Classes.MySQLBackup;
import Util.Classes.PropertiesManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Frm_Backup extends javax.swing.JFrame {

    PropertiesManager props;
    MySQLBackup mySQLBackup;
    Statement st;
    Connection con;
    ResultSet rs;
    public Frm_Backup() {
        initComponents();
        setVisible(true);
        carregaDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_servidor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_dump = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_banco = new javax.swing.JTextField();
        btn_gravar = new javax.swing.JButton();
        btn_testar = new javax.swing.JButton();
        txt_senha = new javax.swing.JPasswordField();
        btn_backup = new javax.swing.JButton();
        btn_restore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuração do Banco de dados");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Banco de dados"));

        jLabel1.setText("Servidor *:");

        jLabel2.setText("Senha *:");

        jLabel4.setText("MySqlDump *:");

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/buscar.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Usuário *:");

        jLabel6.setText("Banco *:");

        btn_gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/salvar.png"))); // NOI18N
        btn_gravar.setText("Gravar");
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });

        btn_testar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/carregar.png"))); // NOI18N
        btn_testar.setText("Testar");
        btn_testar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_testarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_senha)
                                .addGap(134, 134, 134)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_dump)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_servidor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_testar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_servidor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_dump, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_testar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_backup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/backup.png"))); // NOI18N
        btn_backup.setText("Backup");
        btn_backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backupActionPerformed(evt);
            }
        });

        btn_restore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/restore.png"))); // NOI18N
        btn_restore.setText("Restore");
        btn_restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_restore, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_backup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_backup, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_restore, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        txt_dump.setText(open().replace("\\", "/"));
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_backupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backupActionPerformed
        validaCampos();
    }//GEN-LAST:event_btn_backupActionPerformed

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        try {
            props = new PropertiesManager();
            props.altera("ip", txt_servidor.getText());
            props.altera("dump", txt_dump.getText());
            props.altera("banco", txt_banco.getText());
            props.altera("usuario", txt_usuario.getText());
            props.altera("senha", txt_senha.getText());
            JOptionPane.showMessageDialog(null, "Informações gravadas com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar as informações!\n" + e);
        }
    }//GEN-LAST:event_btn_gravarActionPerformed

    private void btn_testarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_testarActionPerformed
        if(getConexao(txt_servidor.getText(),
                txt_banco.getText(),
                txt_usuario.getText(),
                txt_senha.getText())!=null){
            JOptionPane.showMessageDialog(null, "Conexão bem sucedida!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados!\n");
        }
    }//GEN-LAST:event_btn_testarActionPerformed

    private void btn_restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restoreActionPerformed
        try {
            st=getConexao(txt_servidor.getText(), txt_banco.getText(), txt_usuario.getText(), txt_senha.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao restaurar o banco de dados!\n"+e);
        }
    }//GEN-LAST:event_btn_restoreActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Frm_Backup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_backup;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_restore;
    private javax.swing.JButton btn_testar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_banco;
    private javax.swing.JTextField txt_dump;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_servidor;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    private void carregaDados() {
        props = new PropertiesManager();
        txt_usuario.setText(props.ler("usuario"));
        txt_senha.setText(props.ler("senha"));
        txt_servidor.setText(props.ler("ip"));
        txt_banco.setText(props.ler("banco"));
        txt_dump.setText(props.ler("dump"));
    }

    private String open() {
        String diretorio = null;
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.CANCEL_OPTION) {
        } else {
            diretorio = fileChooser.getSelectedFile().getPath();
        }
        return diretorio;
    }

    private void validaCampos() {
        if (txt_usuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Usuário inválido!");
            txt_usuario.requestFocus();
        } else {
            if (txt_senha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Senha inválida!");
                txt_senha.requestFocus();
            } else {
                if (txt_banco.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Banco inválido!");
                    txt_banco.requestFocus();
                } else {
                    if (txt_servidor.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Servidor inválido!");
                        txt_servidor.requestFocus();
                    } else {
                        if (txt_dump.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Caminho do executavel DUMP inválido!");
                            txt_dump.requestFocus();
                        } else {
                            mySQLBackup = new MySQLBackup(
                                    txt_usuario.getText(),
                                    txt_senha.getText(),
                                    txt_banco.getText(),
                                    txt_dump.getText());
                        }
                    }
                }
            }
        }
    }

    public Statement getConexao(String servidor, String diretorio, String usuario, String senha) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://" + servidor + ":3306/" + diretorio + "?zeroDateTimeBehavior=convertToNull",
                    usuario,
                    senha);
            st = con.createStatement();
            return st;
        } catch (Exception e) {
            return null;
        }
    }
}
