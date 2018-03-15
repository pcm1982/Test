package com.example.usuario.test.com.test.beans;

import java.io.Serializable;

/**
 * Created by Usuario on 15/03/2018.
 */

public class PersonaDTO implements Serializable{

    private String nombre;
    private DireccionDTO direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DireccionDTO getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionDTO direccion) {
        this.direccion = direccion;
    }

    public PersonaDTO(String nombre, DireccionDTO direccion) {

        this.nombre = nombre;
        this.direccion = direccion;
    }

    public PersonaDTO() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonaDTO that = (PersonaDTO) o;

        if (!getNombre().equals(that.getNombre())) return false;
        return getDireccion().equals(that.getDireccion());
    }

    @Override
    public int hashCode() {
        int result = getNombre().hashCode();
        result = 31 * result + getDireccion().hashCode();
        return result;
    }
}
