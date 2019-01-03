package porraDDR;

import java.util.ArrayList;
import java.util.Collection;

public class Jornada {
	
	Collection<Equipo> partidoJornada = new ArrayList<>(2);
	Equipo equipoLocal;
	Equipo equipoVisitante;
	

	
	public Collection<Equipo> getPartidoJornada() {
		return partidoJornada;
	}




	public Equipo getEquipoLocal() {
		return equipoLocal;
	}




	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}




	public Jornada() {
		equipoLocal = new Equipo();
		equipoVisitante = new Equipo();
	}

	public Jornada(Equipo equipoLocal, Equipo equipoVisitante) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante= equipoVisitante;
	}
	
	public void imprimirJornada() {
		System.out.print("JORNADA A JUGAR ");
		System.out.println("\n" + "Local: " + getEquipoLocal().getNombreEquipo() + " Visitante: " + getEquipoVisitante().getNombreEquipo());
		
	}
	
}
