/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "responsavel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Responsavel.findAll", query = "SELECT r FROM Responsavel r"),
    @NamedQuery(name = "Responsavel.findByCodresponsavel", query = "SELECT r FROM Responsavel r WHERE r.codresponsavel = :codresponsavel"),
    @NamedQuery(name = "Responsavel.findByNome", query = "SELECT r FROM Responsavel r WHERE r.nome = :nome"),
    @NamedQuery(name = "Responsavel.findByCpf", query = "SELECT r FROM Responsavel r WHERE r.cpf = :cpf"),
    @NamedQuery(name = "Responsavel.findByEndereco", query = "SELECT r FROM Responsavel r WHERE r.endereco = :endereco"),
    @NamedQuery(name = "Responsavel.findByBairro", query = "SELECT r FROM Responsavel r WHERE r.bairro = :bairro"),
    @NamedQuery(name = "Responsavel.findByCidade", query = "SELECT r FROM Responsavel r WHERE r.cidade = :cidade"),
    @NamedQuery(name = "Responsavel.findByCep", query = "SELECT r FROM Responsavel r WHERE r.cep = :cep"),
    @NamedQuery(name = "Responsavel.findByFone", query = "SELECT r FROM Responsavel r WHERE r.fone = :fone"),
    @NamedQuery(name = "Responsavel.findByEmail", query = "SELECT r FROM Responsavel r WHERE r.email = :email"),
    @NamedQuery(name = "Responsavel.findByCelular", query = "SELECT r FROM Responsavel r WHERE r.celular = :celular"),
    @NamedQuery(name = "Responsavel.findByObservacao", query = "SELECT r FROM Responsavel r WHERE r.observacao = :observacao")})
public class Responsavel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODRESPONSAVEL")
    private Integer codresponsavel;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Basic(optional = false)
    @Column(name = "CPF")
    private String cpf;
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
    @Column(name = "CEP")
    private String cep;
    @Column(name = "FONE")
    private String fone;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "CELULAR")
    private String celular;
    @Column(name = "OBSERVACAO")
    private String observacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codresponsavel")
    private List<Aluno> alunoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codresponsavel")
    private List<Contrato> contratoList;

    public Responsavel() {
    }

    public Responsavel(Integer codresponsavel) {
        this.codresponsavel = codresponsavel;
    }

    public Responsavel(Integer codresponsavel, String nome, String cpf, String endereco, String bairro, String cidade, String cep) {
        this.codresponsavel = codresponsavel;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public Integer getCodresponsavel() {
        return codresponsavel;
    }

    public void setCodresponsavel(Integer codresponsavel) {
        this.codresponsavel = codresponsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @XmlTransient
    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    @XmlTransient
    public List<Contrato> getContratoList() {
        return contratoList;
    }

    public void setContratoList(List<Contrato> contratoList) {
        this.contratoList = contratoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codresponsavel != null ? codresponsavel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Responsavel)) {
            return false;
        }
        Responsavel other = (Responsavel) object;
        if ((this.codresponsavel == null && other.codresponsavel != null) || (this.codresponsavel != null && !this.codresponsavel.equals(other.codresponsavel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Responsavel[ codresponsavel=" + codresponsavel + " ]";
    }
    
}
