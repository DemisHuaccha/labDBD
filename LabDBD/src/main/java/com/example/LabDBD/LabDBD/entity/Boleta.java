package com.example.LabDBD.LabDBD.entity;
import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
//@Table(name = "boleta")
public class Boleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_boleta")
    private Long numeroBoleta;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "id_metodo")
    private MetodoPago metodoPago;

    @ManyToOne
    @JoinColumn(name = "rut_user")
    private Usuario usuario;

    //Getters y setters
    public Long getNumeroBoleta() { return numeroBoleta; }
    public void setNumeroBoleta(Long numeroBoleta) { this.numeroBoleta = numeroBoleta; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public MetodoPago getMetodoPago() { return metodoPago; }
    public void setMetodoPago(MetodoPago metodoPago) { this.metodoPago = metodoPago; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

}
