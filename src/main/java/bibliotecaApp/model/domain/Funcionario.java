package bibliotecaApp.model.domain;

public class Funcionario {

	private String nome;
	private String cargo;
	private float salario;
	
	public Funcionario() {
		this.setNome("Elberth Moraes");
	}
	
	public Funcionario(String nome) {
		this();
		this.setNome(nome);
	}
	

	@Override
	public String toString() {
		return "Funcionário " + nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}