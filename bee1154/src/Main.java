import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double media = 0;
		int cont = 0;
		int idade = sc.nextInt();
		
		while(idade >= 0) {
			media = media + idade;
			cont++;
			idade = sc.nextInt();
		}
		
		double mediaFinal = media / cont;
		System.out.printf("%.2f%n", mediaFinal);
		
		sc.close();

	}

}
