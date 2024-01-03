package Castin;

public class Teste2 {
    public static void main(String[] args) {
       Object obj1 = obterString();//não vai da erro de compilalação e tbm não vai da erro de execução
       String s1 = (String)obj1;//Nesse caso eu consigo fazer o DownCasting com sucesso

        Object obj2 ="Minha String";
        String s2 = (String) obj2;//consigo também realizar o downcasting pois o objeto esta referenciando uma string

        Object obj3 = new Object();//Porem esse obj não faz referencia a nenhuma String , logo em tempo de execução dara erro
        String s3 = (String) obj3;
    }
    public static String obterString(){
        return "minha String";
    }
}
