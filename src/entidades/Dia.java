/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalTime;
import java.util.Objects;

/**
 *
 * @author PC OSCAR
 */
public class Dia {
    
    private String descripcion;
    private LocalTime hora;

    public Dia(String descripcion, LocalTime hora) {
        this.descripcion = descripcion;
        this.hora = hora;
    }

    public Dia() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.descripcion);
        hash = 53 * hash + Objects.hashCode(this.hora);
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
        final Dia other = (Dia) obj;
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return Objects.equals(this.hora, other.hora);
    }

    @Override
    public String toString() {
        return "Dia{" + "descripcion=" + descripcion + ", hora=" + hora + '}';
    }
    
}
