package Castin;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno =  new Aluno();
        Pessoa pessoa = aluno;

        Pessoa pessoa1 =  new Pessoa();//upcasting

        Aluno aluno1 = (Aluno) pessoa1;//Downcasting. Vale ressaltar que erro de compilação não vai ocorrer
                                      //Mas em tempo de execução vai acontece um erro, dizendo que uma pessoa não pode ser convertida em aluno
    }
}
