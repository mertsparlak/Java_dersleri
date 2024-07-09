package baslangic;

public class main {

	public static void main(String[] args) {
		oop otomobil1= new oop("çelik","mavi");
		//otomobil1.setCant("Çelik");
		//otomobil1.setRenk("mavi");
		System.out.println(otomobil1.getRenk()+"  "+otomobil1.getCant()+ "  "+otomobil1.getModel());
		oop otomobil2=new oop("normal","kırmızı");
		//otomobil2.setCant("Normal");
		//otomobil2.setRenk("Kırmızı");
		System.out.println(otomobil2.getRenk()+"  "+otomobil2.getCant()+ "  "+otomobil2.getModel());
		// classımızdaki özellikler private olmalı ve değiştirilememeli bu yüzden bu methodu yani
		//Encapsulation methodunu kullanarak get ve set gibi fonksiyonlar oluşturup kullanıyoruz.
		
		
		// ya da constructor ile yani daha doğru biçimiyle daha eforsuz hali ile nesneleri şöyle oluşturabiliriz
		oop otomobil3=new oop();
		System.out.println(otomobil3.getRenk()+"  "+otomobil3.getCant()+ "  "+otomobil3.getModel());
		elektrikliOtomobil elektoto1=new elektrikliOtomobil();
		System.out.print(elektoto1.getRenk()); // supper class olarak oop kullandığı için 
		// elektrikliotomobil classında hiçbir şey olmasa da üst klasının özelliklerini taşır
		//bun da inheritance yani kalıtım denir.
	}


}
