package ejemplo1;

public class Trabajador {
	
	
	private String Nombre;
	private long Telefono;
	private String Direccion;
	
	public Trabajador(String nombre, long telefono, String direccion) {
		super();
		Nombre = nombre;
		Telefono = telefono;
		Direccion = direccion;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public long getTelefono() {
		return Telefono;
	}

	public void setTelefono(long telefono) {
		Telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	@Override
	public String toString() {
		return "Trabajador [Nombre=" + Nombre + ", Telefono=" + Telefono + ", Direccion=" + Direccion + "]";
	}
	
	
	
	
}
