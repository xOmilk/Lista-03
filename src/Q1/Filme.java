package Q1;

public class Filme extends Publicacao {

    private String diretor, atorPrincipal, sinopse, tempoDuracao;

    public Filme(String titulo,String autor,int anopublic,String genero,String editora,int qdisponivel,String diretor,String atorPrincipal, String sinopse, String tempoDuracao){
        super(titulo, autor , anopublic, genero, editora,qdisponivel);
        this.setDiretor(diretor);
        this.setAtorPrincipal(atorPrincipal);
        this.setSinopse(sinopse);
        this.setTempoDuracao(tempoDuracao);


    }

    //OVERRIDE
    public void  imprimirdados(){
        System.out.println("IMPRESSÃO DE DADOS DA PUBLICAÇÃO\n\n");
        System.out.println("O titulo da obra: "+this.getTitulo());
        System.out.println("O ano de publicacao da obra: "+ this.getAnopublic());
        System.out.println("O genero da obra é: "+this.getGenero());
        System.out.println("A editora da obra é:"+this.getEditora());
        System.out.println("A quantidade disponivel da obra é: "+this.getQdisponivel());
        System.out.println("O autor da obra é: "+this.getAutor());

        System.out.println("Diretor: "+this.getDiretor());
        System.out.println("Ator principal: "+this.getAtorPrincipal());
        System.out.println("Sinopse: "+this.getSinopse());
        System.out.println("Tempo de duração: "+this.getTempoDuracao());

    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAtorPrincipal() {
        return atorPrincipal;
    }

    public void setAtorPrincipal(String atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(String tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }
}
