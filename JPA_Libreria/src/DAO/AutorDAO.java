/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Autor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;

/**
 *
 * @author Marcos
 */
public class AutorDAO {
    private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("JPAPU");
    private EntityManager em = EMF.createEntityManager();
    
     public void conectar() {
        if (!em.isOpen()) {
            em = EMF.createEntityManager();
        }
    }
     
     public void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }
     
    public void guardar(Autor autor) {
        conectar();
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
        desconectar();
    }
    
    public void actualizar(Autor autor) {
        conectar();
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
        desconectar();
    }
     
      public void eliminar(Autor autor) {
        conectar();
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();
        desconectar();
    }
      
       public List<Autor> listarTodos() {
        try {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a")
                .getResultList();
        return autores;
        } catch (Exception e) {
        e.printStackTrace();
            return null;
        }finally{
        desconectar();
        }
    }
       
        public Autor buscarPorNombre(String nombre) throws Exception {
        try {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre")
                      .setParameter("nombre", nombre)
                      .getSingleResult();
        return autor;
        
        } catch (Exception e) {
            return null;
        }finally{
        desconectar();
        }
    }
        
        public Autor buscarPorId(Long id) throws Exception {
        try {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id LIKE :id").setParameter("id", id).getSingleResult();
        return autor;
        } catch (Exception e) {
        return null;
        }finally{
        desconectar();    
        }
    }
        
         public List<Autor> listarTodosPorNombre(String nombre) {
        try {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a where a.nombre like :nombre").setParameter("nombre", "%" + nombre + "%")
                .getResultList();
        return autores;
        } catch (Exception e) {
        e.printStackTrace();
            return null;
        }finally{
        desconectar();
        }
    }
}
