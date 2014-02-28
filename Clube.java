class Clube
{
	private String nome;
	private int anoDeFundacao;
	private String mascote;
	private Tecnico tecnico;
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
		public String getNome()
		{
			return this.nome;
		}
		
	public void setMascote(String mascote)
	{
		this.mascote = mascote;
	}
		public String getMascote()
		{
			return this.mascote;
		}
		
	public void setTecnico(Tecnico tecnico)
	{
		this.tecnico = tecnico;
	}
		public Tecnico getTecnico()
		{
			return this.tecnico;
		}
	
	public void Clube(String nome, String mascote, int anoDeFundacao)
	{
		this.nome=nome;
		this.mascote = mascote;
		this.anoDeFundacao = anoDeFundacao;
	}
}