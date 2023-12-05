import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea2();
	}
	public static void tarea1() {
		List<Integer> listaNumeros=new ArrayList<>(30);
		
		
		for(int i =0;i<30;i++) {
			int numeroAleatorio=(int) (10*Math.random()+1);
			listaNumeros.add(numeroAleatorio);
		}
		
		System.out.println("Lista original");
		for(Integer numero:listaNumeros) {
			System.out.print(numero+" ");
		}
		System.out.println("\nLista sin duplicados: ");
		Set<Integer> conjuntoSinDuplicados=new HashSet<>(listaNumeros);
		for(Integer numeroU:conjuntoSinDuplicados) {
			System.out.print(numeroU+" ");
		}
		

	}
	
	public static void tarea2() {
		
		List<Integer> lista1=new ArrayList<Integer>(10);
		List<Integer> lista2=new ArrayList<Integer>(10);
		for(int i=0;i<10;i++) {
			int num=(int)(10*Math.random()+1);
			lista1.add(num);
		}
		for(int i=0;i<10;i++) {
			int num=(int)(10*Math.random()+1);
			lista2.add(num);
		}
		/*for(int numero:lista1) {
			System.out.print(numero+" ");
		}
		System.out.print("---------\n");

		for(int numero:lista2) {
			System.out.print(numero+" ");
		}*/
		
		List<Integer> listaFusion=fusionarListas(lista1, lista2);
		for(int numero:listaFusion) {
			System.out.print(numero+" ");
		}
		
	}
	
	
	public static List<Integer> fusionarListas(List<Integer> lista1,List<Integer> lista2) {
		List<Integer> listaFusionada=new ArrayList<Integer>(lista1);
		listaFusionada.addAll(lista2);
		
		
		Collections.sort(listaFusionada,Collections.reverseOrder());
		
		
		
		return listaFusionada;
		
		
	}
	
}
