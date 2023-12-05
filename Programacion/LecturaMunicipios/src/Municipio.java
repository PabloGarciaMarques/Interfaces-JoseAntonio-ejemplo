
public class Municipio {
	//Atributos de la clase
	public String nombreMunicipio;
	public int poblacion;
	public String provincia;

	//constructor de la clase
	public Municipio(String nombreMunicipio, int poblacion, String provincia) {
		super();
		this.nombreMunicipio = nombreMunicipio;
		this.poblacion = poblacion;
		this.provincia = provincia;
	}


	//Metodos Getter y Setter
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



	}

