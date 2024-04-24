package main.java.aplicacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import main.java.modelos.Equipo;
import main.java.modelos.Jugador;
import main.java.modelos.Liga;
import main.java.modelos.Partido;
import main.java.aplicacion.EquiposUtil;

public class Aplicacion {
	
	public static void main(String[] args) {
		
		Liga liga = new Liga();
		
		List<Equipo> equipos = EquiposUtil.getEquipos(3);
		liga.setEquipos(equipos);
		
		List<Partido> partidosLiga = EquiposUtil.getPartidos(equipos);
		
		liga.setPartidos(partidosLiga);
		
		System.out.println("\nPartidos liga: " + partidosLiga);
		
		System.out.println("\nPartidos jugados: " +liga.getPartidosJugados());
		
		Equipo equipo1 = liga.getEquipoPorNombre("equipo1");
		EquiposUtil.mostrarListaPartidosDeEquipo(equipo1);
		
		EquiposUtil.comenzarLiga(liga);
		
		
	}

	
}
