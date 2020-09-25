package exercicio3;

public class ContaCorrente {
	//Declara��o de atributos
	private int numeroAgencia;
	private int numeroConta;
	private float saldoConta;
	private String operacao;
	private float valor;
	//fim dos atributos
	
	//m�todo construtor - tem sempre o mesmo nome da classe
	public ContaCorrente(int numeroAgencia, int numeroConta, float saldoConta, String operacao, Float valor) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
		this.operacao = operacao;
		this.valor = valor;
	}
	//fim do m�todo construtor
	
	
	//getters e setters
	public int getNumeroAgencia() {
		return numeroAgencia;
	}


	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public float getSaldoConta() {
		return saldoConta;
	}


	public void setSaldoConta(float saldoConta) {
		this.saldoConta = saldoConta;
	}


	public String getOperacao() {
		return operacao;
	}


	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}
	
	//fim dos getters e setters
	
	
	//outros m�todos
	public void depositar() {
		saldoConta = getSaldoConta() + getValor();
	}
	public void sacar() {
		saldoConta = getSaldoConta() - getValor();
	}
	public float MostarSaldoAtual() {
		return getSaldoConta();
	}
	
	
}
