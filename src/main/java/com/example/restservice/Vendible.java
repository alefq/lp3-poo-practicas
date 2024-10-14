package com.example.restservice;

import py.edu.uc.lp3.interfaces.Avatar;
import py.edu.uc.lp3.interfaces.Cotizable;
import py.edu.uc.lp3.interfaces.Posicion;
import py.edu.uc.lp3.interfaces.VideoJuegoPosicionable;

public class Vendible  implements VideoJuegoPosicionable, Cotizable {
    Long precio;
    String descripcion;

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public Posicion getUbicacion() {
        return null;
    }

    @Override
    public Avatar getAvatar() {
        return null;
    }

    @Override
    public Long getPrecio(String identificador) {
        return 0l;
    }

    @Override
    public Double getPrecioUSD(String identificador) {
        return 0.0;
    }
}
