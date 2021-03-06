/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Responsavel;
import Util.Classes.Conexao;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class ResponsavelDAO extends Conexao {

    public void salvar(Responsavel responsavel) {
        em.getTransaction().begin();
        em.merge(responsavel);
        em.getTransaction().commit();
    }

    public void remove(Responsavel responsavel) {
        em.getTransaction().begin();
        em.remove(responsavel);
        em.getTransaction().commit();
    }

    public List<Responsavel> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Responsavel.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }
    public List<Responsavel> listarTodosComSerie() {
        em.getTransaction().begin();
        query = em.createQuery("SELECT r FROM Responsavel r INNER JOIN r.alunoList AS a on a.codserie is not null GROUP BY r.codresponsavel");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Responsavel buscarByCodigo(int codigo) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Responsavel.findByCodresponsavel").setParameter("codresponsavel", codigo);
        em.getTransaction().commit();
        return (Responsavel) query.getSingleResult();
    }

    public double retornaTotalAPrazoByCodigo(int codigo) {
        em.getTransaction().begin();
        query = em.createNativeQuery("select\n"
                + "sum(s.`PRECO`)\n"
                + "from aluno a\n"
                + "inner join responsavel r on a.CODRESPONSAVEL=r.CODRESPONSAVEL\n"
                + "inner join serie s on s.CODSERIE=a.CODSERIE where a.codresponsavel="+codigo+";");
        em.getTransaction().commit();
        return (double) query.getSingleResult();
    }

    public Responsavel buscarByCPF(String cpf) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Responsavel.findByCpf").setParameter("cpf", cpf);
        em.getTransaction().commit();
        return (Responsavel) query.getSingleResult();
    }
}
