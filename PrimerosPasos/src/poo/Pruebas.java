package poo;

public class Pruebas {
	public static void main(String [] args){
		Empleados trabajador1 = new Empleados("Denis");
		Empleados trabajdor2 = new Empleados("Monserrat");
		Empleados trabajdor3 = new Empleados("Wilfredo");
		Empleados trabajdor4 = new Empleados("Yaneth");
		trabajador1.cambiaSeccion("RRHH");
		
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajdor2.devuelveDatos());
		System.out.println(trabajdor3.devuelveDatos());
		System.out.println(trabajdor4.devuelveDatos());
	}
}

class Empleados{
	
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente = 1;
	
	public Empleados(String nombre){
		this.nombre = nombre;
		seccion = "Administración";
		id = idSiguiente;
		idSiguiente++;
		
		
	}
	
	public void cambiaSeccion(String seccion){//SETTER
		this.seccion = seccion;
	}
	
	public String devuelveDatos(){
		
		return "El nombre es: " + nombre + " y la seccion es " + seccion + " y el Id = " + id;
	}
	

}
