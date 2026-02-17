import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int vet[] = new int [n];
		
		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();
		}
		
		double soma = 0;
		int cont = 0;
		
		for (int i = 0; i < n; i++) {
			if(vet[i] % 2 == 0) {
				soma = soma + vet[i];
				cont++;
			}
		}
		
		double media = soma / cont;
		System.out.println(media);
		
		sc.close();

	}

}
