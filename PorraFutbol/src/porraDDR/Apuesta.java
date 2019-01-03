package porraDDR;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Apuesta implements Resultable {
	
	private Collection<Equipo> apuestaJornada = new ArrayList<>(2);
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	
	public Apuesta ( Jornada jornada) {
		equipoLocal = jornada.getEquipoLocal();
		equipoLocal.setGolesJornada(golesLocal());
		equipoVisitante= jornada.getEquipoVisitante();
		equipoVisitante.setGolesJornada(golesVisitante());
		apuestaJornada.add(equipoLocal);
		apuestaJornada.add(equipoVisitante);		
	}
	
	

	@Override
	public int golesLocal() {
		Random random = new Random();
		return random.nextInt(4);
	}

	@Override
	public int golesVisitante() {
		Random random = new Random();
		return random.nextInt(4);
	}
	

	public void imprimirApuesta() {
		System.out.println (" La Apuesta: ");
		System.out.println (" Equipo Local :" + ((ArrayList<Equipo>) apuestaJornada).get(0).toString());
		System.out.println (" Equipo Visitante :" + ((ArrayList<Equipo>) apuestaJornada).get(1).toString());
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apuestaJornada == null) ? 0 : apuestaJornada.hashCode());
		result = prime * result + ((equipoLocal == null) ? 0 : equipoLocal.hashCode());
		result = prime * result + ((equipoVisitante == null) ? 0 : equipoVisitante.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apuesta other = (Apuesta) obj;
		if (apuestaJornada == null) {
			if (other.apuestaJornada != null)
				return false;
		} else if (!apuestaJornada.equals(other.apuestaJornada))
			return false;
		if (equipoLocal == null) {
			if (other.equipoLocal != null)
				return false;
		} else if (!equipoLocal.equals(other.equipoLocal))
			return false;
		if (equipoVisitante == null) {
			if (other.equipoVisitante != null)
				return false;
		} else if (!equipoVisitante.equals(other.equipoVisitante))
			return false;
		return true;
	}
	
	
	
}
