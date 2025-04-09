package conta;

public class ContaBanco {
	public int numConta;
	protected String tipoCont;
	private int saldoConta;
	private boolean statusConta;

	public ContaBanco() { // MÉTODO CONSTRUTOR É ACIONADO SEMPRE QUE INSTANCIAR A CLASSE
		
		setSaldoConta(0);
	}

	private int getNumConta() {
		return numConta;

	}

	private void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	private String getTipoCont() {
		return tipoCont;
	}

	private void setTipoCont(String tipoCont) {

		this.tipoCont = tipoCont;
		if (tipoCont != "CC" && tipoCont != "CP") {
			throw new IllegalArgumentException(
					"O tipo de conta não pode ser diferente de conta corrente ou conta poupança");
		}
	}

	private int getSaldoConta() {
		return saldoConta;
	}

	private void setSaldoConta(int saldoConta) {
		this.saldoConta = saldoConta;

	}

	private boolean getStatusConta() {
		return statusConta;
	}

	private void setStatusConta(boolean statusConta) {
		this.statusConta = statusConta;
	}

	/////////////////////////////////////////////////////////////////

	public void abrirConta(String m) {
	    if (!getStatusConta()) {
	        setStatusConta(true);
	        setTipoCont(m);
	        if (getTipoCont().equals("CC")) {
	            setSaldoConta(50);
	        } else if (getTipoCont().equals("CP")) {
	            setSaldoConta(100);
	        }
	    }
	}

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

	public void depositar(int deposito) {
		if (getStatusConta()) {
			setSaldoConta(getSaldoConta() + deposito);
			System.out.println("Depósito realizado na conta");
		} else {
			throw new IllegalArgumentException("");
		}

	}

	public void sacar(int saque) {
		if (getStatusConta() == true && getSaldoConta() >= saque) {
			setSaldoConta(getSaldoConta() - saque);
			System.out.println("Você realizou um saque no valor de:" + saque);
		} else {
			System.out.println("Saldo insuficiente");
		}

	}

	public void pagarMensalidade() {
	int mensalidade = 0;
		if (getStatusConta()) {
			if (getTipoCont() == "CC" && getSaldoConta() > 80) {
				mensalidade = 80;
				setSaldoConta(getSaldoConta() - mensalidade);
				System.out.println("Mensalidade no valor de " + mensalidade + " paga");
			} else if (getTipoCont() == "CP" && getSaldoConta() > 12) {
				mensalidade = 12;
				setSaldoConta(getSaldoConta() - mensalidade);
				System.out.println("Mensalidade paga");
			} else {
				System.out.println("Saldo insuficiente para pagar a mensalidade");
			}

		} else {
			System.out.println("Impossível pagar mensalidade de uma conta fechada");
		}
	}

	public void infoAccount() {
		System.out.println("Status da conta:" + getStatusConta());
		System.out.println("Tipo de conta:" + getTipoCont());
		System.out.println("Saldo da conta:" + getSaldoConta());
	}
}
