package heran;



public class Aluno extends Pessoa {

    private String curso;
    private Double [] notas;

    public void verifica(){
        super.visibili ="jj";

    }

    public Aluno(String nome, String endereco, String telefone, String cpf, String curso, Double[] notas) {
        super(nome, endereco, telefone, cpf);
        this.curso = curso;
        this.notas = notas;
    }

    public Aluno(){

    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }

    public Double calcularMedia(){
        return  null;
    }

    public boolean verificarAprovado(){
        return true;

    }

    public String obterEtiqueta(){

       String s = "Endereço do aluno: ";
       s += this.getEndereco();
       return s;
    }



}
