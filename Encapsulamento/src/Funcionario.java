public class Funcionario {

	private double salario;
	private String nome;
	private double saldo;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setDeposita(double valor) {
		this.saldo = valor;
	}

}
