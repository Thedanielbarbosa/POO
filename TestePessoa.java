public class TestePessoa {
    public static void main(String[] args) {

        Pessoa p = new Pessoa(22, "Daniel", "Barbosa");
        Pessoa p2 = new Pessoa(24, "JJ");

        System.out.println("\nNome: " + p.nome + ", Sobrenome: " + p.Sobrenome + ", Idade: "+ p.idade);

        System.out.println("\nNome: " + p2.nome + "+ idade " + p2.idade);
    }
}
