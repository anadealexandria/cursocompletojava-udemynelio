package Entidades;

public class Empregados1 {
	private String name;
	private Integer hours;
	private Double valuePerHour;

	
	public Empregados1() {

	}

	public Empregados1(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Double payment() {
		return hours * valuePerHour;
	}

	public String toString() {
		return getName() + " - $ " + payment() + "\n";
	}
}
