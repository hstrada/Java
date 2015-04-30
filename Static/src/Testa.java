public class Testa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Contador: " + Conta.contador + "\n");

		Conta c1 = new Conta();
		System.out.println("Numero da primeira conta: " + c1.numero);
		System.out.println("Contador: " + Conta.contador + "\n");

		Conta c2 = new Conta();
		System.out.println("Numero da segunda conta: " + c2.numero);
		System.out.println("Contador: " + Conta.contador + "\n");

		Conta.geraRelatorio();

		System.out.println("");

		Conta.zeraContador();

	}

}
