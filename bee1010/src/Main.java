import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigoA = sc.nextInt();
		int numeroPecaA = sc.nextInt();
		double valorPecaA = sc.nextDouble();
		int codigoB = sc.nextInt();
		int numeroPecaB = sc.nextInt();
		double valorPecaB = sc.nextDouble();
		
		double valorPago = (numeroPecaA * valorPecaA) + (numeroPecaB * valorPecaB);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);
		
		sc.close();

	}

}
