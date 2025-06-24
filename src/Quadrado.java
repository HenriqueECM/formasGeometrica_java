public class Quadrado extends FormaGeometrica {
	
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularPerimetro() {
		return this.lado * 4;
	}
	
	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}
	
	@Override
	public String toString() {
		return "Quadrado: " +
				"Lados = " + this.lado;
	}
}
