package porraDDR;

public class Bote {
	
	private int dineroAcumulado;	
	
	public int getDineroAcumulado() {
		return dineroAcumulado;
	}

	public void setDineroAcumulado(int dineroAcumulado) {
		this.dineroAcumulado = dineroAcumulado;
	}

	public Bote() {
		dineroAcumulado=0;
	}
	
	public void incrementarBote(int dinero) {
		setDineroAcumulado(getDineroAcumulado()+dinero);
	}
}
