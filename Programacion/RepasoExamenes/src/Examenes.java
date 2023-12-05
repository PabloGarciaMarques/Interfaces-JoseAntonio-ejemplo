import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Examenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		municipios();
	}
	
	public static void tarea1() {
		String ruta="C:\\Users\\EstudianteDAM206\\Desktop\\notas.txt";
		String linea="";
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			while((linea=br.readLine())!=null) {
				String[] partesLinea=linea.split(";");
				String nombre=partesLinea[0];
				double notaProgramacion=Double.parseDouble(partesLinea[1]);
				double notaLenguaje=Double.parseDouble(partesLinea[2]);
				double notaSistemas=Double.parseDouble(partesLinea[3]);
				Alumno alumno= new Alumno(nombre,notaProgramacion,notaLenguaje,notaSistemas);
				listaAlumnos.add(alumno);
				for(Alumno alumnoLista:listaAlumnos) {
					System.out.println(alumnoLista);
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void tarea2() {
		String ruta="C:\\Users\\EstudianteDAM206\\Desktop\\potencias.txt";
		String rutaE="C:\\Users\\EstudianteDAM206\\Desktop\\resultados.txt";
		String linea="";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			BufferedWriter bw = new BufferedWriter(new FileWriter(rutaE));
			
			while((linea=br.readLine())!=null) {
				String [] partesLinea=linea.split(" ");
				int base =Integer.parseInt(partesLinea[0]);
				int exponente= Integer.parseInt(partesLinea[1]);
				int resultado=(int) Math.pow(base, exponente);
				bw.write(base+"^"+exponente+"="+resultado);
				bw.newLine();
				System.out.println(base+"^"+exponente+"="+resultado);
				
			}
			bw.close();
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void tarea3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase por teclado: ");
		String frase=sc.nextLine().toLowerCase();
		String [] palabras=frase.split(" ");
		
		String fraseFinal="";
		
		for(String palabra:palabras) {
		if(palabra.length()%2==0) {
			palabra=palabra.toUpperCase();
			fraseFinal+=palabra+" ";
		}else {
			fraseFinal+=palabra+" "; 
		}
		}
		
		System.out.println(fraseFinal);
		
		
		
	}
	public static void municipios() {
		String ruta="C:\\Users\\EstudianteDAM206\\Desktop\\municipios.txt";
		ArrayList<Municipio> listaMunicipios=new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			String linea="";
			
			while((linea=br.readLine())!=null) {
				String [] partesLinea=linea.split(";");
				String nombre=partesLinea[0];
				int poblacion=Integer.parseInt(partesLinea[1]);
				String provincia=partesLinea[2];
				Municipio municipio=new Municipio(nombre, poblacion, provincia);
				listaMunicipios.add(municipio);
				//System.out.println(nombre+" "+poblacion+" "+provincia);
			}
			for(Municipio pueblo:listaMunicipios) {
				System.out.println(pueblo.toString());
			}
			
			//listarPorPoblacionDecreciente(listaMunicipios);
			//listarAlfabeticamente(listaMunicipios);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	 private static void listarPorPoblacionDecreciente(ArrayList<Municipio> listaMunicipios) {
	        Collections.sort(listaMunicipios, Collections.reverseOrder());
	    	for(Municipio pueblo:listaMunicipios) {
				System.out.println(pueblo.toString());
			}
			
	    }
	 private static void listarAlfabeticamente(ArrayList<Municipio> listaMunicipios) {
		// Collections.sort(listaMunicipios,Municipio.comparadorAlfabeticoPorNombre);
		 for(Municipio pueblo:listaMunicipios) {
			 System.out.println(pueblo.toString());
		 }
	 }


}
