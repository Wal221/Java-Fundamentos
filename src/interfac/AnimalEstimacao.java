package interfac;

public interface AnimalEstimacao {

    //Todos os atributos de uma interface são do tipo final
    /*
    E muito comum vermos interfaces com varias constantes dentro
    sendo essas constantes reponsaveis por exemplo conectar ao banco de dados e etc...
     */
    String URL_SITE ="http://walmir.cardoso.com";
    void brincar();
    void levarPassear();
}
