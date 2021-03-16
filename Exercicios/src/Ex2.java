import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double Din, D, E, P; 
		System.out.println("Digite a quantia de dinheiro que quer converter (em reais)");
		Din = input.nextDouble();
		D = +Din / 3.78;
		E = +Din / 4.21;
		P = +Din / 0.08;
		System.out.println(+Din+" reais convertido para dolar fica: "+D);
		System.out.println(+Din+" reais convertido para euro fica: "+E);		
		System.out.println(+Din+" reais convertido para pesos fica: "+P);
	}
}