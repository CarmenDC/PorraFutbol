package porraDDR;

import java.util.ArrayList;
import java.util.Collection;

public class Liga {

	
	private int numEquipos;
	private int numeroJornadas;
	private Collection<Equipo> equiposLiga = new ArrayList<>(numEquipos);
	private Collection<Jornada> liga = new ArrayList<>(numeroJornadas);


	public Collection<Equipo> getEquiposLiga() {
		return equiposLiga;
	}

	public Collection<Jornada> getLiga() {
		return liga;
	}

	public Liga(int equipos, int numeroJornadas) {
		this.numEquipos = equipos;
		this.numeroJornadas = numeroJornadas;
		for (int i = 0; i < numEquipos; i++) {
			equiposLiga.add(new Equipo());
		}
		
		Collection<Equipo> equiposAux= equiposLiga;
		int aux = numeroJornadas;		
			for (int i = 0; i< numEquipos; i++) {
				Equipo local=((ArrayList<Equipo>) equiposAux).get(i);
					for(int j=0; j<numEquipos; j++) {
						if(j!=i && aux>0) {
							Equipo visitante= ((ArrayList<Equipo>) equiposAux).get(j);
							liga.add(new Jornada(local,visitante));
							aux= aux - 1;
						}
					}
			}
	}
	
	public void imprimirLiga() {
		System.out.println ("LOS PARTIDOS DE LIGA SON");
		for (Jornada jornada : liga) {
			jornada.imprimirJornada();
		}
	}
		
}
