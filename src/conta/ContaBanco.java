package conta;

public abstract class ContaBanco {
	public int numConta;
	protected String tipoCont;
	private int saldoConta;
	private boolean statusConta;

	

	public int getNumConta() {
		return numConta;

	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipoCont() {
		return tipoCont;
	}

	public void setTipoCont(String tipoCont) {

		this.tipoCont = tipoCont;
		if (tipoCont != "CC" && tipoCont != "CP") {
			throw new IllegalArgumentException(
					"O tipo de conta não pode ser diferente de conta corrente ou conta poupança");
		}
	}

	public int getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(int saldoConta) {
		this.saldoConta = saldoConta;

	}

	public boolean getStatusConta() {
		return statusConta;
	}

	public void setStatusConta(boolean statusConta) {
		this.statusConta = statusConta;
	}

	/////////////////////////////////////////////////////////////////
	public void abrirConta(String m) {

	}

	public void fecharConta() {

	}

	public void depositar(int deposito) {

	}

	public void sacar(int saque) {

	}

	public void pagarMensalidade() {

	}

	public void infoAccount() {

	}
}
