package com.aluracursos.sreenmatch.modelos;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones; // Modificador de acceso private
    private int totalDeLasEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) { // Setter
        this.nombre = nombre; // this.nombre = refecencia a nombre en setNombre | = nombre refecencia al nombre que le dara el ususario
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones(){ // Getter
        return totalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica (){
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Fue lanzada: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
    }

    public void evalua(double nota){ // double nota = parametro
        sumaDeLasEvaluaciones += nota; // sumaDeLasEvaluaciones es igual a ella misma + nota
        totalDeLasEvaluaciones ++;
    }

    public double calculaLaMedia() {
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
