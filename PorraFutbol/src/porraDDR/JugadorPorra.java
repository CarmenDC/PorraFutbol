package porraDDR;

import java.util.Random;

public class JugadorPorra {
	private static int identificadorJugador=1;
	
	private String nombreJugador;
	private int dineroJugador;
	private int idJugador;
	private Apuesta apuestaJugador;
	private Boolean esGanador;
	private Boolean puedeApostar;
	
// GETTERS AND SETTERS
	
	public Apuesta getApuestaJugador() {
		return apuestaJugador;
	}

	public void setApuestaJugador(Apuesta apuestaJugador) {
		this.apuestaJugador = apuestaJugador;
	}
	
	public String getNombreJugador() {
		return nombreJugador;
	}
	
		public int getDineroJugador() {
		return dineroJugador;
	}

	public void setDineroJugador(int dineroJugador) {
		this.dineroJugador = dineroJugador;
	}


	public Boolean getEsGanador() {
		return esGanador;
	}

	private void setEsGanador(Boolean esGanador) {
		this.esGanador = esGanador;
	}
	
	public Boolean getPuedeApostar() {
		return puedeApostar;
	}

	public void setPuedeApostar(Boolean puedeApostar) {
		this.puedeApostar = puedeApostar;
	}
	
	//	COSNTRUCTOR


	public JugadorPorra() {
		Random random = new Random();
		idJugador=identificadorJugador;
		nombreJugador = "Jugador " + idJugador;
		identificadorJugador++;
		dineroJugador = random.nextInt(20)+1;
		esGanador=false;
		puedeApostar=false;
	}
	
	public JugadorPorra(int dinero) {
		idJugador=identificadorJugador;
		nombreJugador = "Jugador " + idJugador;
		identificadorJugador++;
		dineroJugador = dinero;
	}
	
	// OTROS METODOS
	
	public void apostarJornada(Jornada jornada, int dinero) {
		if (dineroJugador>=dinero) {
			apuestaJugador = new Apuesta(jornada);
			dineroJugador -= dinero;
			System.out.println("\n"+ getNombreJugador() + " La apuesta es de " + dinero+"€");
			setPuedeApostar(true);
			
		}
		else {
			System.out.println("\n"+ getNombreJugador() + " No tiene suficiente dinero para apostar");
			setPuedeApostar(false);
			apuestaJugador = null;
		}
	}
	
	public void ganarApuesta(int dinero) {
		if (esGanador) {
		setDineroJugador(getDineroJugador()+dinero);
		System.out.println ("\n"+nombreJugador + " ha ganado " + dinero +"€" +"\n");
		}
	}
	
	public void imprimirJugadorApuesta() {
		System.out.println ("\n" + nombreJugador + ", dinero disponible: "
				+ "" + dineroJugador + "€"+"\n");
			if (apuestaJugador!= null) {
			apuestaJugador.imprimirApuesta();
			
			}
	}
	
	public Boolean compararApuesta(Partido partido) {
		Boolean acierto =false;
//		System.out.println (getApuestaJugador().golesLocal());	
		if (puedeApostar&&(getApuestaJugador().golesLocal()==partido.getEquipoVisitante().getGolesJornada())&&(getApuestaJugador().golesVisitante()==partido.getEquipoVisitante().getGolesJornada())){
			acierto = true;
			setEsGanador(acierto);
		}
		return acierto;
	}

}
