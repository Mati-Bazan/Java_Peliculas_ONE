package com.aluracursos.sreenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String directos;

    public String getDirectos() {
        return directos;
    }

    public void setDirectos(String directos) {
        this.directos = directos;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaLaMedia() / 2);
    }
}
