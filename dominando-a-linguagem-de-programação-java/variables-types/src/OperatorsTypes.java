public class OperatorsTypes {
  public static void main(String[] args) {
    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20 / 4);

    String fullName = "Luciano" + " " + "Amâncio";

    System.out.println(fullName);

    // Unários
    System.out.println("======OPERADORES UNÁRIOS======");

    int numero = 5;

    // Imprimindo o numero negativo
    System.out.println(-numero);

    // incrementando numero em mais 1 numero, imprime 6
    numero++;
    System.out.println(numero);

    // incrementando numero em mais 1 numero, imprime 7
    System.out.println(numero++);// ops algo de errado não está certo

    System.out.println(numero);// agora sim, numero virou 7

    // ordem de precedencia conta aqui
    System.out.println(++numero);

    boolean verdadeiro = true;

    System.out.println("Inverteu " + !verdadeiro);

    numero =- numero; // converte o numero para negativo
    System.out.println(numero);

    numero = numero * -1; // converte o numero para positivo
    System.out.println(numero);

    // Ternário
    System.out.println("====== Operador ternário ======");

    String numeroOito = numero == 8 ? "É o numero 8" : "Não é O numero 8";

    System.out.println(numeroOito);

  }
}
