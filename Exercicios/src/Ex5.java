/*Criar um algoritmo que receba um valor positivo inteiro 
 * e imprima a sequ�ncia Fibonacci at� o valor lido. Por exemplo: caso o usu�rio insira o n�mero 15, 
 *o programa deve imprimir na tela os n�meros 0, 1, 1, 2, 3, 5, 8, 13. */
import java.util.Scanner;
public class Ex5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	        int num1 = 1, num2 = 0, num;
	        System.out.println("Digite o limite da sequ�ncia de fibonacci: ");
	        num = input.nextInt();
	        
	        System.out.println(num2);
	        System.out.println(num1);
	        
	        for(int i = 0; i < num; i++){
	            num1 = num1 + num2;
	            num2 = num1 - num2;
	           if (num1 <= num) {
	        	   System.out.println(num1);
	           }
	        }
	    }
}