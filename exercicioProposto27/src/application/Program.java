package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o preço do dolar? ");
		double dollarPrice = sc.nextDouble();
		System.out.println("Qual a quantidade voce vai comprar? ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Quantidade em reais: %.2f%n", result);
		
		sc.close();

	}

}
