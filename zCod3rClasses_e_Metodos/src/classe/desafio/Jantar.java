package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Janta", 0.8);
		Comida c2 = new Comida("Sobremesa", 0.2);
		
		Pessoa p1 = new Pessoa("Ruriê", 120);
		
		p1.apresentar();
		
		p1.comer(c1);
		
		p1.apresentar();
		
		p1.comer(c2);
		
		p1.apresentar();
		
	}

}
