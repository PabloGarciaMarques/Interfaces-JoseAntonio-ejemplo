import java.util.Scanner;

import javax.swing.Spring;

public class letrina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea1();
	}
	public static void tarea1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase por teclado");
		String linea=sc.nextLine().toLowerCase(); 
		
		String fraseFinal="";
		String [] palabras=linea.split(" ");
		
		for(String palabra:palabras) {
			int longitud=palabra.length();
			if(longitud%2==0) {
				fraseFinal+=palabra.toUpperCase()+" ";
			}else {
				fraseFinal+=palabra+" ";
			}
		}
		System.out.println(fraseFinal);
		
	}
}
