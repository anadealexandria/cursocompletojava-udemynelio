package Entidades;

public class ExercicioDesafio1 {
	private int conta;
	private String nome;
	private double saldo;
	private double taxa= 5.00;
	
	public ExercicioDesafio1(int conta, String nome, double saldo) {
		this.conta=conta;
		this.nome=nome;
		this.saldo=saldo;
	}
	
	public ExercicioDesafio1(int conta, String nome) {
		this.conta= conta;
		this.nome= nome;
	}
	
	public int getConta() {
		return conta;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getNome() {
		return nome;
	}
			
	public double getSaldo() {
		return saldo;
	}
	
	public double Deposito(double valor) {
		return saldo+=valor;
	}
	
	public double Saque(double valor) {
		return saldo-=valor + taxa;
	}
	
	public void mostrarConta() {
		System.out.println("Account data:\n" + "Account " + getConta() + ", Holder: " + getNome() + ", Balance: $ " + getSaldo());
	}
	
	public void contaAtualizada() {
		System.out.println("Updated account data:\n" + "Account " + getConta() + ", Holder: " + getNome() + ", Balance: $ " + getSaldo());
	}
}
