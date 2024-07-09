package baslangic;

public class elektrikliOtomobil extends oop {
	private int sarjdurumu;
	private String akuTipi;
	public void elektrikliotomobil(int sarjDurumu,String akuTipi) {
	
		this.sarjdurumu=sarjDurumu;
		this.akuTipi=akuTipi;
	}
	public int getSarjDurum() {
		return sarjdurumu;
	}
	public void setSarjDurumu(int sarjMiktari) {
		 this.sarjdurumu=sarjMiktari;
	}
	public void sarjEt()
	{
		this.sarjdurumu=100;
	}
}
