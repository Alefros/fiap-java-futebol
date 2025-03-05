package src;

import java.util.Date;

class Tecnico extends Pessoa {
	private String nacionalidade;
	private Date nascimento;

	public String getNacionalidade() {
		return nacionalidade;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public Tecnico(String nome, String nacionalidade, Date nascimento) {
		super(nome);
		this.nacionalidade = nacionalidade;
		this.nascimento = nascimento;
	}
}