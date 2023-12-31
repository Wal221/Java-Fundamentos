package obj;


import java.util.Arrays;
import java.util.Objects;

public class Aluno {

    private String curso;
    private Double [] notas;



    public Aluno(String nome, String endereco, String telefone, String cpf, String curso, Double[] notas) {
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
        return
                true;

    }


    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Aluno other = (Aluno) o;
        if (this == o) return true;
       if(curso.equalsIgnoreCase(other.getCurso()))
           return true;
       return false;
    }

}
