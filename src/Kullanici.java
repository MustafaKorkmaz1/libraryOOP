
public class Kullanici extends BaseBook {
	private String isim;
	private String soyİsim;
	private String kullaniciID;

	public Kullanici(String isim, String soyİsim, String kullaniciID) {
		super();
		this.isim = isim;
		this.soyİsim = soyİsim;
		this.kullaniciID = kullaniciID;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyİsim() {
		return soyİsim;
	}

	public void setSoyİsim(String soyİsim) {
		this.soyİsim = soyİsim;
	}

	public String getKullaniciID() {
		return kullaniciID;
	}

	public void setKullaniciID(String kullaniciID) {
		this.kullaniciID = kullaniciID;
	}
	public void kitapOduncAlma() {
		System.out.println("ID: "+this.kullaniciID+" "+this.isim+" "+ this.soyİsim+" İsimli üyeye kitap ödünç verildi.");
	}
	public void kitapİade() {
		System.out.println("ID: "+this.kullaniciID+" "+this.isim+" "+ this.soyİsim+" İsimli üye kitabı teslim etmiştir.");
	}

	@Override
	public String toString() {
		return "Kullanici [isim=" + isim + ", soyİsim=" + soyİsim + ", kullaniciID=" + kullaniciID + "]";
	}
	

}
