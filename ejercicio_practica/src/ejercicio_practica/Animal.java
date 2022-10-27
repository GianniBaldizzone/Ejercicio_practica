package ejercicio_practica;

public abstract class Animal {

private String nombre;
private String tipo;
private String color;
private String edad;
@Override
public String toString() {
	return "Animal [nombre=" + nombre + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + "]";
}
public Animal(String nombre, String tipo, String color, String edad) {
	super();
	this.nombre = nombre;
	this.tipo = tipo;
	this.color = color;
	this.edad = edad;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getEdad() {
	return edad;
}
public void setEdad(String edad) {
	this.edad = edad;
}



}
