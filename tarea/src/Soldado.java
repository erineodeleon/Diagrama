import java.util.List;

public class Soldado {
	
	private String codigo;
	private String nombre;
	private String Apellidos;
	private String graduacion;
	
	private List<Servicio> cervicios;
	private List<Cuerpos> cuerpos;
	private List<Cuartel> cuarteles;
	private List<Compañia> compañias;

	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getGraduacion() {
		return graduacion;
	}
	public void setGraduacion(String graduacion) {
		this.graduacion = graduacion;
	}
	
	
}
