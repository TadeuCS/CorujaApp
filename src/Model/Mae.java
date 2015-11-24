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
@Table(name = "mae")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mae.findAll", query = "SELECT p FROM Mae p ORDER BY p.nome"),
    @NamedQuery(name = "Mae.findByCodmae", query = "SELECT p FROM Mae p WHERE p.codmae = :codmae"),
    @NamedQuery(name = "Mae.findByNome", query = "SELECT p FROM Mae p WHERE p.nome = :nome"),
    @NamedQuery(name = "Mae.findByFone", query = "SELECT p FROM Mae p WHERE p.fone = :fone"),
    @NamedQuery(name = "Mae.findByEmail", query = "SELECT p FROM Mae p WHERE p.email = :email"),
    @NamedQuery(name = "Mae.findByCpf", query = "SELECT p FROM Mae p WHERE p.cpf = :cpf")})
public class Mae implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODMAE")
    private Integer codmae;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Column(name = "FONE", nullable = true)
    private String fone;
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "CPF", nullable = false)
    private String cpf;
    @OneToMany(mappedBy = "codmae")
    private List<Aluno> alunoList;

    public Mae() {
    }

    public Mae(Integer codmae) {
        this.codmae = codmae;
    }

    public Mae(Integer codmae, String nome, String cpf, Character sexo) {
        this.codmae = codmae;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Integer getCodmae() {
        return codmae;
    }

    public void setCodmae(Integer codmae) {
        this.codmae = codmae;
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
        hash += (codmae != null ? codmae.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mae)) {
            return false;
        }
        Mae other = (Mae) object;
        if ((this.codmae == null && other.codmae != null) || (this.codmae != null && !this.codmae.equals(other.codmae))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Mae[ codmae=" + codmae + " ]";
    }

}
