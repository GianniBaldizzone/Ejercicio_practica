package ejercicio_practica;

import javax.swing.JOptionPane;

public  class Perro extends Animal{

private String manchas;

public Perro(String nombre, String tipo, String color, String edad) {
	super(nombre, tipo, color, edad);
	// TODO Auto-generated constructor stub
}

public String getManchas() {
	return manchas;
}

public void setManchas(String manchas) {
	this.manchas = manchas;
}

@Override
public String toString() {
	return " ¿Tiene manchas? = " + manchas + "\n Nombre= " + getNombre()
			+ "\n Tipo de animal = " + getTipo() + "\n Color= " + getColor() + "\n Edad = " + getEdad();
}
public void hacerSonido() {
	JOptionPane.showMessageDialog(null, "Hola amo soy tu perro wow :D");
	System.out.println("Wow");
}
public void moverse() {
	JOptionPane.showMessageDialog(null, "Estoy caminando");
	}

}
