package classe;

public class ProdutoTeste {

	public static void main(String[] args)
	{

		Produto p1 = new Produto("Notebook");
		p1.preco = 4356.89;
		
		var p2 = new Produto ();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1=p1.precoDesconto();
		double precoFinal2=p2.precoDesconto(0.1);
		double mediaCarrinho=(precoFinal1+precoFinal2)/2;
		
		System.out.printf("Média do carrinho: R$%.2f\n",mediaCarrinho);
		System.out.printf("Valor final do Notebook: R$%.2f\n",precoFinal1);
		System.out.printf("Valor final da: R$%.2f\n",precoFinal2);
	}

}
