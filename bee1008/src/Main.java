import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double salarioHora = sc.nextDouble();
		
		double salario = horasTrabalhadas * salarioHora;
		
		System.out.println("NUMBER = " + id);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
