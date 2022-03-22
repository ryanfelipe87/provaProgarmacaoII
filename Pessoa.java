package entidades;

import enums.SexoEnum;

public abstract class Pessoa {

	
	private String nome;
	private SexoEnum sexo;
	private int idade;
	private int rg;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, SexoEnum sexo, int idade, int rg ) {
		this.idade = idade;
		this.nome = nome;
		this.rg = rg;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public SexoEnum getSexo() {
		return sexo;
	}

	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}
	

}
