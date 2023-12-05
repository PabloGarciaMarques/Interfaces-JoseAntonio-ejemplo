import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Hoja10ArchivosBinarios {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	
		 
		leerBinarios();
	}
	
	public static void tarea1() {
		String ruta="C:\\Users\\EstudianteDAM206\\Desktop\\numeros.dat";
		int cantidad=150;
		try {
			DataOutputStream dos=new DataOutputStream(new FileOutputStream(ruta));
			
			
			for(int i =0;i<cantidad;i++) {
				int numA=(int)(100*Math.random()+1);
				dos.writeInt(numA);
			}
			System.out.println("Numeros almacenados en "+ruta);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	  
	    
	    public static void tarea2() {
	    	String ruta="C:\\Users\\EstudianteDAM206\\Desktop\\numerosDouble.dat";
	    	int cantidad=150;
	    	try {
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta));
				
				for(int i=0;i<cantidad;i++) {
		    		double num=(100*Math.random()+1);
		    		dos.writeDouble(num);
				}		
				System.out.println("Numeros almacenados en "+ruta);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	    	}
	    
	    public static void leerBinarios(){
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("Cual de los dos archivos deseas abrir: ");
	    	int opcion=sc.nextInt();
	    	if(opcion==2) {
	        try (DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\EstudianteDAM206\\Desktop\\numerosDouble.dat"))) {
	            while (dis.available() > 0) {
	                double numero = dis.readDouble();
	                System.out.print(numero+" ");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    	}else if(opcion==1) {
	    		try (DataInputStream dis=new DataInputStream(new FileInputStream("C:\\Users\\EstudianteDAM206\\Desktop\\numeros.dat"))){
					while(dis.available()>0) {
						int numero = dis.readInt();
						System.out.print(numero+" ");
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
	    }
}
