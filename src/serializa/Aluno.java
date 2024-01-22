package serializa;

import java.io.Serializable;

public class Aluno implements Serializable {

    private Long id;
    private String name;
    private String email;

    private static String nomeEscola ="PoliValente";

    private static final long serialVersionUID = 1l;


    public Aluno(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String getNomeEscola() {
        return nomeEscola;
    }

    public static void setNomeEscola(String nomeEscola) {
        Aluno.nomeEscola = nomeEscola;
    }



    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                "nome Escola" + nomeEscola+
                '}';
    }


}
