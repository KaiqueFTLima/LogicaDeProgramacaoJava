package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.println("Nome: ");
		employee.nome = sc.nextLine();
		System.out.println("Salario base: ");
		employee.salario = sc.nextDouble();
		System.out.println("Horas extras: ");
		employee.horasExtra = sc.nextDouble();
		System.out.println("Valor hora extra: ");
		employee.valorHoraExtra = sc.nextDouble();
		
		System.out.println(employee);
		
		sc.close();

	}

}
