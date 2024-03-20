package Correção;

import Correção.Aluno;

public class TesteAluno {
    public static void main(String[] args) {


        Aluno A1 = new Aluno("Daniel", 22, " 12111364");


        System.out.printf("Nome:%s, Idade: %d anos, Matrícula:%s", A1.getnome(),A1.getidade(), A1.getMatricula());

        A1.setNome("João");
        A1.setIdade(34);
        A1.setMatricula(" 123456");

        System.out.printf("\nNome:%s, Idade: %d anos, Matrícula:%s", A1.getnome(), A1.getidade(), A1.getMatricula());

        A1.setNome("Irineu");
        A1.setIdade(25);
        A1.setMatricula(" 34576882");

        System.out.printf("\nNome:%s, Idade: %d anos, Matrícula:%s", A1.getnome(), A1.getidade(), A1.getMatricula());
    }
}