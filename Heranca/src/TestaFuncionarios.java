public class TestaFuncionarios {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setNome("Helena Strada");
		g.setSalario(1000);
		g.setUsuario("helena.strada");
		g.setSenha("1234");

		Telefonista t = new Telefonista();
		t.setNome("Carol Mello");
		t.setSalario(500);
		t.setEstacaoDeTrabalho(12);

		Secretaria s = new Secretaria();
		s.setNome("Tati");
		s.setSalario(800);
		s.setRamal(16);

		// GERENTE
		System.out.println(" GERENTE");
		// System.out.println("Nome: " + g.getNome());
		// System.out.println("Salário: " + g.getSalario());
		// System.out.println("Usuário: " + g.getUsuario());
		// System.out.println("Senha: " + g.getSenha());
		// System.out.println("Bonificação: " + g.calculaBonificacao());
		g.mostraDados();

		// TELEFONISTA
		System.out.println("\n TELEFONISTA");
		// System.out.println("Nome: " + t.getNome());
		// System.out.println("Salário: " + t.getSalario());
		// System.out.println("Estação de trabalho: " +
		// t.getEstacaoDeTrabalho());
		// System.out.println("Bonificação: " + t.calculaBonificacao());
		t.mostraDados();

		// SECRETARIA
		System.out.println("\n SECRETARIA");
		// System.out.println("Nome: " + s.getNome());
		// System.out.println("Salário: " + s.getSalario());
		// System.out.println("Ramal: " + s.getRamal());
		// System.out.println("Bonificação: " + s.calculaBonificacao());
		s.mostraDados();

	}

}
