package sogutucu;

public class MusteriHesabi
{
	private int hesapNumarasi;
	private Musteri musteri;

	public MusteriHesabi(int hesapNumarasi, double bakiye, String adi, String soyadi) {
		this.hesapNumarasi=hesapNumarasi;
		this.musteri=new Musteri(adi, soyadi);
	}

	public int getHesapNumarasi() {
		return hesapNumarasi;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}



	@Override
	public String toString() {
		return " " + musteri.getAd() + " "+musteri.getSoyad();
			
	}
}
