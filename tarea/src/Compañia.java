import java.util.List;

public class Compaņia {
	
	private final short numeroCompaņia;
	private String actividad;
	
	private List<Cuerpos> cuerpos;
	private List<Soldado> soldados;
	private List<Cuartel> cuarteles;

	
	public Compaņia(short numeroCompaņia,String actividad) {
		this.numeroCompaņia = numeroCompaņia;
		this.actividad = actividad;
		
	}
	
	public short getNumeroCompaņia() {
		return numeroCompaņia;
	}

	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

}
