package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Quantas notas você deseja inserir?");
		int nota = leia.nextInt();

		double[] notasAlunoA = new double[nota];

		System.out.println(Arrays.toString(notasAlunoA));

		for (int i = 0; i < notasAlunoA.length; i++) {
			System.out.println("Entre com a nota " + (i + 1) + ": ");
			notasAlunoA[i] = leia.nextDouble();
		}

		System.out.println(Arrays.toString(notasAlunoA));

		double somaAlunoA = 0;
		for (double notas : notasAlunoA) {
			somaAlunoA += notas;
		}

		System.out.println("A média é: " + somaAlunoA / notasAlunoA.length);
	}

}
