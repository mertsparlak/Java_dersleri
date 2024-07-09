package baslangic;

public class oop {
	private String renk;
	private String cant;
	private String model="Audi"; // private kullanılıyor değiştirilmeyecek özelliği olarak.
	private int en= 2;
	private int boy= 3;
	// ya da direkt constructor ile kullanabiliriz sett kullanmadan yani şöyle
		public oop(String ct,String rk)
		{
			this.cant=ct;
			this.renk=rk;
		}
	public String getModel()
	{
		return this.model; // sınıf içindeki özelliği al demektir this
	}
	public void setRenk(String rnk)
	{
		 this.renk=rnk;
	}
	public void setCant(String cnt)
	{
		this.cant=cnt;
	}
	public String getRenk()
	{
		return this.renk; // sınıf içindeki özelliği al demektir this
	}
	public String getCant()
	{
		return this.cant; // sınıf içindeki özelliği al demektir this
	}
    
	// bu da default olacak constructors methodu eğer bir şey girilmezse 
	public oop()
	{
		//this.renk="Siyah";
		//this.cant="Normal";
		this("siyah","normal"); // hatta bu kullanım daha kolay ve yaygındır java direkt bulur.
	}

}
