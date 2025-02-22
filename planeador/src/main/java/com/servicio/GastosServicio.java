package com.servicio;

import com.entidades.Gastos;
import com.entidades.Usuarios;
import com.entidades.Categorias;
import com.persistencia.GastosDAO;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GastosServicio {

    private final GastosDAO daoGastos;

    public GastosServicio() {
        daoGastos = new GastosDAO();
    }

    public void guardarGastos(int id, int idUsuario, int idCategoria, double monto, String fecha) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaConvertida = dateFormat.parse(fecha);

            Usuarios usuario = daoGastos.consultarUsuario(idUsuario);
            Categorias categoria = daoGastos.consultarCategoria(idCategoria);

            if (usuario == null || categoria == null) {
                System.out.println("Usuario o categoría no encontrados.");
                return;
            }

            Gastos gastos = new Gastos();
            gastos.setId(id);
            gastos.setMonto(monto);
            gastos.setFecha(fechaConvertida);
            gastos.setUsuario(usuario);
            gastos.setCategoria(categoria);

            daoGastos.guardarGastos(gastos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizarGastos(int id, int idUsuario, int idCategoria, double monto, String fecha) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaConvertida = dateFormat.parse(fecha);

            Gastos gastos = daoGastos.consultarGastos(id);
            if (gastos == null) {
                System.out.println("Gasto no encontrado.");
                return;
            }

            Usuarios usuario = daoGastos.consultarUsuario(idUsuario);
            Categorias categoria = daoGastos.consultarCategoria(idCategoria);

            if (usuario == null || categoria == null) {
                System.out.println("Usuario o categoría no encontrados.");
                return;
            }

            gastos.setMonto(monto);
            gastos.setFecha(fechaConvertida);
            gastos.setUsuario(usuario);
            gastos.setCategoria(categoria);

            daoGastos.actualizarGastos(gastos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarGastos(int id) {
        try {
            Gastos gastos = daoGastos.consultarGastos(id);
            if (gastos == null) {
                System.out.println("Gasto no encontrado.");
                return;
            }
            daoGastos.eliminarGastos(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
