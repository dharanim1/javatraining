package Java8Features;

import java.util.stream.Stream;

public class Product {
	String name;
	String Category;
	double Price;
	public Product(String name, String category, double price) {
		this.name = name;
		this.Category = category;
		this.Price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", Category=" + Category + ", Price=" + Price + "]";
	}
	
	public static void testStatic(String str) {
		System.out.println("static");
		
	}
	}
	

