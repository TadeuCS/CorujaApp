/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aluno;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class AlunoDAO extends Conexao {

    public void salvar(Aluno aluno) {
        em.getTransaction().begin();
        em.merge(aluno);
        em.getTransaction().commit();
    }
    public void remover(Aluno aluno) {
        em.getTransaction().begin();
        em.remove(aluno);
        em.getTransaction().commit();
    }

    public List<Aluno> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Aluno.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Aluno buscar(int codigo) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Aluno.findByCodaluno").setParameter("codaluno", codigo);
        em.getTransaction().commit();
        return (Aluno) query.getSingleResult();
    }
}
