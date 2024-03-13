import java.util.Scanner;
import java.io.*;

public class EntradaDados {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite um nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite a idade: ");
        idade = entrada.nextInt();

        System.out.printf("Nome: %s\nIdade: %d", nome, idade);

    }
}
