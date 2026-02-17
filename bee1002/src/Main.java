import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n = 3.14159;
		double raio = sc.nextDouble();
		
		double area = n * (raio * raio);
		
		System.out.printf("A=%.4f%n", area);
		
		
		sc.close();

	}

}
