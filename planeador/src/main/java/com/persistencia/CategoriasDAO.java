package com.persistencia;

import com.entidades.Categorias;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class CategoriasDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("planeador");
    private final EntityManager em = emf.createEntityManager();

    public void guardarCategoria(Categorias categoria) {
        em.getTransaction().begin();
        em.persist(categoria);
        em.getTransaction().commit();
    }

    public void actualizarCategoria(Categorias categoria) {
        em.getTransaction().begin();
        em.merge(categoria);
        em.getTransaction().commit();
    }

    public void eliminarCategoria(int id) {
        Categorias categoria = em.find(Categorias.class, id);
        if (categoria != null) {
            em.getTransaction().begin();
            em.remove(categoria);
            em.getTransaction().commit();
        }
    }

    public Categorias consultarCategoria(int id) {
        return em.find(Categorias.class, id);
    }

    public List<Categorias> consultarCategorias() {
        return em.createQuery("SELECT c FROM Categorias c", Categorias.class).getResultList();
    }
}