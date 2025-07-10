package com.example.LabDBD.LabDBD.entity;
import jakarta.persistence.*;


@Entity
public class ListaDeseados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_listadeseados")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "rut_user", nullable = false)
    private Usuario usuario;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad = 0;

    //Getters
    public Long getId() {
        return id;
    }
    public Producto getProducto() {
        return producto;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public Integer getCantidad(){
        return cantidad;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
