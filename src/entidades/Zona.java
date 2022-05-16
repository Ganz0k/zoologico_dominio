/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Entidad que representa una zona del zoológico
 *
 * @author luisg
 */
public class Zona {

    private ObjectId id;
    private String nombre;
    private Double extension;
    private List<ObjectId> especies;
    private List<ObjectId> habitats;

    /**
     * Constructor por defecto
     */
    public Zona() {

    }

    /**
     * Constructor que recibe id, nombre y extensión
     *
     * @param id id de la zona
     * @param nombre nombre de la zona
     * @param extension extensión de la zona
     */
    public Zona(ObjectId id, String nombre, Double extension) {
        this.id = id;
        this.nombre = nombre;
        this.extension = extension;
    }

    /**
     * Constructor que recibe todo menos el id
     *
     * @param nombre nombre de la zona
     * @param extension extensión de la zona
     * @param especies especies de la zona
     * @param habitats hábitats de la zona
     */
    public Zona(String nombre, Double extension, List<ObjectId> especies, List<ObjectId> habitats) {
        this.nombre = nombre;
        this.extension = extension;
        this.especies = especies;
        this.habitats = habitats;
    }

    /**
     * Constructor que recibe todo
     *
     * @param id id de la zona
     * @param nombre nombre de la zona
     * @param extension extensión de la zona
     * @param especies especies de la zona
     * @param habitats hábitats de la zona
     */
    public Zona(ObjectId id, String nombre, Double extension, List<ObjectId> especies, List<ObjectId> habitats) {
        this.id = id;
        this.nombre = nombre;
        this.extension = extension;
        this.especies = especies;
        this.habitats = habitats;
    }

    /**
     * Regresa el id
     *
     * @return id
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Le asigna un nuevo id
     *
     * @param id id a asignar
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Regresa el nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Le asigna un nuevo nombre
     *
     * @param nombre nombre a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa la extensión
     *
     * @return extensión
     */
    public Double getExtension() {
        return extension;
    }

    /**
     * Le asigna una nueva extensión
     *
     * @param extension extensión a asignar
     */
    public void setExtension(Double extension) {
        this.extension = extension;
    }

    /**
     * Regresa las especies
     *
     * @return especies
     */
    public List<ObjectId> getEspecies() {
        return especies;
    }

    /**
     * Le asigna nuevas especies
     *
     * @param especies especies a asignar
     */
    public void setEspecies(List<ObjectId> especies) {
        this.especies = especies;
    }

    /**
     * Regresa los hábitats
     *
     * @return hábitats
     */
    public List<ObjectId> getHabitats() {
        return habitats;
    }

    /**
     * Le asigna nuevos hábitats
     *
     * @param habitats hábitats a asignar
     */
    public void setHabitats(List<ObjectId> habitats) {
        this.habitats = habitats;
    }

    /**
     * Regresa el hash code de la zona
     *
     * @return has code de la zona
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara dos zonas si son iguales regresa true, si no false
     *
     * @param obj zona a comparar
     * @return true si son iguales, false si no
     */
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

    /**
     * Regresa una cadena con todos los atributos de la zona
     *
     * @return una cadena con todos los atributos de la zona
     */
    @Override
    public String toString() {
        return id + ", " + nombre + ", " + extension + ", " + especies + ", " + habitats;
    }
}
