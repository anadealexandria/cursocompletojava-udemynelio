package Entidades;

public class EmpregadosTerceirizados extends Empregados1{
	
	private Double cobrancaAdcional;
	
	public EmpregadosTerceirizados() {
		super();
	}

	public EmpregadosTerceirizados(String name, Integer hours, Double valuePerHour, Double cobrancaAdcional) {
		super(name, hours, valuePerHour);
		this.cobrancaAdcional = cobrancaAdcional;
	}

	public Double getCobrancaAdcional() {
		return cobrancaAdcional;
	}

	public void setCobrancaAdcional(Double cobrancaAdcional) {
		this.cobrancaAdcional = cobrancaAdcional;
	}
	
	@Override
	public Double payment() {
		return super.payment()+ cobrancaAdcional * 1.1;
	}
	
}
