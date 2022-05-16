/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Objects;

/**
 * Entidad que representa un día
 *
 * @author PC OSCAR
 */
public class Dia {

    private String descripcion;
    private String hora;

    /**
     * Constructor que solo inicia la descripción
     *
     * @param descripcion descripción del día
     */
    public Dia(String descripcion) {
        this.descripcion = descripcion;
        this.hora = null;
    }

    /**
     * Contructor que inicializa todo
     *
     * @param descripcion descripción del día
     * @param hora hora del día
     */
    public Dia(String descripcion, String hora) {
        this.descripcion = descripcion;
        this.hora = hora;
    }

    /**
     * Constructor por defecto
     */
    public Dia() {
    }

    /**
     * Regresa la descripción del día
     *
     * @return descripción del día
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Le asigna una nueva descripción al día
     *
     * @param descripcion descripción a asignar
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Regresa la hora del día
     *
     * @return hora del día
     */
    public String getHora() {
        return hora;
    }

    /**
     * Le asigna una nueva hora al día
     *
     * @param hora hora a asignar
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * Devuelve el hash code del día
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.descripcion);
        hash = 53 * hash + Objects.hashCode(this.hora);
        return hash;
    }

    /**
     * Compara dos días si son iguales regresa true, si no false
     *
     * @param obj día a comparar
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
        final Dia other = (Dia) obj;
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return Objects.equals(this.hora, other.hora);
    }

    /**
     * Regresa una cadena con todos los atributos del día
     *
     * @return una cadena con todos los atributos del día
     */
    @Override
    public String toString() {
        return descripcion;
    }
}
