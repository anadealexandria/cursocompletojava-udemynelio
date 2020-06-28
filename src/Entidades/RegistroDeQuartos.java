package Entidades;

public class RegistroDeQuartos {
	private String name;
	private String email;
	private int numberRooms;
	
	public RegistroDeQuartos(String name, String email) {
		this.name=name;
		this.email=email;
	}
	
	public int getNumberRooms() {
		return numberRooms;
	}

	public void setNumberRooms(int numberRooms) {
		this.numberRooms = numberRooms;
	}

	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return name + " ,"+ email;
	}
}
