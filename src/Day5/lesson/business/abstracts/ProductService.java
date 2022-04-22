package Day5.lesson.business.abstracts;

import java.util.List;

import Day5.lesson.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();
}
