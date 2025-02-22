package com.servicio;

import com.entidades.Categorias;
import com.persistencia.CategoriasDAO;

import java.util.List;

public class CategoriasServicio {
    private final CategoriasDAO daoCategorias;

    public CategoriasServicio() {
        daoCategorias = new CategoriasDAO();
    }

    public void guardarCategoria(String nombre) {
        try {
            Categorias categoria = new Categorias();
            categoria.setNombre(nombre);
            daoCategorias.guardarCategoria(categoria);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizarCategoria(int id, String nombre) {
        try {
            Categorias categoria = daoCategorias.consultarCategoria(id);
            if (categoria != null) {
                categoria.setNombre(nombre);
                daoCategorias.actualizarCategoria(categoria);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarCategoria(int id) {
        try {
            daoCategorias.eliminarCategoria(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Categorias consultarCategoria(int id) {
        try {
            return daoCategorias.consultarCategoria(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Categorias> consultarCategorias() {
        try {
            return daoCategorias.consultarCategorias();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
