package Day5.lesson.business.concretes;

import java.util.List;

import Day5.lesson.business.abstracts.ProductService;
import Day5.lesson.core.LoggerService;
import Day5.lesson.dataAccess.abstracts.ProductDao;
import Day5.lesson.entities.concretes.Product;


public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		//İş kodları yazılır
		if (product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor ");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi : "+ product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}
	
}
