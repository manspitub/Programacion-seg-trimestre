package ejemplo1;

public class Main {

	public static void main(String[] args) {
		
		
		Trabajador t = new Trabajador("�ngel", 689640570, "Jefe secci�n");
		
		Empleado e = new Empleado("Rafa", 83748362, "Inform�tico", 1200, 20);
		
		Consultor c = new Consultor("Miguel", 8564865, "Asistente", 160, 20);
		
		System.out.println(e.CalcularPaga());
	}

}
