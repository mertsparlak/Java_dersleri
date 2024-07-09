package heli;

public class helikopter {
	private int kuyruknumarasi;
	private motor motor;
	private pervane pervane;
	private depo depo;
	
	public helikopter(int kuyruknumarasi,motor motor,pervane pervane,depo depo) {
		this.kuyruknumarasi=kuyruknumarasi;
		this.motor=motor;
		this.pervane=pervane;
		this.depo=depo;
	}
	public motor getMotor() {
		return motor;
	}
	
	public void setMotor(motor motor) {
		this.motor = motor;
	}
	
	public pervane getPervane() {
		return pervane;
	}
	
	public void setPervane(pervane pervane) {
		this.pervane = pervane;
	}
	
	
	public depo getDepo() {
		return depo;
	}
	
	public void setDepo(depo depo) {
		this.depo = depo;
	}
	
	
}
