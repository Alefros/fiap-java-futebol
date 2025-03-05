package src;

import java.util.Date;

class Clube {
	private String nome;
	private Date fundacao;
	private String mascote;
	private Tecnico tecnico;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setMascote(String mascote) {
		this.mascote = mascote;
	}

	public String getMascote() {
		return this.mascote;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Tecnico getTecnico() {
		return this.tecnico;
	}

	public Date getFundacao() {
		return fundacao;
	}

	Clube(String nome, String mascote, Date anoDeFundacao) {
		this.nome = nome;
		this.mascote = mascote;
		this.fundacao = anoDeFundacao;
	}
}