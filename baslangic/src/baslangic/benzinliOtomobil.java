package baslangic;

public class benzinliOtomobil extends oop {
	private int benzindurumu;
	public void benzinotomobil(int yakitdurumu) {
		
		this.benzindurumu=yakitdurumu;
	}
	public int getyakit()
	{
		return this.benzindurumu;
	}
	public void setyakitkoy(int yakit) {
		this.benzindurumu=yakit;
	}
	public void depodoldur() {
		this.benzindurumu=100;
	}

}
