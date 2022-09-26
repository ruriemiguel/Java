package com.generation.trabalhador.model;

public class Gerente extends Trabalhador
{
	private int setor;

	public Gerente(Long id, String nome, float salario, int setor)
	{
		super(id, nome, salario);
		this.setor = setor;
	}
	@Override
	public void aumentarSalario(float percentual)
	{
		float bonus = 20;
		
		salario *= 1+(percentual+bonus)/100;
		System.out.println("\nNovo Salário: "+salario);

	}
	
	public void visualizar ()
	{
		super.visualizar();
		System.out.println("\nSetor do trabalhador: "+this.getSetor());
	}
	
	public int getSetor() {
		return setor;
	}
	public void setSetor(int setor) {
		this.setor = setor;
	}
	
	

}
