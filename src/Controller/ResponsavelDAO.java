/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Responsavel;
import Util.Classes.Conexao;
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

    public List<Responsavel> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Responsavel.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Responsavel buscar(String cpf) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Responsavel.findByCpf").setParameter("cpf", cpf);
        em.getTransaction().commit();
        return (Responsavel) query.getSingleResult();
    }
}
