package com.example;

public class Jugador {
    private String nombre;
    private int edad;
    private String posicion;
    private int numeroCamiseta;
    private String equipo;

    Jugador(String nombre, int edad, String posicion, int numeroCamiseta, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void mostrarInformacion() {
        System.out.println("--------------------------------------------------");
        System.out.println("Información del jugador");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Posición: " + posicion);
        System.out.println("Número de Camiseta: " + numeroCamiseta);
        System.out.println("Equipo: " + equipo);
    }
}
