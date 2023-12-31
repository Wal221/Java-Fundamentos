package exercicio001;

public class ObjetosNaMemoria {
    public static void main(String[] args) {
        ContaPoupanca a = new ContaPoupanca("Walmir",1212,1.000,3);
        ContaPoupanca b = a;
        System.out.println("Minha conta A " + a);
        System.out.println("Minha conta B " + b);
        a = new ContaPoupanca("Valdir",33,3.400,5);

        System.out.println("Minha conta A " + a);
        System.out.println("Minha conta B " + b);

        int c = 1;
        int d = c;

        c = 7;

    }
}
