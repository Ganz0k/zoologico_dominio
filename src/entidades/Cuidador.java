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
public class Cuidador extends Empleado {
    
    private List<Especie> especiesExperto;
    private List<String> diasCargo;

    public Cuidador() {
        super();
    }

    public Cuidador(String nombre, String telefono, Date fechaComienzo, String discriminador, List<String> diasCargo) {
        super(nombre, telefono, fechaComienzo, discriminador);
        this.diasCargo = diasCargo;
    }

    public Cuidador(ObjectId id, String nombre, String telefono, Date fechaComienzo, String discriminador, List<String> diasCargo) {
        super(id, nombre, telefono, fechaComienzo, discriminador);
        this.diasCargo = diasCargo;
    }

    public Cuidador(ObjectId id, String nombre, String telefono, Date fechaComienzo, String discriminador, List<String> diasCargo, List<Especie> especiesExperto) {
        super(id, nombre, telefono, fechaComienzo, discriminador);
        this.diasCargo = diasCargo;
        this.especiesExperto = especiesExperto;
    }

    public List<Especie> getEspeciesExperto() {
        return especiesExperto;
    }

    public void setEspeciesExperto(List<Especie> especiesExperto) {
        this.especiesExperto = especiesExperto;
    }

    public List<String> getDiasCargo() {
        return diasCargo;
    }

    public void setDiasCargo(List<String> diasCargo) {
        this.diasCargo = diasCargo;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + especiesExperto + ", " + diasCargo;
    }
}
