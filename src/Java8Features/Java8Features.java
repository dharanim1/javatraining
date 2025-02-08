package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//@FunctionalInterface
interface Maths{
	int operate(int a,int b);
	//Functional Interface--->Single abstract methods
	//int operate(double c);
}
public class Java8Features {

	public static void main(String[] args) {
	  
	   Maths add = (a,b)->a+b;
	   System.out.println(add.operate(20,450));
	   Maths sub =(a,b)->a-b;
	   System.out.println(sub.operate(10,40));
	   List<String> names =Arrays.asList("name1","name2","name3");
	   List<String> names2 = new ArrayList<>();
	   List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
	   List<Integer> evenNumbers = numbers.stream()
			                              .filter(n -> n%2==0)
			                              .collect(Collectors.toList());
	   List<Integer> incNumbers = numbers.stream()
               .map(n -> n+10)
               .collect(Collectors.toList());
	   int resultSum= numbers.stream()
			                 .map(n->n*2)
			                 .mapToInt(Integer::intValue)
			                 .sum();
	   int resultSum2= numbers.stream()
               .map(n->n++)
               .mapToInt(Integer::intValue)
               .sum();
			    
	   
	   names2.add("java");
	   names2.add("Training");
	   names.sort((s1,s2) -> s1.compareTo(s2));
	   System.out.println(names);
	   names.forEach(Product::testStatic);
	   System.out.println(evenNumbers);
	   System.out.println(incNumbers);
	   System.out.println(resultSum);
	   System.out.println(resultSum2);
	   names2.forEach(name -> System.out.println(name));
	}

}
// stream> chain operations on Collections
//process Collections


