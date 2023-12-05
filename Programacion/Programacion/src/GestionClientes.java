import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class GestionClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "C:\\Users\\EstudianteDAM206\\Desktop\\ClientesBanco.txt";
		Scanner sc= new Scanner(System.in);
		System.out.println("Bienvenido al sistema de gestion de clientes de nuestro banco perraca.");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Elija una opcion:\n ");
		
		System.out.println("1.Alta cliente\r\n"
							+ "2.Baja Cliente\r\n"
							+ "3.Listar Clientes\r\n"
							+ "4.Guardar y Salir\r\n");
		
		int opcion=sc.nextInt();
		
		
		switch(opcion) {
		case 1:
			altaClientes(ruta);
			break;
		case 2:
			//bajaClientes();
			break;
		case 3:
			//listarClientes();
			break;
		case 4:
			//guardarYsalir();
			break;
		}
		
	
	}
	
	public static void altaClientes(String ruta) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			String linea="";
			
			while((linea=br.readLine())!=null) {
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} {
			
		}
	}

}
