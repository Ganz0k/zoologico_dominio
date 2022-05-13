/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author luisg
 */
public class Administrador extends Empleado {
    
    private String contrasenia;

    public Administrador() {
        super();
    }

    public Administrador(String nombre, String telefono, Date fechaComienzo, String discriminador, String contrasenia) {
        super(nombre, telefono, fechaComienzo, discriminador);
        this.contrasenia = contrasenia;
    }

    public Administrador(ObjectId id, String nombre, String telefono, Date fechaComienzo, String discriminador, String contrasenia) {
        super(id, nombre, telefono, fechaComienzo, discriminador);
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + contrasenia;
    }
}
