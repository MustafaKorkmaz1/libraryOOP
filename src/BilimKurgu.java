
public class BilimKurgu extends Kitap {
	private boolean isUzaylı;
	private boolean isDogaUstuOlaylar;
	private boolean isDunyaninSonu;

	
	public BilimKurgu(String kitapAdi, String yazarAdi, String yayinYili, boolean isUzaylı, boolean isDogaUstuOlaylar,
			boolean isDunyaninSonu) {
		super(kitapAdi, yazarAdi, yayinYili);
		this.isUzaylı = isUzaylı;
		this.isDogaUstuOlaylar = isDogaUstuOlaylar;
		this.isDunyaninSonu = isDunyaninSonu;
	}


	public boolean getIsUzaylı() {
		return isUzaylı;
	}


	public void setIsUzaylı(boolean isUzaylı) {
		this.isUzaylı = isUzaylı;
	}


	public boolean getIsDogaUstuOlaylar() {
		return isDogaUstuOlaylar;
	}


	public void setIsDogaUstuOlaylar(boolean isDogaUstuOlaylar) {
		this.isDogaUstuOlaylar = isDogaUstuOlaylar;
	}


	public boolean getIsDunyaninSonu() {
		return isDunyaninSonu;
	}


	public void setIsDunyaninSonu(boolean isDunyaninSonu) {
		this.isDunyaninSonu = isDunyaninSonu;
	}
	
	

}
