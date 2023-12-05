
public class Alumno {
private String nombre;
private double notaProgramacion;
private double notaLenguaje;
private double notaSistemas;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getNotaProgramacion() {
	return notaProgramacion;
}
public void setNotaProgramacion(double notaProgramacion) {
	this.notaProgramacion = notaProgramacion;
}
public double getNotaLenguaje() {
	return notaLenguaje;
}
public void setNotaLenguaje(double notaLenguaje) {
	this.notaLenguaje = notaLenguaje;
}
public double getNotaSistemas() {
	return notaSistemas;
}
public void setNotaSistemas(double notaSistemas) {
	this.notaSistemas = notaSistemas;
}

public Alumno(String nombre, double notaProgramacion, double notaLenguaje, double notaSistemas) {
	this.nombre = nombre;
	this.notaProgramacion = notaProgramacion;
	this.notaLenguaje = notaLenguaje;
	this.notaSistemas = notaSistemas;
}

@Override 
public String toString() {
	  return "Nombre: " + nombre +
              ", Nota Programación: " + notaProgramacion +
              ", Nota Lenguaje: " + notaLenguaje +
              ", Nota Sistemas: " + notaSistemas;
}

}
