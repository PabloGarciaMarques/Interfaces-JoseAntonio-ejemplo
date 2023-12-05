import java.util.Arrays;
import java.util.Scanner;

public class Hoja6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio3();
	}
	public static void ejercicio1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase por teclado: ");
		String frase=sc.nextLine();
		int contadorEspacios=0;
		for (int i=0;i<frase.length();i++) {
			if(Character.isWhitespace(frase.charAt(i))) {
				contadorEspacios++;
			}
		}
		System.out.println(contadorEspacios);
		
	}
	
	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase por teclado: ");
		String frase=sc.nextLine();
		String fraseInvertida="";
		
		for(int i =frase.length()-1;i>=0;i--) {
			fraseInvertida+=frase.charAt(i);
		}
		System.out.println(fraseInvertida);
		
	}
	
	public static void ejercicio3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena o palabra por teclado: ");
		String cadena=sc.nextLine();
		char [] caracteres= {'a','e','i','o','u'};
		cadena.toLowerCase();
		for(int i=0;i<caracteres.length;i++) {
			cadena=cadena.replace(caracteres[i], ' ');
			}
		System.out.println(cadena);
		}
	
	public static void ejercicio4() {
		Scanner sc= new Scanner(System.in);
		int contador=0;
		System.out.println("Introduce una frase por teclado: ");
		String frase=sc.nextLine();
		System.out.println("Introduce la palabra que quieres buscar: ");
		String palabra=sc.nextLine();
		String [] partesFrase=frase.split("[ ,;:.]");
		
		for(int i=0;i<partesFrase.length;i++) {
			if(partesFrase[i].equals(palabra)) {
				contador++;
			}
		}
		
		System.out.println(contador);
	}
	
	
	public static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String palabra1=sc.nextLine().trim();
		System.out.println("Introduce otra palabra: ");
		String palabra2=sc.nextLine().trim();
		
		char[] arrayP1=palabra1.toCharArray();
		char[] arrayP2=palabra2.toCharArray();
		Arrays.sort(arrayP1);
		Arrays.sort(arrayP2);
		
		if(Arrays.equals(arrayP1, arrayP2)) {
			System.out.println("Las palabras son anagramas");
		}else {
			System.out.println("Las palabras no son anagramas.");
		}
		
		
		System.out.println(Arrays.toString(arrayP1));
	}
	
	
	public static void ejercicio7() {
		
	}
}
