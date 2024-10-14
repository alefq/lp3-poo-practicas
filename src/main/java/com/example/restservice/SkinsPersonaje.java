package com.example.restservice;

public class SkinsPersonaje extends Skin {
    private String descripcion;
    private String nombre;

    public SkinsPersonaje(int i) {
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
