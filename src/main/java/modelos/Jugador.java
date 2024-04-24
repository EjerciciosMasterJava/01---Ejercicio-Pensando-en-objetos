package main.java.modelos;

public class Jugador {

	private String nombre;
	private Integer numero;
	private Equipo equipo;
	private long golesMarcados;

	public Jugador() {
		super();
	}

	public Jugador(String nombre, Integer numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}

	public Jugador(String nombre, Integer numero, Equipo equipo) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.equipo = equipo;
		golesMarcados = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public long getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(long golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", numero=" + numero + ", equipo=" + equipo + ", golesMarcados="
				+ golesMarcados + "]";
	}

}
