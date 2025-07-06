package com.example.LabDBD.LabDBD.entity;
import jakarta.persistence.*;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    @Column(name = "nombre_producto", nullable = false, length = 50)
    private String nombreProducto;

    @Column(name = "descripcion", length = 255)
    private String descripcion;

    @Column(name = "precio_producto", nullable = false)
    private Integer precioProducto;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @Column(name = "cantidad_de_ventas", nullable = false)
    private Integer cantidadDeVentas = 0;

    @Column(name = "tipo_prod")
    private Integer tipoProd;

    @Column(name = "imagen", length = 255)
    private String imagen;

    @ManyToOne
    @JoinColumn(name = "rut_user")
    private Usuario usuario;

    //Getters
    public Long getIdProducto() {
        return idProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Integer getPrecioProducto() {
        return precioProducto;
    }
    public Integer getStock() {
        return stock;
    }
    public Integer getCantidadDeVentas() {
        return cantidadDeVentas;
    }
    public Integer getTipoProd() {
        return tipoProd;
    }
    public String getImagen() {
        return imagen;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    //Setters
    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecioProducto(Integer precioProducto) {
        this.precioProducto = precioProducto;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public void setCantidadDeVentas(Integer cantidadDeVentas) {
        this.cantidadDeVentas = cantidadDeVentas;
    }
    public void setTipoProd(Integer tipoProd) {
        this.tipoProd = tipoProd;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
