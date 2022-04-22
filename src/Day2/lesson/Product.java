package Day2.lesson;

public class Product {
	public Product() {
		System.out.println("Ben çalıştım");
	}//constructor
	
	public Product(int id,String name,double unitPrice, String detail) {
		this();
		this.id=id;
		this.detail=detail;
		this.name=name;
		this.unitPrice=unitPrice;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
}
