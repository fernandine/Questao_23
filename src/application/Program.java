package application;

import java.util.ArrayList;
import java.util.List;

import entidade.Pessoa;

public class Program {

	public static void main(String[] args) {

		/*
		 * Pessoa pessoa = new Pessoa(); Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Digite seu nome: "); pessoa.nome = sc.nextLine();
		 * 
		 * System.out.println("Digite o dia do seu nascimento: "); pessoa.diaNasc =
		 * sc.nextInt(); System.out.println("Digite o mes do seu nascimento: ");
		 * pessoa.mesNasc = sc.nextInt();
		 * System.out.println("Digite o ano do seu nascimento: "); pessoa.anoNasc =
		 * sc.nextInt();
		 * 
		 * int idadeEmDias = pessoa.anoNasc * 365 + pessoa.mesNasc * 30 *
		 * pessoa.diaNasc;
		 * 
		 * System.out.println(pessoa); System.out.println(pessoa.nome +
		 * " viveu até hoje " + idadeEmDias + " dias.");
		 * 
		 * sc.close();
		 */
		
		Pessoa pessoa = new Pessoa();
		List<Pessoa> list = new ArrayList<>();

		list.add(pessoa);

		String[] datas = { 
				"Helena 28 03 1989", 
				"Romeu 21 04 1950", 
				"Raquel 14 01 2000", 
				"Enzo 25 12 2021" 
				};

		for (String dt : datas) {

			String[] campo = dt.split(" ");
			String nome = campo[0];
			int dia = Integer.parseInt(campo[1]);
			int mes = Integer.parseInt(campo[2]);
			int ano = Integer.parseInt(campo[3]);

			System.out.println(nome + " " + dia + "/" + mes + "/" + ano);

			list.add(new Pessoa(nome, dia, mes, ano));

			int idadeEmDias = ano * 365 + mes * 30 + dia;

			System.out.println(nome + " viveu até hoje " + idadeEmDias + " dias");

		}
	}
}
