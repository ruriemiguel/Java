package com.generation.trabalhador;

import com.generation.trabalhador.model.Gerente;
import com.generation.trabalhador.model.Vendedor;

public class TestaTrabalhador {

	public static void main(String[] args)
	{
		Gerente g1 = new Gerente(1L, "Mirelle", 20000.00f, 1);
		g1.visualizar();
		g1.aumentarSalario(10);
		
		Vendedor v1 = new Vendedor(2L, "Lucas", 8000.00f, 1);
		v1.visualizar();
		v1.aumentarSalario(5);
	}

}
