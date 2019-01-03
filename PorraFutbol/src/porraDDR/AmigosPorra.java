package porraDDR;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class AmigosPorra {
	
	
	private int numAmigos;
	private Collection<JugadorPorra> amigosPorra = new ArrayList<>(10);
//	private Collection<JugadorPorra> listaApostantes= new ArrayList<>();
	
	public int getNumAmigos() {
		return numAmigos;
	}

	public void setNumAmigos(int numAmigos) {
		this.numAmigos = numAmigos;
	}
	
	public Collection<JugadorPorra> getAmigosPorra() {
		return amigosPorra;
	}

	public AmigosPorra(int numAmigos) {
		this.numAmigos = numAmigos;
		for (int i=0; i<numAmigos; i++) {
			amigosPorra.add(new JugadorPorra());
		}
	}
	
	public void AmigosPorraApuestaJornada (Jornada jornada, Bote bote) {
		Random random = new Random();
		int dineroApuesta = random.nextInt(9)+1;
		for (JugadorPorra jugador : amigosPorra) {
			jugador.apostarJornada(jornada,dineroApuesta);
			bote.incrementarBote(dineroApuesta);
			jugador.imprimirJugadorApuesta();
		
		}
		
	 }
	
	public void dineroAmigosFinalPorra() {
		for (JugadorPorra amigo : amigosPorra) {
			System.out.println("\n" + amigo.getNombreJugador() +" ha ganado: " + amigo.getDineroJugador()+"€");
		}
	}

}
