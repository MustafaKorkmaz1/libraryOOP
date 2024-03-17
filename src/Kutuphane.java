

public class Kutuphane {

	public static void main(String[] args) {
		
		Roman kitap1 = new Roman("Başlangıç", "Dan Brown", "2017", true, false, false);
		Roman kitap2 = new Roman("Eylül", "Mehmet Rauf", "1901", false, true, false);
		Roman kitap3 = new Roman("Harry Potter", "J.K.Rowling", "2017", false, false, true);
		BilimKurgu kitap4 = new BilimKurgu("Dune", "Frank Herbert", "1965", true, false, false);
		BilimKurgu kitap5 = new BilimKurgu("Kozmos", "Carl Sagan", "2007", false, true, false);
		BilimKurgu kitap6 = new BilimKurgu("Her Şeyin Sonu", "Katie Mack", "2022", false, false, true);
		Tarih kitap7 = new Tarih("Cumhuriyetin 100 İsmi", "Emrah Sefa Gürkan", "2023", true, false);
		Tarih kitap8 = new Tarih("Osmanlı Tarihi", "Halil İnalcık", "2021", false, true);
		
		Kullanici k1= new Kullanici("Mustafa", "Korkmaz", "1001");
		Kullanici k2= new Kullanici("Ali", "Ak", "1002");
		Kullanici k3= new Kullanici("Veli", "Bak", "1003");
		
		BaseBook[] kitaplar = {kitap1, kitap2, kitap3, kitap4, kitap5, kitap6, kitap7, kitap8};
		kitaplar[0].kitapListele();
		
		kitap3.kitapEkle();
		kitap5.kitapSil();
		kitap1.kitapEkle();
		kitap2.kitapSil();
		kitap3.kitapOduncAlma();
		kitap3.kitapİade();
		kitap4.kitapEkle();
		kitap5.kitapSil();
		kitap6.kitapOduncAlma();
		kitap7.kitapListele();
		kitap8.kitapSil();
		k1.kitapOduncAlma();
		k2.kitapİade();
		k3.kitapOduncAlma();
		
		
		
		
		
		
		
	}
	

}
