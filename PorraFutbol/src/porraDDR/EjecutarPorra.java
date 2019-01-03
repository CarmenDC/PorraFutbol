package porraDDR;


public class EjecutarPorra {

	public static void main(String[] args) {
		
		AmigosPorra amigosPorra2019 = new AmigosPorra(3);
		Liga liga2019 = new Liga(5, 20);
		Bote bote2019 = new Bote();
		
		liga2019.imprimirLiga();
		
		for (Jornada jornada :liga2019.getLiga()) {
			jornada.imprimirJornada();			
			Partido partido = new Partido(jornada);
			partido.jugarPartidoJornada();
			partido.imprimirResultadoPartido();
			amigosPorra2019.AmigosPorraApuestaJornada(jornada, bote2019);
			repartirPorra(amigosPorra2019, partido, bote2019);
			amigosPorra2019.dineroAmigosFinalPorra();
		}



	}

	private static void repartirPorra(AmigosPorra amigosPorra2019, Partido partidoJornada, Bote bote) {
	int numGanadores=0;
	int dineroToca=bote.getDineroAcumulado();
	for (JugadorPorra amigo: amigosPorra2019.getAmigosPorra()) {
		amigo.compararApuesta(partidoJornada);
	}
	for (JugadorPorra amigo: amigosPorra2019.getAmigosPorra()) {
		if (amigo.getEsGanador()) {
			numGanadores = numGanadores+1;
		}	
	}
	if (numGanadores!=0) {
		dineroToca = bote.getDineroAcumulado() / numGanadores;
		bote.setDineroAcumulado(0);
	}
	for (JugadorPorra amigo: amigosPorra2019.getAmigosPorra()) {
		if (amigo.getEsGanador()) {
			amigo.ganarApuesta(dineroToca);
		}	
	}
	
	}

}
