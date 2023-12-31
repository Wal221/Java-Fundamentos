package abstrata;


public class teste {
    public static void main(String[] args) {
   // Pessoa pessoa = new Pessoa(); // Essa e uma classe abstrata nesse caso estamos definindo como essa classe deve ser
                                    // a gente não pode realmente instancia essa classe. Somente as classes filhas e que podem
                                   // ser instanciadas
      Pessoa aluno = new Aluno();
      Pessoa professor = new Professor();

      aluno.setEndereco("Rua 1, num 1");
      professor.setEndereco("Rua 2, num 2");

        System.out.println(aluno.obterEtiqueta());
        System.out.println(professor.obterEtiqueta());
    }


}
