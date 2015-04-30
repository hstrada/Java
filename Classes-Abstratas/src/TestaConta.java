class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * extends Conta - Conta é abstrata, portanto ela não pode ser
		 * instanciada com o new
		 * 
		 * Conta c = new Conta();
		 */

		Conta c = new ContaPoupanca();
		c.setSaldo(1000);

		c.imprimeExtratoDetalhado();

		// System.out.println(c.getSaldo());

	}

}
