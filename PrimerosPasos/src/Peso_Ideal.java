import javax.swing.*;
public class Peso_Ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String genero = "";
		
		do{
			genero = JOptionPane.showInputDialog("Ingroduce tu género (H/M)");
		
		}while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
			
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
		double pesoIdeal = 0;
		
		if (genero.equalsIgnoreCase("H")){
			pesoIdeal = altura - 110;
		}
		else if (genero.equalsIgnoreCase("M")){
			pesoIdeal = altura - 120;
		}
		
		pesoIdeal = pesoIdeal * 2.2;
		System.err.println("Tu peso ideal es " + pesoIdeal + " Libras");
	}

}
