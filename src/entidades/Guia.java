/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author luisg
 */
public class Guia extends Empleado {
    
    private List<Itinerario> itinerarios;

    public Guia() {
        super();
    }

    public Guia(ObjectId id, String nombre) {
        super(id, nombre);
    }

    public Guia(String nombre, String telefono, Date fechaComienzo, String discriminador, List<Itinerario> itinerarios) {
        super(nombre, telefono, fechaComienzo, discriminador);
        this.itinerarios = itinerarios;
        
    }

    public Guia(ObjectId id, String nombre, String telefono, Date fechaComienzo, String discriminador, List<Itinerario> itinerarios) {
        super(id, nombre, telefono, fechaComienzo, discriminador);
        this.itinerarios = itinerarios;
    }

    public List<Itinerario> getIdsItinerarios() {
        return itinerarios;
    }

    public void setItinerarios(List<Itinerario> itinerarios) {
        this.itinerarios = itinerarios;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + itinerarios;
    }
}
