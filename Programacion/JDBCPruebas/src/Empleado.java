
public class Empleado {

public int idEmpleado;
public String nombre;
public int edad;
public String telefono;


public int getIdEmpleado() {
	return idEmpleado;
}
public void setIdEmpleado(int idEmpleado) {
	this.idEmpleado = idEmpleado;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public Empleado(int idEmpleado, String nombre, int edad, String telefono) {
	super();
	this.idEmpleado = idEmpleado;
	this.nombre = nombre;
	this.edad = edad;
	this.telefono = telefono;
}

public Empleado(String nombre, int edad, String telefono) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.telefono = telefono;
}

}
