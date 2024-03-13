public class Aula {

    String nome; //para armazenar o nome do aluno.
    int matricula;  //para armazenar o número de matrícula do aluno.
    double nota_mat;  //para armazenar a nota de matemática.
    double nota_por;   //para armazenar a nota de português.
    double nota_fis;   //para armazenar a nota de física.
    double nota_geo;  //para armazenar a nota de geografia.
    double nota_quim; //para armazenar a nota de química.
    Diciplina diciplina_favorita;

    public Aula (String nome,int matricula, double nota_mat, double nota_por,double nota_fis,double nota_quim,double nota_geo, Diciplina diciplina_favorita) {

        this.nome = nome;
        this.matricula = matricula;
        this.nota_mat = nota_mat;
        this.nota_por = nota_por;
        this.nota_fis = nota_fis;
        this.nota_quim = nota_quim;
        this.nota_geo = nota_geo;
        this.diciplina_favorita = diciplina_favorita;

    }
    double calcularMedia(){
        return(this.nota_mat + this.nota_por + this.nota_fis + this.nota_quim + this.nota_geo)/2;


    }
    String situacaoAluno(){
        double media = calcularMedia();
        if(media >= 6){
            return "Aprovado!";

        }
        else{
            return "Reprovado!";
        }
    }
}
