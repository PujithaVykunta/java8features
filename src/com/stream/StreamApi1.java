package com.stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi1 {
	public static void main(String[] args) {	
		Product p1=new Product(1,"PS5",89000,5);
		Product p2=new Product(2,"Iphone 17 Pro Max",175000,1);
		Product p3=new Product(3,"Sony HeadSet",18000,3);
		Product p4=new Product(4,"Gold Bracelet",200000,1);
		Product p5=new Product(5,"Dyson Airwrap",42000,2);
		Product p6=new Product(6,"Sony HeadSet",15000,3);

		//Filtering Objects 
		
		List<Product> productList=Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		System.out.println("filtering the data ");
		///filtering the objects based on the price>20000
		productList.stream()
		.filter(product->product.getPrice()>20000)
		//product->product.getPrice()>20000 lambda expression
		.forEach(System.out::println);
       //.forEach(prod->System.out.println(prod));
		
		System.out.println("sorting the objects on the basis of name");
		///anonymous class 
	       Comparator<Product> cmp = new Comparator<>() {
	    	    public int compare(Product a, Product b) {
	    	        return a.getPname().compareTo(b.getPname());
	    	    }
	    	};
	    	
	    	//System.out.println(cmp.compare(p5, p6));
	    	
	    	System.out.println("with lambda expression");
	    	Stream<Product> sorted1=	productList.stream()
	    			//comparing method takes an  input of Functional Interface
	    			//and we are implementing Functional interface (product,product)
	    		.sorted(cmp);
	        //   System.out.println(sorted);
	           sorted1.forEach(m->System.out.println(m));
	  
	           System.out.println("using method reference by writing separetely ");
	         ///using method reference 
		    	Comparator<Product> cmp1 = Comparator.comparing(Product::getPname);
		    	// Sorting Objects 
				System.out.println("based on the name using method reference ");
				productList.stream()
				.sorted(cmp1)
				.forEach(System.out::println);
			
			///reverse order	based on the price
			System.out.println("based on the price using method reference");
			System.out.println("using method reference inside the sorted()");
			productList.stream()
			.sorted(Comparator.comparing(Product::getPrice))
			.forEach(System.out::println);
			
			System.out.println("------------->>>>");
			
			// order based on the name if they have same name then based on price
			System.out.println("===name and price sorting");
			productList.stream()
			.sorted(Comparator.comparing(Product::getPname)
					.thenComparing(Product::getPrice))
			.forEach(System.out::println);
	    	
			System.out.println("sorting of integer objects");
	    	List<Integer> list1=Arrays.asList(20,2,4,3,6,8,9);
//			.sorted()             // default sorting in ascending 
			 list1.stream()
	     .sorted(Comparator.reverseOrder())	
			.forEach(System.out::println);
		
	}
	
	
}