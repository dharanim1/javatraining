package Java8Features;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> Products =List.of(
				new Product("Laptop","Electronics",45000.00),
				new Product("Cooker","kitchenware",1000.00),
				new Product("honey", "grocery",100.0),
				new Product("Mobile","electronics",10000.00)
				 
				 );
		List<Product> filteredProducts =Products.stream()
				                                .filter(Product -> Product.getPrice() >5000.0 && Product.getPrice() <=50000)
	                                            .collect(Collectors.toList());
		List<Product> sortedProducts =Products.stream()
                                              .sorted(Comparator.comparingDouble(Product::getPrice))
                                              .collect(Collectors.toList());
		List<String> UpperCaseNames = Products.stream()
				                             .map(Product -> Product.getName().toUpperCase())
				                             .collect(Collectors.toList());
		double avgPrice = Products.stream()
				                  .mapToDouble(Product::getPrice)
				                  .average()
				                  .orElse(0);
			                  
		System.out.println(filteredProducts);
		System.out.println(UpperCaseNames);
		System.out.println(avgPrice);
		sortedProducts.forEach(Product->System.out.println(Product));
		
	}

}
