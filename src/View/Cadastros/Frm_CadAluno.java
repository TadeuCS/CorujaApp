/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastros;

import Controller.AlunoDAO;
import Controller.PaiDAO;
import Controller.MaeDAO;
import Controller.ResponsavelDAO;
import Controller.SerieDAO;
import Model.Aluno;
import Model.Mae;
import Model.Pai;
import Model.Responsavel;
import Model.Serie;
import Util.Classes.Data;
import Util.Classes.LowerDocument;
import Util.Classes.TableConfig;
import Util.Classes.UpperDocument;
import java.awt.Event;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Tadeu
 */
public class Frm_CadAluno extends javax.swing.JFrame {

    PaiDAO paiDAO;
    MaeDAO maeDAO;
    SerieDAO serieDAO;
    ResponsavelDAO responsavelDAO;
    AlunoDAO alunoDAO;
    Aluno aluno;
    List<Responsavel> responsaveis = new ArrayList<>();
    List<Pai> pais = new ArrayList<>();
    List<Mae> maes = new ArrayList<>();

    public Frm_CadAluno() {
        initComponents();
        setVisible(true);
        setEnabledButtons(true);
        carregaSeries();
        carregaPais();
        carregaMaes();
        carregaResponsavel();
        listaAlunos();
        setFieldsCase();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btn_cadSerie = new javax.swing.JButton();
        btn_cadPai = new javax.swing.JButton();
        btn_cadMae = new javax.swing.JButton();
        btn_cadResponsavel = new javax.swing.JButton();
        chx_nonoDigito = new javax.swing.JCheckBox();
        lb_idade = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_dataDesistencia = new javax.swing.JFormattedTextField();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        pnl_pesquisaAluno = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txt_filtro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_alunos = new javax.swing.JTable();
        btn_editar = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Aluno");
        setResizable(false);

        pnl_cadastroAluno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Código:");

        jLabel10.setText("Email:");

        jLabel11.setText("Telefone *:");

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
        txt_dataNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_dataNascimentoFocusLost(evt);
            }
        });
        txt_dataNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_dataNascimentoKeyPressed(evt);
            }
        });

        txt_codigo.setEnabled(false);

        jLabel13.setText("Data Nascimento:");

        jLabel14.setText("Pai:");

        jLabel2.setText("Nome *:");

        cbx_pai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbx_paiMousePressed(evt);
            }
        });

        jLabel4.setText("Endereço :*");

        cbx_mae.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbx_maeMousePressed(evt);
            }
        });

        jLabel15.setText("Mãe:");

        jLabel16.setText("Responsavel *:");

        cbx_responsavel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbx_responsavelMousePressed(evt);
            }
        });

        jLabel17.setText("Série:");

        jLabel6.setText("Bairro *:");

        cbx_serie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbx_serieMousePressed(evt);
            }
        });

        jLabel8.setText("Cidade *:");

        jLabel9.setText(" Estado *:");

        btn_cadSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cadastro.png"))); // NOI18N
        btn_cadSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadSerieActionPerformed(evt);
            }
        });

        btn_cadPai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cadastro.png"))); // NOI18N
        btn_cadPai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadPaiActionPerformed(evt);
            }
        });

        btn_cadMae.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cadastro.png"))); // NOI18N
        btn_cadMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadMaeActionPerformed(evt);
            }
        });

        btn_cadResponsavel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cadastro.png"))); // NOI18N
        btn_cadResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadResponsavelActionPerformed(evt);
            }
        });

        chx_nonoDigito.setText("9 digitos");
        chx_nonoDigito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chx_nonoDigitoActionPerformed(evt);
            }
        });

        lb_idade.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        lb_idade.setForeground(new java.awt.Color(0, 51, 102));
        lb_idade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_idade.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setText("Idade:");

        jLabel20.setText("Data desistência:");

        try {
            txt_dataDesistencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_dataDesistencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dataDesistencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_dataDesistenciaFocusLost(evt);
            }
        });
        txt_dataDesistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_dataDesistenciaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nome))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_cidade)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cadResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_bairro)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chx_nonoDigito)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_dataDesistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(402, 402, 402)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(cbx_serie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cadSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_pai, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cadPai, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_mae, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cadMae, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_endereco, javax.swing.GroupLayout.Alignment.TRAILING))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cadSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_cadPai, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cadMae, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(cbx_pai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)
                                .addComponent(cbx_mae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17)
                                .addComponent(cbx_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(cbx_responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_cadResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txt_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(chx_nonoDigito)
                            .addComponent(jLabel19)
                            .addComponent(txt_dataDesistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lb_idade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/adicionar.png"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/salvar.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cancelar.png"))); // NOI18N
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
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        txt_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroKeyReleased(evt);
            }
        });

        tb_alunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Responsavel", "Pai", "Mãe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_alunos.getTableHeader().setReorderingAllowed(false);
        tb_alunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_alunosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_alunos);
        if (tb_alunos.getColumnModel().getColumnCount() > 0) {
            tb_alunos.getColumnModel().getColumn(0).setMinWidth(80);
            tb_alunos.getColumnModel().getColumn(0).setPreferredWidth(80);
            tb_alunos.getColumnModel().getColumn(0).setMaxWidth(80);
        }

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

        javax.swing.GroupLayout pnl_pesquisaAlunoLayout = new javax.swing.GroupLayout(pnl_pesquisaAluno);
        pnl_pesquisaAluno.setLayout(pnl_pesquisaAlunoLayout);
        pnl_pesquisaAlunoLayout.setHorizontalGroup(
            pnl_pesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pesquisaAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_pesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnl_pesquisaAlunoLayout.createSequentialGroup()
                        .addGroup(pnl_pesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_pesquisaAlunoLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_pesquisaAlunoLayout.createSequentialGroup()
                                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(btn_editar)
                    .addComponent(btn_apagar))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_cadastroAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_pesquisaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
        setEnabledButtons(false);
        txt_nome.requestFocus();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        limpaCampos();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        validaCampos();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_cadSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadSerieActionPerformed
        Frm_CadSerie f = new Frm_CadSerie();
    }//GEN-LAST:event_btn_cadSerieActionPerformed

    private void btn_cadPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadPaiActionPerformed
        Frm_CadPai f = new Frm_CadPai();
    }//GEN-LAST:event_btn_cadPaiActionPerformed

    private void btn_cadMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadMaeActionPerformed
        Frm_CadMae f = new Frm_CadMae();
    }//GEN-LAST:event_btn_cadMaeActionPerformed

    private void btn_cadResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadResponsavelActionPerformed
        Frm_CadResponsavel f = new Frm_CadResponsavel();
    }//GEN-LAST:event_btn_cadResponsavelActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        if (tb_alunos.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Selecione 1 linha de cada vez para Editar!");
        } else {
            setEnabledButtons(false);
            setAlunoNaTela(alunoDAO.buscar(Integer.parseInt(tb_alunos.getValueAt(tb_alunos.getSelectedRow(), 0).toString())));
            txt_nome.requestFocus();
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        if (tb_alunos.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Selecione 1 linha de cada vez para Apagar!");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente apagar o Aluno " + tb_alunos.getValueAt(tb_alunos.getSelectedRow(), 1).toString(), "", 0, 0) == 0) {
                removeAluno(Integer.parseInt(tb_alunos.getValueAt(tb_alunos.getSelectedRow(), 0).toString()));
            }
        }
    }//GEN-LAST:event_btn_apagarActionPerformed

    private void txt_dataNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_dataNascimentoFocusLost
        btn_salvar.requestFocus();
    }//GEN-LAST:event_txt_dataNascimentoFocusLost

    private void cbx_serieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_serieMousePressed
        carregaSeries();
    }//GEN-LAST:event_cbx_serieMousePressed

    private void cbx_paiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_paiMousePressed
        carregaPais();
    }//GEN-LAST:event_cbx_paiMousePressed

    private void cbx_maeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_maeMousePressed
        carregaMaes();
    }//GEN-LAST:event_cbx_maeMousePressed

    private void cbx_responsavelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_responsavelMousePressed
        carregaResponsavel();
    }//GEN-LAST:event_cbx_responsavelMousePressed

    private void txt_dataNascimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dataNascimentoKeyPressed
        if (evt.getKeyCode() == Event.ENTER) {
            Data data = new Data();
            txt_dataNascimento.setText(data.completaData(txt_dataNascimento.getText(), "dd/MM/yyyy"));
        }
    }//GEN-LAST:event_txt_dataNascimentoKeyPressed

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

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased
        TableConfig.filtrar(tb_alunos, txt_filtro);
    }//GEN-LAST:event_txt_filtroKeyReleased

    private void tb_alunosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_alunosMousePressed
        if (tb_alunos.getSelectedRowCount() == 1) {
            setAlunoNaTela(alunoDAO.buscar(Integer.parseInt(tb_alunos.getValueAt(tb_alunos.getSelectedRow(), 0).toString())));
        }
    }//GEN-LAST:event_tb_alunosMousePressed

    private void txt_dataDesistenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_dataDesistenciaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dataDesistenciaFocusLost

    private void txt_dataDesistenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dataDesistenciaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dataDesistenciaKeyPressed

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
//                new Frm_CadAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_cadMae;
    private javax.swing.JButton btn_cadPai;
    private javax.swing.JButton btn_cadResponsavel;
    private javax.swing.JButton btn_cadSerie;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox cbx_mae;
    private javax.swing.JComboBox cbx_pai;
    private javax.swing.JComboBox cbx_responsavel;
    private javax.swing.JComboBox cbx_serie;
    private javax.swing.JCheckBox chx_nonoDigito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_idade;
    private javax.swing.JPanel pnl_cadastroAluno;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JPanel pnl_pesquisaAluno;
    private javax.swing.JTable tb_alunos;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JFormattedTextField txt_dataDesistencia;
    private javax.swing.JFormattedTextField txt_dataNascimento;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JFormattedTextField txt_telefone;
    // End of variables declaration//GEN-END:variables

    private void setEnabledFields(boolean tipo) {
        chx_nonoDigito.setEnabled(tipo);
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
        txt_dataDesistencia.setEnabled(tipo);
        cbx_responsavel.setEnabled(tipo);
    }

    private void setEnabledButtons(boolean tipo) {
        btn_novo.setEnabled(tipo);
        btn_editar.setEnabled(tipo);
        btn_apagar.setEnabled(tipo);
        btn_cadMae.setEnabled(!tipo);
        btn_cadPai.setEnabled(!tipo);
        btn_cadResponsavel.setEnabled(!tipo);
        btn_cadSerie.setEnabled(!tipo);
        btn_salvar.setEnabled(!tipo);
        btn_cancelar.setEnabled(!tipo);
        tb_alunos.setEnabled(tipo);
        setEnabledFields(!tipo);
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
        txt_dataDesistencia.setText(null);
        txt_filtro.setText(null);
        cbx_pai.setSelectedIndex(0);
        cbx_mae.setSelectedIndex(0);
        cbx_serie.setSelectedIndex(0);
        cbx_responsavel.setSelectedIndex(0);
        setEnabledButtons(true);
    }

    private void carregaSeries() {
        try {
            cbx_serie.removeAllItems();
            cbx_serie.addItem("Selecione uma Série");
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
            cbx_pai.addItem("Selecione um Pai");
            paiDAO = new PaiDAO();
            pais = paiDAO.listar();
            for (Pai pai : pais) {
                cbx_pai.addItem(pai.getNome());
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
                                if (cbx_responsavel.getSelectedItem() == null) {
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

    private void salvar() {
        try {
            serieDAO = new SerieDAO();
            responsavelDAO = new ResponsavelDAO();
            alunoDAO = new AlunoDAO();
            aluno = new Aluno();
            if (!txt_codigo.getText().isEmpty()) {
                aluno.setCodaluno(Integer.parseInt(txt_codigo.getText()));
            }
            aluno.setNome(txt_nome.getText().trim());
            if (cbx_serie.getSelectedIndex() != 0) {
                aluno.setCodserie(serieDAO.buscar(cbx_serie.getSelectedItem().toString()));
            }
            if (cbx_pai.getSelectedIndex() != 0) {
                aluno.setCodpai(pais.get(cbx_pai.getSelectedIndex() - 1));
            }
            if (cbx_mae.getSelectedIndex() != 0) {
                aluno.setCodmae(maes.get(cbx_mae.getSelectedIndex() - 1));
            }
            aluno.setEndereco(txt_endereco.getText().trim());
            aluno.setBairro(txt_bairro.getText().trim());
            if (!txt_email.getText().isEmpty()) {
                aluno.setEmail(txt_email.getText().trim());
            }
            aluno.setCidade(txt_cidade.getText().trim());
            aluno.setUf(txt_estado.getText().trim());
            aluno.setCodresponsavel(responsaveis.get(cbx_responsavel.getSelectedIndex()));
            if (!txt_telefone.getText().isEmpty()) {
                aluno.setFone(txt_telefone.getText());
            }
            if (txt_dataNascimento.getText().replace("/", "").trim().isEmpty()) {
                aluno.setDtNascimento(null);
            } else {
                aluno.setDtNascimento(Data.getDataByTexto(txt_dataNascimento.getText(), "dd/MM/yyyy"));
            }
            if (txt_dataDesistencia.getText().replace("/", "").trim().isEmpty()) {
                aluno.setDtDesistencia(null);
            } else {
                aluno.setDtDesistencia(Data.getDataByTexto(txt_dataDesistencia.getText(), "dd/MM/yyyy"));
            }
            alunoDAO.salvar(aluno);
            JOptionPane.showMessageDialog(null, "Aluno Salvo com sucesso!");
            limpaCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o Aluno!\n" + e);
        } finally {
            listaAlunos();
        }
    }

    private void listaAlunos() {
        try {
            alunoDAO = new AlunoDAO();
            TableConfig.limpaTabela(tb_alunos);
            for (Aluno aluno : alunoDAO.listar()) {
                String pai;
                String mae;
                if (aluno.getCodpai() == null) {
                    pai = "";
                } else {
                    pai = aluno.getCodpai().getNome();
                }
                if (aluno.getCodmae() == null) {
                    mae = "";
                } else {
                    mae = aluno.getCodmae().getNome();
                }

                String[] linha = new String[]{aluno.getCodaluno().toString(), aluno.getNome(),
                    aluno.getCodresponsavel().getNome(), pai, mae};
                TableConfig.getModel(tb_alunos).addRow(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os Alunos!\n" + e);
        }
    }

    private void setAlunoNaTela(Aluno aluno) {
        try {
            txt_codigo.setText(aluno.getCodaluno().toString());
            txt_nome.setText(aluno.getNome());
            if (aluno.getCodserie() != null) {
                cbx_serie.setSelectedItem(aluno.getCodserie().getNome());
            } else {
                cbx_serie.setSelectedIndex(0);
            }
            if (aluno.getCodmae() == null) {
                cbx_mae.setSelectedIndex(0);
            } else {
                cbx_mae.setSelectedIndex(getMaeByAluno(aluno) + 1);
            }
            if (aluno.getCodpai() == null) {
                cbx_pai.setSelectedIndex(0);
            } else {
                cbx_pai.setSelectedIndex(getPaiByAluno(aluno) + 1);
            }
            txt_endereco.setText(aluno.getEndereco());
            txt_bairro.setText(aluno.getBairro());
            txt_cidade.setText(aluno.getCidade());
            txt_estado.setText(aluno.getUf());
            if (aluno.getEmail() != null) {
                txt_email.setText(aluno.getEmail());
            }
            cbx_responsavel.setSelectedItem(aluno.getCodresponsavel().getNome());
            if (aluno.getFone().replace("(", "").replace(")", "").replace("-", "").replace(" ", "").length() < 11) {
                chx_nonoDigito.setSelected(false);
                trataNonoDigito();
                if (aluno.getFone().replace("(", "").replace(")", "").replace("-", "").replace(" ", "").length() == 8) {
                    txt_telefone.setText("34" + aluno.getFone().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
                } else {
                    if (aluno.getFone().replace("(", "").replace(")", "").replace("-", "").replace(" ", "").length() == 10) {
                        txt_telefone.setText(aluno.getFone().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
                    }
                }
            } else {
                chx_nonoDigito.setSelected(true);
                trataNonoDigito();
                txt_telefone.setText(aluno.getFone().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
            }
            if (aluno.getDtNascimento() != null) {
                txt_dataNascimento.setText(Data.getDataByDate(aluno.getDtNascimento(), "dd/MM/yyyy"));
                lb_idade.setText(Data.getIdade(aluno.getDtNascimento()));
            }
            if (aluno.getDtDesistencia()!= null) {
                txt_dataDesistencia.setText(Data.getDataByDate(aluno.getDtDesistencia(), "dd/MM/yyyy"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o Aluno na tela!\n" + e);
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

    private void removeAluno(int codigo) {
        try {
            alunoDAO = new AlunoDAO();
            alunoDAO.remover(alunoDAO.buscar(codigo));
            TableConfig.getModel(tb_alunos).removeRow(tb_alunos.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!\n");
            setEnabledButtons(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover o Aluno!\n" + e);
        }
    }

    private int getMaeByAluno(Aluno aluno) {
        int retorno = 0;
        for (int i = 0; i < maes.size(); i++) {
            if (aluno.getCodmae().equals(maes.get(i)) == true) {
                retorno = i;
            }
        }
        return retorno;
    }

    private int getPaiByAluno(Aluno aluno) {
        int retorno = 0;
        for (int i = 0; i < pais.size(); i++) {
            if (aluno.getCodpai().equals(pais.get(i)) == true) {
                retorno = i;
            }
        }
        return retorno;
    }

    private void setFieldsCase() {
        txt_nome.setDocument(new UpperDocument(255));
        txt_endereco.setDocument(new UpperDocument(255));
        txt_bairro.setDocument(new UpperDocument(255));
        txt_cidade.setDocument(new UpperDocument(255));
        txt_estado.setDocument(new UpperDocument(2));
        txt_email.setDocument(new LowerDocument(255));
    }

    private void carregaMaes() {
        try {
            cbx_mae.removeAllItems();
            cbx_mae.addItem("Selecione uma Mãe");
            maeDAO = new MaeDAO();
            maes = maeDAO.listar();
            for (Mae mae : maes) {
                cbx_mae.addItem(mae.getNome());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao carregar as Mães!\n" + e);
        }
    }
}
