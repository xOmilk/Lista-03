package Q1;


public class Livro extends Publicacao{
	private int edicao;
	private int isbn;//codigo do livro
	
	
	public Livro(String titulo,String autor,int anopublic,String genero,String editora,int qdisponivel,int edicao, int isbn) {
		super(titulo, autor, anopublic, genero, editora, qdisponivel);
		this.setIsbn(isbn);
		this.setEdicao(edicao);

	}

	//OVERRIDE
	public void imprimirdados(){
		super.imprimirdados();
		System.out.println("Edição: "+this.getEdicao());
		System.out.println("ISBN:"+this.getIsbn());


	}
	
	
	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	
	
	
}
