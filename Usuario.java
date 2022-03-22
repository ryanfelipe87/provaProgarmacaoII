package entidades;

public class Usuario extends Pessoa{
	
	private int idUsuario;
	private String cpf;
	private Conta conta;
	private String email;
	

	public Usuario() {
	};
	
	public Usuario(int idUsuario, String cpf, Conta conta, String email) {
		
		super ();
		
		this.idUsuario = idUsuario;
		this.cpf = cpf;
		this.conta = conta;
		this.email = email;
				
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	};
	


}
