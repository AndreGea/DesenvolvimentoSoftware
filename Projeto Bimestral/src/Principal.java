import java.util.ArrayList;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Vendedor vendedor = new Vendedor();
		Produto produto = new Produto();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		int opcao;
		do {
			System.out.println("\n-- Projeto de Vendas --");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Listar Clientes");
			System.out.println("3 - Cadastrar Vendedor");
			System.out.println("4 - Listar Vendedor");
			System.out.println("5 - Cadastrar Produto");
			System.out.println("6 - Listar Produtos");
			System.out.println("7 - Registrar Venda");
			System.out.println("8 - Listar Venda");
			System.out.println("9 - Listar Venda por Cliente");
			System.out.println("0 - Sair");
			System.out.println("\nDigite a opção desejada: ");
			opcao = sc.nextInt();
			switch (opcao) {
				case 1: 
					System.out.println("\n -- Cadastrar Cliente --");
					System.out.println("\nDigite o nome do Cliente");
					cliente.setNome(sc.next());
					System.out.println("\nDigite o CPF do Cliente");
					cliente.setCpf(sc.next());
					clientes.add(cliente);
					System.out.println("Nome: " +cliente.getNome()+ " CPF: " +cliente.getCpf());
					break;
				case 2:
					System.out.println("\n -- Listar Clientes --");
					System.out.println(cliente.toString());
					break;
				case 3:
					System.out.println("\n -- Cadastrar Vendedor --");
					System.out.println("\nDigite o nome do Vendedor");
					vendedor.setNome(sc.next());
					System.out.println("\nDigite o nome do Vendedor");
					vendedor.setCpf(sc.next());
					vendedores.add(vendedor);
					break;
				case 4:
					System.out.println("\n -- Listar Vendedores --");
					break;
				case 5:
					System.out.println("\n -- Cadastrar Produto --");
					System.out.println("\nDigite o nome do Produto");
					produto.setNome(sc.next());
					System.out.println("\nDigite o preço do produto");
					produto.setPrice(sc.nextDouble());
					System.out.println("\nDigite a quantidade do produto");
					produto.setQuant(sc.nextInt());
					produtos.add(produto);
					break;
				case 6:
					System.out.println("\n -- Listar Produtos --");
					break;
				case 7:
					System.out.println("\n -- Registrar Venda --");
					break;
				case 8:
					System.out.println("\n -- Listar Venda --");
					break;
				case 9:
					System.out.println("\n -- Listar Venda por Cliente --");
					break;
				case 0:
					System.out.println("\nSaindo.......");
				default:
					System.out.println("\nOpção Inválida");
			}
		} while (opcao != 0);
		sc.close();
	}
}