import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if (a + b > c && a + c > b && b + c > a ) {
			double perimetro = a + b + c;
			System.out.println("Perimetro = " + perimetro);
		}
		else {
			double area = ((a + b) * c) / 2;
			System.out.println("Area = " + area);
		}
		sc.close();

	}

}
