import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea5();
	}
	public static void tarea1() { 
		String ruta="C:\\Users\\EstudianteDAM206\\Desktop\\potencias.dat";
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta));
			for(int i =0;i<=20;i++) {
			int potencias=(int) Math.pow(2, i);
			
			dos.writeInt(potencias);
			
		}
			dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println(potencias);
}
	
	
	public static void tarea2() {
		String ruta="C:\\Users\\EstudianteDAM206\\Desktop\\potencias.dat";
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(ruta));
			
			for(int i=0;i<=20;i++) {
				int potencia=dis.readInt();
				System.out.println(potencia);	
			}
			dis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void tarea5() {
		String ruta="C:\\Users\\EstudianteDAM206\\Downloads\\peliculas.txt";
		String linea="";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(ruta));
			
			while((linea=reader.readLine())!=null) {
				System.out.println(linea);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
	
}