import java.util.Date;

public class Vendedor {
	
	public Vendedor() {
		this.estaAtivo = true;
		this.criadoEm = new Date();
	}
	
	private String nome;
	private String cpf;
	private boolean estaAtivo;
	private Date criadoEm;
	
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
		Vendedor vendedor = (Vendedor) obj;
		if (vendedor.getNome().equals(nome) && vendedor.getCpf().equals(cpf)) 
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