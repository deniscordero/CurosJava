import javax.swing.*;
public class UsoArraysII {
	public static void main(String[] args){
		
		
//		String [] paises = new String [8];
		/*
		paises[0] = "España";
		paises[1] = "México";
		paises[2] = "Colombia";
		paises[3] = "Perú";
		paises[4] = "Chile";
		paises[5] = "Argentina";
		paises[6] = "Ecuador";
		paises[7] = "Venezuela";
		*/
		
		/*
		for(int i=0; i<paises.length; i++){
			System.out.println("País " + (i+1) + " = " + paises[i]);
		}
		*/
		
//		String [] paises = {"España", "México", "Colombia", "Perú", "Chile", "Argentina","Ecuador", "Venezuela"};
		
//		for(int i=0; i<8; i++){
//			paises[i] = JOptionPane.showInputDialog("Introuce país " + (i+1));
//		}
//		
//		for(String elemento: paises){
//			System.out.println("País: " + elemento);
//		}
		
		int [] matrizAleatorios = new int[150];
		
		for(int i=0; i<matrizAleatorios.length; i++){
			matrizAleatorios[i] = (int)(Math.random()*100);
		}
		
		for(int numeros:matrizAleatorios){
			System.out.print(numeros + " ");
		}
	}
}
