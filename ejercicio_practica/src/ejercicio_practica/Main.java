package ejercicio_practica;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[]args) {
	
		Gato papafrita = new Gato("Papafrita","Mamifero","Amarillo","3 a�os");
		papafrita.setBigotes("Si");
		JOptionPane.showMessageDialog(null, papafrita);
		papafrita.hacerSonido();
		
		Perro dorito = new Perro("Dorito","Mamifero","Blanco","4 a�os");
		dorito.setManchas("Si");
		JOptionPane.showMessageDialog(null, dorito);
		dorito.hacerSonido();
		
		Perro serpy = new Perro("Serpy","Reptil","Verde","5 a�os");
		dorito.setVeneno("Si");
		JOptionPane.showMessageDialog(null, dorito);
		dorito.hacerSonido();
	}
}
