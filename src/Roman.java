
public class Roman extends Kitap {
	
	private boolean isPolisiye;
	private boolean isPsikolojik;
	private boolean isFantastik;
	
	public Roman(String kitapAdi, String yazarAdi, String yayinYili, boolean isPolisiye, boolean isPsikolojik,
			boolean isFantastik) {
		super(kitapAdi, yazarAdi, yayinYili);
		this.isPolisiye = isPolisiye;
		this.isPsikolojik = isPsikolojik;
		this.isFantastik = isFantastik;
	}

	public boolean getIsPolisiye() {
		return isPolisiye;
	}

	public void setIsPolisiye(boolean isPolisiye) {
		this.isPolisiye = isPolisiye;
	}

	public boolean getIsPsikolojik() {
		return isPsikolojik;
	}

	public void setIsPsikolojik(boolean isPsikolojik) {
		this.isPsikolojik = isPsikolojik;
	}

	public boolean getIsFantastik() {
		return isFantastik;
	}

	public void setIsFantastik(boolean isFantastik) {
		this.isFantastik = isFantastik;
	}
		

}
