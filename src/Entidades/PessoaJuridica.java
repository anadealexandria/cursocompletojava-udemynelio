package Entidades;

public class PessoaJuridica extends Pessoa {

	private int numeroDeFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, int numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public Double impostoPago() {
		double resultado = 0.0;
		if (numeroDeFuncionarios <= 10) {
			resultado =  getRendaAnual() * 0.16;
		} else {
			resultado = getRendaAnual() * 0.14;
		}
		return resultado;
	}
		
}
