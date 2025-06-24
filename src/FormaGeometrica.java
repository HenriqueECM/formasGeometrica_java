public abstract class FormaGeometrica {
	
	public abstract double calcularPerimetro();
	public abstract double calcularArea();
	
	@Override
	public String toString() {
		return "Perímetro = " + this.calcularPerimetro() +
				"Área = " + this.calcularArea();
	}
	
	
	
	

}
