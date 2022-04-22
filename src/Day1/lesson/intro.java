package Day1.lesson;

public class intro {

	public static void main(String[] args) {
				
				//camelCase
				//Don't repeat yourself
				String internetSbeButonu ="İnterne şubeye gir";
				double dolarDun = 8.15;
				double dolarBugün = 8.18;
				//int vade = 36;
				//boolean dustumu = false;
				
				System.out.println(internetSbeButonu);
				
				if (dolarBugün<dolarDun) {
					System.out.println("Dolar düştü resmi");
				}
				else if (dolarBugün>dolarDun) {
					System.out.println("Dolar yükseldi resmi");
				}
				else {
					System.out.println("Dolar eşittir resmi");
				}
				
				String kredi1 ="Hızlı kredi";
				String kredi2 ="Mutlu emekli kredi";
				String kredi3 ="Konut kredi";
				String kredi4 ="Çiftçi kredi";
				String kredi5 ="Msb kredi";
				String kredi6 ="Meb kredi";
				String kredi7 ="Kültür bakanlığı kredi";
				
				System.out.println(kredi1);
				System.out.println(kredi2);
				System.out.println(kredi3);
				System.out.println(kredi4);
				System.out.println(kredi5);
				System.out.println(kredi6);
				System.out.println(kredi7);
				
				String[] krediler = {
						"Meb kredi",
						"Msb kredi",
						"Hızlı kredi",
						"Konut kredi",
						"Çiftçi kredi",
						"Mutlu emekli kredi",
						"Kültür bakanlığı kredi"
				};
				
				//foreach
				for(String kredi : krediler) {
					System.out.println(kredi);
				}
				
				for(int i =0; i<krediler.length;i=i+1) {
					System.out.println(krediler[i]);
				}
				
				int sayi1 = 10;
				int sayi2 = 20;
				sayi1 = sayi2;
				sayi2 = 100;
				System.out.println(sayi1);
				
				int[] sayilar1 = {1,2,3,4,5};
				int[] sayilar2 = {10,20,30,40,50};
				sayilar1=sayilar2;
				sayilar2[0]=100;
				System.out.println(sayilar1[0]);
				
				String sehir1 = "Ankara";
				String sehir2 = "İstanbul";
				sehir1=sehir2;
				sehir2 = "İzmir";
				System.out.println(sehir1);
	
	}
}
