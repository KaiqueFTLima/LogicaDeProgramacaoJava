import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double vet[] = new double [n];
		
		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextDouble();
		}
		
		double soma = 0;
		double media = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vet[i];
		}
		
		media = soma / n;
		System.out.println(media);
		
		for (int i = 0; i < n; i++) {
			if (vet[i] < media) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();

	}

}
