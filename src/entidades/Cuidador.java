/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Entidad que hereda a la clase Empleado y representa a un Cuidador de un
 * zoológico. Un objeto de este tipo será enviado y almacenado en la base de
 * datos del zoológico
 *
 * @author luisg
 */
public class Cuidador extends Empleado {

    private List<Especie> especiesExperto;
    private List<String> diasCargo;

    /**
     * Constructor por defecto
     */
    public Cuidador() {
        super();
    }

    /**
     * Constructor que inicializa todos los atributos menos el id y la lista de
     * especies en las que es experto
     *
     * @param nombre nombre del cuidador
     * @param telefono teléfono del cuidador
     * @param fechaComienzo fecha en la que el cuidador comenzó a trabajar
     * @param discriminador discriminador que lo diferencía de las demás clases
     * que heredan a Empleado
     * @param diasCargo días de la semana en las que se hace cargo de sus
     * especies
     */
    public Cuidador(String nombre, String telefono, Date fechaComienzo, String discriminador, List<String> diasCargo) {
        super(nombre, telefono, fechaComienzo, discriminador);
        this.diasCargo = diasCargo;
    }

    /**
     * Contructor que inicializa todo menos la lista de especies en la que es
     * experto
     *
     * @param id id del cuidador
     * @param nombre nombre del cuidador
     * @param telefono teléfono del cuidador
     * @param fechaComienzo fecha en la que el cuidador comenzó a trabajar
     * @param discriminador discriminador que lo diferencía de las demás clases
     * que heredan a Empleado
     * @param diasCargo días de la semana en las que se hace cargo de sus
     * especies
     */
    public Cuidador(ObjectId id, String nombre, String telefono, Date fechaComienzo, String discriminador, List<String> diasCargo) {
        super(id, nombre, telefono, fechaComienzo, discriminador);
        this.diasCargo = diasCargo;
    }

    /**
     * Constructor que inicializa todos los atributos de la clase
     *
     * @param id id del cuidador
     * @param nombre nombre del cuidador
     * @param telefono teléfono del cuidador
     * @param fechaComienzo fecha en la que el cuidador comenzó a trabajar
     * @param discriminador discriminador que lo diferencía de las demás clases
     * que heredan a Empleado
     * @param diasCargo días de la semana en las que se hace cargo de sus
     * especies
     * @param especiesExperto especies en las que es experto
     */
    public Cuidador(ObjectId id, String nombre, String telefono, Date fechaComienzo, String discriminador, List<String> diasCargo, List<Especie> especiesExperto) {
        super(id, nombre, telefono, fechaComienzo, discriminador);
        this.diasCargo = diasCargo;
        this.especiesExperto = especiesExperto;
    }

    /**
     * Regresa la lista de especies en la que es experto
     *
     * @return lista de especies en la que es experto
     */
    public List<Especie> getEspeciesExperto() {
        return especiesExperto;
    }

    /**
     * Le asigna una nueva lista de especies
     *
     * @param especiesExperto lista de especies a asignar
     */
    public void setEspeciesExperto(List<Especie> especiesExperto) {
        this.especiesExperto = especiesExperto;
    }

    /**
     * Regresa la lista de dias en las que se hace cargo
     *
     * @return lista de dias en las que se hace cargo
     */
    public List<String> getDiasCargo() {
        return diasCargo;
    }

    /**
     * Le asigna una nueva lista de dias
     *
     * @param diasCargo lista de dias a asignar
     */
    public void setDiasCargo(List<String> diasCargo) {
        this.diasCargo = diasCargo;
    }

    /**
     * Regresa una cadena con todos los atributos del cuidador
     *
     * @return una cadena con todos los atributos del cuidador
     */
    @Override
    public String toString() {
        return super.toString() + ", " + especiesExperto + ", " + diasCargo;
    }
}
