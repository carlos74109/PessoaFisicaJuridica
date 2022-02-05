package Entidades;

public class PessoFisica extends Pessoa {
	
	private Double gastoSaude;

	public PessoFisica() {
		super();
	}

	public PessoFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	
	
	

	@Override
	double calcularImposto() {
		double soma = 0.0;
		if(getRendaAnual() > 20000) {
			soma = (getRendaAnual() * 0.25) - (gastoSaude * 0.50);
		}else {
			soma = (getRendaAnual() * 0.15) - (gastoSaude * 0.50);
		}
		
		return soma;
		
	}
	
}
