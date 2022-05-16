/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 * Entidad que hereda a la clase Empleado y representa a un Administrador de un
 * zoológico. Un objeto de este tipo será enviado y almacenado en la base de
 * datos del zoológico
 *
 * @author luisg
 */
public class Administrador extends Empleado {

    private String contrasenia;

    /**
     * Constructor por defecto
     */
    public Administrador() {
        super();
    }

    /**
     * Constructor que inicializa todos los atributos a excepción del id
     *
     * @param nombre nombre del administrador
     * @param telefono teléfono del administrador
     * @param fechaComienzo fecha en la que el administrador comenzó a trabajar
     * @param discriminador discriminador que lo diferencía de las demás clases
     * que heredan a Empleado
     * @param contrasenia contraseña del administrador
     */
    public Administrador(String nombre, String telefono, Date fechaComienzo, String discriminador, String contrasenia) {
        super(nombre, telefono, fechaComienzo, discriminador);
        this.contrasenia = contrasenia;
    }

    /**
     * Constructor que inicializa todos los atributos del administrador
     *
     * @param id id del administrador
     * @param nombre nombre del administrador
     * @param telefono teléfono del administrador
     * @param fechaComienzo fecha en la que el administrador comenzó a trabajar
     * @param discriminador discriminador que lo diferencía de las demás clases
     * que heredan a Empleado
     * @param contrasenia contraseña del administrador
     */
    public Administrador(ObjectId id, String nombre, String telefono, Date fechaComienzo, String discriminador, String contrasenia) {
        super(id, nombre, telefono, fechaComienzo, discriminador);
        this.contrasenia = contrasenia;
    }

    /**
     * Regresa la contraseña del administrador
     *
     * @return la contraseña del administrador
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Le asigna una nueva contraseña al administrador
     *
     * @param contrasenia contraseña a asignar
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Regresa una cadena con todos los atributos del administrador
     *
     * @return una cadena con todos los atributos del administrador
     */
    @Override
    public String toString() {
        return super.toString() + ", " + contrasenia;
    }
}
