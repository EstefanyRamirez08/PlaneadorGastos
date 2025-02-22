package com.persistencia;

import com.entidades.Gastos;
import com.entidades.Usuarios;
import com.entidades.Categorias;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;
///import java.util.Date;

public class GastosDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("planeador");

    public void guardarGastos(Gastos gastos) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(gastos);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void actualizarGastos(Gastos gastos) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(gastos);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void eliminarGastos(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Gastos gastos = em.find(Gastos.class, id);
            if (gastos != null) {
                em.remove(gastos);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Gastos consultarGastos(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Gastos.class, id);
        } finally {
            em.close();
        }
    }

    public List<Gastos> consultarGastosPorUsuario(int idUsuario) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createNamedQuery("consultarGastos", Gastos.class)
                    .setParameter("idUsuario", idUsuario)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    public Usuarios consultarUsuario(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Usuarios.class, id);
        } finally {
            em.close();
        }
    }

    public Categorias consultarCategoria(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Categorias.class, id);
        } finally {
            em.close();
        }
    }
}
