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
@Table(name = "pai")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pai.findAll", query = "SELECT p FROM Pai p"),
    @NamedQuery(name = "Pai.findByCodpai", query = "SELECT p FROM Pai p WHERE p.codpai = :codpai"),
    @NamedQuery(name = "Pai.findByNome", query = "SELECT p FROM Pai p WHERE p.nome = :nome"),
    @NamedQuery(name = "Pai.findByFone", query = "SELECT p FROM Pai p WHERE p.fone = :fone"),
    @NamedQuery(name = "Pai.findByEmail", query = "SELECT p FROM Pai p WHERE p.email = :email"),
    @NamedQuery(name = "Pai.findByCpf", query = "SELECT p FROM Pai p WHERE p.cpf = :cpf")})
public class Pai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODPAI")
    private Integer codpai;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Column(name = "FONE")
    private String fone;
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "CPF", nullable = false)
    private String cpf;
    @OneToMany(mappedBy = "codpai")
    private List<Aluno> alunoList;

    public Pai() {
    }

    public Pai(Integer codpai) {
        this.codpai = codpai;
    }

    public Pai(Integer codpai, String nome, String cpf, Character sexo) {
        this.codpai = codpai;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Integer getCodpai() {
        return codpai;
    }

    public void setCodpai(Integer codpai) {
        this.codpai = codpai;
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

    @XmlTransient
    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codpai != null ? codpai.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pai)) {
            return false;
        }
        Pai other = (Pai) object;
        if ((this.codpai == null && other.codpai != null) || (this.codpai != null && !this.codpai.equals(other.codpai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Pai[ codpai=" + codpai + " ]";
    }

}
