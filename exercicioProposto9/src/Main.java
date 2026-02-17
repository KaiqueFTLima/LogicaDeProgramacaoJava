import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double vet[] = new double[n];
		
		for(int i = 0; i < n; i++) {
			vet[i] = sc.nextDouble();
		}
		
		double media = 0;
		double soma = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print(vet[i] + " ");
			soma = soma + vet[i];
			media = soma / n;
		}
		System.out.println();
		System.out.printf("%.2f%n", soma);
		System.out.printf("%.2f%n", media);
		
		sc.close();

	}

}
