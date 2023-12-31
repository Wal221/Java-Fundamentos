package fina;


public class Teste {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Aluno aluno  = new Aluno();
        Professor professor  = new Professor();
         final String valorImutavel = "valorInicial";

        System.out.println(constantes.URL_BLOG );
        //constantes.URL_BLOG = "injcw"; isso não vai acontece pois e uma variavel final

    }
}
