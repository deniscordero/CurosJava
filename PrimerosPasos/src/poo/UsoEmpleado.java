package poo;
import java.util.Date;
import java.util.GregorianCalendar;
public class UsoEmpleado {
	public static void main(String [] args){
		
		/*
		Empleado empleado1 = new Empleado("Denis Cordero", 85000, 1990, 12, 17);
		Empleado empleado2 = new Empleado("Monserrat Mejia", 95000, 1995, 06, 02);
		Empleado empleado3 = new Empleado("Maria Martín", 105000, 2002, 03, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.getNombre() + " Sueldo: " 
				+ empleado1.getSueldo() + " Fecha de Alta: " + empleado1.getFechaContrato());
		
		System.out.println("Nombre: " + empleado2.getNombre() + " Sueldo: " 
				+ empleado2.getSueldo() + " Fecha de Alta: " + empleado2.getFechaContrato());
		
		System.out.println("Nombre: " + empleado3.getNombre() + " Sueldo: " 
				+ empleado3.getSueldo() + " Fecha de Alta: " + empleado3.getFechaContrato());
		*/
		
		Jefatura jefe_RRHH = new Jefatura("Denis", 55000, 2006, 9, 25);
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("Wily Cordero", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Monserrat Mejia", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("Maria Martín", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Jessikka");
		misEmpleados[4] = jefe_RRHH; //Polimorfismo en acción. Principio de sustitución
		misEmpleados[5] = new Jefatura("María", 95000, 1999, 4, 26);
		
		Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];
		jefaFinanzas.estableceIncentivo(55000);
		/*for(int i=0; i<misEmpleados.length; i++){
			misEmpleados[i].subeSueldo(5);
		}*/
		
		for(Empleado e: misEmpleados){
			e.subeSueldo(5);
		}
		
		
		for(Empleado e: misEmpleados){
			System.out.println("Nombre: " + e.getNombre() 
					+ " Sueldo: " + e.getSueldo() 
					+ " Fecha de Alta: " + e.getFechaContrato());
		}
		
		/*for(int i=0; i<misEmpleados.length; i++){
			System.out.println("Nombre: " + misEmpleados[i].getNombre() 
							+ " Sueldo: " + misEmpleados[i].getSueldo() 
							+ " Fecha de Alta: " + misEmpleados[i].getFechaContrato());
		}*/
		  
		
	}
}

class Empleado{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia){
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
		++IdSiguiente;
		Id = IdSiguiente;
	}
	
	public Empleado(String nombre){
		this(nombre, 30000, 2000,01,01);
	}
	
	
	
	public String getNombre(){//GETTER
		
		return nombre + " Id: " + Id;
	}
	
	public double getSueldo(){//GETTER
		
		return sueldo;
	}
	
	public Date getFechaContrato(){//GETTER
		
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje){//SETTER
		
		double aumento = sueldo * porcentaje/100;
		sueldo += aumento;
	}
	
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
}

class Jefatura extends Empleado{
	public Jefatura(String nom, double sue, int agno, int mes, int dia){
		super(nom, sue, agno, mes, dia);
	}
	
	public void estableceIncentivo(double incentivo){
		this.incentivo = incentivo;
	}
	
	public double getSueldo(){
		double suedoJefe = super.getSueldo();
		return suedoJefe + incentivo;
	}
	  
	private double incentivo;
	
	
}


