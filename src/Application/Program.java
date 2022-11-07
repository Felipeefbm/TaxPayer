package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>(); // declaração da lista e o tipo

		System.out.print("Quantos contribuintes voce vai digitar? ");
		int n = sc.nextInt();

		System.out.println();
		for (int i = 1; i <= n; i++) {
			System.out.println("Digite os dados do " + i + "° contribuinte: ");
			System.out.print("Renda anual com salário: ");
			double salary = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double services = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capital = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			double health = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double education = sc.nextDouble();
			System.out.println();

			TaxPayer tax = new TaxPayer(salary, services, capital, health, education); // construtor
			list.add(tax); // adicionando construtor na lista
		}

		for (TaxPayer tax : list) {
			System.out.print("resumo do " + (list.indexOf(tax) + 1) + "° contribuinte"); // adiciona a posiçao da lista
			System.out.print(tax);
		}

		sc.close();
	}

}
