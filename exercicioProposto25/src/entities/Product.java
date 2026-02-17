package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double calcularTotal() {
		return price * quantity;
	}

	public double calcularDesconto() {
		if (calcularTotal() > 100) {
			return 0.10 * calcularTotal();
		} else {
			return 0.0;
		}
	}

	public double totalFinal() {
		return calcularTotal() - calcularDesconto();
	}

	public String toString() {
		return "Produto: " + name + "\nTotal Final: R$ " + String.format("%.2f", totalFinal());
	}

}