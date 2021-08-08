import java.util.List;

public class Compa�ia {
	
	private final short numeroCompa�ia;
	private String actividad;
	
	private List<Cuerpos> cuerpos;
	private List<Soldado> soldados;
	private List<Cuartel> cuarteles;

	
	public Compa�ia(short numeroCompa�ia,String actividad) {
		this.numeroCompa�ia = numeroCompa�ia;
		this.actividad = actividad;
		
	}
	
	public short getNumeroCompa�ia() {
		return numeroCompa�ia;
	}

	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

}
