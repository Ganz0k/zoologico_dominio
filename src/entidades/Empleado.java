/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author luisg
 */
public class Empleado {
    
    protected ObjectId id;
    protected String nombre;
    protected String telefono;
    protected Date fechaComienzo;
    protected String discriminador;

    public Empleado() {
        
    }

    public Empleado(ObjectId id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Empleado(String nombre, String telefono, Date fechaComienzo, String discriminador) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaComienzo = fechaComienzo;
        this.discriminador = discriminador;
    }

    public Empleado(ObjectId id, String nombre, String telefono, Date fechaComienzo, String discriminador) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaComienzo = fechaComienzo;
        this.discriminador = discriminador;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaComienzo() {
        return fechaComienzo;
    }

    public void setFechaComienzo(Date fechaComienzo) {
        this.fechaComienzo = fechaComienzo;
    }

    public String getDiscriminador() {
        return discriminador;
    }

    public void setDiscriminador(String discriminador) {
        this.discriminador = discriminador;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + ", " + nombre + ", " + telefono + ", " + fechaComienzo;
    }
}
