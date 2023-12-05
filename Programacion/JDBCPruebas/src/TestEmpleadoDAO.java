
public class TestEmpleadoDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpleadoDAO dao=new EmpleadoDAO();
		/*Empleado e1=new Empleado("Pepe", 25, "123 45 67");
		Empleado e2=new Empleado("Paquito", 29, "123 45 89");
		Empleado e3=new Empleado("Jose Luis", 30, "123 45 01");
		Empleado e4=new Empleado("Antonio", 33, "123 45 12");
		Empleado e5=new Empleado("Pepa", 21, "123 45 23");*/
		
		Empleado empleado1=dao.read(1);
		System.out.println(empleado1);
	}

}
