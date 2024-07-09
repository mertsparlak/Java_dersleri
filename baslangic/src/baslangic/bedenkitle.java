package baslangic;

import java.util.Scanner;

public class bedenkitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Kilonuzu giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int kilo=scanner.nextInt();
		System.out.print("boyunuzu giriniz:: ");
		double boy=scanner.nextDouble();
		System.out.println("boyunuz:"+boy);
		System.out.println("kilo:"+kilo);
		double kitlendeksi=kilo/(boy*boy);
		System.out.print("Kitle endeksiniz:"+kitlendeksi);
	}

}
