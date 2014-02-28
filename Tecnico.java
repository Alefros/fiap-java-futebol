class Tecnico extends Pessoa
{
	private String nacionalidade;
	private int anoNascimento;
	
	public Tecnico(String nome, String nacionalidade, int anoNascimento)
	{
		super(nome);
		this.nacionalidade = nacionalidade;
		this.anoNascimento = anoNascimento;
	}
}