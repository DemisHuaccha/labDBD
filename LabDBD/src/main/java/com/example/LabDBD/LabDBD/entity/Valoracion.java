package com.example.LabDBD.LabDBD.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Valoracion{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_valoracion")
    private Long idValoracion;

    @Column(name = "valoracion", nullable = false)
    private Integer valoracion;

    @Column(name = "comentario", length = 255)
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "rut_user")
    private Usuario usuario;

    //Getters
    public Long getIdValoracion() {
        return idValoracion;
    }
    public Integer getValoracion() {
        return valoracion;
    }
    public String getComentario() {
        return comentario;
    }
    public Producto getProducto() {
        return producto;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    //Setters
    public void setIdValoracion(Long idValoracion) {
        this.idValoracion = idValoracion;
    }
    public void setValoracion(Integer valoracion) {
        this.valoracion = valoracion;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
