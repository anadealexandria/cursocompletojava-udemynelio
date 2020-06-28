package Entidades;

public class PessoaFisica extends Pessoa {

	private Double gastosEmSaude;

	public PessoaFisica() {

	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosEmSaude) {
		super(nome, rendaAnual);
		this.gastosEmSaude = gastosEmSaude;
	}

	public Double getGastosEmSaude() {
		return gastosEmSaude;
	}

	public void setGastosEmSaude(Double gastosEmSaude) {
		this.gastosEmSaude = gastosEmSaude;
	}

	@Override
	public Double impostoPago() {
		double resultado = 0.0;
		if (getRendaAnual() < 20000.00) {
			resultado = getRendaAnual()* 0.15 - (gastosEmSaude * 0.50);
		}
		if (getRendaAnual() >= 20000.00) {
			resultado = getRendaAnual() * 0.25 - (gastosEmSaude * 0.50);
		}
		return resultado;
	}
		
}
