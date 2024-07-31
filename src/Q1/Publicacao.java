package Q1;

public abstract class Publicacao {
	
	private String titulo;
	private String autor;
	private int anopublic;
	private String genero;
	private String editora;
	private int qdisponivel;

	public abstract void imprimirdados();
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
