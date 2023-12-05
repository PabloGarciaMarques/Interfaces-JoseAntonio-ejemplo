import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExamenFebrero22_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea1();
	}
	
	public static void tarea1() {
		String archivo="C:\\Users\\EstudianteDAM206\\Desktop\\numeros.txt";
		int contadorPares=0;
		int contadorImpares=0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			String lineaLeida="";
			String [] partesLinea=null;
			while((lineaLeida=br.readLine())!=null) {
				partesLinea=lineaLeida.split(" ");
				for(int i=0;i<partesLinea.length;i++) {
					int numero=Integer.parseInt(partesLinea[i]);
					if(numero%2==0) {
						contadorPares++;
					}else {
						contadorImpares++;
					}
				}
			}
			System.out.println("Hay "+contadorPares+" numeros pares y "+contadorImpares+" numeros impares");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void tarea2() {
		String archivo="C:\\Users\\EstudianteDAM206\\Desktop\\Jugadores.txt";
		int totalEdad=0,numJugador=0,edadMax=0,edadMin=0;
		double alturaMax=0,alturaMin=0;
		String nombre,edadS,alturaS,NombreJugadorMasMayor,nombreJugadorMasPequeño,nombreJugadorMasBajo,nombreJugadorMasAlto;
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			String linea="";
			String [] partesLinea=null;
			while((linea=br.readLine())!=null) {
				partesLinea=linea.split(";");
				 nombre=partesLinea[0];
				 edadS=partesLinea[1];
				 alturaS=partesLinea[2];
				System.out.println(nombre+" "+edadS+" "+alturaS);
				int edad=Integer.parseInt(edadS);
				double altura=Double.parseDouble(alturaS);
				if(numJugador==0) {
					edadMax=edad;
					alturaMax=altura;
					alturaMin=altura;
					edadMin=edad;
				}if(edad>edadMax) {
					edadMax=edad;
					NombreJugadorMasMayor=nombre;
				}if(edad<edadMin) {
					edadMin=edad;
					nombreJugadorMasPequeño=nombre;
				}if(altura>alturaMax) {
					alturaMax=altura;
					nombreJugadorMasAlto=nombre;
				}if(altura<alturaMin) {
					alturaMin=altura;
					nombreJugadorMasBajo=nombre;
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
