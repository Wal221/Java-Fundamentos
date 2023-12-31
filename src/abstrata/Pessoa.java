package abstrata;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    private String telefoneCelular;
    protected String visibili; //Não importa em qual sub pasta as classes filhas estão
                               // elas sempre terão acesso a atributos protected


    public Pessoa(){
      super();
    }
    public Pessoa(String nome, String endereco, String telefone, String cpf) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    //Se eu quiser que todas as minhas classes filha tenham esse metodo obter
    //etiqueta eu posso simplesmente declara a assinatura do metodo com a palavra abtract na declaração
    // do metodo
    public abstract String obterEtiqueta();
}
