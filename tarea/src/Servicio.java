import java.util.List;

public class Servicio {
	
	private String codigoServicio;
	private String descripcion;
	
	private List<Soldado> soldados;
	
	
	public String getCodigoServicio() {
		return codigoServicio;
	}
	public void setCodigoServicio(String codigoServicio) {
		this.codigoServicio = codigoServicio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
