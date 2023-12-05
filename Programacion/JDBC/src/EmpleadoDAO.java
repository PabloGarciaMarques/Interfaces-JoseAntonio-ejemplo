import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmpleadoDAO {
private Connection conexionbd;
public EmpleadoDAO() {
	conexion();
	read(1);
}

private void conexion() {
	try {
		String url="jdbc:mysql://localhost:3306/EmpleadoBBDD";
		String user="root";
		String password="rootpablo";
		this.conexionbd=DriverManager.getConnection(url, user, password);
	}catch (Exception e) {
		// TODO: handle exception
	}
}

public Empleado read(int idEmpleado) {
	Empleado empleado=null;
	try {
		String plantilla="SELECT * FROM empleado where id=?";
		PreparedStatement prepared=conexionbd.prepareStatement(plantilla);
		prepared.setInt(1, idEmpleado);
		ResultSet resultados=prepared.executeQuery();
		if(resultados.next()) {
			String nombre=resultados.getString(2);
			int edad=resultados.getInt(3);
			String telefono=resultados.getString(4);
			empleado= new Empleado(idEmpleado,nombre,edad,telefono);
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	return empleado;
}

public boolean create(Empleado empleado) {
	boolean exito =false;
	try {
		String plantillaSQL="INSERT INTO empleado (nombre.edad,telefono) VALUES (?,?,?)";
		PreparedStatement prepared=conexionbd.prepareStatement(plantillaSQL);
		prepared.setString(1, empleado.getNombre());
		prepared.setInt(2, empleado.getEdad());
		prepared.setString(3, empleado.getTelefono());
		
		prepared.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	return exito;
}




}
