package exercicio001;

public class ContaPoupanca extends ContaBancaria{
    private Integer diaRendimento;



    public ContaPoupanca( String nomeCliente, Integer numConta, Double saldo , Integer diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public Integer getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(Integer diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void  calcularNovoSaldo(){
        Double rendimentDia = 0.0;
        for(int i =0; i<this.diaRendimento; i++){
             rendimentDia += this.getSaldo() * 0.00044445;

        }
        this.setSaldo(this.getSaldo() + rendimentDia);

    }
}
