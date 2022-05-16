/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Entidad que representa una especie del zoológico
 *
 * @author luisg
 */
public class Especie {

    private ObjectId id;
    private String nombreEspaniol;
    private String nombreCientifico;
    private String descripcion;
    private List<Animal> animales;

    /**
     * Constructor por defecto
     */
    public Especie() {

    }

    /**
     * Constructor que inicializa el id y el nombre
     *
     * @param id id de espeice
     * @param nombreEspaniol nombre de especie
     */
    public Especie(ObjectId id, String nombreEspaniol) {
        this.id = id;
        this.nombreEspaniol = nombreEspaniol;
    }

    /**
     * Constructor que inicializa todo menos el id
     *
     * @param nombreEspaniol nombre de especie
     * @param nombreCientifico nombre científico
     * @param descripcion descripción de la especie
     */
    public Especie(String nombreEspaniol, String nombreCientifico, String descripcion) {
        this.nombreEspaniol = nombreEspaniol;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
    }

    /**
     * Constructor que inicializa todo
     *
     * @param id id de la especie
     * @param nombreEspaniol nombre de especie
     * @param nombreCientifico nombre científico
     * @param descripcion descripción de la especie
     */
    public Especie(ObjectId id, String nombreEspaniol, String nombreCientifico, String descripcion) {
        this.id = id;
        this.nombreEspaniol = nombreEspaniol;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
    }

    /**
     * Regresa el id de la especie
     *
     * @return id de la especie
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Le asigna un nuevo id a la especie
     *
     * @param id id a asignar
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Regresa el nombre de la especie
     *
     * @return nombre de la especie
     */
    public String getNombreEspaniol() {
        return nombreEspaniol;
    }

    /**
     * Le asigna un nuevo nombre a la especie
     *
     * @param nombreEspaniol nombre a asignar
     */
    public void setNombreEspaniol(String nombreEspaniol) {
        this.nombreEspaniol = nombreEspaniol;
    }

    /**
     * Regresa el nombre científcio de la especie
     *
     * @return nombre científico de la especie
     */
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    /**
     * Le asigna un nuevo nombre científico a la especie
     *
     * @param nombreCientifico id a asignar
     */
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    /**
     * Regresa la descripción de la especie
     *
     * @return descripción de la especie
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Le asigna una nueva descripción a la especie
     *
     * @param descripcion descripcion a asignar
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Regresa una lista de animales de la especie
     *
     * @return lista de animales de la especie
     */
    public List<Animal> getAnimales() {
        return animales;
    }

    /**
     * Le asigna una nueva lista de animales a la especie
     *
     * @param animales lista de animales a asignar
     */
    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    /**
     * Regresa el hash code de la especie
     *
     * @return has code de la especie
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara dos especies si son iguales regresa true, si no false
     *
     * @param obj espcie a comparar
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
        final Especie other = (Especie) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    /**
     * Regresa una cadena con todos los atributos de la especie
     *
     * @return una cadena con todos los atributos de la especie
     */
    @Override
    public String toString() {
        return id + ", " + nombreEspaniol + ", " + nombreCientifico + ", " + descripcion + ", " + animales;
    }
}
