package poo;
import javax.swing.*;

public class UsoVehiculo {
	
	public static void main(String[] args){
//		Coche Renault = new Coche(); // INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE.
	
//		System.out.println("Este coche tiene " + Renault.getLargo() +  " ruedas");
		
//		System.out.println(Renault.dimeLargo());
	/*
	 
	Coche miCoche = new Coche();
	
	miCoche.estableceColor(JOptionPane.showInputDialog("Introduce color"));
	System.out.println(miCoche.dimeDatosGenerales());
	System.out.println(miCoche.dimeColor());
	
	miCoche.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
	System.out.println(miCoche.dimeAsientos());
	
	miCoche.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
	System.out.println(miCoche.dimeClimatizador());
	
	System.out.println(miCoche.dimePesoCoche());
	
	System.out.println("El precio final del coche es; " + miCoche.precioCoche()); 
	*/
		
		Coche miCoche1 = new Coche();
		miCoche1.estableceColor("Rojo");
		
		Furgoneta miFurgoneta1 = new Furgoneta(7, 580);
		miFurgoneta1.estableceColor("azul");
		miFurgoneta1.configuraAsientos("Si");
		miFurgoneta1.configuraClimatizador("Si");
		
		System.out.println(miCoche1.dimeDatosGenerales() + " " + miCoche1.dimeColor());
		System.out.println(miFurgoneta1.dimeDatosGenerales()+ " " + miFurgoneta1.dimeDatosFurgoneta() + " " + miFurgoneta1.dimeColor());
		
	}
}
