package model;

public class Circulo extends FormaGeometrica {
	
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * this.raio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * this.raio * this.raio;
	}
	
	@Override
	public String toString() {
		return "Círculo: " + 
				"Raio = " + this.raio +
				"Diâmetro = " + this.raio * 2 +
				super.toString();
	}
}
