/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pai;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class PaiDAO extends Conexao {

    public void salvar(Pai pai) {
        em.getTransaction().begin();
        em.merge(pai);
        em.getTransaction().commit();
    }
    public void remover(Pai pai) {
        em.getTransaction().begin();
        em.remove(pai);
        em.getTransaction().commit();
    }

    public List<Pai> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Pai.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Pai findByCodigo(int codigo) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Pai.findByCodpai").setParameter("codpai", codigo);
        em.getTransaction().commit();
        return (Pai) query.getSingleResult();
    }
    public Pai buscar(String cpf) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Pai.findByCpf").setParameter("cpf", cpf);
        em.getTransaction().commit();
        return (Pai) query.getSingleResult();
    }
}
