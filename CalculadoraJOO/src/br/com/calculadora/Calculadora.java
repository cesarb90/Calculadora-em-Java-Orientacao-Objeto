package br.com.calculadora;

public class Calculadora {

	// atributos
	float a;
	float b;
	float res;
//	float soma;
	
// construtores

	public Calculadora() {
	}

	// metodos

	//com retorno
	public float soma() {
		float soma = a + b;
		return soma;
	}
	public float sub() {
		float sub = a - b;
		return sub;
	}
	public float div() {
		float div = a / b;
		return div;
	}
	public float mult() {
		float mult = a * b;
		return mult;
	}
	// getandset
	
	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getRes() {
		return res;
	}

	public void setRes(float res) {
		this.res = res;
	}
}