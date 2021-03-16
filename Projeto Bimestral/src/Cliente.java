//Modificador de Acessos - public, private e protected

public class Cliente {
	
	//O atributo dentro de uma classe modelo, sempre deve ser privado
	
	private String nome; 
	private String cpf;
	
	//Getters and setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
}