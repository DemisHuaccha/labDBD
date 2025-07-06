package com.example.LabDBD.LabDBD.entity;
import jakarta.persistence.*;


@Entity
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrito")
    private Long idCarrito;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "rut_user")
    private Usuario usuario;

    //Getters
    public Long getIdCarrito() {
        return idCarrito;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public Producto getProducto() {
        return producto;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    //Setters
    public void setIdCarrito(Long idCarrito) {
        this.idCarrito = idCarrito;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
