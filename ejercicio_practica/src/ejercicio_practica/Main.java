package ejercicio_practica;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[]args) {
	
		Gato papafrita = new Gato("Papafrita","Mamifero","Amarillo","3 a�os");
		papafrita.setBigotes("Si");
		JOptionPane.showMessageDialog(null, papafrita);
		papafrita.hacerSonido();
		papafrita.moverse();
		
		Perro dorito = new Perro("Dorito","Mamifero","Blanco","4 a�os");
		dorito.setManchas("Si");
		JOptionPane.showMessageDialog(null, dorito);
		dorito.hacerSonido();
		dorito.moverse();
		
		Serpiente serpy = new Serpiente("Serpy","Reptil","Verde","5 a�os");
		serpy.setVeneno("Si");
		JOptionPane.showMessageDialog(null, serpy);
		serpy.hacerSonido();
		serpy.moverse();
	}
}
