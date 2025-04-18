package conta;

public class Banco {

	public static void main(String[] args) {
		ContaBanco conta01 = new ContaCorrente();
		conta01.abrirConta("CC");
		conta01.sacar(50);
		conta01.fecharConta();
		// conta01.depositar(31);
		// conta01.pagarMensalidade();
		conta01.infoAccount();

	}

}
