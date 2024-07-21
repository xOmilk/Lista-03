package lista01;

public class Publicacao {
	
	private String titulo;
	private String autor;
	private int anopublic;
	private String genero;
	private String editora;
	private int qdisponivel;

	public void imprimirdados() {
		System.out.println("IMPRESSÃO DE DADOS DA PUBLICAÇÃO\n\n");
		System.out.println("O titulo da obra: "+this.getTitulo());
		System.out.println("O ano de publicacao da obra: "+ this.getAnopublic());
		System.out.println("O genero da obra é: "+this.getGenero());
		System.out.println("A editora da obra é:"+this.getEditora());
		System.out.println("A quantidade disponivel da obra é: "+this.getQdisponivel());
		System.out.println("O autor da obra é: "+this.getAutor());

	
	}
	public Publicacao(String titulo,String autor,int anopublic,String genero,String editora,int qdisponivel){
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setAnopublic(anopublic);
		this.setGenero(genero);
		this.setEditora(editora);
		this.setQdisponivel(qdisponivel);
		
	}
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnopublic() {
		return anopublic;
	}

	public void setAnopublic(int anopublic) {
		this.anopublic = anopublic;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getQdisponivel() {
		return qdisponivel;
	}

	public void setQdisponivel(int qdisponivel) {
		this.qdisponivel = qdisponivel;
	}
	
}
