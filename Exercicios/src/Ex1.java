import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		double B, A, H;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base do tri�ngulo");
		B = sc.nextDouble();
		System.out.println("Digite a altura do tri�ngulo");
		H = sc.nextDouble();
		A = (B * H) / 2;
		System.out.println("�rea do triangulo: "+A);
	}
}