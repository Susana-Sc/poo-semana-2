package com.example;

public class Main {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Lionel Messi", 33, "Delantero", 10, "Barcelona");
        Jugador jugador2 = new Jugador("Cristiano Ronaldo", 35, "Delantero", 7, "Juventus");

        jugador1.mostrarInformacion();
        jugador2.mostrarInformacion();

        jugador1.setEdad(26);
        jugador2.setEquipo("Real Madrid");

        jugador1.mostrarInformacion();
        jugador2.mostrarInformacion();

    }
}