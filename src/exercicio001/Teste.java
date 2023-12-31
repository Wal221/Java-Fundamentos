package exercicio001;

public class Teste {
    public static void main(String[] args) {
    ContaPoupanca conta001 = new ContaPoupanca("Walmir",1212,1.000,3);
    ContaEspecial conta002 = new ContaEspecial("Hugo",1213,3.500,1.000);
    ContaBancaria conta003 = new ContaPoupanca("Zezinho", 2345,4.000,3);
    ContaPoupanca conta004 = (ContaPoupanca) new ContaBancaria("Henrique",33,45.56);


        System.out.println(conta001);
        System.out.println(conta002);

         conta002.sacar(1.500);
         conta001.calcularNovoSaldo();

        System.out.println(conta001);
        System.out.println(conta002);


    }
}
