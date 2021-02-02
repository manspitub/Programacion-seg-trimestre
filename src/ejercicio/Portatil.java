package ejercicio;

public class Portatil extends Ordenador{
	
	private String Marca;

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public Portatil(float cap_disco_duro, double frec_procesador, double precio_base, String Marca) {
		super(cap_disco_duro, frec_procesador, precio_base);
	}

	@Override
	public String toString() {
		return "Portatil [Marca=" + Marca + ", getMarca()=" + getMarca() + ", getCap_disco_duro()="
				+ getCap_disco_duro() + ", getFrec_procesador()=" + getFrec_procesador() + ", getPrecio_base()="
				+ getPrecio_base() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	@Override
	public double CalcularPvp(double Precio_base) {
		int Precio_garantia= 50;
		return super.CalcularPvp(Precio_base)+Precio_garantia;
	}
	
	

}
