package ejercicios;

import javax.swing.JOptionPane;

public class CodigoMorse {
	public static void main(String args[]){
		
		CodigoMorse codigo = new CodigoMorse();
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		JOptionPane.showMessageDialog(null, "Tu nombre es codigo morse es: " + codigo.getNameMorse(nombre));
		
	}
	
	public String getNameMorse(String nombre){
		

		return nombre;
	}
	
	String 
	a = "· —",	
	b = "— · · ·",
	c = "— · — ·",
	d = "— · ·",
	e = "·",	
	f = "· · — ·",
	g = "— — ·",
	h = "· · · ·",
	i = "· ·",	
	j = "· — — —",
	k = "— · —",
	l = "· — · ·",
	m = "— —",
	n = "— ·",
	ñ = "— — · — —",
	o = "— — —",
	p = "· — — ·",
	q = "— — · —",
	r = "· — ·",
	s = "· · ·",
	t = "—",
	u = "· · —",
	v = "· · · —",	
	w = "· — —",
	x = "— · · —",
	y = "— · — —",
	z = "— — · ·";
	
	
	
	
}
