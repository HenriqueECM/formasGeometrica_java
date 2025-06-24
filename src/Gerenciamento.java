import java.util.ArrayList;

public class Gerenciamento {

    /* uma constante ali mas não está alterando o objeto e sim o cnteudo do objeto */
    private ArrayList<FormaGeometrica> formasGeometricas;
    private Usuario usuario;

    public Gerenciamento() {
        this.formasGeometricas = new ArrayList<>();
        this.usuario = new Usuario("Roberto", "Senh@123");
    }

    public void cadastrarForma(FormaGeometrica forma){
        this.formasGeometricas.add(forma);
    }

    public Usuario login(String senha){
        if (this.usuario.validarSenha(senha)) {
            return this.usuario;
        }
        return null;
    }
    
    public String buscarFormas (int opcao) {
    	
    	String formasTexto = "";
    	ArrayList<formaGeometrica> formasLista;
    	switch (opcao) {
    	case 1: formasLista = buscarQuadrado(); break;
    	default: formasLista = buscarTodos();
    	}
    	
    
    	for (FormaGeometrica forma : this.formasGeometricas) {
    	}
    }

}