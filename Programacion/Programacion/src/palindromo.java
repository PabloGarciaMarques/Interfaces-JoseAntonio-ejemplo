import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.sampled.Port;

public class palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		apartadoB();
	}
	public static void tarea1() {
		String ruta="C:\\Users\\EstudianteDAM206\\Desktop\\municipios.txt",linea;
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
					//System.out.println(pueblo);
				}
				System.out.println(nombrePueblacho+" "+poblacion+" "+provincia);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		Scanner sc = new Scanner(System.in);
		int opcion=sc.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("Opcion 1");
			Collections.sort(Listamunicipios);
		}
		}
	
	
	
	
	public static void tarea2() {
		Scanner sc = new Scanner(System.in);
		String fraseFinal="";
		int longitud=0;
		System.out.println("Introduce una frase por pantalla: ");
		
		String fraseusuario=sc.nextLine().toLowerCase().trim();
		String [] palabras=fraseusuario.split(" ");
		for(String palabra:palabras) { 
			longitud=palabra.length();
			if(longitud%2==0) {
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
		
		mediaPalabrasLargas(fraseUser);
		
		sc.close();
	}
	public static void nMedioLetras(String fraseUser) {
		String [] palabras=fraseUser.split(" ");
		int nPalabras=0,nLetrasTotal=0;
		char[] letras=fraseUser.toCharArray();
		double mediaLetras=0;
		for(char letra:letras) {
			if(Character.isLetter(letra)) {
			nLetrasTotal++;
			}
		}
		for(String palabra:palabras) {
			 nPalabras++;
		}
		mediaLetras=(double)nLetrasTotal/nPalabras;
		System.out.println(mediaLetras);
		System.out.println(nLetrasTotal);
		System.out.println(nPalabras);
	}
	
	
	
	public static void palabraMasLarga(String fraseUser) {
		String palabras[] =fraseUser.split(" ");
		int nletras=0,nletrasMax=0;
		String palabraMax="";
		for(String palabra:palabras) {
			int longitud=palabra.length();
			if(longitud>nletrasMax) {
				palabraMax=palabra;
				nletrasMax=longitud;
			}
		}
		
		System.out.println("La palabra mas larga es "+palabraMax+" y tiene "+nletrasMax+" letras");
	}
	
	public static void mediaPalabrasLargas(String fraseUser) {
		String [] palabras=fraseUser.split(" ");
		int totalpalabras=palabras.length;
		int nPalabrasLargas=0;
		double porcentaje=0;
		for(String palabra:palabras) {
			if(palabra.length()>=3) {
				nPalabrasLargas++;
			}else {
				//no hace na
			}
		}
		if(nPalabrasLargas>0) {
			 porcentaje=((double)nPalabrasLargas/totalpalabras)*100;
		}
		
		System.out.println("Hay un "+porcentaje+" de palabras con tres o mas letras");
		
		
	}
	
	public static void tarea4(int min,int max, int cantidad) {
		arrayAleatorio(15, 100, 10);
	}
	
	public static int[] arrayAleatorio(int min, int max, int cantidad) {
		int [] tablaFinal=new int[0];
		
		if(max+5<=min) {
			System.out.println("Los parametros de entrada no cumplen los requisitos, por favor intentelo de nuevo.");
		
			
		}else {
			tablaFinal=new int[cantidad];
			for(int i = 0; i<tablaFinal.length;i++) {
				int numR=(int)((max-min+1)*(Math.random())+min);
				tablaFinal[i]=numR;
			}
			
		}
		System.out.println(Arrays.toString(tablaFinal));
		return tablaFinal;
		
	}
	public static void apartadoB() {
		int [] tablaFinal= arrayAleatorio(1, 25, 50);
		
		Arrays.sort(tablaFinal);
		
		for(int numero:tablaFinal) {
			System.out.print(numero+" ");
		}
		
		
	}
	
	}
	

