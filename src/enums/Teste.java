package enums;

public class Teste {
    public static void main(String[] args) {

    }

    private static void usandoConst(){
        int segunda = DiasemanConstantes.SEGUNDA;
        int terca = DiasemanConstantes.TERCA;
        int quarta = DiasemanConstantes.QUARTA;
        int quinta = DiasemanConstantes.QUINTA;
        int sexta = DiasemanConstantes.SEXTA;
        int sabado = DiasemanConstantes.SABADO;
        int Domingo = DiasemanConstantes.DOMINGO;
    }
    private static void imprimiDiasemana(int dia){
      switch (dia){
          case 1:
              System.out.println("Segunda feira");
              break;
          case 2:
              System.out.println("Terça feira");
              break;
          case 3:
              System.out.println("Quarta feira");
              break;
          case 4:
              System.out.println("Quinta-feira");
              break;
          case 5:
              System.out.println("Sexta-feira");
              break;
          case 6:
              System.out.println("Sabado");
              break;
          case 7:
              System.out.println("Domingo");
              break;

      }
    }
}
