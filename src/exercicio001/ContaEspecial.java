package exercicio001;

public class ContaEspecial extends ContaBancaria {
    private Double limite;

    public ContaEspecial(String nomeCliente, Integer numConta, Double saldo, Double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite =limite;
    }


    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(Double valor) {


        if(valor <= this.limite){
            if(this.getSaldo() > valor){
               this.setSaldo(this.getSaldo() - valor);
            }
        }
        else{
            System.out.println("Você so pode sacar " + this.limite + " reais");
        }
    }
}
