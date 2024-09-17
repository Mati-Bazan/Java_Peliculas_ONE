package com.aluracursos.screenmatch.calculos;

import com.aluracursos.sreenmatch.modelos.Pelicula;
import com.aluracursos.sreenmatch.modelos.Serie;
import com.aluracursos.sreenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    public int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
