package Util.Classes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Conexao {

    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("CorujaAppPU");
    protected EntityManager em = emf.createEntityManager();
    protected Query query;
}
