package baslangic;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		x=7;
		// array tanımlama
		int[] array;
		array=new int [5];
		
		array[0]=30;
		array[1]=14;
		array[2]=25;
		array[3]=27;
		array[4]=18;
		for (int i=0;i<5;i++)
			System.out.println(array[i]);
		
        String[] cars= {"Mercedes","Toyota","Auidi","Honda"};
        for(String marka: cars) // for each kullanımı da böyle 
        	System.out.println(marka);
		
		
		
		
		
		
		
	}

}
