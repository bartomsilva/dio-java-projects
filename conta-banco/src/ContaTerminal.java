import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>ContaTerminal</h1>
 * A ContaTerminal possui dois métodos, receberDadosCliente responsável
 * por receber via teclado os dados do cliente e o imprimirDadosCliente que
 * faz a impressão da mensagem de boas vidas para o novo cliente.
 * 
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe
 * para desfrutar dos recursos oferecidos
 *
 * @author Bart Silva
 * @version 1.0
 * @since 27/08/2023
 */
public class ContaTerminal {

  static private String nomeCliente; // nome do cliente
  static private int numero; // múmero da conta
  static private String agencia; // número da agência
  static private double saldo; // saldo da conta

  public static void main(String[] args) {
    receberDadosCliente();
    imprimirDadosCliente();
  }

  /**
   * Este método é utilizado para rebeber através do teclado
   * os dados do cliente.
   */
  public static void receberDadosCliente() {
    // cria uma instância de Scanner para poder receber os dados.
    Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("----------------------------------");
    System.out.println("Por favor preencha os dados abaixo");
    System.out.println("e tecle ENTER para continuar");
    System.out.println("----------------------------------");

    System.out.println("Digite seu nome:");
    nomeCliente = keyboard.nextLine();

    System.out.println("Digite sua agência:");
    agencia = keyboard.next();

    System.out.println("Digite o número de sua conta:");
    numero = keyboard.nextInt();

    System.out.println("Digite o seu saldo:");
    saldo = keyboard.nextDouble();
    System.out.println("");

    // fecha o scanner
    keyboard.close();
  }

  /**
   * Este método realiza a impressão da menssagem
   * de boas vindas.
   */
  static public void imprimirDadosCliente() {
    final String MESSAGE = "Olá " + nomeCliente
        .concat(", obrigado por criar uma conta em nosso banco, ")
        .concat("sua agência é " + agencia)
        .concat(", conta " + numero + " ")
        .concat("e seu saldo " + saldo + " ")
        .concat("já está disponível para saque.");

    System.out.println(MESSAGE);
  }
}