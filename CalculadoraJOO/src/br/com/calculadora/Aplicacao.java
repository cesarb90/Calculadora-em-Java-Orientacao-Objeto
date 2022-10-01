package br.com.calculadora;

import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		Calculadora um = new Calculadora();
		Scanner scan = new Scanner(System.in);
		int operacao = 0;
		String repet = "S";
		
		while (repet.equalsIgnoreCase("s")) {
			
		System.out.println("Informe um valor: ");
		um.setA(scan.nextFloat());
		System.out.println("Informe outro valor: ");
		um.setB(scan.nextFloat());
		System.out.println("Qual operação matemática você gostaria de realizar:" + "\n1- Soma" + "\n2- Subtração"
				+ "\n3- Divisão" + "\n4- Multiplicação");
		operacao = scan.nextInt();

		if (operacao == 1) {
//			System.out.printf("%nA soma de %f e %f e igual a %f", um.getA(), um.getB(), um.soma());
			System.out.println("A soma de " + um.getA() + " e " + um.getB() + " é igual a: " + um.soma()+"\n");
		} else if (operacao == 2) {
//			System.out.printf("%nA subtração de %f e %f e igual a %f", um.getA(), um.getB(), um.sub());
			System.out.println("A subtração de " + um.getA() + " e " + um.getB() + " é igual a: " + um.sub()+"\n");
		} else if (operacao == 3 & um.getB() == 0) {
			System.err.println("Não é possível dividir por 0");
		} else if (operacao == 3) {
//			System.out.printf("%nA divisão de %f por %f e igual a %f", um.getA(), um.getB(), um.div());
			System.out.println("A divisão de " + um.getA() + " e " + um.getB() + " é igual a: " + um.div()+"\n");
		} else if (operacao == 4) {
//			System.out.printf("%nA multiplicação de %f e %f e igual a %f", um.getA(), um.getB(), um.mult());
			System.out.println("A multiplicação de " + um.getA() + " e " + um.getB() + " é igual a: " + um.mult()+"\n");
		} else {
			System.err.println("Você digitou uma opção invalida\n");
		}
		System.out.println("Deseja fazer outra operação?"
				+ "\nS - Sim"
				+ "\nN - Nao");
		repet = scan.next();
		}
		scan.close();
	}
}
