package com.example.LabDBD.LabDBD.entity;
import jakarta.persistence.*;

@Entity
public class JuegoDeMesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_juegosm")
    private Long id;

    @Column(name = "tipo", length = 30)
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    //Getters
    public Long getId() {
        return id;
    }
    public String getTipo() {
        return tipo;
    }
    public Producto getProducto() {
        return producto;
    }
    //Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
