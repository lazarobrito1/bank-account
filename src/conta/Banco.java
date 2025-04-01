package conta;

public class Banco {

	public static void main(String[] args) {
		ContaBanco conta01 = new ContaBanco();
		conta01.abrirConta("CC");
		//conta01.fecharConta();
		conta01.depositar(31.80f);
		//conta01.sacar(100);
		conta01.pagarMensalidade();
		
		System.out.println("Status da conta:" + conta01.getStatusConta());
		System.out.println("Tipo de conta:" + conta01.getTipoCont());
		System.out.println("Saldo da conta:" + conta01.getSaldoConta());
	}

}
