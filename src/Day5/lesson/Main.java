package Day5.lesson;

import Day5.lesson.business.abstracts.ProductService;
import Day5.lesson.business.concretes.ProductManager;
import Day5.lesson.core.JLoggerManagerAdapter;
import Day5.lesson.dataAccess.concretes.AbcProductDao;
import Day5.lesson.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// Bir projede entity'ler hariç nwe yapıyorsak ilerde problem yaşarız.
		
		//ToDo: Spring IoC ile çözülecek
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
	}

}
