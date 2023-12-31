package exercicio001;

public class ContaBancaria {
    private String nomeCliente;
    private Integer numConta;
    private Double saldo;





    public ContaBancaria(String nomeCliente, Integer numConta, Double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void sacar(Double valor){

        if(valor > 0){
           if(this.saldo > valor){
               this.saldo -= valor;
           }
        }
        else{
            return;
        }

    }

    public void deposita(Double valor){
        if(valor > 0){
            this.saldo += valor;
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }
}
