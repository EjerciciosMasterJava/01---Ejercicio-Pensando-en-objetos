package main.java.aplicacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import main.java.modelos.Equipo;
import main.java.modelos.Jugador;
import main.java.modelos.Liga;
import main.java.modelos.Partido;

public abstract class EquiposUtil {

	public static List<Equipo> getEquipos(int cantidad) {
		List<Equipo> equipos = new ArrayList<Equipo>();
		for (int i = 0; i < cantidad; i++) {
			Equipo e = new Equipo("equipo" + (i + 1));
			e.setJugadores(getJugadores(e, 11));
			equipos.add(e);
		}
		return equipos;
	}

	public static List<Jugador> getJugadores(Equipo equipo, int cantidad) {
		List<Jugador> jugadores = new ArrayList<Jugador>();
		for (int i = 0; i < cantidad; i++) {
			Jugador j = new Jugador("jugador" + (i + 1), (i + 1), equipo);
			jugadores.add(j);
		}
		return jugadores;
	}

	public static List<Partido> getPartidos(List<Equipo> equipos) {
		List<Partido> partidosAdisputar = new ArrayList<Partido>();
		equipos.forEach(e -> {
			equipos.forEach(es -> {
				if (!e.equals(es)) {
					Partido p = new Partido().setLocal(e).setInvitado(es);
					partidosAdisputar.add(p);
					e.agregarPartido(p);
				}
			});
		});
		return partidosAdisputar;
	}

	public static void comenzarLiga(Liga liga) {
		if (liga != null) {
			Random r = new Random();
			List<Partido> partidosSinJugar = liga.getPartidosSinJugar();
			int cantidadPartidosSinJugar = partidosSinJugar.size();
			if (cantidadPartidosSinJugar > 0) {
				try {
					System.out.println("\nSe va a comenzar la liga.");
					while (cantidadPartidosSinJugar > 0) {
						Partido p = partidosSinJugar.get(r.nextInt(cantidadPartidosSinJugar));
						p.setDisputado(true);
						p.setGolesInvitado(r.nextInt(1, 10));
						p.setGolesLocal(r.nextInt(1, 10));
						System.out.println("Se acaba de jugar el partido = " + p + ". Goles " + p.getLocal().getNombre()
								+ " (local) = " + p.getGolesLocal() + ". Goles " + p.getInvitado().getNombre()
								+ " (invitado) = " + p.getGolesInvitado());
						Thread.sleep(1000);
						partidosSinJugar.remove(p);
						cantidadPartidosSinJugar = partidosSinJugar.size();
					}
					System.out.println("La liga ha finalizado.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void mostrarListaPartidosDeEquipo(Equipo e) {
		System.out.println("\nLista de partidos del equipo " + e.getNombre() + " = " + e.getPartidos());
	}
	

	
	
}
