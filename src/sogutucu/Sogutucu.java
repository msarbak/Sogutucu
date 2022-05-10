package sogutucu;


public class Sogutucu
{
	private final IEkran ekran;
	private final ITusTakimi tusTakimi;
	private final IEyleyici paraBolmesi;
	private final ISicaklikAlgilayici kartBolmesi;

	private static final int SICAKLIK_GORUNTULE = 1;
	private static final int SOGUTUCU_AC = 2;
	private static final int SOGUTUCU_KAPAT  = 3;
	private static final int CIKIS = 4;

	public Sogutucu() {
		ekran=new Ekran();
		tusTakimi=new TusTakimi();
		paraBolmesi=new Eyleyici();
		kartBolmesi=new SicaklikAlgilayici();
	}

	public void basla() {
		ekran.mesajGoruntule("Sogutucunun baglantilari yapildi mi? (0'a basin) ...");
		Araclar.bekle();
		int kontrol= tusTakimi.veriAl();
		if(kontrol == 0) {
			ekran.mesajGoruntule("Acilis Testi Yapiliyor...");
			Araclar.bekle(1000);
			kontrol++;
			if(kontrol == 1) {
				ekran.mesajGoruntule("Sogutucu Baslatiliyor...");
				Araclar.bekle(1000);
				int hesapNumarasi=this.kartDogrulama();
				if(hesapNumarasi!=0){
					ekran.mesajGoruntule("Sifre girin(1234)");
					Araclar.bekle(1000);
					int sifre= tusTakimi.veriAl();
			
					ISogutucuBilgiSistemi sogutucuBilgiSistemi=new SogutucuBilgiSistemi(new SanalVeritabaniSurucu());
					MusteriHesabi musteriHesabi = this.kullaniciDogrula(hesapNumarasi, sifre, sogutucuBilgiSistemi);
			
					if (musteriHesabi != null){
						ekran.mesajGoruntule("Kullanici dogrulandi, Hosgeldiniz...:"+ musteriHesabi);
						Araclar.bekle(1000);
						islemSecimi(sogutucuBilgiSistemi, musteriHesabi);
					} else{
						ekran.mesajGoruntule("Kullanici dogrulanmadi");
						
					}
				} else{
					ekran.mesajGoruntule("Kullanici dogrulanmadi");
	
				}
			}
			else {
				ekran.mesajGoruntule("Acilis Testi Basarisiz...");
			}
			
		}
		
		else {
			ekran.mesajGoruntule("Sogutucu servis disi...");
		}
		
		
	}

	private int kartDogrulama(){
		return kartBolmesi.sicaklikOku();
	}

	private MusteriHesabi kullaniciDogrula(int hesapNumarasi, int sifre, ISogutucuBilgiSistemi sogutucuBilgiSistemi){
		
		return sogutucuBilgiSistemi.kullaniciDogrula(hesapNumarasi,sifre);
	}
	private void islemSecimi(ISogutucuBilgiSistemi sogutucuBilgiSistemi, MusteriHesabi musteriHesabi){
		int secim;
		 do{
		 	secim=anaMenuyuGoster();
		 	ekran.ekranTemizle();
			switch (secim) {
				case SICAKLIK_GORUNTULE:
					Islem sicaklikGoruntuleme=new SicaklikGoruntuleme(ekran, tusTakimi, musteriHesabi);
					sicaklikGoruntuleme.islemYap();
					break;
				case SOGUTUCU_AC:
					Islem sogutucuAc=new SogutucuAc(sogutucuBilgiSistemi, ekran, tusTakimi, musteriHesabi, paraBolmesi);
					sogutucuAc.islemYap();
					break;

				case SOGUTUCU_KAPAT:
					Islem sogutucuKapat=new SogutucuKapat(sogutucuBilgiSistemi, ekran, tusTakimi, musteriHesabi, paraBolmesi);
					sogutucuKapat.islemYap();
					break;

				case CIKIS:
					ekran.mesajGoruntule("Sogutucu Sonlandiriliyor");
					
					break;
				default:
					ekran.mesajGoruntule("1-4 arasinda bir sayi girmelisiniz");
			}
		}while(secim!=4);
	}

	private int anaMenuyuGoster()
	{
		ekran.mesajGoruntule("****************************************************");
		ekran.mesajGoruntule("Ana Menu");
		ekran.mesajGoruntule("1-Sicaklik goruntule");
		ekran.mesajGoruntule("2-Sogutucuyu ac");
		ekran.mesajGoruntule("3-Sogutucuyu kapat");
		ekran.mesajGoruntule("4-Cikis");
		ekran.mesajGoruntule("Seciminiz:");
		ekran.mesajGoruntule("****************************************************");
		return tusTakimi.veriAl();
	}
}
