import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExamenSept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea1();
	}
	public static void tarea1() {
		ArrayList<Municipio> listaMunicipios=new ArrayList<Municipio>();
		String ruta="C:\\Users\\EstudianteDAM206\\Desktop\\FicherosTXT-DAT\\municipios.txt";
		String lineaLeida="";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(ruta));
			while((lineaLeida=reader.readLine())!=null) {
				String [] partesLinea=lineaLeida.split(";");
				//System.out.println(Arrays.toString(partesLinea));
				String nombreMunicipio=partesLinea[0];
				int poblacion=Integer.parseInt(partesLinea[1]);
				String provincia=partesLinea[2];
				
				Municipio municipio=new Municipio(nombreMunicipio, poblacion, provincia);
				listaMunicipios.add(municipio);
				
				
			}
		} catch (IOException ex) {
			ex.toString();
		}
		//Ordenar por población creciente:
		Collections.sort(listaMunicipios);
		//Ordenar por población decreciente:
		Collections.sort(listaMunicipios,Collections.reverseOrder());
		//Ordenar alfabeticamente A-Z
		Collections.sort(listaMunicipios,new ComparatorNombre());
		
		//ordenados A-Z por provincia y si son de la misma provincia
		//ordenamos por nombre
		ComparatorProvincia cp=new ComparatorProvincia();
		Collections.sort(listaMunicipios,cp.thenComparing(new ComparatorNombre()));
		
		for (Municipio pueblo:listaMunicipios) {
			System.out.println(pueblo);
		}
		
		
	}

}
