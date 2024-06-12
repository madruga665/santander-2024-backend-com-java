import java.util.Scanner;

public class SistemaMedida {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu tamanha ex:(P,M,G)");
    String sigla = scanner.next();

    switch (sigla) {
      case "P": {
        System.out.println("PEQUENO");
        break;
      }
      case "M": {
        System.out.println("MÉDIO");
        break;
      }
      case "G": {
        System.out.println("GRANDE");
        break;
      }
      default:
        System.out.println("INDEFINIDO");
    }

    scanner.close();
  }
}
