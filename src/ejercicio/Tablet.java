package ejercicio;

public class Tablet extends Ordenador {
	
	private int Megapixeles;
	
	
	public Tablet(float cap_disco_duro, double frec_procesador, double precio_base, int megapixeles) {
		super(cap_disco_duro, frec_procesador, precio_base);
		Megapixeles = megapixeles;
	}


	public int getMegapixeles() {
		return Megapixeles;
	}


	public void setMegapixeles(int megapixeles) {
		Megapixeles = megapixeles;
	}


	@Override
	public String toString() {
		return "Tablet [Megapixeles=" + Megapixeles + ", getCap_disco_duro()=" + getCap_disco_duro()
				+ ", getFrec_procesador()=" + getFrec_procesador() + ", getPrecio_base()=" + getPrecio_base()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	public double CalcularDesc(double Precio_base){
		int porc_desc = 10;
		double result = 0;
		int den = 100;
		
		result=  Precio_base-(Precio_base*porc_desc)/den ; 
		return result;
	}


	@Override
	public double CalcularPvp(double Precio_base) {
		// TODO Auto-generated method stub
		return super.CalcularPvp(CalcularDesc(Precio_base));
	}
	
	
	
	
	

}
