package Day5.lesson.dataAccess.concretes;

import java.util.List;

import Day5.lesson.dataAccess.abstracts.ProductDao;
import Day5.lesson.entities.concretes.Product;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Hibernate ile eklendi " + product.getName());
		
	}

	@Override
	public void update(Product product) {
		
		
	}

	@Override
	public void delete(Product product) {
		
		
	}

	@Override
	public Product get(int id) {
		
		return null;
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}

}
