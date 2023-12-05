import java.io.Serializable;
import java.time.LocalDate;

public class Cliente implements Serializable,Comparable<Cliente> {
private String DNI;
private String nombreCompleto;
private int edad;
private double saldo;
private LocalDate fechaInicio;

@Override
public int compareTo(Cliente otro) {
	return this.fechaInicio.compareTo(otro.fechaInicio);
	
}

@Override
public String toString() {
    return "Cliente{dni='" + DNI + "', nombre='" + nombreCompleto + "', edad=" + edad +
           ", saldo=" + saldo + ", fechaInicio=" + fechaInicio + '}';
}


public String getDNI() {
	return DNI;
}
public void setDNI(String dNI) {
	DNI = dNI;
}
public String getNombreCompleto() {
	return nombreCompleto;
}
public void setNombreCompleto(String nombreCompleto) {
	this.nombreCompleto = nombreCompleto;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public LocalDate getFechaInicio() {
	return fechaInicio;
}
public void setFechaInicio(LocalDate fechaInicio) {
	this.fechaInicio = fechaInicio;
}



public Cliente(String dNI, String nombreCompleto, int edad, double saldo, LocalDate fechaInicio) {
	super();
	DNI = dNI;
	this.nombreCompleto = nombreCompleto;
	this.edad = edad;
	this.saldo = saldo;
	this.fechaInicio = fechaInicio;
}

}