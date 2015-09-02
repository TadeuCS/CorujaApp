/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pessoa;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class PessoaDAO extends Conexao {

    public void salvar(Pessoa pessoa) {
        em.getTransaction().begin();
        em.merge(pessoa);
        em.getTransaction().commit();
    }
    public void remover(Pessoa pessoa) {
        em.getTransaction().begin();
        em.remove(pessoa);
        em.getTransaction().commit();
    }

    public List<Pessoa> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Pessoa.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Pessoa buscar(String cpf) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Pessoa.findByCpf").setParameter("cpf", cpf);
        em.getTransaction().commit();
        return (Pessoa) query.getSingleResult();
    }
}
