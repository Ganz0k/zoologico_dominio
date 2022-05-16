/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Entidad que representa una queja del zoológico
 *
 * @author luisg
 */
public class Queja {

    private ObjectId id;
    private String queja;
    private Visitante visitante;
    private Itinerario itinerario;
    private Guia guia;

    /**
     * Constructor por defecto
     */
    public Queja() {

    }

    /**
     * Constructor que inicializa todo menos el id
     *
     * @param queja queja
     * @param visitante visitante que hace la queja
     * @param itinerario itinerario de la qeuja
     * @param guia guia de la queja
     */
    public Queja(String queja, Visitante visitante, Itinerario itinerario, Guia guia) {
        this.queja = queja;
        this.visitante = visitante;
        this.itinerario = itinerario;
        this.guia = guia;
    }

    /**
     * Constructor que inicializa todo
     *
     * @param id id de la queja
     * @param queja queja
     * @param visitante visitante que hace la queja
     * @param itinerario itinerario de la qeuja
     * @param guia guia de la queja
     */
    public Queja(ObjectId id, String queja, Visitante visitante, Itinerario itinerario, Guia guia) {
        this.id = id;
        this.queja = queja;
        this.visitante = visitante;
        this.itinerario = itinerario;
        this.guia = guia;
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
     * Regresa la queja
     *
     * @return queja
     */
    public String getQueja() {
        return queja;
    }

    /**
     * Le asigna una nueva queja
     *
     * @param queja queja a asignar
     */
    public void setQueja(String queja) {
        this.queja = queja;
    }

    /**
     * Regresa el visitante
     *
     * @return visitante
     */
    public Visitante getVisitante() {
        return visitante;
    }

    /**
     * Le asigna un nuevo visitante
     *
     * @param visitante visitante a asignar
     */
    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    /**
     * Regresa el itinerario
     *
     * @return itinerario
     */
    public Itinerario getItinerario() {
        return itinerario;
    }

    /**
     * Le asigna un nuevo itinerario
     *
     * @param itinerario itinerario a asignar
     */
    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    /**
     * Regresa el guia
     *
     * @return guia
     */
    public Guia getGuia() {
        return guia;
    }

    /**
     * Le asigna un nuevo guia
     *
     * @param guia guia a asignar
     */
    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    /**
     * Regresa el hash code de la queja
     *
     * @return has code de la queja
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara dos quejas si son iguales regresa true, si no false
     *
     * @param obj queja a comparar
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
        final Queja other = (Queja) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    /**
     * Regresa una cadena con todos los atributos de la queja
     *
     * @return una cadena con todos los atributos de la queja
     */
    @Override
    public String toString() {
        return id + ", " + queja + ", " + visitante + ", " + itinerario + ", " + guia;
    }
}
