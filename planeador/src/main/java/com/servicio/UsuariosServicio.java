package com.servicio;

import com.entidades.Usuarios;
import com.persistencia.UsuariosDAO;

public class UsuariosServicio {

    private final UsuariosDAO daoUsuarios;

    public UsuariosServicio() {  // Corrección del nombre del constructor
        daoUsuarios = new UsuariosDAO();
    }

    public void guardarUsuarios(int id, String nombre, String correo, String contrasenia) {
        try {
            Usuarios usuario = new Usuarios();
            usuario.setId(id);
            usuario.setNombre(nombre);
            usuario.setCorreo(correo);
            usuario.setContrasenia(contrasenia);
            daoUsuarios.guardarUsuarios(usuario);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizarUsuarios(int id, String nombre, String correo, String contrasenia) {
        try {
            Usuarios usuario = new Usuarios();
            usuario.setId(id);
            usuario.setNombre(nombre);
            usuario.setCorreo(correo);
            usuario.setContrasenia(contrasenia);
            daoUsuarios.actualizarUsuarios(usuario);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarUsuarios(int id) {
        try {
            daoUsuarios.eliminarUsuarios(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Usuarios consultarUsuarios(int id) {
        try {
            return daoUsuarios.consultarUsuarios(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Usuarios consultarUsuarios(String nombre) {
        try {
            return daoUsuarios.consultarUsuarios(nombre);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void actualizarContrasenia(int id, String contrasenia) {
        try {
            daoUsuarios.actualizarContrasenia(id, contrasenia);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizarNombre(int id, String nombre) {
        try {
            daoUsuarios.actualizarNombre(id, nombre);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizarCorreo(int id, String correo) {
        try {
            daoUsuarios.actualizarCorreo(id, correo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
