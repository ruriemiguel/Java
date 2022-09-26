package Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet(); // não aceita repetição
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add("x");
		
		System.out.println("Tamanho é: "+conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add("x");
		System.out.println("Tamanho é: "+conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove("x"));
		
		System.out.println("Tamanho é: "+conjunto.size());
		
		System.out.println(conjunto.contains("x"));
		
		System.out.println(conjunto.contains(1));
		
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // união dos dois conjuntos
		conjunto.retainAll(nums); // mantém apenas valores iguais entre os dois conjuntos
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}

}
