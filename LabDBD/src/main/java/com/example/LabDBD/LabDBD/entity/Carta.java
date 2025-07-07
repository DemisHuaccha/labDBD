package com.example.LabDBD.LabDBD.entity;
import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
public class Carta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cartas")
    private Long id;

    @Column(name = "año")
    private LocalDate ano;

    @Column(name = "estado", length = 30)
    private String estado;

    @Column(name = "rareza", length = 20)
    private String rareza;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
    
    //Getters
    public long getId() {
        return id;
    }
    public LocalDate getAno(){
        return ano;
    }
    public String getEstado(){
        return estado;
    }
    public String getRareza(){
        return rareza;
    }
    public Producto getProducto(){
        return producto;
    }
    //Setters
    public void setId(long id) {
        this.id = id;
    }
    public void setAno(LocalDate ano) {
        this.ano = ano;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setRareza(String rareza) {
        this.rareza = rareza;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
