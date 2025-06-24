package model;

public class Equilatero extends Triangulo{
	
	public Equilatero(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
	}

	@Override
	public double calcularArea() {
		return (Math.sqrt(3) / 4) * lado1 * lado1;
	}
}