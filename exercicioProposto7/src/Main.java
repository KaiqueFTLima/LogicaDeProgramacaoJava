import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int soma = 0;
		int quantidade = 0;
		
		while (idade >= 0) {
			soma = soma + idade;
			quantidade = quantidade + 1;
			idade = sc.nextInt();
		}
		
		if (quantidade > 0) {
			double media = (double) soma / quantidade;
			System.out.printf("%.2f%n", media);
		}
		else {
			System.out.println("impossivel calcular");
		}
		sc.close();

	}

}
