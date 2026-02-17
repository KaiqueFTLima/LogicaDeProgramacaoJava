import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2;
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		double notaFinal = nota1 + nota2;
		
		System.out.printf("NOTA FINAL = %.1f%n" , notaFinal);
		
		if (notaFinal < 60) {
			System.out.println("REPROVADO");
		}
		
		sc.close();

	}

}
