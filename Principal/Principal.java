package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.PessoFisica;
import Entidades.Pessoa;
import Entidades.PessoaJuridica;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Digite a quantidade: ");
		Scanner sc = new Scanner(System.in);
		int qtde = sc.nextInt();
		List<Pessoa> lista = new ArrayList<>();
		
		for(int i = 0; i <qtde; i++) {
			System.out.println("Fisico ou Juridico (f/j)? ");
			String escolha = sc.next();
			
			System.out.println("Nome: ");
			String nome = sc.next();
			
			System.out.println("Ganho anual: ");
			Double ganhoAnual = sc.nextDouble();
			
			if(escolha.equals("f")) {
				System.out.println("Gastou com saude: ");
				Double gasSaude = sc.nextDouble();
				lista.add(new PessoFisica(nome, ganhoAnual, gasSaude));
			}
			else if(escolha.equals("j")) {
				System.out.println("Quantidade de funcionario: ");
				Integer qtdeFunc = sc.nextInt();
				lista.add(new PessoaJuridica(nome, ganhoAnual, qtdeFunc));
			}
		}
		System.out.println("Taxas a pagar");
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
			System.out.println("---------------------");
		}
		
		double soma =0.0;
		for (Pessoa pessoa : lista) {
			soma += pessoa.calcular();
		}
		
		System.out.println("Taxa total: " + soma);
		
		
		
		
		sc.close();
	}

}
