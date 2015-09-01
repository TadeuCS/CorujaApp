/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Livro;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class LivroDAO extends Conexao{
    
    public void salvar(Livro livro){
        em.getTransaction().begin();
        em.merge(livro);
        em.getTransaction().commit();
    }
    public void remover(Livro livro){
        em.getTransaction().begin();
        em.remove(livro);
        em.getTransaction().commit();
    }
    public List<Livro> listar(){
        em.getTransaction().begin();
        query=em.createNamedQuery("Livro.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }
    public Livro buscar(String nome){
        em.getTransaction().begin();
        query=em.createNamedQuery("Livro.findByDescricao").setParameter("descricao", nome);
        em.getTransaction().commit();
        return (Livro) query.getSingleResult();
    }
}
