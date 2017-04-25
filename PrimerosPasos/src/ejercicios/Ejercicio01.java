package ejercicios;

import java.util.Scanner;

/*Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. 
 * Si no existen, debe indicarlo.*/

public class Ejercicio01 {
	public static void main(String[] args){
		double a, b, c; // coeficientes ax^2+bx+c=0
		double x1, x2 , d; //soluciones y determinantes
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el primer coeficiente (a): ");
		a = entrada.nextDouble();
		
		System.out.println("Introduzca el primer coeficiente (b): ");
		b = entrada.nextDouble();
		
		System.out.println("Introduzca el primer coeficiente (c): ");
		c = entrada.nextDouble();
		
		
//		calculamos el determinante o discriminante
		
		d = ((Math.pow(b, 2)) - 4 * a * c);
		if(d<0)
			System.out.println("No existen soluciones reales");
		else{
			
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("Solución X1: " + x1);
			System.out.println("Solución X2: " + x2);
		}
	}
}
