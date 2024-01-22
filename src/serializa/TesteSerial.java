package serializa;

import java.io.*;

public class TesteSerial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       Aluno aluno = new Aluno(1L,"walmir","rosa@email.com");
        //gravaObjetos(aluno);
        lerObjetos();
    }


    /*E um processo que converte uma estrutura de dados ou um objeto em um formato que possa ser armazenado ou transferido
     - Independente: Um dado serializado em qualque plataforma, deve pode ser deserializado por qualquer outr
     -A serialização trabalha apenas com atribtos de uma classe não incluindo atributos estaticos


     */
    public static void gravaObjetos(Aluno aluno) throws IOException {
        ObjectOutputStream object =  new ObjectOutputStream(new FileOutputStream("src/serializa/novo"));
        object.writeObject(aluno);
        object.close();

    }

    public static void lerObjetos() throws IOException, ClassNotFoundException {
        ObjectInputStream ler = new ObjectInputStream( new FileInputStream("src/serializa/novo"));
        Aluno aluno = (Aluno) ler.readObject();
        System.out.println(aluno);
    }
}
