package conta;

public class ContaBanco {
	public int numConta;
	protected String tipoCont;
	private float saldoConta;
	private boolean statusConta;

	public ContaBanco() { // MÉTODO CONSTRUTOR É ACIONADO SEMPRE QUE INSTANCIAR A CLASSE
		setStatusConta(false); 
		setSaldoConta(0);
	}

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
					"O tipo de conta não pode ser diferente de conta corrente ou conta poupança");// Mensagem de exceção
																									// que é exibida no
																									// console caso a
			// condição não seja
			// atendida.
		

	}}

	public float getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(float saldoConta) {
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
	setStatusConta(true);
	setTipoCont(m);
	if (tipoCont == "CC") {
		setSaldoConta(50.00f);
	} else if (tipoCont == "CP") {
		setSaldoConta(100.00f);
	}
	}
	
	

	public void fecharConta() {
		if (getSaldoConta() > 0) {
			System.out.println("Você possui saldo em conta, neste caso, não podemos realizar a operação!");
		} else if (getSaldoConta() < 0) {
			System.out.println("Você possui débitos em sua conta. Por favor regularize suas pendências!");
		} else {
			setStatusConta(false);
		}
	}

	public void depositar(float deposito) {
		if (getStatusConta()) {
			setSaldoConta(getSaldoConta() + deposito);
			System.out.println("Depósito realizado na conta");
		} else {
			throw new IllegalArgumentException(
					"");
		}

	} 
	public void sacar(float saque) {
		if (statusConta == true && saldoConta > saque) {
			setSaldoConta(getSaldoConta() - saque);
			System.out.println("Você realizou um saque no valor de:" + saque);
		} else {
			System.out.println("Saldo insuficiente");
		}
	
	}
	public void pagarMensalidade() {
		float mensalidade = 0;
		if (tipoCont == "CC"){
			mensalidade = 80.00f;
		} else if (tipoCont == "CP") {
			mensalidade = 12f;
			}
		if (saldoConta > 12) {
			saldoConta = saldoConta - mensalidade; }

	}
		}
