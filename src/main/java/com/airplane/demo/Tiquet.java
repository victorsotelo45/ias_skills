package com.airplane.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Size;
import javax.persistence.Id;
@Entity
public class Tiquet {
    @Size(max=30, message="El id del tiquet no puede tener mas de 30 caracteres")
    private Long id_usuario;

    @Size(max=30)
    private String id_vuelo;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size(max=30)
    private String id_tiquet;

    @Size(max=30)
    private String ciudadDestino;

    @Size(max=30)
    private String id_reserva;

    public Tiquet() {
    }

    public Tiquet(Long id_usuario, String id_vuelo, String id_tiquet, String ciudadDestino, String id_reserva) {
        this.id_usuario = id_usuario;
        this.id_vuelo = id_vuelo;
        this.id_tiquet = id_tiquet;
        this.ciudadDestino = ciudadDestino;
        this.id_reserva = id_reserva;
    }

    public void setId_tiquet(String id_tiquet) {
        this.id_tiquet = id_tiquet;
    }
    public String getId_tiquet() {
        return id_tiquet;
    }
    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }
    public Long getId_usuario() {
        return id_usuario;
    }
    public void setId_vuelo(String id_vuelo) {
        this.id_vuelo = id_vuelo;
    }
    public String getId_vuelo() {
        return id_vuelo;
    }
    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }
    public String getCiudadDestino() {
        return ciudadDestino;
    }
    public void setId_reserva(String id_reserva) {
        this.id_reserva = id_reserva;
    }
    public String getId_reserva() {
        return id_reserva;
    }
}