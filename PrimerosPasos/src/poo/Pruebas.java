package poo;

public class Pruebas {
	public static void main(String [] args){
		Empleados trabajador1 = new Empleados("Denis");
		Empleados trabajador2 = new Empleados("Monserrat");
		Empleados trabajador3 = new Empleados("Wilfredo");
		Empleados trabajador4 = new Empleados("Yaneth");
		trabajador1.cambiaSeccion("RRHH");
		
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos()+
				"\n"+ trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());

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
	
	public static String dameIdSiguiente(){
		
		return "El IdSiguiente es: " +idSiguiente;
	}
	
	public void cambiaSeccion(String seccion){//SETTER
		this.seccion = seccion;
	}
	
	public String devuelveDatos(){
		
		return "El nombre es: " + nombre + " y la seccion es " + seccion + " y el Id = " + id;
	}
	

}
