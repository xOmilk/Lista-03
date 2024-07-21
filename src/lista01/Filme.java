package lista01;

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
        super.imprimirdados();

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
