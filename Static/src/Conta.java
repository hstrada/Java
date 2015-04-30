public class Conta {
	// atributo de classe
	// static transformar num atributo de classe
	static int contador;

	// atributo de instância
	int numero;

	// construtor
	Conta() {
		Conta.contador++;
		// definição que o número será o valor do contador
		this.numero = Conta.contador;
	}

	static void zeraContador() {

		System.out.println("Contador: " + Conta.contador);
		System.out.println("Zerando o contador de contas...");
		Conta.contador = 0;

	}

	void mostraDados() {
		System.out.println("Número: " + this.numero);
		// System.out.println("Saldo: " + this.saldo);
		// System.out.println("Limite: " this.limite);

	}

	// transformar num abrituo da classe
	// void geraRelatorio() {

	static void geraRelatorio() {
		System.out.println("Total de contas criadas: " + Conta.contador);
	}
}
