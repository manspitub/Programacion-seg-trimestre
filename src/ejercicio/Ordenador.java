package ejercicio;

public class Ordenador {
	
	private float Cap_disco_duro;
	private double Frec_procesador;
	private double Precio_base;
	
	

	
	public Ordenador(float cap_disco_duro, double frec_procesador, double precio_base) {
		super();
		Cap_disco_duro = cap_disco_duro;
		Frec_procesador = frec_procesador;
		Precio_base = precio_base;
	}
	public float getCap_disco_duro() {
		return Cap_disco_duro;
	}
	public void setCap_disco_duro(float cap_disco_duro) {
		Cap_disco_duro = cap_disco_duro;
	}
	public double getFrec_procesador() {
		return Frec_procesador;
	}
	public void setFrec_procesador(double frec_procesador) {
		Frec_procesador = frec_procesador;
	}
	public double getPrecio_base() {
		return Precio_base;
	}
	public void setPrecio_base(double precio_base) {
		Precio_base = Precio_base;
		
	}
	
	public double CalcularPvp(double Precio_base){
		
		int porc_iva = 10;
		int den = 100;
		double result = 0;
		
		
		result = (Precio_base * porc_iva)/den + Precio_base;
		return result;
		
		
	}
	@Override
	public String toString() {
		return "Ordenador [Cap_disco_duro=" + Cap_disco_duro + ", Frec_procesador=" + Frec_procesador + ", Precio_base="
				+ Precio_base + ", getCap_disco_duro()=" + getCap_disco_duro() + ", getFrec_procesador()="
				+ getFrec_procesador() + ", getPrecio_base()=" + getPrecio_base() + "]";
	}
	
	
	
}
