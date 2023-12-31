package heran;


public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa proferssor  = new Professor();

        pessoa.setEndereco("Rua 1, num 1 "); // o  Polimorfismo e o mesmo metodo com comportamentos diferente
        aluno.setEndereco("Rua 2, num 2");
        proferssor.setEndereco("Rua 3, num 3");


        System.out.println(pessoa.obterEtiqueta());
        System.out.println(aluno.obterEtiqueta());
        System.out.println(proferssor.obterEtiqueta());
    }
}
