/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeradores.Sexo;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Entidad que representa un Animal de un zoológico. Un objeto de este tipo será
 * enviado y almacenado en la base de datos del zoológico
 *
 * @author luisg
 */
public class Animal {

    private ObjectId id;
    private String nombreAnimal;
    private Integer edad;
    private Sexo sexo;

    /**
     * Constructor por defecto
     */
    public Animal() {

    }

    /**
     * Constructor que solo inicializa el nombre y la edad
     *
     * @param nombreAnimal nombre del animal
     * @param edad edad del animal
     */
    public Animal(String nombreAnimal, Integer edad) {
        this.nombreAnimal = nombreAnimal;
        this.edad = edad;
    }

    /**
     * Constructor que inicializa todos los atributos menos el id
     *
     * @param nombreAnimal nombre del animal
     * @param edad edad del animal
     * @param sexo sexo del animal
     */
    public Animal(String nombreAnimal, Integer edad, Sexo sexo) {
        this.nombreAnimal = nombreAnimal;
        this.edad = edad;
        this.sexo = sexo;
    }

    /**
     * Constructor que inicializa todos los atributos del animal
     *
     * @param id id del animal
     * @param nombreAnimal nombre del animal
     * @param edad edad del animal
     * @param sexo sexo del animal
     */
    public Animal(ObjectId id, String nombreAnimal, Integer edad, Sexo sexo) {
        this.id = id;
        this.nombreAnimal = nombreAnimal;
        this.edad = edad;
        this.sexo = sexo;
    }

    /**
     * Regresa el id del animal
     *
     * @return
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Le asigna un nuevo id al animal
     *
     * @param id id a asignar
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Regresa el nombre del animal
     *
     * @return nombre del animal
     */
    public String getNombreAnimal() {
        return nombreAnimal;
    }

    /**
     * Le asigna un nuevo nombre al animal
     *
     * @param nombreAnimal nombre a asignar
     */
    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    /**
     * Regresa la edad del animal
     *
     * @return edad del animal
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * Le asigna una nueva edad al animal
     *
     * @param edad edad a asignar
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * Regresa el sexo del animal
     *
     * @return sexo del animal
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Le asigna un nuevo sexo al animal
     *
     * @param sexo sexo a asignar
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * Regresa el hash code del animal
     *
     * @return hash code del animal
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara este animal con el que se asigna en el parámetro del método.
     * Devuelve true si ambos ids son iguales, false en el caso contrario
     *
     * @param obj animal a comparar
     * @return true si ambos ids son iguales, false en el caso contrario
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
        final Animal other = (Animal) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    /**
     * Devuelve una cadena con todos los atributos del animal
     *
     * @return cadena con todos los atributos del animal
     */
    @Override
    public String toString() {
        return id + ", " + nombreAnimal + ", " + edad + ", " + sexo;
    }
}
