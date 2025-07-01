public class Equilatero extends Triangulo{
	
	public Equilatero(double lado1) {
		super(lado1, lado1, lado1);
	}

	@Override
	public double calcularArea() {
		return (Math.sqrt(3) / 4) * lado1 * lado1;
	}
}