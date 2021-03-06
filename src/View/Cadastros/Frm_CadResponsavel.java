/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastros;

import Controller.MaeDAO;
import Controller.PaiDAO;
import Controller.ResponsavelDAO;
import Model.Mae;
import Model.Pai;
import Model.Responsavel;
import Util.Classes.LowerDocument;
import Util.Classes.NormalDocument;
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
public class Frm_CadResponsavel extends javax.swing.JFrame {

    PaiDAO paiDAO;
    MaeDAO maeDAO;
    ResponsavelDAO responsavelDAO;
    Responsavel responsavel;

    public Frm_CadResponsavel() {
        initComponents();
        setVisible(true);
        grupoPais.add(rbt_mae);
        grupoPais.add(rbt_pai);
        listaResponsaveis();
        setEnabledButtons(true);
        setFieldsCase();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPais = new javax.swing.ButtonGroup();
        pnl_fundo = new javax.swing.JPanel();
        pnl_pesquisa = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_filtro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_responsaveis = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btn_editar = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_novo = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbt_pai = new javax.swing.JRadioButton();
        rbt_mae = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txt_codigoImportacao = new javax.swing.JTextField();
        btn_importar = new javax.swing.JButton();
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
        txt_celular = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observacao = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        txt_cep = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_bairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_cidade = new javax.swing.JTextField();
        chx_nonoDigito = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Responsável Financeiro");
        setResizable(false);

        pnl_pesquisa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Filtro:");

        txt_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroKeyReleased(evt);
            }
        });

        tb_responsaveis.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_responsaveis.getTableHeader().setReorderingAllowed(false);
        tb_responsaveis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_responsaveisMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_responsaveis);
        if (tb_responsaveis.getColumnModel().getColumnCount() > 0) {
            tb_responsaveis.getColumnModel().getColumn(0).setMinWidth(80);
            tb_responsaveis.getColumnModel().getColumn(0).setPreferredWidth(80);
            tb_responsaveis.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        javax.swing.GroupLayout pnl_pesquisaLayout = new javax.swing.GroupLayout(pnl_pesquisa);
        pnl_pesquisa.setLayout(pnl_pesquisaLayout);
        pnl_pesquisaLayout.setHorizontalGroup(
            pnl_pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnl_pesquisaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_pesquisaLayout.setVerticalGroup(
            pnl_pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
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

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Parâmetros de Importação"));

        rbt_pai.setText("Pai");

        rbt_mae.setText("Mãe");

        jLabel8.setText("Código");

        btn_importar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/carregar.png"))); // NOI18N
        btn_importar.setText("Importar");
        btn_importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_importarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbt_pai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbt_mae)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_codigoImportacao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_importar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbt_pai)
                .addComponent(jLabel8)
                .addComponent(txt_codigoImportacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rbt_mae)
                .addComponent(btn_importar))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        try {
            txt_celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_celular.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setText("Celular *:");

        jLabel13.setText("Observação:");

        txt_observacao.setColumns(20);
        txt_observacao.setRows(5);
        jScrollPane2.setViewportView(txt_observacao);

        jLabel10.setText("CEP *:");

        try {
            txt_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cep.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Endereço *:");

        jLabel11.setText("Bairro *:");

        jLabel12.setText("Cidade *:");

        txt_cidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cidadeFocusLost(evt);
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
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addComponent(txt_telefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chx_nonoDigito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_nome)))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_endereco))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cidade)))
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
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chx_nonoDigito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_pesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnl_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setEnabledButtons(false);
        txt_nome.requestFocus();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        validaCampos();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        if (tb_responsaveis.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Selecione 1 linha de cada vez para Editar!");
        } else {
            setEnabledButtons(false);
            responsavelDAO = new ResponsavelDAO();
            setResponsavelNaTela(responsavelDAO.buscarByCodigo(Integer.parseInt(tb_responsaveis.getValueAt(tb_responsaveis.getSelectedRow(), 0).toString())));
            txt_nome.requestFocus();
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        if (tb_responsaveis.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Selecione 1 linha de cada vez para Apagar!");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente apagar o Responsavel " + tb_responsaveis.getValueAt(tb_responsaveis.getSelectedRow(), 1).toString(), "", 0, 0) == 0) {
                removeResponsavel(Integer.parseInt(tb_responsaveis.getValueAt(tb_responsaveis.getSelectedRow(), 0).toString()));
            }
        }
    }//GEN-LAST:event_btn_apagarActionPerformed

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased
        TableConfig.filtrar(tb_responsaveis, txt_filtro);
    }//GEN-LAST:event_txt_filtroKeyReleased

    private void txt_cidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cidadeFocusLost
        btn_salvar.requestFocus();
    }//GEN-LAST:event_txt_cidadeFocusLost

    private void chx_nonoDigitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chx_nonoDigitoActionPerformed
        if (chx_nonoDigito.isSelected()) {
            try {
                txt_celular.setValue(null);
                MaskFormatter cpf = new MaskFormatter("(##) #####-####");
                txt_celular.setFormatterFactory(
                        new DefaultFormatterFactory(cpf));
                txt_celular.requestFocus();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir o nono digito!\n" + e);
            }
        } else {
            try {
                txt_celular.setValue(null);
                MaskFormatter cpf = new MaskFormatter("(##) ####-####");
                txt_celular.setFormatterFactory(
                        new DefaultFormatterFactory(cpf));
                txt_celular.requestFocus();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir o nono digito!\n" + e);
            }
        }
    }//GEN-LAST:event_chx_nonoDigitoActionPerformed

    private void btn_importarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_importarActionPerformed
        setEnabledButtons(false);
        txt_nome.requestFocus();
        if (txt_codigoImportacao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o código de quem vai importar as informações!");
            txt_codigoImportacao.requestFocus();
        } else {
            paiDAO = new PaiDAO();
            maeDAO = new MaeDAO();
            try {
                if (rbt_pai.isSelected()) {
                    setDadosNaTelaByPai(paiDAO.findByCodigo(Integer.parseInt(txt_codigoImportacao.getText())));
                } else {
                    setDadosNaTelaByMae(maeDAO.findByCodigo(Integer.parseInt(txt_codigoImportacao.getText())));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Código inválido!");
            } finally {
                txt_codigoImportacao.setText(null);
                txt_codigoImportacao.requestFocus();
            }
        }
    }//GEN-LAST:event_btn_importarActionPerformed

    private void tb_responsaveisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_responsaveisMousePressed
        if (tb_responsaveis.getSelectedRowCount() == 1) {
            responsavelDAO = new ResponsavelDAO();
            setResponsavelNaTela(responsavelDAO.buscarByCodigo(Integer.parseInt(tb_responsaveis.getValueAt(tb_responsaveis.getSelectedRow(), 0).toString())));
        }
    }//GEN-LAST:event_tb_responsaveisMousePressed

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
            java.util.logging.Logger.getLogger(Frm_CadResponsavel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_CadResponsavel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_CadResponsavel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_CadResponsavel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Frm_CadResponsavel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_importar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JCheckBox chx_nonoDigito;
    private javax.swing.ButtonGroup grupoPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JPanel pnl_pesquisa;
    private javax.swing.JRadioButton rbt_mae;
    private javax.swing.JRadioButton rbt_pai;
    private javax.swing.JTable tb_responsaveis;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JFormattedTextField txt_celular;
    private javax.swing.JFormattedTextField txt_cep;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_codigoImportacao;
    private javax.swing.JFormattedTextField txt_cpf;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextArea txt_observacao;
    private javax.swing.JFormattedTextField txt_telefone;
    // End of variables declaration//GEN-END:variables

    private void setEnabledFields(boolean b) {
        txt_nome.setEnabled(b);
        txt_telefone.setEnabled(b);
        txt_celular.setEnabled(b);
        txt_cpf.setEnabled(b);
        txt_email.setEnabled(b);
        txt_observacao.setEnabled(b);
        txt_filtro.setEnabled(!b);
        txt_cep.setEnabled(b);
        txt_endereco.setEnabled(b);
        txt_bairro.setEnabled(b);
        txt_cidade.setEnabled(b);
        chx_nonoDigito.setEnabled(b);
    }

    private void setEnabledButtons(boolean b) {
        btn_novo.setEnabled(b);
        btn_editar.setEnabled(b);
        btn_apagar.setEnabled(b);
        btn_salvar.setEnabled(!b);
        btn_cancelar.setEnabled(!b);
        tb_responsaveis.setEnabled(b);
        setEnabledFields(!b);
    }

    private void salvar() {
        try {
            responsavel = new Responsavel();
            if (!txt_codigo.getText().isEmpty()) {
                responsavel.setCodresponsavel(Integer.parseInt(txt_codigo.getText()));
            }
            responsavel.setNome(txt_nome.getText());
            responsavel.setFone(txt_telefone.getText());
            responsavel.setCelular(txt_celular.getText());
            responsavel.setCpf(txt_cpf.getText());
            if (!txt_email.getText().isEmpty()) {
                responsavel.setEmail(txt_email.getText());
            }
            if (!txt_observacao.getText().isEmpty()) {
                responsavel.setObservacao(txt_observacao.getText());
            }
            responsavel.setCep(txt_cep.getText());
            responsavel.setEndereco(txt_endereco.getText());
            responsavel.setBairro(txt_bairro.getText());
            responsavel.setCidade(txt_cidade.getText());

            responsavelDAO = new ResponsavelDAO();
            responsavelDAO.salvar(responsavel);
            JOptionPane.showMessageDialog(null, "Responsavel salvo com sucesso!\n");
            limparCampos();
        } catch (Exception ex) {
            if (ex.toString().contains("com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException")) {
                JOptionPane.showMessageDialog(null, "Já existe um Responsável cadastrado com este CPF!");
                txt_cpf.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar o Responsável!\n" + ex);
            }
        } finally {
            listaResponsaveis();
        }
    }

    private void limparCampos() {
        txt_codigo.setText(null);
        txt_nome.setText(null);
        txt_telefone.setText(null);
        txt_celular.setText(null);
        txt_cpf.setText(null);
        txt_email.setText(null);
        txt_observacao.setText(null);
        txt_filtro.setText(null);
        txt_cep.setText(null);
        txt_endereco.setText(null);
        txt_bairro.setText(null);
        txt_cidade.setText(null);
        chx_nonoDigito.setSelected(false);
        setEnabledButtons(true);
    }

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

    private void removeResponsavel(int codigo) {
        try {
            responsavelDAO = new ResponsavelDAO();
            responsavelDAO.remove(responsavelDAO.buscarByCodigo(codigo));
            TableConfig.getModel(tb_responsaveis).removeRow(tb_responsaveis.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Responsável removido com sucesso!\n");
            setEnabledButtons(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover o Responsável!\n" + e);
        }
    }

    private void validaCampos() {
        if (txt_nome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome inválido!");
            txt_nome.requestFocus();
        } else {
            if (txt_telefone.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Telefone inválido!");
                txt_telefone.requestFocus();
            } else {
                if (txt_celular.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Celular inválido!");
                    txt_celular.requestFocus();
                } else {
                    if (ValidarCGCCPF.validaCPF(txt_cpf.getText()) == false) {
                        JOptionPane.showMessageDialog(null, "CPF inválido!");
                        txt_cpf.requestFocus();
                    } else {
                        if (txt_cep.getText().replace("-", "").trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "CEP inválido!");
                            txt_cep.requestFocus();
                        } else {
                            if (txt_endereco.getText().isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Endereço inválido!");
                                txt_endereco.requestFocus();
                            } else {
                                if (txt_bairro.getText().isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Bairro inválido!");
                                    txt_bairro.requestFocus();
                                } else {
                                    if (txt_bairro.getText().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Cidade inválida!");
                                        txt_cidade.requestFocus();
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
    }

    private void setResponsavelNaTela(Responsavel resp) {
        try {
            txt_codigo.setText(resp.getCodresponsavel().toString());
            txt_nome.setText(resp.getNome());
            txt_telefone.setText(resp.getFone());
            if (resp.getCelular().replace("(", "").replace(")", "").replace("-", "").replace(" ", "").length() < 11) {
                chx_nonoDigito.setSelected(false);
                trataNonoDigito();
                if (resp.getCelular().replace("(", "").replace(")", "").replace("-", "").replace(" ", "").length() == 8) {
                    txt_celular.setText("34" + resp.getCelular().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
                } else {
                    if (resp.getFone().replace("(", "").replace(")", "").replace("-", "").replace(" ", "").length() == 10) {
                        txt_telefone.setText(resp.getFone().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
                    }
                }
            } else {
                chx_nonoDigito.setSelected(true);
                trataNonoDigito();
                txt_celular.setText(resp.getCelular().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
            }
            txt_cpf.setText(resp.getCpf().replace(".", "").replace("/", "").replace("-", ""));
            if (resp.getEmail() != null) {
                txt_email.setText(resp.getEmail());
            }
            if (resp.getObservacao() != null) {
                txt_observacao.setText(resp.getObservacao());
            }
            txt_cep.setText(resp.getCep());
            txt_endereco.setText(resp.getEndereco());
            txt_bairro.setText(resp.getBairro());
            txt_cidade.setText(resp.getCidade());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados do Responsavel na tela!\n" + e);
        }
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

    private void setFieldsCase() {
        txt_nome.setDocument(new UpperDocument(255));
        txt_email.setDocument(new LowerDocument(255));
        txt_observacao.setDocument(new NormalDocument(255));
        txt_endereco.setDocument(new UpperDocument(255));
        txt_bairro.setDocument(new UpperDocument(255));
        txt_cidade.setDocument(new UpperDocument(255));
    }

    private void setDadosNaTelaByPai(Pai resp) {
        txt_nome.setText(resp.getNome());
        txt_telefone.setText(resp.getFone());
        txt_cpf.setText(resp.getCpf());
        txt_email.setText(resp.getEmail());
        txt_celular.requestFocus();
    }

    private void setDadosNaTelaByMae(Mae mae) {
        txt_nome.setText(mae.getNome());
        txt_telefone.setText(mae.getFone());
        txt_cpf.setText(mae.getCpf());
        txt_email.setText(mae.getEmail());
        txt_celular.requestFocus();
    }
}
