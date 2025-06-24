package model;

public class Escaleno extends Triangulo {
	
	public Escaleno(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
	}

	@Override
	public double calcularArea() {
		double semiPerimetro = calcularPerimetro() / 2;
		return Math.sqrt(semiPerimetro * 
				(semiPerimetro - lado1) * 
				(semiPerimetro - lado2) * 
				(semiPerimetro - lado3));
	}
}
