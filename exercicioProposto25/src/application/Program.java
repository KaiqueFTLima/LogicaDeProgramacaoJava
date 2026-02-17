package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Qual o nome do produto: ");
		product.name = sc.nextLine();
		System.out.println("Qual o preço unitario: ");
		product.price = sc.nextDouble();
		System.out.println("Quantos ira comprar: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		
		sc.close();

	}

}
