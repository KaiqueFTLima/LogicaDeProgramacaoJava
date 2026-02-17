import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		double quantidade = sc.nextDouble();
	
		
		if (codigo == 1) {
			System.out.printf("Total: R$ %.2f%n", 4 * quantidade);
		}
		else if (codigo == 2) {
			System.out.printf("Total: R$ %.2f%n", 4.50 * quantidade);
		}
		else if (codigo == 3) {
			System.out.printf("Total: R$ %.2f%n", 5 * quantidade);
		}
		else if (codigo == 4) {
			System.out.printf("Total: R$ %.2f%n", 2 * quantidade);
		}
		else if (codigo == 5) {
			System.out.printf("Total: R$ %.2f%n", 1.50 * quantidade);
		}
		sc.close();

	}

}
