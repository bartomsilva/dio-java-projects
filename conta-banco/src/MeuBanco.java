/**
 * <h1>MeuBanco</h1>
 * O MeuBanco é a classe principal deste projeto.
 * <p>
 *
 * @author Bart Silva
 * @version 1.0
 * @since 27/08/2023
 */
	public class MeuBanco {
	public static void main(String[] args) {
		// criei uma instância da classe ContaTerminal
		ContaTerminal contaTerminal = new ContaTerminal();
		// receber dados do cliente
		contaTerminal.receiveCustomerData();
		// imprmir dados do cliente
		contaTerminal.printCustomerData();
	}
}
