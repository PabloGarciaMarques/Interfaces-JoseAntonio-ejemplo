
public class TestEmpleadoDAO {

	public static void main(String[] args) {
	        // TODO Auto-generated method stub
	   EmpleadoDAO dao = new EmpleadoDAO();
	   Empleado e1 = new Empleado(1, "David Pérez", 25, "633225599");
	   Empleado e2 = new Empleado(2, "Julian González", 30, "644665599");
	   Empleado e3 = new Empleado(3, "Maria Gómez", 24, "699447788");
	   Empleado e4 = new Empleado(4, "Nuria Roca", 35, "611442233");
	   Empleado e5 = new Empleado(5, "Alberto Gutierrez", 34, "633778899");
	   Empleado[] empleados = { e1, e2, e3, e4, e5 };
	   }
	public static void leerEmpleados() {
		for(int i=0;i<=5;i++) {
			Empleado e=EmpleadoDAO.read(i);
		}
	}

}

