package com.example.LabDBD.LabDBD.entity;
import jakarta.persistence.*;


@Entity
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tienda")
    private Long idTienda;

    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "rut_user", nullable = false)
    private Usuario propietario;

    //Getters
    public Long getIdTienda() {
        return idTienda;
    }
    public String getNombre() {
        return nombre;
    }
    public Usuario getPropietario() {
        return propietario;
    }
    //Setters
    public void setIdTienda(Long idTienda) {
        this.idTienda = idTienda;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }
}
