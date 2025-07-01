public abstract class Triangulo extends FormaGeometrica implements Validacao {
	
	protected double lado1;
	protected double lado2;
	protected double lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	@Override
	public boolean validar() {
		return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
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

	public static Triangulo criarTriangulo(double lado1, double lado2, double lado3) {
		if (lado1 == lado2 && lado1 == lado3) {
			return new Equilatero(lado1);
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			double base;
			double ladosIguais;
			
			if (lado1 == lado2) {
				ladosIguais = lado1;
				base = lado3;
			} else if (lado2 == lado3) {
				ladosIguais = lado1;
				base = lado2;
			} else {
				ladosIguais = lado3;
				base = lado1;
			}
			return new Isoceles(base, ladosIguais);
		} else {
			return new Escaleno(lado1, lado2, lado3);
		}
	}

}