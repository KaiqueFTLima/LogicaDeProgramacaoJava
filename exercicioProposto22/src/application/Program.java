package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and heigth: ");
		Rectangle rectangle = new Rectangle();
		
		rectangle.Width = sc.nextDouble();
		rectangle.Height = sc.nextDouble();
		
		System.out.println(rectangle);
		
		sc.close();

	}

}
