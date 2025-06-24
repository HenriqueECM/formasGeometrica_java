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
    	
    	String formas = "";
    	Class classe = (opcao == 1 ? Quadrado.class : 
    		(opcao == 2 ? Retangulo.class :
    			(opcao == 3 ? Circulo.class :
    				(opcao == 4 ? Triangulo.class : null))));
    	for (FormaGeometrica forma : this.formasGeometricas) {
    		if (classe == null) {
    			
    		}
    	}
    }

}