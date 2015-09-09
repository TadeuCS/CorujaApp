/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "livro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Livro.findAll", query = "SELECT l FROM Livro l"),
    @NamedQuery(name = "Livro.findByCodlivro", query = "SELECT l FROM Livro l WHERE l.codlivro = :codlivro"),
    @NamedQuery(name = "Livro.findByDescricao", query = "SELECT l FROM Livro l WHERE l.descricao = :descricao")})
public class Livro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODLIVRO")
    private Integer codlivro;
    @Basic(optional = false)
    @Column(name = "DESCRICAO",unique = true,nullable = false)
    private String descricao;
    @JoinColumn(name = "CODSERIE", referencedColumnName = "CODSERIE")
    @ManyToOne(optional = false)
    private Serie codserie;

    public Livro() {
    }

    public Livro(Integer codlivro) {
        this.codlivro = codlivro;
    }

    public Livro(Integer codlivro, String descricao) {
        this.codlivro = codlivro;
        this.descricao = descricao;
    }

    public Integer getCodlivro() {
        return codlivro;
    }

    public void setCodlivro(Integer codlivro) {
        this.codlivro = codlivro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        hash += (codlivro != null ? codlivro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livro)) {
            return false;
        }
        Livro other = (Livro) object;
        if ((this.codlivro == null && other.codlivro != null) || (this.codlivro != null && !this.codlivro.equals(other.codlivro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Livro[ codlivro=" + codlivro + " ]";
    }
    
}
