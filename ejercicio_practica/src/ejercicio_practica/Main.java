package ejercicio_practica;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[]args) {
	
		Gato papafrita = new Gato("Papafrita","Mamifero","Amarillo","3 años");
		papafrita.setBigotes("Si");
		JOptionPane.showMessageDialog(null, papafrita);
		papafrita.hacerSonido();
		
		Perro dorito = new Perro("Dorito","Mamifero","Blanco","4 años");
		dorito.setManchas("Si");
		JOptionPane.showMessageDialog(null, dorito);
		dorito.hacerSonido();
		
		Perro serpy = new Perro("Serpy","Reptil","Verde","5 años");
		dorito.setVeneno("Si");
		JOptionPane.showMessageDialog(null, dorito);
		dorito.hacerSonido();
	}
}
