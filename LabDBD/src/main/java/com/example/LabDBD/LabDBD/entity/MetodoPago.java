package com.example.LabDBD.LabDBD.entity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


@Entity
//@Table(name = "metodo_pago")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_metodo")
    private Long idMetodo;

    @Column(name = "nombre_metodo", nullable = false, length = 30)
    private String nombreMetodo;

    // getters y setters
    public Long getIdMetodo() { return idMetodo; }
    public void setIdMetodo(Long idMetodo) { this.idMetodo = idMetodo; }
    public String getNombreMetodo() { return nombreMetodo; }
    public void setNombreMetodo(String nombreMetodo) { this.nombreMetodo = nombreMetodo; }
}
