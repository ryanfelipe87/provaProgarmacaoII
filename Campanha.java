package entidades;

public class Campanha {
	
	private int idVakinha;
	private Usuario usuario;
	private double valorArrecadado;
	private double meta;
	//private double progresso;
	private int numApoiadores;
	private String descri��o;

	public Campanha() {
	};
	
	public Campanha(int idVakinha, Usuario usuario, double valorArrecadado, double meta, int numApoiadores, String descricao) {
		
		this.idVakinha = idVakinha;
		this.usuario = usuario;
		this.valorArrecadado = valorArrecadado;
		this.meta = meta;
		this.numApoiadores = numApoiadores;
		this.descri��o = descricao;
		
	}

	public int getIdVakinha() {
		return idVakinha;
	}

	public void setIdVakinha(int idVakinha) {
		this.idVakinha = idVakinha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public double getValorArrecadado() {
		return valorArrecadado;
	}

	public void setValorArrecadado(double valorArrecadado) {
		this.valorArrecadado = valorArrecadado;
	}

	public double getMeta() {
		return meta;
	}

	public void setMeta(double meta) {
		this.meta = meta;
	}

	public int getNumApoiadores() {
		return numApoiadores;
	}

	public void setNumApoiadores(int numApoiadores) {
		this.numApoiadores = numApoiadores;
	}

	public String getDescri��o() {
		return descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
	
	

}
