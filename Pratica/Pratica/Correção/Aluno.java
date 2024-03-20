package Correção;

public class Aluno {

    private String nome;
    private int idade;
    private String matricula;

    public Aluno(String nome, int idade, String matricula){

        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
    public void setNome( String nome ){
        this.nome = nome;
    }
    public void setIdade( int idade ){
        this.idade = idade;
    }
    public void setMatricula( String matricula ){
        this.matricula = matricula;
    }
    public String getnome(){
        return this.nome;
    }
    public int getidade(){
        return this.idade;
    }
    public String getMatricula(){
        return this.matricula;
    }

}
