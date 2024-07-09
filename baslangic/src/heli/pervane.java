package heli;

public class pervane {
	private int uzunluk;
	private int rpm;
	public int getUzunluk() {
		return uzunluk;
	}
	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}
	public int getRpm() {
		return rpm;
	}
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	public pervane(int uzunluk,int rpm) {
		super();
		this.uzunluk=uzunluk;
		this.rpm=rpm;
		
	}
} 
