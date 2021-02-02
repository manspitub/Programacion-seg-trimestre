package ejemplo1;

public class Empleado extends Trabajador {
	
	private double sueldo;
	private double impuestos;
	
	public Empleado(String nombre, long telefono, String direccion, double sueldo, double impuestos) {
		super(nombre, telefono, direccion); //Es Una llamada al constructor de la clase madre
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + ", getNombre()=" + getNombre()
				+ ", getTelefono()=" + getTelefono() + ", getDireccion()=" + getDireccion() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	public double CalcularPaga() {
		return(sueldo-impuestos);
	}
	
	
}
