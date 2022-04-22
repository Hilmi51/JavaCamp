package Day2.Work;

public class ComputerMain {

	public static void main(String[] args) {
		 	Computer computer1 = new Computer(3451,"Asus x409-fb",9000,"i5 8900k İşlemci, 8gb Ram");

	        Computer computer2 = new Computer(51,"Lonovo V14",6000,"i3 8300 İşlemci, 4gb Ram");

	        Computer computer3 = new Computer(34,"Msi",19000,"i9 10900k İşlemci, 32gb Ram");

	        Computer [] computers ={computer1,computer2,computer3};

	        for(Computer computer : computers){
	            System.out.println("İsmi : "+computer.brand+"Ücreti : "+computer.fee);
	        }

	        ComputerManager computerManager = new ComputerManager();

	        computerManager.addToCart(computer1);
	}

}
