package lista01;

public class ProgramaBiblioteca {

    public static void main(String[] args) {

        Filme filme= new Filme("O auto da compadecida","Adriano Suassuna",2000,"Aventura,Comédia","Nova fronteira", 5,
                "Guel Arraes","Selton Melo","Aventuras de jõao grilo e chicó","1h35min");

        Livro livro= new Livro("Harry potter e a pedra filosofal","J.K. Rowling",1997,"Fantasia","Rocco",2,1234,567);

        Publicacao publi[]= new Publicacao[2];

        publi[0]= livro;
        publi[1]= filme;

        for(int i=0;i<2;i++){
            publi[i].imprimirdados();
            System.out.println("\n\n");

        }


    }
}
