package latihan2;

public class BangunDatar {

	public static void main(String[] args) {
		
		// Lingkaran d = 10, keliling? 3.14 * d
		double pi = 3.14;
		int diameterLingkaran = 10;
		
		// Segitiga a = 6, t = 8, luas? a * t / 2
		int alas = 6;
		int tinggiSegitiga = 8;
		
		// Tabung d = 5, t = 10, volume? pi * r * r * t
		int diameterTabung = 5;
		int tinggiTabung = 10;
		double jariTabung = diameterTabung/2;
		
		System.out.print("Keliling lingkaran dengan diameter 10cm = ");
		System.out.println(pi * diameterLingkaran);
		System.out.print("Luas segitiga dengan alas 6cm dan tinggi 8cm = ");
		System.out.println(alas * tinggiSegitiga / 2);
		System.out.print("Volume tabung dengan diameter 5cm dan tinggi 10cm = ");
		System.out.println(pi * jariTabung * jariTabung * tinggiTabung);
		
	}

}
