import java.util.List;

public class Cuartel {
	
	private final String codigoCuartel;
	private String nombre;
	private String ubicacion;
	
	private List<Soldado> soldados;
	private List<Compañia> compañias;
	
	public Cuartel(String codigoCuartel,String nombre, String ubicacion) {
		this.codigoCuartel = codigoCuartel;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	
	public String getCodigoCuartel() {
		return codigoCuartel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

}
