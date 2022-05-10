package sogutucu;

public class SogutucuAc extends Islem{

    private final IEyleyici eyleyici;
    

    public SogutucuAc(ISogutucuBilgiSistemi sogutucuBilgiSistemi, IEkran ekran, ITusTakimi tusTakimi, MusteriHesabi musteriHesabi, IEyleyici eyleyici) {
        super(ekran, tusTakimi, sogutucuBilgiSistemi, musteriHesabi);
        this.eyleyici = eyleyici;
    }
    @Override
    public void islemYap() {
        ekran.mesajGoruntule("sogutucu acma islemini sectiniz");
        Araclar.bekle(1000);
        ekran.mesajGoruntule("Lutfen Bekleyiniz...");
        Araclar.bekle(1000);
       
		boolean servisdisi = false;
		if(!servisdisi) {
			 ekran.mesajGoruntule("Islem Yapiliyor...");
			Araclar.bekle(1000);
			
			 int min = 16;
		        int max = 18;
		          
		        System.out.println("Yeni Ortam Sicakligi: ("+min+" - "+max+ ")");
		       
		        Araclar.bekle(1000);
		        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		        System.out.println(random_int);
		}
		else {
			ekran.mesajGoruntule("Sogutucu Servis Disi...");
		}
		
    
    }

}
