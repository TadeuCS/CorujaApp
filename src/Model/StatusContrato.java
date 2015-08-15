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
@Table(name = "status_contrato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatusContrato.findAll", query = "SELECT s FROM StatusContrato s"),
    @NamedQuery(name = "StatusContrato.findByCodstatusContrato", query = "SELECT s FROM StatusContrato s WHERE s.codstatusContrato = :codstatusContrato"),
    @NamedQuery(name = "StatusContrato.findByDescricao", query = "SELECT s FROM StatusContrato s WHERE s.descricao = :descricao")})
public class StatusContrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODSTATUS_CONTRATO")
    private Integer codstatusContrato;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codstatusContrato")
    private List<Contrato> contratoList;

    public StatusContrato() {
    }

    public StatusContrato(Integer codstatusContrato) {
        this.codstatusContrato = codstatusContrato;
    }

    public StatusContrato(Integer codstatusContrato, String descricao) {
        this.codstatusContrato = codstatusContrato;
        this.descricao = descricao;
    }

    public Integer getCodstatusContrato() {
        return codstatusContrato;
    }

    public void setCodstatusContrato(Integer codstatusContrato) {
        this.codstatusContrato = codstatusContrato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        hash += (codstatusContrato != null ? codstatusContrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusContrato)) {
            return false;
        }
        StatusContrato other = (StatusContrato) object;
        if ((this.codstatusContrato == null && other.codstatusContrato != null) || (this.codstatusContrato != null && !this.codstatusContrato.equals(other.codstatusContrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.StatusContrato[ codstatusContrato=" + codstatusContrato + " ]";
    }
    
}
