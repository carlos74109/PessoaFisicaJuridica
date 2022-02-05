package Entidades;

public abstract class Pessoa {
	
	private String nome;
	private Double rendaAnual;
		

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}


	public Pessoa() {
		super();
	}


	public Pessoa(String nome, Double rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	
	abstract double calcularImposto();
	
	public double calcular() {
		double soma =0.0; 
		soma += calcularImposto();
		return soma;
		
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome +", R$" + calcularImposto();
	}

}
