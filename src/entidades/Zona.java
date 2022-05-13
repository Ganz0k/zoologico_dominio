/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author luisg
 */
public class Zona {
    
    private ObjectId id;
    private String nombre;
    private Double extension;
    private List<ObjectId> especies;
    private List<ObjectId> habitats;

    public Zona() {
        
    }

    public Zona(ObjectId id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Zona(String nombre, Double extension, List<ObjectId> especies, List<ObjectId> habitats) {
        this.nombre = nombre;
        this.extension = extension;
        this.especies = especies;
        this.habitats = habitats;
    }

    public Zona(ObjectId id, String nombre, Double extension, List<ObjectId> especies, List<ObjectId> habitats) {
        this.id = id;
        this.nombre = nombre;
        this.extension = extension;
        this.especies = especies;
        this.habitats = habitats;
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

    public Double getExtension() {
        return extension;
    }

    public void setExtension(Double extension) {
        this.extension = extension;
    }

    public List<ObjectId> getEspecies() {
        return especies;
    }

    public void setEspecies(List<ObjectId> especies) {
        this.especies = especies;
    }

    public List<ObjectId> getHabitats() {
        return habitats;
    }

    public void setHabitats(List<ObjectId> habitats) {
        this.habitats = habitats;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.id);
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
        final Zona other = (Zona) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + ", " + nombre + ", " + extension + ", " + especies + ", " + habitats;
    }
}
