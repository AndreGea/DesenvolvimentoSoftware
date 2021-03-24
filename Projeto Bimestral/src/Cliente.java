import java.util.Date;

//Modificador de Acessos - public, private e protected

public class Cliente{
	
	public Cliente () {
		this.estaAtivo = true;
		this.criadoEm = new Date();
		System.out.println("Esta rodando....");
	}
	//O atributo dentro de uma classe modelo, sempre deve ser privado
	
	private String nome; 
	private String cpf;
	private boolean estaAtivo;
	private Date criadoEm;
	
	//Getters and setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isEstaAtivo() {
		return estaAtivo;
	}

	public void setEstaAtivo(boolean estaAtivo) {
		this.estaAtivo = estaAtivo;
	}

	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public boolean equals(Object obj) {
		Cliente cliente = (Cliente) obj;
		if (cliente.getNome().equals(nome) && cliente.getCpf().equals(cpf)) 
		{
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return ("Nome: " +nome+ " // CPF: " +cpf);
	}
}