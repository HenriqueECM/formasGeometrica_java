import java.util.ArrayList;

public class Gerenciamento {
	
	private final ArrayList<FormaGeometrica> formasGeometricas;
	private Usuario usuario;
	
	public Gerenciamento() {
		this.formasGeometricas = new ArrayList<>();
		 this.usuario = 
				new Usuario("João Guilherme", "Senh@123");
	}
	
	public void cadastrarForma(FormaGeometrica forma) {
		this.formasGeometricas.add(forma);
	}

	public Usuario login(String senha) {
		if (this.usuario.validarSenha(senha)) {
			return this.usuario;
		}
		
		return null;
	}

	public String buscarFormas(int opcao) {
		String formasTexto = "";
		
		ArrayList<FormaGeometrica> formasLista;
		
		switch (opcao) {
			case 1: formasLista = buscarQuadrados(); break;
			case 2: formasLista = buscarRetangulos(); break;
			case 3: formasLista = buscarCirculos(); break;
			case 4: formasLista = buscarTriangulos(); break;
			default: formasLista = this.formasGeometricas;
		}
		
		if (formasLista.isEmpty()) {
			formasTexto = "Nenhuma forma encontrada!";
		} else {
		
		for (FormaGeometrica forma : formasLista) {
			formasTexto += formasTexto.toString() + "\n";		
			}
		}
		return formasTexto;
	}

	private ArrayList<FormaGeometrica> buscarTriangulos() {
		ArrayList<FormaGeometrica> formasFiltradas = new ArrayList<>();
		for (FormaGeometrica forma : this.formasGeometricas) {
			if (forma instanceof Triangulo) {
				formasFiltradas.add(forma);
			}
		}
		return formasFiltradas;
	}

	private ArrayList<FormaGeometrica> buscarCirculos() {
		ArrayList<FormaGeometrica> formasFiltradas = new ArrayList<>();
		for (FormaGeometrica forma : this.formasGeometricas) {
			if (forma instanceof Circulo) {
				formasFiltradas.add(forma);
			}
		}
		return formasFiltradas;
	}

	private ArrayList<FormaGeometrica> buscarRetangulos() {
		ArrayList<FormaGeometrica> formasFiltradas = new ArrayList<>();
		for (FormaGeometrica forma : this.formasGeometricas) {
			if (forma instanceof Retangulo) {
				formasFiltradas.add(forma);
			}
		}
		return formasFiltradas;
	}

	private ArrayList<FormaGeometrica> buscarQuadrados() {
		ArrayList<FormaGeometrica> formasFiltradas = new ArrayList<>();
		for (FormaGeometrica forma : this.formasGeometricas) {
			if (forma instanceof Quadrado) {
				formasFiltradas.add(forma);
			}
		}
		return formasFiltradas;
	}
}