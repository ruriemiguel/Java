package classe;

public class Produto {
	
	String nome;
	double preco;
	final static double desconto = 0.25;
	
	Produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	Produto(){	
	}
	
	double precoDesconto ()
	{
		return preco*(1-desconto);
	}
	
	double precoDesconto (double descontoGerente)
	{
		return preco*(1-desconto+descontoGerente);
	}
}
