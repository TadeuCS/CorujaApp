/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "pessoa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pessoa.findAll", query = "SELECT p FROM Pessoa p"),
    @NamedQuery(name = "Pessoa.findByCodpessoa", query = "SELECT p FROM Pessoa p WHERE p.codpessoa = :codpessoa"),
    @NamedQuery(name = "Pessoa.findByNome", query = "SELECT p FROM Pessoa p WHERE p.nome = :nome"),
    @NamedQuery(name = "Pessoa.findByFone", query = "SELECT p FROM Pessoa p WHERE p.fone = :fone"),
    @NamedQuery(name = "Pessoa.findByEmail", query = "SELECT p FROM Pessoa p WHERE p.email = :email"),
    @NamedQuery(name = "Pessoa.findByCpf", query = "SELECT p FROM Pessoa p WHERE p.cpf = :cpf"),
    @NamedQuery(name = "Pessoa.findBySexo", query = "SELECT p FROM Pessoa p WHERE p.sexo = :sexo")})
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODPESSOA")
    private Integer codpessoa;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Column(name = "FONE")
    private String fone;
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "CPF",unique = true,nullable = false)
    private String cpf;
    @Basic(optional = false)
    @Column(name = "SEXO",nullable = false)
    private Character sexo;
    @OneToMany(mappedBy = "codmae")
    private List<Aluno> alunoList;
    @OneToMany(mappedBy = "codpai")
    private List<Aluno> alunoList1;

    public Pessoa() {
    }

    public Pessoa(Integer codpessoa) {
        this.codpessoa = codpessoa;
    }

    public Pessoa(Integer codpessoa, String nome, String cpf, Character sexo) {
        this.codpessoa = codpessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public Integer getCodpessoa() {
        return codpessoa;
    }

    public void setCodpessoa(Integer codpessoa) {
        this.codpessoa = codpessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    @XmlTransient
    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    @XmlTransient
    public List<Aluno> getAlunoList1() {
        return alunoList1;
    }

    public void setAlunoList1(List<Aluno> alunoList1) {
        this.alunoList1 = alunoList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codpessoa != null ? codpessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.codpessoa == null && other.codpessoa != null) || (this.codpessoa != null && !this.codpessoa.equals(other.codpessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Pessoa[ codpessoa=" + codpessoa + " ]";
    }
    
}
