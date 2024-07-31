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
		System.out.println("IMPRESSÃO DE DADOS DA PUBLICAÇÃO\n\n");
		System.out.println("O titulo da obra: "+this.getTitulo());
		System.out.println("O ano de publicacao da obra: "+ this.getAnopublic());
		System.out.println("O genero da obra é: "+this.getGenero());
		System.out.println("A editora da obra é:"+this.getEditora());
		System.out.println("A quantidade disponivel da obra é: "+this.getQdisponivel());
		System.out.println("O autor da obra é: "+this.getAutor());
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
