package com.example.LabDBD.LabDBD.entity;
import jakarta.persistence.*;

@Entity
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion")
    private Long id;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "calle", length = 50)
    private String calle;

    @Column(name = "region", length = 50)
    private String region;

    @ManyToOne
    @JoinColumn(name = "rut_user")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_tienda")
    private Tienda tienda;

    //Getters
    public Long getId() {
        return id;
    }
    public Integer getNumero() {
        return numero;
    }
    public String getCalle() {
        return calle;
    }
    public String getRegion() {
        return region;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public Tienda getTienda() {
        return tienda;
    }
    //Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }
}
