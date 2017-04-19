package poo;

public class Coche {
	
	private int ruedas;
	private int largo; //cm
	private int ancho; //cm
	private int motor; //cm3 del motor
	private int pesoPlataforma; //kilos
	
	private String color;
	private int pesoTotal;
	private boolean asientosCuero, climatizador;
	

	public Coche(){
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
	}
	
	public String dimeDatosGenerales(){//GETTER
		return "La plataforma del veh�culo tiene " + ruedas + " ruedas" + ". Mide " + largo/1000 +
				" metros con un ancho de " + ancho + " cm y un peso de plataforma de " + pesoPlataforma + " kg";
		
	}
	
	public void estableceColor(String colorCoche){ // SETTER
		color = colorCoche;
	}
	
	public String dimeColor(){
		return "El color del coche es " + color;
	}
	
	public void configuraAsientos(String asientosCuero){//SETTER
		if(asientosCuero.equalsIgnoreCase("si")){
			this.asientosCuero = true;
		}else{
			this.asientosCuero = false;
		}
	}
	
	public String dimeAsientos(){//GETTER
		if (asientosCuero == true){
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie";
		}
	}
	
	public void configuraClimatizador(String climatizador){//SETTER
		if(climatizador.equalsIgnoreCase("si")){
			this.climatizador = true;
		}else{
			this.climatizador = false;
		}
	}
	
	public String dimeClimatizador(){ //GETTER
		if (climatizador == true){
			return "El coche incorpora climatizador";
		}else{
			return "el coche lleva aire acondicionado";
		}
	}
	
	public String dimePesoCoche(){
		int pesoCarroceria = 500;
		pesoTotal = pesoPlataforma + pesoCarroceria;
		if(asientosCuero == true){
			pesoTotal = pesoTotal + 50;
		}
		if(climatizador == true){
			pesoTotal = pesoTotal + 20;
		}
		return "El peso del coche es " + pesoTotal;
	}
	
	public int precioCoche(){
		int precioFinal = 10000;
			if(asientosCuero == true){
				precioFinal+=2000;
			}
			if(climatizador == true){
				precioFinal+=1500;
			}
		return precioFinal;
	}
}
