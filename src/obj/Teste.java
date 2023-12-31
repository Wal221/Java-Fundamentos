package obj;

public class Teste {
    public static void main(String[] args) {
      Aluno aluno  = new Aluno();

      aluno.setCurso("Ciência da Computação");
      Double notas[] = {2.3,10.0,10.0};
      aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "uiedeiwuad";
        String s2 = "uiedeiwuaD";


        Aluno aluno2 =  new Aluno();
        aluno2.setCurso("Ciência da Computação");
        Double notas2[] = {2.3,10.0,10.0};
        aluno2.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));


    }
}
