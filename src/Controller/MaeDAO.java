/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mae;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class MaeDAO extends Conexao {

    public void salvar(Mae mae) {
        em.getTransaction().begin();
        em.merge(mae);
        em.getTransaction().commit();
    }

    public void remover(Mae mae) {
        em.getTransaction().begin();
        em.remove(mae);
        em.getTransaction().commit();
    }

    public List<Mae> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Mae.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Mae findByCodigo(int codigo) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Mae.findByCodmae").setParameter("codmae", codigo);
        em.getTransaction().commit();
        return (Mae) query.getSingleResult();
    }

}
