public class Testapessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Livro l = new Livro();


        p.nome = "Daniel";
        p.idade = 23;

        p.livroFavorito = l;

        l.Titulo = "Senhor dos Aneis";
        l.Autor  = "J.J. Tolkin";


        p.FazerAniversario();
        p.FazerAniversario();

        System.out.println("Nome: "+ p.nome + "\nIdade: " + p.idade + " anos." + "\nLivro Favorito: "+ p.livroFavorito.Titulo + ", autor: " + p.livroFavorito.Autor);

    }
}
