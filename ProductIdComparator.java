package com.ansari.ArrayList.Sorting.Comparator;

import java.util.Comparator;

public class ProductIdComparator implements Comparator<Product> {

	public int compare(Product product1, Product product2) {
		
		if(product1.id==product2.id) {
			return 0;
		}else if(product1.id<product2.id) {
			return 1;
		}else {
			return -1;
		}
	}

}
