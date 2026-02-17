package entities;

public class Employee {

	public String nome;
	public double salario;
	public double horasExtra;
	public double valorHoraExtra;

	public double calcularHorasExtras() {
		return horasExtra * valorHoraExtra;
	}

	public double calcularBonus() {
		if (salario > 3000) {
			return salario * 0.05;
		} else {
			return 0.0;
		}
	}

	public double salarioFinal() {
		return salario + calcularHorasExtras() - calcularBonus();
	}

	public String toString() {
		return "Funcionário: " + nome + "\nSalario Final: R$ " + String.format("%.2f", salarioFinal());
	}

}
