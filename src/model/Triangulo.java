package model;

public abstract class Triangulo extends FormaGeometrica {
	
	protected double lado1;
	protected double lado2;
	protected double lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	@Override
	public double calcularPerimetro() {
		return lado1 + lado2 + lado3;
	}
	
	@Override
	public String toString() {
		return "Triângulo: " +
				"Lado 1 = " + this.lado1 +
				"Lado 2 = " + this.lado2 +
				"Lado 3 = " + this.lado3;
	}

}
