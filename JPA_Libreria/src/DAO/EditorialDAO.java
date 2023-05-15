/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Editorial;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Marcos
 */
public class EditorialDAO {
    
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
     
    public void guardar(Editorial editorial) {
        conectar();
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
        desconectar();
    }
    
    public void actualizar(Editorial editorial) {
        conectar();
        em.getTransaction().begin();
        em.merge(editorial);
        em.getTransaction().commit();
        desconectar();
    }
     
      public void eliminar(Editorial editorial) {
        conectar();
        em.getTransaction().begin();
        em.remove(editorial);
        em.getTransaction().commit();
        desconectar();
    }
      
        public List<Editorial> listarTodos() {
        try {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e")
                .getResultList();
        return editoriales;
        } catch (Exception e) {
        return null;
        }finally{
        desconectar();
        }
    }
       
        public Editorial buscarPorNombre(String nombre) throws Exception {
        try {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        return editorial;
        } catch (Exception e) {
        return null;
        }finally{
        desconectar();
        }
        }
        
        public Editorial buscarPorId(Long id) throws Exception {
        try {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id LIKE :id").setParameter("id", id).getSingleResult();
        return editorial;
        } catch (Exception e) {
        return null;
        }finally{
        desconectar();
        }
        }
        public List<Editorial> listarTodosPorNombre(String nombre) {
        try {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e where e.nombre like :nombre").setParameter("nombre", "%" + nombre + "%")
                .getResultList();
        return editoriales;
        } catch (Exception e) {
        return null;
        }finally{
        desconectar();
        }
    }
}
