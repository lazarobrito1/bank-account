package conta;

public class ContaCorrente extends ContaBanco {

	public ContaCorrente() { // MÉTODO CONSTRUTOR É ACIONADO SEMPRE QUE INSTANCIAR A CLASSE
		setTipoCont("CC");
		setSaldoConta(0);
	}

	@Override
	public void abrirConta(String m) {
		if (!getStatusConta()) {
			setStatusConta(true);
			setTipoCont(m);
		} if (getTipoCont().equals("CC")) {
			setSaldoConta(50);
		}
	}

	@Override
	public void fecharConta() {
		if (getSaldoConta() > 0) {
			System.out.println("Você possui saldo em conta, neste caso, não podemos realizar a operação!");
		} else if (getSaldoConta() < 0) {
			System.out.println("Você possui débitos em sua conta. Por favor regularize suas pendências!");
		} else {
			setStatusConta(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	@Override
	public void depositar(int deposito) {
		if (getStatusConta()) {
			setSaldoConta(getSaldoConta() + deposito);
			System.out.println("Depósito realizado na conta");
		} else {
			throw new IllegalArgumentException("");
		}

	}

	@Override
	public void sacar(int saque) {
		if (getStatusConta() == true && getSaldoConta() >= saque) {
			setSaldoConta(getSaldoConta() - saque);
			System.out.println("Você realizou um saque no valor de:" + saque);
		} else {
			System.out.println("Saldo insuficiente");
		}

	}

	@Override
	public void pagarMensalidade() {
		int mensalidade = 0;
		if (getStatusConta()) {
		} else if (getTipoCont() == "CC" && getSaldoConta() > 80) {
			mensalidade = 80;
			setSaldoConta(getSaldoConta() - mensalidade);
			System.out.println("Mensalidade no valor de " + mensalidade + " paga");
		} else {
			System.out.println("Saldo insuficiente para pagar a mensalidade");
		}

	}

	@Override
	public void infoAccount() {
		System.out.println("Status da conta:" + getStatusConta());
		System.out.println("Tipo de conta:" + getTipoCont());
		System.out.println("Saldo da conta:" + getSaldoConta());
	}
}
