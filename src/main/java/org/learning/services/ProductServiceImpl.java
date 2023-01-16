package org.learning.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.learning.beans.Product;

public class ProductServiceImpl implements ProductService{

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
	 return Arrays.asList(
				new Product(1L,"Bicicleta", "Deportivo", 1000000.0),
				new Product(2L,"Noteboock", "Computacion", 3600000.0),
				new Product(3L,"Sofa cama", "Hogar", 800000.0),
				new Product(4L,"Taladro", "Herramients", 600000.0),
				new Product(5L,"Cafetera", "Cocina", 300000.0),
				new Product(6L,"Traje de baño", "Deportivo", 100000.0),
				new Product(7L,"Agenda", "Hogar", 40000.0)
				
				);
	}

	
	
}
