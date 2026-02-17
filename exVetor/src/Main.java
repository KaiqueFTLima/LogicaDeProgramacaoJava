import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double [] a = new double[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextDouble();
		}
		
		for ( int i = 0; i < n; i++) {
			System.out.printf("%.2f%n", a[i]);
		}
		
		
		sc.close();

	}

}
