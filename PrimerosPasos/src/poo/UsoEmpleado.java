package poo;
import java.util.Date;
import java.util.GregorianCalendar;
public class UsoEmpleado {
	public static void main(String [] args){
		
	}
}

class Empleado{
	public Empleado(String nom, int sue, int agno, int mes, int dia){
		
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
		
	}
	
	
	public String getNombre(){//GETTER
		
		return nombre;
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
	
}
