/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Entidad que hereda a la clase Empleado y representa a un Guía de un zoológico.
 * Un objeto de este tipo será enviado y almacenado en la base de datos del zoológico
 * @author luisg
 */
public class Guia extends Empleado {
    
    private List<Itinerario> itinerarios;

    /**
     * Constructor por defecto
     */
    public Guia() {
        super();
    }

    /**
     * Constructor que solo inicializa el id y nombre
     * @param id id del guia
     * @param nombre nombre del guia
     */
    public Guia(ObjectId id, String nombre) {
        super(id, nombre);
    }

    /**
     * Constructor que inicializa el id, nombre y teléfono
     * @param id id del guia
     * @param nombre nombre del guia
     * @param telefono teléfono del guia
     */
    public Guia(ObjectId id, String nombre, String telefono){
        super(id, nombre, telefono);
    }
    
    /**
     * Constructor que inicializa todo menos el id
     * @param nombre nombre del guia
     * @param telefono teléfono del guia
     * @param fechaComienzo fecha en la que comenzó el guia
     * @param discriminador discriminador del guia
     * @param itinerarios itinerarios del guia
     */
    public Guia(String nombre, String telefono, Date fechaComienzo, String discriminador, List<Itinerario> itinerarios) {
        super(nombre, telefono, fechaComienzo, discriminador);
        this.itinerarios = itinerarios;
        
    }

    /**
     * Constructor que inicializa todo
     * @param id id del guia
     * @param nombre nombre del guia
     * @param telefono teléfono del guia
     * @param fechaComienzo fecha en la que comenzó el guia
     * @param discriminador discriminador del guia
     * @param itinerarios itinerarios del guia
     */
    public Guia(ObjectId id, String nombre, String telefono, Date fechaComienzo, String discriminador, List<Itinerario> itinerarios) {
        super(id, nombre, telefono, fechaComienzo, discriminador);
        this.itinerarios = itinerarios;
    }

    /**
     * Regresa los itinerarios del guia
     * @return itinerarios del guia
     */
    public List<Itinerario> getItinerarios() {
        return itinerarios;
    }

    /**
     * Le asigna nuevos itinerarios del guia
     * @param itinerarios itinerarios a asignar
     */
    public void setItinerarios(List<Itinerario> itinerarios) {
        this.itinerarios = itinerarios;
    }

    /**
     * Regresa una cadena con todos los atributos del guia
     *
     * @return una cadena con todos los atributos del guia
     */
    @Override
    public String toString() {
        return super.getNombre();
    }
}
