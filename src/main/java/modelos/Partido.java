package main.java.modelos;

import java.time.LocalDateTime;

public class Partido {
	private Equipo local;
	private Equipo invitado;
	
	private LocalDateTime fechaPartido;
	private String lugarPartido;
	
	private int golesLocal;
	private int golesInvitado;
	
	private boolean disputado;
	
	private boolean partidoGanado;

	public Partido() {
		super();
	}

	public Partido(Equipo local, Equipo invitado, LocalDateTime fechaPartido, String lugarPartido) {
		super();
		this.local = local;
		this.invitado = invitado;
		this.fechaPartido = fechaPartido;
		this.lugarPartido = lugarPartido;
	}

	public Equipo getLocal() {
		return local;
	}

	public Partido setLocal(Equipo local) {
		this.local = local;
		return this;
	}

	public Equipo getInvitado() {
		return invitado;
	}

	public Partido setInvitado(Equipo invitado) {
		this.invitado = invitado;
		return this;
	}

	public LocalDateTime getFechaPartido() {
		return fechaPartido;
	}

	public void setFechaPartido(LocalDateTime fechaPartido) {
		this.fechaPartido = fechaPartido;
	}

	public String getLugarPartido() {
		return lugarPartido;
	}

	public void setLugarPartido(String lugarPartido) {
		this.lugarPartido = lugarPartido;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesInvitado() {
		return golesInvitado;
	}

	public void setGolesInvitado(int golesInvitado) {
		this.golesInvitado = golesInvitado;
	}

	public boolean isDisputado() {
		return disputado;
	}

	public void setDisputado(boolean disputado) {
		this.disputado = disputado;
	}

	public boolean isPartidoGanado() {
		return partidoGanado;
	}

	public void setPartidoGanado(boolean partidoGanado) {
		this.partidoGanado = partidoGanado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nPartido [local=");
		builder.append(local);
		builder.append(", invitado=");
		builder.append(invitado);
		builder.append(", fechaPartido=");
		builder.append(fechaPartido);
		builder.append(", lugarPartido=");
		builder.append(lugarPartido);
		builder.append(", golesLocal=");
		builder.append(golesLocal);
		builder.append(", golesInvitado=");
		builder.append(golesInvitado);
		builder.append(", disputado=");
		builder.append(disputado);
		builder.append(", partidoGanado=");
		builder.append(partidoGanado);
		builder.append("]");
		return builder.toString();
	}

	
	
}
