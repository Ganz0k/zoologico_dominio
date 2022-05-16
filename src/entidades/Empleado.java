/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Entidad que representa un empleado del zoológico
 *
 * @author luisg
 */
public class Empleado {

    protected ObjectId id;
    protected String nombre;
    protected String telefono;
    protected Date fechaComienzo;
    protected String discriminador;

    /**
     * Constructor por defecto
     */
    public Empleado() {

    }

    /**
     * Constructor que solo inicializa el id y nombre
     *
     * @param id id del empleado
     * @param nombre nombre del empleado
     */
    public Empleado(ObjectId id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Constructor que inicializa el id, nombre y teléfono
     *
     * @param id id del empleado
     * @param nombre nombre del empleado
     * @param telefono teléfono del empleado
     */
    public Empleado(ObjectId id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * Constructor que inicializa todo menos el id
     *
     * @param nombre nombre del empleado
     * @param telefono teléfono del empleado
     * @param fechaComienzo fecha en la que comenzó a trabajar
     * @param discriminador discriminador para diferenciarlo
     */
    public Empleado(String nombre, String telefono, Date fechaComienzo, String discriminador) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaComienzo = fechaComienzo;
        this.discriminador = discriminador;
    }

    /**
     * Constructor que inicializa todo
     *
     * @param id id del empleado
     * @param nombre nombre del empleado
     * @param telefono teléfono del empleado
     * @param fechaComienzo fecha en la que comenzó a trabajar
     * @param discriminador discriminador para diferenciarlo
     */
    public Empleado(ObjectId id, String nombre, String telefono, Date fechaComienzo, String discriminador) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaComienzo = fechaComienzo;
        this.discriminador = discriminador;
    }

    /**
     * Regresa el id del empleado
     *
     * @return id del empleado
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Le asigna un nuevo id al empleado
     *
     * @param id id a asignar
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Regresa el nombre del empleado
     *
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Le asigna un nuevo nombre al empleado
     *
     * @param nombre nombre a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el teléfono del empleado
     *
     * @return teléfono del empleado
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Le asigna un nuevo teléfono al empleado
     *
     * @param telefono teléfono a asignar
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Regresa la fecha de comienzo del empleado
     *
     * @return fecha de comeienzo del empleado
     */
    public Date getFechaComienzo() {
        return fechaComienzo;
    }

    /**
     * Le asigna una nueva fecha de comienzo al empleado
     *
     * @param fechaComienzo fecha a asignar
     */
    public void setFechaComienzo(Date fechaComienzo) {
        this.fechaComienzo = fechaComienzo;
    }

    /**
     * Regresa el discriminador del empleado
     *
     * @return discriminador del empleado
     */
    public String getDiscriminador() {
        return discriminador;
    }

    /**
     * Le asigna un nuevo discriminador al empleado
     *
     * @param discriminador discriminador a asignar
     */
    public void setDiscriminador(String discriminador) {
        this.discriminador = discriminador;
    }

    /**
     * Regresa el hash code del empleado
     *
     * @return has code del empleado
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara dos empleados si son iguales regresa true, si no false
     *
     * @param obj empleado a comparar
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
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    /**
     * Regresa una cadena con todos los atributos del empleado
     *
     * @return una cadena con todos los atributos del empleado
     */
    @Override
    public String toString() {
        return id + ", " + nombre + ", " + telefono + ", " + fechaComienzo;
    }
}
