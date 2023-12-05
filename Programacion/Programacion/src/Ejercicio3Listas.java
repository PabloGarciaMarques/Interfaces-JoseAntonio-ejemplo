import java.time.LocalDate;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio3Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Cliente cliente1 = new Cliente("123456789A", "Cliente1", 30, 1000.0, LocalDate.of(2020, 1, 1));
	        Cliente cliente2 = new Cliente("234567890B", "Cliente2", 25, 1500.0, LocalDate.of(2019, 3, 15));
	        Cliente cliente3 = new Cliente("345678901C", "Cliente3", 35, 2000.0, LocalDate.of(2022, 5, 10));
	        Cliente cliente4 = new Cliente("456789012D", "Cliente4", 40, 1200.0, LocalDate.of(2018, 7, 20));
	        Cliente cliente5 = new Cliente("567890123E", "Cliente5", 28, 1800.0, LocalDate.of(2021, 11, 5));
	        
	        
	        Set<Cliente> setClientes= new TreeSet<>();
	        
	        setClientes.add(cliente1);
	        setClientes.add(cliente2);
	        setClientes.add(cliente3);
	        setClientes.add(cliente4);
	        setClientes.add(cliente5);
	        
	        Iterator<Cliente> iterator=setClientes.iterator();
	        Cliente ultimoCliente=null;
	        while(iterator.hasNext()) {
	        	ultimoCliente=iterator.next();
	        	
	        }
	        setClientes.remove(ultimoCliente);
	        iterator=setClientes.iterator();
	        while(iterator.hasNext()){
	        	Cliente cliente=iterator.next();
	        	System.out.println(cliente.toString());
	        }
	}

}
