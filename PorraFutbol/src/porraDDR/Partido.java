package porraDDR;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Partido implements Resultable {
	
	
	Collection<Equipo> partidoJornada = new ArrayList<>(2);
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	
		public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}
	
	
//	CONSTRUCTOR
	public Partido(Jornada jornada) {
		equipoLocal = jornada.getEquipoLocal();
		equipoVisitante= jornada.getEquipoVisitante();
		partidoJornada.add(equipoLocal);
		partidoJornada.add(equipoVisitante);
	}
	
//	OTROS MÉTODOS
	
	public void jugarPartidoJornada() {
		equipoLocal.setGolesJornada(golesLocal());
		equipoVisitante.setGolesJornada(golesVisitante());
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
	
	public void imprimirResultadoPartido() {
		System.out.println ("\n"+"El Resultado del partido es: ");
		System.out.println (" Equipo Local :" + ((ArrayList<Equipo>) partidoJornada).get(0).toString());
		System.out.println (" Equipo Local :" + ((ArrayList<Equipo>) partidoJornada).get(1).toString());
	}
	

}
