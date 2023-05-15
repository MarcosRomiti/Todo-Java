/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Libro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Marcos
 */
public class LibroDAO {
    
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
     
    public void guardar(Libro libro) {
        conectar();
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
        desconectar();
    }
     
    public void actualizar(Libro libro) {
        conectar();
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
        desconectar();
    }
     
      public void eliminar(Libro libro) {
        conectar();
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
        desconectar();
    }
      
       public List<Libro> listarTodos() {
        try {
        conectar();
        List<Libro> libros = (List<Libro>) em.createQuery("SELECT l FROM Libro l")
                .getResultList();
        return libros;
        } catch (Exception e) {
        return null;
        }finally{
        desconectar();}
    }
       
        public Libro buscarPorNombre(String nombre) throws Exception {
            try {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        return libro;
        } catch (Exception e) {
        return null;
        }finally{
        desconectar();}
    }
        
        public List<Libro> listarTodosPorNombre(String nombre) {
        try {
        conectar();
        List<Libro> libros = (List<Libro>) em.createQuery("SELECT l FROM Libro l where l.nombre like :nombre").setParameter("nombre", "%" + nombre + "%")
                .getResultList();
        return libros;
        } catch (Exception e) {
        return null;
        }finally{
        desconectar();}
    }
        
        public Libro buscarPorIsbn(Long isbn) throws Exception {
            try {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.id LIKE :isbn").setParameter("isbn", isbn).getSingleResult();
        return libro;
        } catch (Exception e) {
        return null;
        }finally{
        desconectar();}
    }
        
    public List<Libro> buscarPorAutor(Long id) throws Exception {
            try {
        conectar();
        List<Libro> libros = (List<Libro>) em.createQuery("SELECT l FROM Libro l WHERE l.autor.id like :id").setParameter("id", id).getResultList();
        return libros;
        } catch (Exception e) {
        return null;
        }finally{
        desconectar();}
    }
    
    public List<Libro> buscarPorEditorial(Long id) throws Exception {
            try {
        conectar();
        List<Libro> libros = (List<Libro>) em.createQuery("SELECT l FROM Libro l WHERE l.editorial.id like :id").setParameter("id", id).getResultList();
        return libros;
        } catch (Exception e) {
        return null;
        }finally{
        desconectar();}
    }
}
