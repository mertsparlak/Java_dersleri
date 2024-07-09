package poly;

public class kopek extends hayvan {

	public kopek(String adi) {
		super(adi);
	}
	@Override
	public void sesCikar() {
		System.out.println(super.getAdi()+ " havliyor!");
	}

}
