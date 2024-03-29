package chapter4;

public class Product {
	private String name;
	private double price;
	private double tax;

	public Product() {

	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Product nhapthongtin(String name, double price, double tax) {
		Product pr = new Product(name, price, tax);
		return pr;
	}

	public void xuatthongtin(Product pr) {
		System.out.println(" name = " + pr.getName());
	}

	public double getTaxPrice(double price, double tax) {
		return price * tax;
	}

	public static void main(String[] args) {

	}
}
