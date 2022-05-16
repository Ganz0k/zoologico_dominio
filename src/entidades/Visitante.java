/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Entidad que representa un visitante del zoológico
 *
 * @author luisg
 */
public class Visitante {

    private ObjectId id;
    private String correo;
    private String telefono;
    private String nombreCompleto;

    /**
     * Constructor por defecto
     */
    public Visitante() {

    }

    /**
     * Constructor que inicializa el correo y telefono
     *
     * @param correo correo del visitante
     * @param telefono teléfono del visitante
     */
    public Visitante(String correo, String telefono) {
        this.correo = correo;
        this.telefono = telefono;
    }

    /**
     * Constructor que inicializa todo menos el id
     *
     * @param correo correo del visitante
     * @param telefono teléfono del visitante
     * @param nombreCompleto nombre del visitante
     */
    public Visitante(String correo, String telefono, String nombreCompleto) {
        this.correo = correo;
        this.telefono = telefono;
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * Constructor que inicializa todo
     *
     * @param id id del visitante
     * @param correo correo del visitante
     * @param telefono teléfono del visitante
     * @param nombreCompleto nombre del visitante
     */
    public Visitante(ObjectId id, String correo, String telefono, String nombreCompleto) {
        this.id = id;
        this.correo = correo;
        this.telefono = telefono;
        this.nombreCompleto = nombreCompleto;
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
     * Regresa el correo
     *
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Le asigna un nuevo correo
     *
     * @param correo correo a asignar
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Regresa el teléfono
     *
     * @return teléfono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Le asigna un nuevo teléfono
     *
     * @param telefono teléfono a asignar
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Regresa el nombre completo
     *
     * @return nombre completo
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Le asigna un nuevo nombre completo
     *
     * @param nombreCompleto nombre completo a asignar
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * Regresa el hash code del visitante
     *
     * @return has code del visitante
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara dos visitantes si son iguales regresa true, si no false
     *
     * @param obj visitante a comparar
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
        final Visitante other = (Visitante) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    /**
     * Regresa una cadena con todos los atributos del visitante
     *
     * @return una cadena con todos los atributos del visitante
     */
    @Override
    public String toString() {
        return id + ", " + correo + ", " + telefono + ", " + nombreCompleto;
    }
}
