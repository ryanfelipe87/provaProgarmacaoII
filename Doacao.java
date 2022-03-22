package entidades;

public class Doacao {
	
	private Usuario usuario;
	private double valor;
	private Campanha campanha;
	private String tipoDoacao;
	
	public Doacao() {
	}
	
	public Doacao(Usuario usuario, double valor, Campanha campanha, String tipoDoacao) {
		this.usuario = usuario;
		this.valor = valor;
		this.campanha = campanha;
		this.tipoDoacao = tipoDoacao;
		
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Campanha getCampanha() {
		return campanha;
	}

	public void setCampanha(Campanha campanha) {
		this.campanha = campanha;
	}

	public String getTipoDoacao() {
		return tipoDoacao;
	}

	public void setTipoDoacao(String tipoDoacao) {
		this.tipoDoacao = tipoDoacao;
	}
	


}
