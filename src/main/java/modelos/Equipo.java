package main.java.modelos;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private String nombre;
	
	private List<Jugador> jugadores;
	
	private List<Partido> partidos;

	public Equipo() {
		super();
		jugadores = new ArrayList<Jugador>();
		partidos = new ArrayList<Partido>();
	}

	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
		jugadores = new ArrayList<Jugador>();
		partidos = new ArrayList<Partido>();
	}

	public Equipo(String nombre, List<Jugador> jugadores) {
		super();
		this.nombre = nombre;
		this.jugadores = jugadores;
		partidos = new ArrayList<Partido>();
	}

	public void agregarPartido(Partido p) {
		if(p != null) {
			try {
				this.partidos.add(p);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + "]";
	}
	
	
	
	
}
