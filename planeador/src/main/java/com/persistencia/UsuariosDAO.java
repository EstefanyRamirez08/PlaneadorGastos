package com.persistencia;

//import java.util.List;
import com.entidades.Usuarios;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class UsuariosDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("planeador");

    public void guardarUsuarios(Usuarios usuario) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
        em.close();
    }

    public void actualizarUsuarios(Usuarios usuario) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(usuario);
        em.getTransaction().commit();
        em.close();
    }

    public void eliminarUsuarios(int id) {
        EntityManager em = emf.createEntityManager();
        Usuarios usuario = em.find(Usuarios.class, id);
        if (usuario != null) {
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
        }
        em.close();
    }

    public Usuarios consultarUsuarios(int id) {
        EntityManager em = emf.createEntityManager();
        Usuarios usuario = em.find(Usuarios.class, id);
        em.close();
        return usuario;
    }

    public Usuarios consultarUsuarios(String nombre) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Usuarios> query = em.createQuery(
            "SELECT u FROM Usuarios u WHERE u.nombre = :nombre", Usuarios.class);
        query.setParameter("nombre", nombre);
        Usuarios usuario = query.getSingleResult();
        em.close();
        return usuario;
    }

    public void actualizarContrasenia(int id, String contrasenia) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Usuarios usuario = em.find(Usuarios.class, id);
        if (usuario != null) {
            usuario.setContrasenia(contrasenia);
            em.merge(usuario);
        }
        em.getTransaction().commit();
        em.close();
    }

    public void actualizarNombre(int id, String nombre) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Usuarios usuario = em.find(Usuarios.class, id);
        if (usuario != null) {
            usuario.setNombre(nombre);
            em.merge(usuario);
        }
        em.getTransaction().commit();
        em.close();
    }

    public void actualizarCorreo(int id, String correo) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Usuarios usuario = em.find(Usuarios.class, id);
        if (usuario != null) {
            usuario.setCorreo(correo);
            em.merge(usuario);
        }
        em.getTransaction().commit();
        em.close();
    }
}
