/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeradores.Sexo;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author luisg
 */
public class Animal {
    
    private ObjectId id;
    private String nombreAnimal;
    private Integer edad;
    private Sexo sexo;

    public Animal() {
        
    }

    public Animal(String nombreAnimal, Integer edad) {
        this.nombreAnimal = nombreAnimal;
        this.edad = edad;
    }

    public Animal(String nombreAnimal, Integer edad, Sexo sexo) {
        this.nombreAnimal = nombreAnimal;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Animal(ObjectId id, String nombreAnimal, Integer edad, Sexo sexo) {
        this.id = id;
        this.nombreAnimal = nombreAnimal;
        this.edad = edad;
        this.sexo = sexo;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final Animal other = (Animal) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + ", " + nombreAnimal + ", " + edad + ", " + sexo;
    }
}
