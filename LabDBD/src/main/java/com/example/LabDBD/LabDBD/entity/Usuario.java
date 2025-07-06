package com.example.LabDBD.LabDBD.entity;
import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id
    @Column(name = "rut_user", length = 15)
    private String rutUser;

    @Column(name = "correo", nullable = false, length = 30, unique = true)
    private String correo;

    @Column(name = "clave", nullable = false, length = 30)
    private String clave;

    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false)
    private Rol rol;

    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "rut_user2")
    private Usuario referente;  // autorreferencia

    // getters y setters
    public String getRutUser() { return rutUser; }
    public void setRutUser(String rutUser) { this.rutUser = rutUser; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }
    public Rol getRol() { return rol; }
    public void setRol(Rol rol) { this.rol = rol; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Usuario getReferente() { return referente; }
    public void setReferente(Usuario referente) { this.referente = referente; }
}
