/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author luisg
 */
public class Visitante {
    
    private ObjectId id;
    private String correo;
    private String telefono;
    private String nombreCompleto;

    public Visitante() {
        
    }

    public Visitante(String correo, String telefono) {
        this.correo = correo;
        this.telefono = telefono;
    }

    public Visitante(String correo, String telefono, String nombreCompleto) {
        this.correo = correo;
        this.telefono = telefono;
        this.nombreCompleto = nombreCompleto;
    }

    public Visitante(ObjectId id, String correo, String telefono, String nombreCompleto) {
        this.id = id;
        this.correo = correo;
        this.telefono = telefono;
        this.nombreCompleto = nombreCompleto;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Visitante other = (Visitante) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + ", " + correo + ", " + telefono + ", " + nombreCompleto;
    }
}
