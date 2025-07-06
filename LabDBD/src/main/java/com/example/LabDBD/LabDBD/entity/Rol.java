package com.example.LabDBD.LabDBD.entity;
import jakarta.persistence.*;

@Entity
public class Rol {
    @Id
    @Column(name = "id_rol")
    private Integer idRol;

    @Column(name = "nombre_rol", nullable = false, length = 30)
    private String nombreRol;

    // getters y setters
    public Integer getIdRol() { return idRol; }
    public void setIdRol(Integer idRol) { this.idRol = idRol; }
    public String getNombreRol() { return nombreRol; }
    public void setNombreRol(String nombreRol) { this.nombreRol = nombreRol; }
}
