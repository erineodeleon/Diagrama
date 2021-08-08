import java.util.List;

public class Cuerpos {
	
	private String codigoCuerpo;
	private final String denominacion;
	
	private List<Soldado> soldados;
	private List<Cuartel> cuarteles;
	private List<Compañia> compañias;

	public Cuerpos(String codigoCuerpo, String denominacion) {
		
		this.denominacion = denominacion;
		this.codigoCuerpo= codigoCuerpo;

	}
	
	public String getCodigoCuerpo() {
		return codigoCuerpo;
	}
	
	public void setCodigoCuerpo(String codigoCuerpo) {
		this.codigoCuerpo = codigoCuerpo;
		
	}

	public String getDenominacion() {
		return denominacion;
	}

	

}
