import java.util.Comparator;

public class ComparatorNombre implements Comparator<Municipio>{

	@Override
	public int compare(Municipio m1, Municipio m2) {
		
		return m1.getNombre().compareTo(m2.getNombre());
	}

}
