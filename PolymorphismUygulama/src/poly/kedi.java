package poly;

public class kedi extends hayvan {

	public kedi(String adi) {
		super(adi);
	}
	public void sesCikar() {
		System.out.println(super.getAdi() + " miyavliyor!");
	}

}
