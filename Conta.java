package entidades;

public class Conta {
		
		
	int idUsuario;
	double saldo;
	int agencia;
	int numero_Conta;
		
	public Conta(int idUsuario, Double saldo, int numero, int agencia) {
		super();
		this.idUsuario = idUsuario;
		this.saldo = saldo;
		this.agencia = agencia;
		}
	

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero_Conta() {
		return numero_Conta;
	}

	public void setNumero_Conta(int numero_Conta) {
		this.numero_Conta = numero_Conta;
	}
	


}
