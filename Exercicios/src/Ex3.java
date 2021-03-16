import java.util.Scanner;
public class Ex3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double A, B;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um valor qualquer");
		A = input.nextDouble();
		System.out.println("Digite um outro valor qualquer");
		B = input.nextDouble();
			if (A > B) {
				System.out.println(+A+ " é maior que " +B);
			}
			else if(B > A) {
				System.out.println(+B+ " é maior que " +A);
			}
			else {
				System.out.println("Os números digitados são iguais.");
			}
	}
}