package ejercicio;

public class Main {

	public static void main(String[] args) {
//		Crear un programa con una clase ordenador que permita modelar uno con características como
//		capacidad de disco duro, frecuencia del procesador, precio base, etc. Crear dos clases hijas, llamadas
//		Tablet y Portátil. Añadir atributos que especifiquen su estado respecto a los ordenadores normales, al
//		menos un atributo más.
//		La clase madre debe tener un método para calcular el precio de venta al público aplicando un % de
//		ganancia del vendedor al precio base. Este método se debe reescribir en las clases hijas con algún
//		aspecto concreto de cada una de ellas para calcular el precio de otra forma. Por ejemplo, a la tablet se
//		le puede añadir un plus por el seguro de rotura de pantalla y al portátil un descuento por estar de oferta.
//		Crear un main sencillo (no es necesario crear menú) para comprobar todo, basta llamar a los métodos
//		en orden adecuado y mostrar el resultado de los cálculos que hace cada uno, es decir, el precio de venta
//		al público de un objeto de cada tipo (un ordenador, una tablet y un portátil).
//	
		
		Ordenador o = new Ordenador(16, 50, 500);
		Portatil p = new Portatil(8, 60, 360, "Asus");
		Tablet t = new Tablet(12, 70, 280, 3);
		
		System.out.println(o.getPrecio_base());
		System.out.println(p.getPrecio_base());
		System.out.println(t.getPrecio_base());
		
		System.out.println(o.CalcularPvp(o.getPrecio_base()));
		System.out.println(p.CalcularPvp(p.getPrecio_base()));
		System.out.println(t.CalcularPvp(t.getPrecio_base()));
	}

}
