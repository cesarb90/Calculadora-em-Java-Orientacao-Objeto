package br.com.calculadora;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculadora um = new Calculadora();
		Calculadora dois = new Calculadora();
		Calculadora res = new Calculadora();
		// float sol = res.getRes();
		float operacao;
		int i;
		int count = 0;

		System.out.println("Informe quantas vezes você quer realizar as operações: ");
		i = scan.nextInt();
		while (count < i) {
			System.out.println("Informe um valor: ");
			um.setA(scan.nextFloat());
			System.out.println("Informe outro valor: ");
			dois.setB(scan.nextFloat());
			System.out.println("qual operação você deseja utilizar:	" + "\n 1- Soma" + "\n 2- Subtração"
					+ "\n 3- Divisão" + "\n 4- Multiplicação");
			operacao = scan.nextFloat();

			if (operacao == 1) {
				res.setRes(um.getA() + dois.getB());
				// sol = um.getA() + dois.getB();
				System.out.println("A soma de " + um.getA() + " e " + dois.getB() + " é igual a: " + res.getRes());
//				System.out.printf("%nA soma de %f com %f e igual a %f", um.getA(), dois.getB(), res.getRes());
//			System.out.println("A soma de " + um.getA() + " e " + dois.getB() + " é igual a: " + sol);
//			System.out.printf("%nA soma de %f com %f e igual a %f", um.getA(), dois.getB(), sol);
				System.out.printf("%n%n");
			} else if (operacao == 2) {
				res.setRes(um.getA() - dois.getB());
				System.out.println("A subtração de " + um.getA() + " e " + dois.getB() + " é igual a: " + res.getRes());
//				System.out.printf("%nA subtração de %f e %f e igual a %f", um.getA(), dois.getB(), res.getRes());
				System.out.printf("%n%n");
			} else if (operacao == 3) {
				res.setRes(um.getA() / dois.getB());
				System.out.println("A divisão de " + um.getA() + " e " + dois.getB() + " é igual a: " + res.getRes());
//				System.out.printf("%nA divisão de %f e %f e igual a %f", um.getA(), dois.getB(), res.getRes());
				System.out.printf("%n%n");
			} else if (operacao == 4) {
				res.setRes(um.getA() * dois.getB());
				System.out.println(
						"A multiplicação de " + um.getA() + " e " + dois.getB() + " é igual a: " + res.getRes());
//				System.out.printf("%nA multiplicação de %f e %f e igual a %f", um.getA(), dois.getB(), res.getRes());
				System.out.printf("%n%n");
			} else {
				System.err.println("A Opção que você escolheu não é valida");
			}
			count++;
		}
		scan.close();
	}

}
