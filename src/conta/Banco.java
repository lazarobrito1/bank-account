package conta;

public class Banco {

	public static void main(String[] args) {
		ContaBanco conta01 = new ContaBanco();
		conta01.abrirConta("CC");
		conta01.fecharConta();
		//conta01.depositar(31.80f);
		conta01.sacar(50);
		// conta01.pagarMensalidade();
		conta01.infoAccount();

	}

}
