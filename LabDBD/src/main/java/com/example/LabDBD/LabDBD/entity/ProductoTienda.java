package com.example.LabDBD.LabDBD.entity;

import jakarta.persistence.*;

@Entity
public class ProductoTienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ProductoTienda")
    private Long id_ProductoTienda;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;


    @ManyToOne
    @JoinColumn(name = "id_tienda", insertable = false, updatable = false)
    private Tienda tienda;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad = 0;

    //Getters
    public Long getId_ProductoTienda() {
        return id_ProductoTienda;
    }
    public Producto getProducto() {
        return producto;
    }
    public Tienda getTienda() {
        return tienda;
    }
    public Integer getCantidad() {
        return cantidad;
    }

    //Setters
    public void setId_ProductoTienda(Long id_ProductoTienda) {
        this.id_ProductoTienda = id_ProductoTienda;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
