package heran;



public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;


    public Professor(){
     super();
    }

    public Professor(double salario, String nomeCurso) {
        super();
        this.salario = salario;
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido(){
       return  0.0;
    }

    public String obterEtiqueta(){

        String s = "Endereço do Professor: ";
        s += this.getEndereco();
        return s;
    }
}
