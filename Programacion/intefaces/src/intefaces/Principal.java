package intefaces;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea1();
	}

	public static void tarea1() {
		String ruta="C:\\Users\\EstudianteDAM206\\Desktop\\municipios.txt",linea="";
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		ArrayList<Municipio> listaMunicipios=new ArrayList<Municipio>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(ruta));
			while((linea=reader.readLine())!=null) {
				//System.out.println(linea);
				String [] partesLinea=linea.split(";");
				String nombrePueblo=partesLinea[0];
				int poblacion=Integer.parseInt(partesLinea[1]);
				String provincia=partesLinea[2];
				Municipio municipio=new Municipio(nombrePueblo, poblacion, provincia);
				listaMunicipios.add(municipio);
				
			}
			do {
			System.out.println("Que quieres hacer con los datos: ");
			System.out.println("1.Listar Municipios por poblacion decreciente");
			System.out.println("2.Lista municipios alfabeticamente.");
			System.out.println("3.Listar municipios ordenador alfabeticamente por provincia.");
			System.out.println("4.Guardar en un fichero binario.");
			System.out.println("5.Salir.");
			opcion=sc.nextInt();
			switch(opcion){
			case 1:
				compararPoblacion(listaMunicipios);
				break;
			case 2:
				compararAlfa(listaMunicipios);
				break;
			case 3:
				compararProvincia(listaMunicipios);
				break;
			case 4:
				guardarBinario(listaMunicipios);
				break;
			case 5:
				System.out.println("Gracias por utilizar nuestros servicios.");
				break;
			default:
				System.out.println("Opcion no valida, intentelo de nuevo");
			}
			}while(opcion!=5);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void compararPoblacion(ArrayList<Municipio> listaMunicipios) {
		Collections.sort(listaMunicipios);
		for(Municipio pueblo:listaMunicipios) {
			System.out.println(pueblo.toString());
		}
	}
	public static void compararAlfa(ArrayList<Municipio> listaMunicipios) {
		Collections.sort(listaMunicipios, Municipio.comparadorAlf);
		for(Municipio pueblo:listaMunicipios) {
			System.out.println(pueblo.toString());
		}
	}
	
	public static void compararProvincia(ArrayList<Municipio> listaMunicipios) {
		Collections.sort(listaMunicipios, Municipio.ComparadorProv);
		for(Municipio pueblo:listaMunicipios) {
			System.out.println(pueblo.toString());
		}
	}
	public static void guardarBinario(ArrayList<Municipio> listaMunicipios) {
		String ruta="C:\\Users\\EstudianteDAM206\\Desktop\\municipios.dat";
		try {
			ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream(ruta));
			for(Municipio pueblo:listaMunicipios) {
				dos.writeObject(pueblo);
			}
			dos.close();
			System.out.println("Datos guardados correctamente en archivo binario.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
public static void tarea2() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce una frase por teclado: ");
	String frase=sc.nextLine().toLowerCase().trim(),fraseFinal="";
	
	String [] palabras=frase.split(" ");
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

public static void tarea3() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce una frase por teclado: ");
	String fraseUser=sc.nextLine();
	System.out.println("¿Que quieres hacer con tu frase?");
	System.out.println("1.Calcular el numero medio de letras por palabra.");
	System.out.println("2.Calcular cual es la palabra mas larga de la frase.");
	System.out.println("3.Calcular el porcentaje de palabras de la frase que tienen 3 o mas letras.");
	int opcion=sc.nextInt();
	
	switch(opcion) {
	case 1:
		numeroMedioLetras(fraseUser);
		break;
	case 2:
		palabraMasLarga(fraseUser);
		break;
	case 3:
		palabras3oMas(fraseUser);break;
	}
	
}

public static void numeroMedioLetras(String fraseUser) {
	// TODO Auto-generated method stub
	int nLetras=0,nPalabras=0;
	double mediaLetras=0;
	String [] palabras=fraseUser.split(" ");
	
	for(String palabra:palabras) {
		nPalabras++;
		nLetras+=palabra.length();
	}
	
	mediaLetras=(double)nLetras/nPalabras;
	System.out.println(nPalabras+"  "+nLetras+" la media de letras por palabra es de "+mediaLetras);
}

public static void palabraMasLarga(String fraseUser) {
	int longitud=0,longitudMax=0;
	String palabraAct="",palabraM="";
	String [] palabras=fraseUser.split(" ");
	
	for(String palabra:palabras) {
		longitud=palabra.length();
		if(longitud>longitudMax) {
			longitudMax=longitud;
			palabraM=palabra;
		}
	}
	System.out.println("La palabra mas larga es "+palabraM+" y tiene "+longitudMax+" letras.");
}

public static void palabras3oMas(String fraseUser) {
	int nPalabras3=0,nPalabras=0,nLetras=0;
	
	String [] palabras=fraseUser.split(" ");
	for(String palabra:palabras) {
		if(palabra.length()>=3) {
			nPalabras3++;
		}else {
			nPalabras++;
		}
	}
	int nPalabrasTotales=nPalabras+nPalabras3;
	
	double porcentaje = ((double) nPalabras3 / nPalabrasTotales) * 100;
	
	System.out.println("Hay un "+porcentaje+"% de palabras con 3 o mas letras.");
}

public static void cadenas() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce una frase por teclado: ");
	String frase=sc.nextLine();
	String fraseFinal="";
	String [] palabras=frase.split(" ");
	for(String palabra:palabras) {
		char[] letras=palabra.toCharArray();
		for(int i=0;i<letras.length;i++) {
			
		}
	}
	
	
	
	
}

}
 	
	

