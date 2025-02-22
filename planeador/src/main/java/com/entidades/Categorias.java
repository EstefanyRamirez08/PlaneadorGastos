package com.entidades;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
@NamedQuery(name = "consultarCategorias", query = "SELECT c FROM Categorias c WHERE c.id = :id")
public class Categorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Gastos> gastos;

    public Categorias() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<Gastos> getGastos() { return gastos; }
    public void setGastos(List<Gastos> gastos) { this.gastos = gastos; }

    @Override
    public String toString() {
        return "Categorias{" + "id=" + id + ", nombre='" + nombre + "'}";
    }
}
