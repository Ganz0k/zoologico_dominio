/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Entidad que representa un itinerario del zoológico
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
    private List<Dia> diasRecorrido;

    /**
     * Constructor por defecto
     */
    public Itinerario() {

    }

    /**
     * Contructor que solo inicializa el id y el nombre
     *
     * @param id id del itinerario
     * @param nombre nombre del itinerario
     */
    public Itinerario(ObjectId id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Contructor que inicializa todo menos el id
     *
     * @param nombre nombre del itinerario
     * @param duracionRecorrido duración del itinerario
     * @param longitud longitud del itinerario
     * @param maximoVisitantes máximo de visistantes
     * @param zonasRecorridas zonas recorridas
     * @param diasRecorrido días en que se recorre
     */
    public Itinerario(String nombre, Integer duracionRecorrido, Double longitud, Integer maximoVisitantes, List<Zona> zonasRecorridas, List<Dia> diasRecorrido) {
        this.nombre = nombre;
        this.duracionRecorrido = duracionRecorrido;
        this.longitud = longitud;
        this.maximoVisitantes = maximoVisitantes;
        this.zonasRecorridas = zonasRecorridas;
        int num = 0;
        for (Zona z : this.zonasRecorridas) {
            num = num + z.getEspecies().size();
        }
        this.numEspecies = num;
        this.diasRecorrido = diasRecorrido;
    }

    /**
     * Contructor que inicializa todo
     *
     * @param id id del itinerario
     * @param nombre nombre del itinerario
     * @param duracionRecorrido duración del itinerario
     * @param longitud longitud del itinerario
     * @param maximoVisitantes máximo de visistantes
     * @param zonasRecorridas zonas recorridas
     * @param diasRecorrido días en que se recorre
     */
    public Itinerario(ObjectId id, String nombre, Integer duracionRecorrido, Double longitud, Integer maximoVisitantes, List<Zona> zonasRecorridas, List<Dia> diasRecorrido) {
        this.id = id;
        this.nombre = nombre;
        this.duracionRecorrido = duracionRecorrido;
        this.longitud = longitud;
        this.maximoVisitantes = maximoVisitantes;
        this.zonasRecorridas = zonasRecorridas;
        int num = 0;
        for (Zona z : this.zonasRecorridas) {
            num = num + z.getEspecies().size();
        }
        this.numEspecies = num;
        this.diasRecorrido = diasRecorrido;
    }

    /**
     * Constructor que inicializa todo
     *
     * @param id id del itinerario
     * @param nombre nombre del itinerario
     * @param duracionRecorrido duración del itinerario
     * @param longitud longitud del itinerario
     * @param maximoVisitantes máximo de visistantes
     * @param zonasRecorridas zonas recorridas
     * @param numEspecies número de especies
     * @param diasRecorrido días en que se recorre
     */
    public Itinerario(ObjectId id, String nombre, Integer duracionRecorrido, Double longitud, Integer maximoVisitantes, List<Zona> zonasRecorridas, Integer numEspecies, List<Dia> diasRecorrido) {
        this.id = id;
        this.nombre = nombre;
        this.duracionRecorrido = duracionRecorrido;
        this.longitud = longitud;
        this.maximoVisitantes = maximoVisitantes;
        this.zonasRecorridas = zonasRecorridas;
        this.numEspecies = numEspecies;
        this.diasRecorrido = diasRecorrido;
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
     * Regresa la duración
     *
     * @return duración
     */
    public Integer getDuracionRecorrido() {
        return duracionRecorrido;
    }

    /**
     * Le asigna una nueva duración
     *
     * @param duracionRecorrido duración a asignar
     */
    public void setDuracionRecorrido(Integer duracionRecorrido) {
        this.duracionRecorrido = duracionRecorrido;
    }

    /**
     * Regresa la longitud
     *
     * @return longitud
     */
    public Double getLongitud() {
        return longitud;
    }

    /**
     * Le asigna una nueva longitud
     *
     * @param longitud longitu a asignar
     */
    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    /**
     * Regresa el máximo de visitantes
     *
     * @return máximo de visitantes
     */
    public Integer getMaximoVisitantes() {
        return maximoVisitantes;
    }

    /**
     * Le asigna un nuevo máximo
     *
     * @param maximoVisitantes nuevo máximo
     */
    public void setMaximoVisitantes(Integer maximoVisitantes) {
        this.maximoVisitantes = maximoVisitantes;
    }

    /**
     * Regresa las zonas recorridas
     *
     * @return zonas recorridas
     */
    public List<Zona> getZonasRecorridas() {
        return zonasRecorridas;
    }

    /**
     * Le asigna nuevas zonas a recorrer
     *
     * @param zonasRecorridas zonas a asignar
     */
    public void setZonasRecorridas(List<Zona> zonasRecorridas) {
        this.zonasRecorridas = zonasRecorridas;
        int num = 0;
        for (Zona z : this.zonasRecorridas) {
            num = num + z.getEspecies().size();
        }
        this.numEspecies = num;
    }

    /**
     * Regresa el número de especies
     *
     * @return número de especies
     */
    public Integer getNumEspecies() {
        return numEspecies;
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
     * Regresa los días del recorrido
     *
     * @return días del recorrido
     */
    public List<Dia> getDiasRecorrido() {
        return diasRecorrido;
    }

    /**
     * Le asigna nuevos días
     *
     * @param diasRecorrido días a asignar
     */
    public void setDiasRecorrido(List<Dia> diasRecorrido) {
        this.diasRecorrido = diasRecorrido;
    }

    /**
     * Regresa el hash code del itinerario
     *
     * @return has code del itinerario
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara dos itinerarios si son iguales regresa true, si no false
     *
     * @param obj itinerario a comparar
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
        final Itinerario other = (Itinerario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    /**
     * Regresa una cadena con todos los atributos del itinerario
     *
     * @return una cadena con todos los atributos del itinerario
     */
    @Override
    public String toString() {
        return nombre;
    }
}
