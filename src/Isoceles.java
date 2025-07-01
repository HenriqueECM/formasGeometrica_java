public class Isoceles extends Triangulo {
	
	public Isoceles(double base, double ladosIguais) {
		super(base, ladosIguais, ladosIguais);
	}
	
	@Override
	public double calcularArea() {
		double base = lado1;
		double lado = lado2;
		double altura = Math.sqrt(lado * lado - (base * base / 4));
		return (base * altura) / 2;
	}
}