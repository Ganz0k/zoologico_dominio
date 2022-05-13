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
public class Especie {
    
    private ObjectId id;
    private String nombreEspaniol;
    private String nombreCientifico;
    private String descripcion;
    private List<Animal> animales;

    public Especie() {
        
    }

    public Especie(ObjectId id, String nombreEspaniol) {
        this.id = id;
        this.nombreEspaniol = nombreEspaniol;
    }

    public Especie(String nombreEspaniol, String nombreCientifico, String descripcion) {
        this.nombreEspaniol = nombreEspaniol;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
    }

    public Especie(ObjectId id, String nombreEspaniol, String nombreCientifico, String descripcion) {
        this.id = id;
        this.nombreEspaniol = nombreEspaniol;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombreEspaniol() {
        return nombreEspaniol;
    }

    public void setNombreEspaniol(String nombreEspaniol) {
        this.nombreEspaniol = nombreEspaniol;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Especie other = (Especie) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + ", " + nombreEspaniol + ", " + nombreCientifico + ", " + descripcion + ", " + animales;
    }
}
