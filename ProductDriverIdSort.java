package com.ansari.ArrayList.Sorting.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductDriverIdSort {

	public static void main(String[] args) {
		
		List<Product>  products = new ArrayList<Product>();
		
		products.add(new Product(12, "bottel"));
		products.add(new Product(1, "mobile"));
		products.add(new Product(9, "connector"));
		
		Collections.sort(products, new ProductIdComparator());
		
		for (Product product : products) {
			System.out.println(product.id);
		}
	}
}
