package intefaces;

import java.io.Serializable;
import java.util.Comparator;

public class Municipio implements Serializable, Comparable<Municipio> {
private String nombreMunicipio;
private int poblacion;
private String provincia;


public Municipio(String nombreMunicipio, int poblacion, String provincia) {
	
	this.nombreMunicipio = nombreMunicipio;
	this.poblacion = poblacion;
	this.provincia = provincia;
}


public String getNombreMunicipio() {
	return nombreMunicipio;
}
public void setNombreMunicipio(String nombreMunicipio) {
	this.nombreMunicipio = nombreMunicipio;
}
public int getPoblacion() {
	return poblacion;
}
public void setPoblacion(int poblacion) {
	this.poblacion = poblacion;
}
public String getProvincia() {
	return provincia;
}
public void setProvincia(String provincia) {
	this.provincia = provincia;
}

@Override
public String toString() {
	return "[Nombre: "+nombreMunicipio+", Poblacion: "+poblacion+", Provincia: "+provincia+"]";
}
@Override
public int compareTo(Municipio otroMunicipio){
	return Integer.compare(otroMunicipio.getPoblacion(), this.getPoblacion());
}
public static Comparator<Municipio> comparadorAlf=Comparator.comparing(Municipio::getNombreMunicipio);
/*public static Comparator<Municipio> comparadorAlfabeticoPorNombre = 
(municipio1, municipio2) -> municipio1.getNombre().compareTo(municipio2.getNombre());*/
public static Comparator<Municipio> ComparadorProv=Comparator.comparing(Municipio::getProvincia).thenComparing(Municipio::getNombreMunicipio);


}
