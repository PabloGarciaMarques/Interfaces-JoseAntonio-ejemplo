import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void tarea1() {
		String ruta="C:\\Users\\EstudianteDAM206\\Desktop\\municipios.txt";
		String linea="";
		ArrayList<Municipio> Listamunicipios=new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			while((linea=br.readLine())!=null) {
				//System.out.println(linea);
				String[]partesLinea=linea.split(";");
				String nombrePueblacho=partesLinea[0];
				int poblacion=Integer.parseInt(partesLinea[1]);
				String provincia=partesLinea[2];
				Municipio municipio=new Municipio(nombrePueblacho, poblacion, provincia);
				Listamunicipios.add(municipio);
				//System.out.println(Arrays.toString(partesLinea));
				for(Municipio pueblo:Listamunicipios) {
				System.out.println(pueblo);
				}
				System.out.println(nombrePueblacho+" "+poblacion+" "+provincia);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
