package main.java.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Liga {
	private String nombre;
	
	private List<Equipo> equipos;
	
	private List<Partido> partidos;

	public Liga() {
		super();
		equipos = new ArrayList<Equipo>();
		partidos = new ArrayList<Partido>();
	}

	public Liga(String nombre, List<Equipo> equipos, List<Partido> partidos) {
		super();
		this.nombre = nombre;
		this.equipos = equipos;
		this.partidos = partidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
	
	public List<Partido> getPartidosJugados(){
		List<Partido> partidosJugados = new ArrayList();
		partidos.forEach(p -> {
			if(p.isDisputado()) {
				partidosJugados.add(p);
			}
		});
		return partidosJugados;
	}
	
	public List<Partido> getPartidosSinJugar(){
		List<Partido> partidosSinJugar = new ArrayList();
		partidos.forEach(p -> {
			if(!p.isDisputado()) {
				partidosSinJugar.add(p);
			}
		});
		return partidosSinJugar;
	}
	
	public Equipo getEquipoPorNombre(String nombre) {
		Optional<Equipo> equipo = this.equipos.parallelStream().filter(e -> e.getNombre().equalsIgnoreCase(nombre)).findFirst();
		if(equipo.isPresent()) {
			System.out.println("Se ha encontrado el equipo " + nombre);
			return equipo.get();
		} 
		System.out.println("El equipo " + nombre + " no existe en la liga " + getNombre());
		return null;
	}

	@Override
	public String toString() {
		return "Liga [nombre=" + nombre + ", equipos=" + equipos + ", partidos=" + partidos + "]";
	}
	
	
	
}
