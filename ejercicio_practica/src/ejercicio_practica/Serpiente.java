package ejercicio_practica;

import javax.swing.JOptionPane;

public class Serpiente extends Animal {

public Serpiente(String nombre, String tipo, String color, String edad) {
		super(nombre, tipo, color, edad);
		
	}


private String veneno;
s
public String getVeneno() {
	return veneno;
}

public void setVeneno(String veneno) {
	this.veneno = veneno;
}

public String toString() {
	return " ¿Es venenosa? = " + veneno + "\n Nombre= " + getNombre()
			+ "\n Tipo de animal = " + getTipo() + "\n Color= " + getColor() + "\n Edad = " + getEdad();

}
public void hacerSonido() {
	JOptionPane.showMessageDialog(null, "Hola amo soy tu serpiente SSSSSSSSSS :D");
	System.out.println("SSSSSSSSSS");
}
public void moverse() {
	JOptionPane.showMessageDialog(null, "Estoy reptandoss");
	}
}
