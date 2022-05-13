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
public class Itinerario {
    
    private ObjectId id;
    private String nombre;
    private Integer duracionRecorrido;
    private Double longitud;
    private Integer maximoVisitantes;
    private List<Zona> zonasRecorridas;
    private Integer numEspecies;
    private List<String> diasRecorrido;

    public Itinerario() {
        
    }

    public Itinerario(ObjectId id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Itinerario(String nombre, Integer duracionRecorrido, Double longitud, Integer maximoVisitantes, List<Zona> zonasRecorridas, List<String> diasRecorrido) {
        this.nombre = nombre;
        this.duracionRecorrido = duracionRecorrido;
        this.longitud = longitud;
        this.maximoVisitantes = maximoVisitantes;
        this.zonasRecorridas = zonasRecorridas;
        int num = 0;
        for(Zona z : this.zonasRecorridas){
            num = num + z.getEspecies().size();
        }
        this.numEspecies = num;
        this.diasRecorrido = diasRecorrido;
    }

    public Itinerario(ObjectId id, String nombre, Integer duracionRecorrido, Double longitud, Integer maximoVisitantes, List<Zona> zonasRecorridas, List<String> diasRecorrido) {
        this.id = id;
        this.nombre = nombre;
        this.duracionRecorrido = duracionRecorrido;
        this.longitud = longitud;
        this.maximoVisitantes = maximoVisitantes;
        this.zonasRecorridas = zonasRecorridas;
        int num = 0;
        for(Zona z : this.zonasRecorridas){
            num = num + z.getEspecies().size();
        }
        this.numEspecies = num;
        this.diasRecorrido = diasRecorrido;
    }

    public Itinerario(ObjectId id, String nombre, Integer duracionRecorrido, Double longitud, Integer maximoVisitantes, List<Zona> zonasRecorridas, Integer numEspecies, List<String> diasRecorrido) {
        this.id = id;
        this.nombre = nombre;
        this.duracionRecorrido = duracionRecorrido;
        this.longitud = longitud;
        this.maximoVisitantes = maximoVisitantes;
        this.zonasRecorridas = zonasRecorridas;
        this.numEspecies = numEspecies;
        this.diasRecorrido = diasRecorrido;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Integer getDuracionRecorrido() {
        return duracionRecorrido;
    }

    public void setDuracionRecorrido(Integer duracionRecorrido) {
        this.duracionRecorrido = duracionRecorrido;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Integer getMaximoVisitantes() {
        return maximoVisitantes;
    }

    public void setMaximoVisitantes(Integer maximoVisitantes) {
        this.maximoVisitantes = maximoVisitantes;
    }

    public List<Zona> getZonasRecorridas() {
        return zonasRecorridas;
    }

    public void setZonasRecorridas(List<Zona> zonasRecorridas) {
        this.zonasRecorridas = zonasRecorridas;
        int num = 0;
        for(Zona z : this.zonasRecorridas){
            num = num + z.getEspecies().size();
        }
        this.numEspecies = num;
    }

    public Integer getNumEspecies() {
        return numEspecies;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getDiasRecorrido() {
        return diasRecorrido;
    }

    public void setDiasRecorrido(List<String> diasRecorrido) {
        this.diasRecorrido = diasRecorrido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
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
        final Itinerario other = (Itinerario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + ", " + duracionRecorrido + ", " + longitud + ", " + maximoVisitantes + ", " + zonasRecorridas + ", " + numEspecies + ", " + diasRecorrido;
    }
}
