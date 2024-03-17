
public class Tarih extends Kitap {
	private boolean isOsmanliDonemi;
	private boolean isCumhuriyetDonemi;

	public Tarih(String kitapAdi, String yazarAdi, String yayinYili, boolean isOsmanliDonemi,
			boolean isCumhuriyetDonemi) {
		super(kitapAdi, yazarAdi, yayinYili);
		this.isOsmanliDonemi = isOsmanliDonemi;
		this.isCumhuriyetDonemi = isCumhuriyetDonemi;
	}

	public boolean getIsOsmanliDonemi() {
		return isOsmanliDonemi;
	}

	public void setIsOsmanliDonemi(boolean isOsmanliDonemi) {
		this.isOsmanliDonemi = isOsmanliDonemi;
	}

	public boolean getIsCumhuriyetDonemi() {
		return isCumhuriyetDonemi;
	}

	public void setIsCumhuriyetDonemi(boolean isCumhuriyetDonemi) {
		this.isCumhuriyetDonemi = isCumhuriyetDonemi;
	}
	

}
