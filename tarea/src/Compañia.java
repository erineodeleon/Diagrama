import java.util.List;

public class Compañia {
	
	private final short numeroCompañia;
	private String actividad;
	
	private List<Cuerpos> cuerpos;
	private List<Soldado> soldados;
	private List<Cuartel> cuarteles;

	
	public Compañia(short numeroCompañia,String actividad) {
		this.numeroCompañia = numeroCompañia;
		this.actividad = actividad;
		
	}
	
	public short getNumeroCompañia() {
		return numeroCompañia;
	}

	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

}
