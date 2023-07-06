package session2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Oractica {
	
	public static void main(String [] args) {
		//List
		List<String> lista = new ArrayList<>();
		
		//HashSet
		Set<String> setEjemplo = new HashSet<>();
		
		//TreeSet
		Set<String> treeSetEjemplo = new TreeSet<String>();
		
		//LinkedHashSet
		Set<String> linkedHashEjemplo = new LinkedHashSet<>();
		
		String [] nombres = { "Omar","Jose","Raul","Sonia","Jonathan",
				"Arturo","Juan","Francisco",null,"Sonia","Jose" } ;
		
		for(String a : nombres) {
			lista.add(a);
			setEjemplo.add(a);
			if(a!= null)
			treeSetEjemplo.add(a);
			linkedHashEjemplo.add(a);
		}
		
		System.out.println(lista);
		
		
		Map<String, String> hashMapEjemplo = new HashMap<>(); 
		Map<String, String> treeMapEjemplo = new TreeMap<>();
		Map<String, String> linkedHashMapEjemplo = new LinkedHashMap<>();
		
		for(String a : nombres) {
			hashMapEjemplo.put(a, a);
			if(a!= null)
			treeMapEjemplo.put(a, a);
			linkedHashMapEjemplo.put(a, a);
		}
		
		System.out.println(hashMapEjemplo);
		
		 Optional<String> opt = lista.stream()
		.filter( a ->   a !=null && a.equals("Sonia")         )
		.findAny();
  
		opt.get(); //regresa el valor
	}
}
