package model;

public class Isoceles extends Triangulo {
	
	public Isoceles(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
	}
	
	@Override
	public double calcularArea() {
		double base = (lado1 == lado2) ? lado3 : (lado1 == lado3 ? lado2 : lado1);
		double lado = (lado1 == lado2) ? lado1 : (lado1 == lado3 ? lado1 : lado2);
		double altura = Math.sqrt(lado * lado - (base * base / 4));
		return (base * altura) / 2;
	}
}
 