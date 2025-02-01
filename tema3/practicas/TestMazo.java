package com.utad.poo.tema3.practicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Clase Carta
class Carta {
    private int numero;
    private String palo;
    private int posicionEnMazo;

    public Carta(int numero, String palo, int posicionEnMazo) {
        this.numero = numero;
        this.palo = palo;
        this.posicionEnMazo = posicionEnMazo;
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    public int getPosicionEnMazo() {
        return posicionEnMazo;
    }

    @Override
    public String toString() {
        return "Carta [numero=" + numero + ", palo=" + palo + ", posicionEnMazo=" + posicionEnMazo + "]";
    }
}

// Clase Mazo (Baraja)
class Mazo {
    private List<Carta> cartas;
    private List<Carta> monton;
    private int siguiente;

    public Mazo() {
        this.cartas = new ArrayList<>();
        this.monton = new ArrayList<>();
        this.siguiente = 0;
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        int posicionEnMazo = 1;

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo, posicionEnMazo++));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
        siguiente = 0;
    }

    public Carta siguienteCarta() {
        if (siguiente >= cartas.size()) {
            System.out.println("No hay más cartas.");
            return null;
        }
        Carta carta = cartas.get(siguiente++);
        monton.add(carta);
        return carta;
    }

    public int cartasDisponibles() {
        return cartas.size() - siguiente;
    }

    public List<Carta> darCartas(int cantidad) {
        if (cartasDisponibles() < cantidad) {
            System.out.println("No hay suficientes cartas.");
            return null;
        }
        List<Carta> mano = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            mano.add(siguienteCarta());
        }
        return mano;
    }

    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("No ha salido ninguna carta.");
        } else {
            for (int i = 0; i < monton.size(); i++) {
                System.out.println("La carta en la posición " + i + " es " + monton.get(i));
            }
        }
    }

    public void mostrarBaraja() {
        for (int i = siguiente; i < cartas.size(); i++) {
            System.out.println("La carta en la posición " + i + " es " + cartas.get(i));
        }
    }
}

// Clase Jugador
class Jugador {
    private String nombre;
    private List<Carta> mano;
    private int rondasGanadas;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
        this.rondasGanadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void recibirCartas(List<Carta> cartas) {
        mano.addAll(cartas);
    }

    public Carta jugarCarta() {
        return mano.isEmpty() ? null : mano.remove(0);
    }

    public void ganarRonda() {
        rondasGanadas++;
    }

    public int getRondasGanadas() {
        return rondasGanadas;
    }
}

// Clase PartidaMaximos
class PartidaMaximos {
    private Jugador[] jugadores;
    private Mazo mazo;

    public PartidaMaximos() {
        mazo = new Mazo();
        jugadores = new Jugador[4];
        jugadores[0] = new Jugador("Jugador 1");
        jugadores[1] = new Jugador("Jugador 2");
        jugadores[2] = new Jugador("Jugador 3");
        jugadores[3] = new Jugador("Jugador 4");
    }

    public void repartirCartas() {
        mazo.barajar();
        for (Jugador jugador : jugadores) {
            jugador.recibirCartas(mazo.darCartas(10));
        }
    }

    public void jugar() {
        repartirCartas();
        for (int ronda = 0; ronda < 10; ronda++) {
            System.out.println("Ronda " + (ronda + 1));
            Jugador ganador = null;
            Carta cartaGanadora = null;
            for (Jugador jugador : jugadores) {
                Carta carta = jugador.jugarCarta();
                System.out.println(jugador.getNombre() + " juega " + carta);
                if (cartaGanadora == null || carta.getNumero() > cartaGanadora.getNumero()) {
                    cartaGanadora = carta;
                    ganador = jugador;
                }
            }
            System.out.println("Gana la ronda: " + ganador.getNombre());
            ganador.ganarRonda();
        }

        Jugador ganadorPartida = jugadores[0];
        for (Jugador jugador : jugadores) {
            if (jugador.getRondasGanadas() > ganadorPartida.getRondasGanadas()) {
                ganadorPartida = jugador;
            }
        }

        System.out.println("El ganador de la partida es " + ganadorPartida.getNombre());
    }
}

// Clase TestMazo
public class TestMazo {
    public static void main(String[] args) {
        Mazo mazo = new Mazo();
        
        // Mostrar el estado inicial del mazo
        System.out.println("Estado del mazo o baraja, mostrarMazo():");
        mazo.mostrarBaraja();
        
        // Barajar el mazo
        System.out.println("\n** Procedemos a barajar **");
        mazo.barajar();
        
        // Mostrar el estado después de barajar
        System.out.println("Estado después de barajar, mostrarMazo():");
        mazo.mostrarBaraja();
        
        // Dar 5 cartas a un jugador
        System.out.println("\nDamos 5 cartas a un jugador:");
        List<Carta> mano = mazo.darCartas(5);
        if (mano != null) {
            for (Carta carta : mano) {
                System.out.println(carta);
            }
        }
        
        // Mostrar el estado del mazo después de repartir
        System.out.println("\nEstado del mazo o baraja después de haber repartido 5 cartas:");
        mazo.mostrarBaraja();
        
        // Mostrar las cartas que ya han salido
        System.out.println("\nEstado de las cartas repartidas, cartasMonton():");
        mazo.cartasMonton();

        // Jugar una partida de PartidaMaximos
        System.out.println("\n** Jugamos una partida de PartidaMaximos **");
        PartidaMaximos partida = new PartidaMaximos();
        partida.jugar();
    }
}
