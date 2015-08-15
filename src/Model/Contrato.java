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
@Table(name = "contrato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contrato.findAll", query = "SELECT c FROM Contrato c"),
    @NamedQuery(name = "Contrato.findByCodcontrato", query = "SELECT c FROM Contrato c WHERE c.codcontrato = :codcontrato"),
    @NamedQuery(name = "Contrato.findByDataEmissao", query = "SELECT c FROM Contrato c WHERE c.dataEmissao = :dataEmissao"),
    @NamedQuery(name = "Contrato.findByDataCancelamento", query = "SELECT c FROM Contrato c WHERE c.dataCancelamento = :dataCancelamento")})
public class Contrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODCONTRATO")
    private Integer codcontrato;
    @Basic(optional = false)
    @Column(name = "DATA_EMISSAO")
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;
    @Column(name = "DATA_CANCELAMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataCancelamento;
    @JoinColumn(name = "CODRESPONSAVEL", referencedColumnName = "CODRESPONSAVEL")
    @ManyToOne(optional = false)
    private Responsavel codresponsavel;
    @JoinColumn(name = "CODSTATUS_CONTRATO", referencedColumnName = "CODSTATUS_CONTRATO")
    @ManyToOne(optional = false)
    private StatusContrato codstatusContrato;

    public Contrato() {
    }

    public Contrato(Integer codcontrato) {
        this.codcontrato = codcontrato;
    }

    public Contrato(Integer codcontrato, Date dataEmissao) {
        this.codcontrato = codcontrato;
        this.dataEmissao = dataEmissao;
    }

    public Integer getCodcontrato() {
        return codcontrato;
    }

    public void setCodcontrato(Integer codcontrato) {
        this.codcontrato = codcontrato;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataCancelamento() {
        return dataCancelamento;
    }

    public void setDataCancelamento(Date dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }

    public Responsavel getCodresponsavel() {
        return codresponsavel;
    }

    public void setCodresponsavel(Responsavel codresponsavel) {
        this.codresponsavel = codresponsavel;
    }

    public StatusContrato getCodstatusContrato() {
        return codstatusContrato;
    }

    public void setCodstatusContrato(StatusContrato codstatusContrato) {
        this.codstatusContrato = codstatusContrato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcontrato != null ? codcontrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.codcontrato == null && other.codcontrato != null) || (this.codcontrato != null && !this.codcontrato.equals(other.codcontrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Contrato[ codcontrato=" + codcontrato + " ]";
    }
    
}
