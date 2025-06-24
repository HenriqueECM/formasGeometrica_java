public class Retangulo extends FormaGeometrica {

	private double lado1;
	private double lado2;
	
	public Retangulo(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	@Override
	public double calcularPerimetro() {
		return (this.lado1 + this.lado2) * 2;
	}
	
	@Override 
	public double calcularArea() {
		return this.lado1 * this.lado2;
	}
	
	@Override
	public String toString() {
		return "Retângulo: " +
				"Lado 1 = " + this.lado1 +
				"Lado 2 = " + this.lado2;
	}
}
