/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "aluno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a ORDER BY a.nome"),
    @NamedQuery(name = "Aluno.findByCodaluno", query = "SELECT a FROM Aluno a WHERE a.codaluno = :codaluno"),
    @NamedQuery(name = "Aluno.findByNome", query = "SELECT a FROM Aluno a WHERE a.nome = :nome"),
    @NamedQuery(name = "Aluno.findByEndereco", query = "SELECT a FROM Aluno a WHERE a.endereco = :endereco"),
    @NamedQuery(name = "Aluno.findByBairro", query = "SELECT a FROM Aluno a WHERE a.bairro = :bairro"),
    @NamedQuery(name = "Aluno.findByCidade", query = "SELECT a FROM Aluno a WHERE a.cidade = :cidade"),
    @NamedQuery(name = "Aluno.findByUf", query = "SELECT a FROM Aluno a WHERE a.uf = :uf"),
    @NamedQuery(name = "Aluno.findByDtNascimento", query = "SELECT a FROM Aluno a WHERE a.dtNascimento = :dtNascimento"),
    @NamedQuery(name = "Aluno.findByFone", query = "SELECT a FROM Aluno a WHERE a.fone = :fone"),
    @NamedQuery(name = "Aluno.findByEmail", query = "SELECT a FROM Aluno a WHERE a.email = :email")})
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODALUNO")
    private Integer codaluno;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Basic(optional = false)
    @Column(name = "ENDERECO")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "BAIRRO")
    private String bairro;
    @Basic(optional = false)
    @Column(name = "CIDADE")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "UF")
    private String uf;
    @Basic(optional = true)
    @Column(name = "DT_NASCIMENTO")
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;
    @Basic(optional = true)
    @Column(name = "DT_DESISTENCIA")
    @Temporal(TemporalType.DATE)
    private Date dtDesistencia;
    @Basic(optional = false)
    @Column(name = "FONE")
    private String fone;
    @Column(name = "EMAIL")
    private String email;
    @JoinColumn(name = "CODRESPONSAVEL", referencedColumnName = "CODRESPONSAVEL")
    @ManyToOne(optional = false)
    private Responsavel codresponsavel;
    @JoinColumn(name = "CODMAE", referencedColumnName = "CODMAE")
    @ManyToOne(optional = true)
    private Mae codmae;
    @JoinColumn(name = "CODPAI", referencedColumnName = "CODPAI")
    @ManyToOne(optional = true)
    private Pai codpai;
    @JoinColumn(name = "CODSERIE", referencedColumnName = "CODSERIE")
    @ManyToOne(optional = true)
    private Serie codserie;

    public Aluno() {
    }

    public Aluno(Integer codaluno) {
        this.codaluno = codaluno;
    }

    public Aluno(Integer codaluno, String nome, String endereco, String bairro, String cidade, String uf, Date dtNascimento, String fone) {
        this.codaluno = codaluno;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.dtNascimento = dtNascimento;
        this.fone = fone;
    }

    public Date getDtDesistencia() {
        return dtDesistencia;
    }

    public void setDtDesistencia(Date dtDesistencia) {
        this.dtDesistencia = dtDesistencia;
    }

    public Mae getCodmae() {
        return codmae;
    }

    public void setCodmae(Mae codmae) {
        this.codmae = codmae;
    }

    public Integer getCodaluno() {
        return codaluno;
    }

    public void setCodaluno(Integer codaluno) {
        this.codaluno = codaluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Responsavel getCodresponsavel() {
        return codresponsavel;
    }

    public void setCodresponsavel(Responsavel codresponsavel) {
        this.codresponsavel = codresponsavel;
    }

    public Pai getCodpai() {
        return codpai;
    }

    public void setCodpai(Pai codpai) {
        this.codpai = codpai;
    }

    public Serie getCodserie() {
        return codserie;
    }

    public void setCodserie(Serie codserie) {
        this.codserie = codserie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codaluno != null ? codaluno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.codaluno == null && other.codaluno != null) || (this.codaluno != null && !this.codaluno.equals(other.codaluno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Aluno[ codaluno=" + codaluno + " ]";
    }
    
}
