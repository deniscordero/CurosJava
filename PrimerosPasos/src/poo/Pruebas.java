package poo;

public class Pruebas {
	public static void main(String [] args){
		Empleados trabajador1 = new Empleados("Denis");
		Empleados trabajdor2 = new Empleados("Monserrat");
		trabajador1.cambiaSeccion("RRHH");
		trabajador1.cambiaNombre("Wilfredo");
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajdor2.devuelveDatos());
	}
}

class Empleados{
	
	private String nombre;
	private String seccion;
	
	public Empleados(String nom){
		nombre = nom;
		seccion = "Administración";
	}
	
	public void cambiaSeccion(String seccion){//SETTER
		this.seccion = seccion;
	}
	
	public String devuelveDatos(){
		
		return "El nombre es: " + nombre + " y la seccion es " + seccion;
	}
	
	public void cambiaNombre(String nombre){
		this.nombre = nombre;
	}
}
