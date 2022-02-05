package Entidades;

public class PessoaJuridica extends Pessoa {
	
	private Integer qtdeFuncionario;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer qtdeFuncionario) {
		super(nome, rendaAnual);
		this.qtdeFuncionario = qtdeFuncionario;
	}


	public Integer getQtdeFuncionario() {
		return qtdeFuncionario;
	}


	public void setQtdeFuncionario(Integer qtdeFuncionario) {
		this.qtdeFuncionario = qtdeFuncionario;
	}
	
	
	@Override
	double calcularImposto() {
		Double soma = 0.0;
		if(qtdeFuncionario > 10) {
			soma = getRendaAnual() * 0.14;
		}else {
			soma = getRendaAnual() * 0.16;
		}
		return soma;
	}
	
		
	
}
