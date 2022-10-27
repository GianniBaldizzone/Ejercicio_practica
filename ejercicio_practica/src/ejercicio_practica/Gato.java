package ejercicio_practica;

import javax.swing.JOptionPane;

public class Gato extends Animal {
	private String bigotes;

	public Gato(String nombre, String tipo, String color, String edad) {
		super(nombre, tipo, color, edad);
		
	}

	@Override
	public String toString() {
		return " ¿Tiene bigotes? = " + bigotes + "\n Nombre= " + getNombre()
				+ "\n Tipo de animal = " + getTipo() + "\n Color= " + getColor() + "\n Edad = " + getEdad();
	}

	public String getBigotes() {
		return bigotes;
	}

	public void setBigotes(String bigotes) {
		this.bigotes = bigotes;
	}
    public void hacerSonido() {
    	JOptionPane.showMessageDialog(null, "Hola amo soy tu gato " + this.getNombre() +" miaw :D");
    	System.out.println("miaw");
    }
	
    public void moverse() {
	JOptionPane.showMessageDialog(null, "Estoy caminando");
	}
}
	

