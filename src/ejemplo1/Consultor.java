package ejemplo1;

public class Consultor extends Trabajador {
	
	private int horas;
	private int tarifas;
	

	public Consultor(String nombre, long telefono, String direccion, int horas, int tarifas) {
		super(nombre, telefono, direccion);
		this.horas = horas;
		this.tarifas = tarifas;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public int getTarifas() {
		return tarifas;
	}


	public void setTarifas(int tarifas) {
		this.tarifas = tarifas;
	}


	@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", tarifas=" + tarifas + "]";
	}
	
	public double CalcularPaga() {
		return horas*tarifas;
	}
}
