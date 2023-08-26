import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   
   private String nameCustomer;
   private int numberAccount;
   private int numberAgency;
   private double balanceAccount; 

  public void receiveCustomerData(){
    Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome:");
    nameCustomer = keyboard.next();

    System.out.println("Digite sua agência:");
    numberAgency = keyboard.nextInt();
        
    System.out.println("Digite o número de sua conta:");
    numberAccount = keyboard.nextInt();
     
    System.out.println("Digite o seu saldo:");
    balanceAccount = keyboard.nextDouble();
         
  }
  public void printCustomerData(){
    String message="";
    message = "Olá "+this.nameCustomer;
    message +=", obrigado por criar uma conta em nosso banco, ";
    message += "sua agência é "+this.numberAgency;
    message += ", conta "+this.numberAccount+" ";
    message += "e seu saldo "+this.balanceAccount+" ";
    message += "já está disponível para saque";

    System.out.println(message);

  }
}
