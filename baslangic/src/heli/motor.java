package heli;

public class motor {
	private int tork;
	private int beygirgucu;
	public void motorcalistir() {
		System.out.println("motor çalışıyor");
	}
	public void motorkapat() {
		System.out.println("motor durduruldu");
	}
	public int getTork() {
		return tork;
	}
	public void setTork(int tork) {
		this.tork = tork;
	}
	public int getBeygirgucu() {
		return beygirgucu;
	}
	public void setBeygirgucu(int beygirgucu) {
		this.beygirgucu = beygirgucu;
	}
	public motor(int tork,int beygirgucu) {
		super();
		this.beygirgucu=beygirgucu;
		this.tork=tork;
	}
	

}
