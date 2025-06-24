public class Usuario {
	private final String nome;
	private final String senha;
	
	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public boolean validarSenha(String senha) {
		return this.senha.equals(senha);
	}
}