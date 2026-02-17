import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;
		
		int valor = sc.nextInt();
		while(valor != 4) {
			valor = sc.nextInt();
			
			if (valor == 1) {
				alcool++;
			}
			else if (valor == 2) {
				gasolina++;
			}
			else if (valor == 3) {
				diesel++;
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);	
		sc.close();

	}

}
