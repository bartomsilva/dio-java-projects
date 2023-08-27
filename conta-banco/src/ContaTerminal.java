import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>ContaTerminal</h1>
 * A ContaTerminal possui dois métodos, receiveCustomerData responsável
 * por receber via teclado os dados do cliente e o printCustomerData que
 * faz a impressão da mensagem de boas vidas para o novo cliente.
 * vidas!
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe
 * para desfrutar dos recursos oferecidos
 *
 * @author Bart Silva
 * @version 1.0
 * @since 27/08/2023
 */
public class ContaTerminal {
  
  private String nameCustomer;    // nome do cliente
  private int numberAccount;      // múmero da conta
  private String numberAgency;    // número da agência
  private double balanceAccount;  // saldo da conta

  /**
   * Este método é utilizado para rebeber através do teclado
   * os dados do cliente.
   */
  public void receiveCustomerData() {
    //cria uma instância de Scanner para poder receber os dados.
    Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("----------------------------------");
    System.out.println("Por favor preencha os dados abaixo");
    System.out.println("e tecle ENTER para continuar");
    System.out.println("----------------------------------");
    
    System.out.println("Digite seu nome:");
    nameCustomer = keyboard.nextLine();

    System.out.println("Digite sua agência:");
    numberAgency = keyboard.next();

    System.out.println("Digite o número de sua conta:");
    numberAccount = keyboard.nextInt();

    System.out.println("Digite o seu saldo:");
    balanceAccount = keyboard.nextDouble();
    System.out.println("");
    
    // fecha o scanner
    keyboard.close();

  }

  /**
   * Este método realiza a impressão da menssagem
   * de boas vindas.
   */
  public void printCustomerData() {
    final String MESSAGE = "Olá " + this.nameCustomer
        .concat(", obrigado por criar uma conta em nosso banco, ")
        .concat("sua agência é " + this.numberAgency)
        .concat(", conta " + this.numberAccount + " ")
        .concat("e seu saldo " + this.balanceAccount + " ")
        .concat("já está disponível para saque.");

    System.out.println(MESSAGE);
  }
}