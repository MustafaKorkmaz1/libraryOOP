
public class Kitap extends BaseBook {
	private String kitapAdi;
	private String yazarAdi;
	private String yayinYili;
	
	public Kitap(String kitapAdi, String yazarAdi, String yayinYili) {
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.yayinYili = yayinYili;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public String getYayinYili() {
		return yayinYili;
	}

	public void setYayinYili(String yayinYili) {
		this.yayinYili = yayinYili;
	}
	public void kitapEkle() {
		System.out.print(this.kitapAdi+" -> İsimli kitap sisteme eklendi -> ");
		System.out.println("Eklenen kitabın Yazarı: "+this.yazarAdi+" - Yayın yılı: "+this.yayinYili);
	}
	
	public void kitapSil() {
		System.out.println(this.kitapAdi+" İsimli kitap kaydı sistemden silindi");
	}

	
	public void kitapOduncAlma() {
		System.out.println(this.kitapAdi+" İsimli kitap ödünç verildi. Lütfen 14 gün içinde teslim ediniz!");
	}
	public void kitapİade() {
		System.out.println(this.kitapAdi+" İsimli kitap iade edildi. İyi günler.");
	}

	@Override
	public String toString() {
		return "Kitap [kitapAdi=" + kitapAdi + ", yazarAdi=" + yazarAdi + ", yayinYili=" + yayinYili + "]";
	}
	
	
	

}
