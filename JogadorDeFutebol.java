class JogadorDeFutebol extends Pessoa 
{
	private String pernaBoa;
	private String posicaoDeOficio;

	
// ---------------- Getters and Setters -------------------------------------------	
	
	// ---> Posição de Ofício !!
	
	public void setPosicaoDeOficio(String posicao);
	{
		this.posicaoDeOficio = posicao;
	}
		public String getPosicaoDeOficio()
		{
			return this.posicaoDeOficio;
		}
	
	
	
// ---------------- Construtor da Classe ----------------------------------------	

	public void JogadorDeFutebol(String nome, String pernaBoa, String posicaoDeOficio)
	{
		super(nome); //Chamada do Construtor da Classe Pai !
		this.pernaBoa = pernaBoa;
		this.posicaoDeOficio = posicaoDeOficio;
	}
}