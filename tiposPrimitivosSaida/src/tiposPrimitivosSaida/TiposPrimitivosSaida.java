package tiposPrimitivosSaida;

import java.util.Scanner;

public class TiposPrimitivosSaida {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);	
		
		System.out.println("Digite o nome do aluno: ");// TODO Auto-generated method stub
		String nome = teclado.nextLine();
		System.out.println("Digite a nota do aluno: ");
		Float nota = teclado.nextFloat();
		System.out.format("A nota de %s é %.1f ", nome,nota);
	}

}
