import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		int opcao;
		do {
			System.out.println("\n-- Projeto de Vendas --");
			System.out.println("\n1 - Cadastrar Cliente");
			System.out.println("2 - Listar Clientes");
			System.out.println("0 - Sair");
			System.out.println("\nDigite a op��o desejada: ");
			opcao = sc.nextInt();
			switch (opcao) {
				case 1: 
					System.out.println("\n -- Cadastrar Cliente --");
					
					System.out.println("\nDigite o nome do Cliente");
					cliente.setNome(sc.nextLine());
					System.out.println("\nDigite o CPF do Cliente");
					cliente.setCpf(sc.nextLine());
					
					System.out.println("Nome: " +cliente.getNome()+ " CPF: "+cliente.getCpf());
					break;
				case 2:
					System.out.println("\n -- Listar Cliente --");
					break;
				case 0:
					System.out.println("\nSaindo.......");
				default:
					System.out.println("\nOp��o Inv�lida");
			}
		} while (opcao != 0);
		sc.close();
	}
}