/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "serie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Serie.findAll", query = "SELECT s FROM Serie s"),
    @NamedQuery(name = "Serie.findByCodserie", query = "SELECT s FROM Serie s WHERE s.codserie = :codserie"),
    @NamedQuery(name = "Serie.findByNome", query = "SELECT s FROM Serie s WHERE s.nome = :nome"),
    @NamedQuery(name = "Serie.findByPreco", query = "SELECT s FROM Serie s WHERE s.preco = :preco")})
public class Serie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODSERIE")
    private Integer codserie;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PRECO")
    private BigDecimal preco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codserie")
    private List<Aluno> alunoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codserie")
    private List<Livro> livroList;

    public Serie() {
    }

    public Serie(Integer codserie) {
        this.codserie = codserie;
    }

    public Serie(Integer codserie, String nome, BigDecimal preco) {
        this.codserie = codserie;
        this.nome = nome;
        this.preco = preco;
    }

    public Integer getCodserie() {
        return codserie;
    }

    public void setCodserie(Integer codserie) {
        this.codserie = codserie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @XmlTransient
    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    @XmlTransient
    public List<Livro> getLivroList() {
        return livroList;
    }

    public void setLivroList(List<Livro> livroList) {
        this.livroList = livroList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codserie != null ? codserie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Serie)) {
            return false;
        }
        Serie other = (Serie) object;
        if ((this.codserie == null && other.codserie != null) || (this.codserie != null && !this.codserie.equals(other.codserie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Serie[ codserie=" + codserie + " ]";
    }
    
}
