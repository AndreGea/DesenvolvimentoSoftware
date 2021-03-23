import java.util.Date;

public class Produto {
	
	public Produto() {
		this.estaAtivo = true;
		this.criadoEm = new Date();
		System.out.println("Esta rodando.....");
	}
	
	private String nome;
	private double price;
	private int quant;
	private boolean estaAtivo;
	private Date criadoEm;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	public double getPrice() {
		return this.price;
	}
	
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public int getQuant() {
		return this.quant;
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
		Produto produto = (Produto) obj;
		if (produto.getNome().equals(nome)) 
		{
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return ("Nome: " +nome+ " Preço: " +price+ "Quantidade: " +quant);
	}
}