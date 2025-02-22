package com.entidades;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "gastos")
@NamedQueries({
    @NamedQuery(name = "consultarGastos", query = "SELECT g FROM Gastos g WHERE g.usuario.id = :idUsuario")
})
public class Gastos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuarios usuario;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categorias categoria;

    private double monto;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    public Gastos() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Usuarios getUsuario() { return usuario; }
    public void setUsuario(Usuarios usuario) { this.usuario = usuario; }

    public Categorias getCategoria() { return categoria; }
    public void setCategoria(Categorias categoria) { this.categoria = categoria; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    @Override
    public String toString() {
        return "Gastos{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", categoria=" + categoria +
                ", monto=" + monto +
                ", fecha=" + fecha +
                '}';
    }
}
