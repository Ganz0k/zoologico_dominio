/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Entidad que representa un Hábitat de un zoológico. Un objeto de este tipo
 * será enviado y almacenado en la base de datos del zoológico
 *
 * @author luisg
 */
public class Habitat {

    private ObjectId id;
    private String nombre;
    private String clima;
    private String tipoVegetacion;
    private List<String> continentes;
    private List<ObjectId> idsEspecie;

    /**
     * Constructor por defecto
     */
    public Habitat() {

    }

    /**
     * Constructor que inicializa todos los atributos de la clase a excepción
     * del id y idsEspecie
     *
     * @param nombre nombre del hábitat a registrar
     * @param clima tipo de clima del hábitat a registrar
     * @param tipoVegetacion tipo de vegetación del hábitat a registrar
     * @param continentes lista de continentes en los que se puede encontrar el
     * hábitat a registrar
     */
    public Habitat(String nombre, String clima, String tipoVegetacion, List<String> continentes) {
        this.nombre = nombre;
        this.clima = clima;
        this.tipoVegetacion = tipoVegetacion;
        this.continentes = continentes;
    }

    /**
     * Constructor que inicializa todos los atributos de la clase a excepción de
     * idsEspecie
     *
     * @param id id para diferenciar al hábitat en la base de datos
     * @param nombre nombre del hábitat a registrar
     * @param clima tipo de clima del hábitat a registrar
     * @param tipoVegetacion tipo de vegetación del hábitat a registrar
     * @param continentes lista de continentes en los que se puede encontrar el
     * hábitat a registrar
     */
    public Habitat(ObjectId id, String nombre, String clima, String tipoVegetacion, List<String> continentes) {
        this.id = id;
        this.nombre = nombre;
        this.clima = clima;
        this.tipoVegetacion = tipoVegetacion;
        this.continentes = continentes;
    }

    /**
     * Constructor que inicializa todos los atributos de la clase
     *
     * @param id id para diferenciar al hábitat en la base de datos
     * @param nombre nombre del hábitat a registrar
     * @param clima tipo de clima del hábitat a registrar
     * @param tipoVegetacion tipo de vegetación del hábitat a registrar
     * @param continentes lista de continentes en los que se puede encontrar el
     * hábitat a registrar
     * @param idsEspecie ids de las especies que viven en el hábitat
     */
    public Habitat(ObjectId id, String nombre, String clima, String tipoVegetacion, List<String> continentes, List<ObjectId> idsEspecie) {
        this.id = id;
        this.nombre = nombre;
        this.clima = clima;
        this.tipoVegetacion = tipoVegetacion;
        this.continentes = continentes;
        this.idsEspecie = idsEspecie;
    }

    /**
     * Regresa el id del hábitat
     *
     * @return id del hábitat
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Asigna un nuevo id al hábitat
     *
     * @param id id para diferenciar al hábitat en la base de datos
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Regresa el nombre del hábitat
     *
     * @return nombre del hábitat
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna un nuevo nombre al hábitat
     *
     * @param nombre nombre del hábitat a registrar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el tipo de clima del hábitat
     *
     * @return tipo de clima del hábitat
     */
    public String getClima() {
        return clima;
    }

    /**
     * Asigna un nuevo tipo de clima al hábitat
     *
     * @param clima tipo de clima del hábitat a registrar
     */
    public void setClima(String clima) {
        this.clima = clima;
    }

    /**
     * Regresa el tipo de vegetación del hábitat
     *
     * @return tipo de vegetación del hábitat
     */
    public String getTipoVegetacion() {
        return tipoVegetacion;
    }

    /**
     * Asigna un nuevo tipo de vegetación al hábitat
     *
     * @param tipoVegetacion tipo de vegetación del hábitat a registrar
     */
    public void setTipoVegetacion(String tipoVegetacion) {
        this.tipoVegetacion = tipoVegetacion;
    }

    /**
     * Regresa una lista de strings que contiene todos los continentes en que el
     * hábitat se puede encontrar
     *
     * @return lista de strings que contiene todos los continentes en que el
     * hábitat se puede encontrar
     */
    public List<String> getContinentes() {
        return continentes;
    }

    /**
     * Asigna una nueva lista de strings que contiene todos los continentes en
     * que el hábitat a registrar se puede encontrar
     *
     * @param continentes lista de continentes en los que se puede encontrar el
     * hábitat a registrar
     */
    public void setContinentes(List<String> continentes) {
        this.continentes = continentes;
    }

    /**
     * Regresa una lista con todos los ids de las especies que viven en este
     * hábitat
     *
     * @return lista de ids de las especies que viven en este hábitat
     */
    public List<ObjectId> getIdsEspecie() {
        return idsEspecie;
    }

    /**
     * Asigna una nueva lista de ids de las especies que viven en este hábitat
     *
     * @param idsEspecie lista de ids de las especies que viven en este hábitat
     */
    public void setIdsEspecie(List<ObjectId> idsEspecie) {
        this.idsEspecie = idsEspecie;
    }

    /**
     * Devuelve el código hash del hábitat con base a su id
     *
     * @return código hash del hábitat
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara este hábitat con el que se asigna en el parámetro del método.
     * Devuelve true si ambos ids son iguales, false en el caso contrario
     *
     * @param obj hábitat a comparar
     * @return true si ambos ids son iguales, false en el caso contrario
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
        final Habitat other = (Habitat) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    /**
     * Devuelve un string con todos los atributos de la clase Hábitat
     *
     * @return string con todos los atributos de la clase Hábitat
     */
    @Override
    public String toString() {
        return id + ", " + nombre + ", " + clima + ", " + tipoVegetacion + ", " + continentes;
    }
}
