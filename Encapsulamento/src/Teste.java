class Teste {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();

		f.setNome("Helena Strada");
		f.setSalario(2000);
		f.setDeposita(100);

		System.out.println(f.getNome());
		System.out.println(f.getSalario());
		System.out.println(f.getSaldo());
	}
}
