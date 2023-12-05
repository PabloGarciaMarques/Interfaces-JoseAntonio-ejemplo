	import java.sql.Date;
public class Videojuego {
private int idVideojuego;
private String nombre;
private Date fechaLanzamiento;
private String desarrollador;
private double precio;
private boolean descuento;

public Videojuego() {

}

	    public Videojuego(String nombre, Date fechaLanzamiento, String desarrollador, double precio, boolean descuento) {
	        this.nombre = nombre;
	        this.fechaLanzamiento = fechaLanzamiento;
	        this.desarrollador = desarrollador;
	        this.precio = precio;
	        this.descuento = descuento;
	    }

	    // Getters y setters
	    public int getIdVideojuego() {
	        return idVideojuego;
	    }

	    public void setIdVideojuego(int idVideojuego) {
	        this.idVideojuego = idVideojuego;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public Date getFechaLanzamiento() {
	        return fechaLanzamiento;
	    }

	    public void setFechaLanzamiento(Date fechaLanzamiento) {
	        this.fechaLanzamiento = fechaLanzamiento;
	    }

	    public String getDesarrollador() {
	        return desarrollador;
	    }

	    public void setDesarrollador(String desarrollador) {
	        this.desarrollador = desarrollador;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }

	    public boolean isDescuento() {
	        return descuento;
	    }

	    public void setDescuento(boolean descuento) {
	        this.descuento = descuento;
	    }
	}


