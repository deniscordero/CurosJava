import javax.swing.*;
public class Entrada_Numeros {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Introduce un n�mero:");
		double num2 = Double.parseDouble(num1);
		System.out.print("la ra�z de " +  num2 + " es ");
		System.out.printf("%1.2g", + Math.sqrt(num2));
		
	}

}
