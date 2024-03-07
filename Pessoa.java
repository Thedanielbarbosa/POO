public class Pessoa {
    int idade;
    String nome;
    String Sobrenome;

    public Pessoa (int idade, String nome, String Sobrenome){

        this.idade = idade;
        this.nome = nome;
        this.Sobrenome = Sobrenome;
        System.out.printf("Primeiro Constructor ");
    }
    public Pessoa (int idade, String nome){

        this.idade = idade;
        this.nome = nome;
        System.out.printf("Segundo Constructor ");

    }
}
