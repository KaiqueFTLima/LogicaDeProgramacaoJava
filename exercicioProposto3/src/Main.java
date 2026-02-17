import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeA = sc.next();
		int idadeA = sc.nextInt();
		String nomeB = sc.next();
		int idadeB = sc.nextInt();
		
		double mediaIdade = (double)(idadeA + idadeB) / 2;
		
		System.out.println("A idade média de " + nomeA + " e " + nomeB + " é de " + mediaIdade + " anos");
		
		sc.close();

	}

}
