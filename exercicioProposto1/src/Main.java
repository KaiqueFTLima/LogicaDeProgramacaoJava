import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valorMetroQuadrado, preco, area;
		
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		valorMetroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		preco = valorMetroQuadrado * area;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();

	}

}
