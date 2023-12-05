import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {
	private Connection conexion;
public EmpleadoDAO() {
	connect();
}
public void connect() {
	try {
		
		String url="jdbc:mysql://localhost:3306//EmpleadoBBDD";
		String user="root";
		String password="rootpablo";
		this.conexion=DriverManager.getConnection(url,user,password);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}

public List<Empleado> getAllEmpleados(){
	List<Empleado> empleados=new ArrayList<Empleado>();
	int idEmpleado=0,edad=0;
	String nombre="",telefono="";
	String sql="SELECT * FROM empleado";
	Empleado e=null;
	try {
		PreparedStatement sentenciaSQL= conexion.prepareStatement(sql);
		ResultSet resultado=sentenciaSQL.executeQuery();
		while(resultado.next()) {
			idEmpleado=resultado.getInt(1);
			nombre=resultado.getString(2);
			edad=resultado.getInt(3);
			telefono=resultado.getString(4);
			e=new Empleado(idEmpleado, nombre, edad, telefono);	
			empleados.add(e);
		}
	} catch (Exception e2) {
		// TODO: handle exception
	}
	return empleados;
}

public Empleado read(int idEmpleado) {
	Empleado empleado=null;
	try {
		String plantillaSQl="SELECT * FROM empleado WHERE idEmpleado=?";
		PreparedStatement prepared=conexion.prepareStatement(plantillaSQl);
		prepared.setInt(1, idEmpleado);
		ResultSet resultados=prepared.executeQuery();
		
		if (resultados.next()) {
			String nombre = resultados.getString(2);
			int edad = resultados.getInt(3);
			String telefono = resultados.getString(4);
			empleado = new Empleado(idEmpleado, nombre, edad, telefono);
		}else {
			System.out.println("No se han encontrado registros con ese id de usuario");
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	return empleado;
}




}
