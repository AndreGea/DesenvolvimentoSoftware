/*Desenvolver um algoritmo para ler o valor inteiro da idade de uma pessoa e imprimir uma das mensagens: 
 * se idade <= 13: Criança, se idade > 13 e <= 18: 
 * Adolescente, se idade > 18 e <= 60: Adulto e se idade > 60: Idoso.*/
import java.util.Scanner;
public class Ex4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long idade;
		System.out.println("Digite a sua idade");
		idade = input.nextLong();
		
		if (idade <= 13) {
			System.out.println("Você é considerada uma criança pois possui "+idade+" anos de idade");
		}
		else if (idade <= 18) {
			System.out.println("Você é considerado um adolescente pois possui "+idade+ " anos de idade");
		}
		else if (idade > 18 & idade <= 60) {
			System.out.println("Você é considerado um adulto pois possui "+idade+ " anos de idade");
		}
		else {
			System.out.println("Você é considerado um idoso pois possui "+idade+ " anos de idade");
		}
	}
}