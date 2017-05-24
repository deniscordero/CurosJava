import java.util.Scanner;

public class UsoTallas {
	
	//enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE}; 
	
	enum Talla{
		MINI("S"), MEDIANO("M"), GRANDE("L"),  MUY_GRANDE("XL");
		
		private Talla(String abreviatura){
			this.abreviatura = abreviatura;
		}
		
		private String abreviatura;
		
		public String dameAbreviatura(){
			return abreviatura;
		}
		
	}
	
	
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una talla: MINI, MEDIANO, GRADE, MUY_GRANDE");
		
		String entradaDatos = entrada.next().toUpperCase();
		Talla laTalla = Enum.valueOf(Talla.class, entradaDatos);
		System.out.println("Talla = " + laTalla);
		
		System.out.println("Abreviatura = " + laTalla.dameAbreviatura());
	
		
	}
}
