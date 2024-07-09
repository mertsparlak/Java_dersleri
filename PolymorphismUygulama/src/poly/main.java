package poly;

public class main {
	public static void hayvaniKonustur(hayvan hyvn) {
		hyvn.sesCikar();
		hyvn.sesCikar();
		
	}
	
	public static void hayvaniKonustur2(Object object) {
		if(object instanceof kedi) {
			kedi kedii=(kedi) object;
			kedii.sesCikar();
		}
		else if (object instanceof kopek) {
			kopek kopekk=(kedi) object;
			kedii.sesCikar();
		}
	}

	public static void main(String[] args) {
		hayvan hayvan1= new hayvan("tekir");
		//  System.out.println(hayvan1.getAdi());
		kedi kedi1=new kedi("felix");
		System.out.println(hayvan1.getAdi());
		System.out.println(kedi1.getAdi());
		hayvan1.sesCikar();
		kedi1.sesCikar();
		kopek kopek1= new kopek("rıfkı");
		kopek1.sesCikar();
		hayvaniKonustur(kopek1);
		hayvaniKonustur(kedi1);
	}

}
