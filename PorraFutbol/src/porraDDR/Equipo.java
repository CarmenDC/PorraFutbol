package porraDDR;

public class Equipo {
	
	private static int identificadorNombre=1;
	
	private String nombreEquipo;
	private int golesJornada;
	private int idEquipo;
	
	
//GETTERS AND SETTERS	
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public int getGolesJornada() {
		return golesJornada;
	}

	public void setGolesJornada(int golesJornada) {
		this.golesJornada = golesJornada;
	}
	
	public int getIdEquipo() {
		return idEquipo;
	}

	//	COSNTRUCTOR
	public Equipo() {
		idEquipo = identificadorNombre;
		nombreEquipo = "Equipo " + idEquipo;
		identificadorNombre++;
	}

	public Equipo(int goles) {
		idEquipo = identificadorNombre;
		nombreEquipo = "Equipo " + idEquipo;
		identificadorNombre++;
		setGolesJornada(goles);
	}
	
//IMPRIMIR
	@Override
	public String toString() {
		return "" + nombreEquipo + ", goles jornada=" + golesJornada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + golesJornada;
		result = prime * result + idEquipo;
		result = prime * result + ((nombreEquipo == null) ? 0 : nombreEquipo.hashCode());
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
		Equipo other = (Equipo) obj;
		if (golesJornada != other.golesJornada)
			return false;
		if (idEquipo != other.idEquipo)
			return false;
		if (nombreEquipo == null) {
			if (other.nombreEquipo != null)
				return false;
		} else if (!nombreEquipo.equals(other.nombreEquipo))
			return false;
		return true;
	}
	
	
	






}
