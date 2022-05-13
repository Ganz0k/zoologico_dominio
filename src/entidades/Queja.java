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
public class Queja {
    
    private ObjectId id;
    private String queja;
    private Visitante visitante;
    private Itinerario itinerario;
    private Guia guia;

    public Queja() {
        
    }

    public Queja(String queja, Visitante visitante, Itinerario itinerario, Guia guia) {
        this.queja = queja;
        this.visitante = visitante;
        this.itinerario = itinerario;
        this.guia = guia;
    }

    public Queja(ObjectId id, String queja, Visitante visitante, Itinerario itinerario, Guia guia) {
        this.id = id;
        this.queja = queja;
        this.visitante = visitante;
        this.itinerario = itinerario;
        this.guia = guia;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getQueja() {
        return queja;
    }

    public void setQueja(String queja) {
        this.queja = queja;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final Queja other = (Queja) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + ", " + queja + ", " + visitante + ", " + itinerario + ", " + guia;
    }
}
