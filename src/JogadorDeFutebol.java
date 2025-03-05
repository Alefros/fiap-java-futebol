package src;
class JogadorDeFutebol extends Pessoa {
	private String pernaBoa;
	private String posicaoDeOficio;

	public void setPosicaoDeOficio(String posicao) {
		this.posicaoDeOficio = posicao;
	}

	public String getPosicaoDeOficio() {
		return this.posicaoDeOficio;
	}

	public String getPernaBoa() {
		return pernaBoa;
	}

	JogadorDeFutebol(String nome, String pernaBoa, String posicaoDeOficio) {
		super(nome); 
		this.pernaBoa = pernaBoa;
		this.posicaoDeOficio = posicaoDeOficio;
	}
}