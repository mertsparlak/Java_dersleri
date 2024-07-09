package baslangic;

public class Arraynamesilme {

	public static void main(String[] args) {
		String[] cars= {"Mercedes","Toyota","Auidi","Honda"};
		// diziden eleman silme
		//1. adım önce yeni bir dizi oluşturun. yeni dizinin length i eski dizininkinden -1 olmalı
		String[] cars2= new String[cars.length-1];
		int i =0;
		for (String marka:cars)
			if (marka!="Toyota") {
				cars2[i]=marka;
				i++;
			}
			cars=cars2;
			for (String marka:cars)
				System.out.println(marka);
			

	}

}
