public class TesteAluno {
    public static void main(String[] args) {
        Diciplina d1 = new Diciplina();
        d1.nome = "POO";
        d1.cargaHoraria = 60;

        Aula a1 = new Aula("Daniel",1234, 9,8,7,5,6,d1);


        System.out.println(a1.nome +  " = " + a1.situacaoAluno() + " ["+ a1.calcularMedia() + "] " + "\nDiciplina Favorita " + a1.diciplina_favorita.nome);
    }
}
