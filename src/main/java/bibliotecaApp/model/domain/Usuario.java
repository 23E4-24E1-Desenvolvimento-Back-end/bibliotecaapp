package bibliotecaApp.model.domain;

public class Usuario {

	private String nome;

	public Usuario() {
		this.setNome("Elberth Moraes");
	}
	
	public Usuario(String nome) {
		this.setNome(nome);
	}
	
	@Override
	public String toString() {
		return "A inclusão do usuário " + nome + " foi realizada com sucesso!";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
