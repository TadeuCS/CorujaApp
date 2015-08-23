/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Serie;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class SerieDAO extends Conexao{
    
    public void salvar(Serie serie){
        em.getTransaction().begin();
        em.merge(serie);
        em.getTransaction().commit();
    }
    public List<Serie> listar(){
        em.getTransaction().begin();
        query=em.createNamedQuery("Serie.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }
    public Serie buscar(String nome){
        em.getTransaction().begin();
        query=em.createNamedQuery("Serie.findByNome").setParameter("nome", nome);
        em.getTransaction().commit();
        return (Serie) query.getSingleResult();
    }
}
