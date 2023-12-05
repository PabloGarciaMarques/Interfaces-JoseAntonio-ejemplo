import java.util.Arrays;
import java.util.Scanner;
import java.math.*;
public class Examen2T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio5();
	}
	public static String ejercicio1(String frase) {
		String fraseFinal="";
		int contador=0;
		frase.toLowerCase();
		
		for(int i=0;i<frase.length();i++) {
			if(contador%2!=0) {
				fraseFinal+=frase.charAt(i);
			}else {
				fraseFinal+=Character.toUpperCase(frase.charAt(i));
			}
			contador++;
		}
		System.out.println(fraseFinal);
		return fraseFinal;
	}
	
	
	public static void ejercicio3() {
		Scanner sc = new Scanner(System.in);
		String frase;
		int numA=0,numAMax=0;
		String palabraMax="";
		System.out.println("Introduce una frase por teclado: ");
		frase=sc.nextLine();
		
		String [] palabras=frase.split(" ");
		
		for(String palabra:palabras) {
			for(int i=0;i<palabra.length();i++) {
				if(palabra.charAt(i)=='a'||palabra.charAt(i)=='A') {
					numA++;
				}
			}
			if(numA>numAMax) {
				numAMax=numA;
				palabraMax=palabra;
			}
			numA=0;
		}
		System.out.println("La palabra con mas a es "+palabraMax+" y tiene "+numAMax+" letras a");
		System.out.println(Arrays.toString(palabras));
		
	}

	public static int[] ejercicio2(int min,int max,int cantidad) {
		int [] tabla=new int[cantidad];
		if(max<=min+5) {
			System.out.println("Los parametros seleccionados son incorrectos, por favor intentelo de nuevo.");
		}else {
			for(int i=0;i<cantidad;i++) {
				tabla[i]=(int)((max-min)*(Math.random())+min);
			}
		System.out.println(Arrays.toString(tabla));	
		}
		return tabla;
	}
	
	public static void ejercicio5() {
		int [] tabla= {3,6,5,4,7,6,9,5};
		int [] tabla2=insertarEnPosicion(tabla, 2, 1);
		
		System.out.println(Arrays.toString(tabla2));
	}
	//Dudas
	public static int[] insertarEnPosicion(int[] tabla,int valor,int posicion) {
		tabla=Arrays.copyOf(tabla, tabla.length+1);
		for(int i=tabla.length-2;i>=posicion;i--) {
			tabla[i-1]=tabla[i];
		}
		tabla[posicion]=valor;
		System.out.println(Arrays.toString(tabla));
		return tabla;
	}
}
