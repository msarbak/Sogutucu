package sogutucu;

public class SogutucuKapat extends Islem {

    private final IEyleyici eyleyici;

    public SogutucuKapat(ISogutucuBilgiSistemi sogutucuBilgiSistemi, IEkran ekran, ITusTakimi tusTakimi, MusteriHesabi musteriHesabi, IEyleyici eyleyici) {
        super(ekran, tusTakimi, sogutucuBilgiSistemi, musteriHesabi);
        this.eyleyici = eyleyici;
    }

    public void islemYap() {
        ekran.mesajGoruntule("Sogutucuyu kapatma islemini sectiniz");
        Araclar.bekle(1000);
        ekran.mesajGoruntule("Lutfen Bekleyiniz...");
        Araclar.bekle(1000);
        ekran.mesajGoruntule("Islem Yapiliyor...");
		Araclar.bekle(1000);
		
        int min = 22;
        int max = 26;
          
        
        System.out.println("Yeni Ortam Sicakligi: ("+min+" - "+max+ ")");
        Araclar.bekle(1000);
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_int);

        
}
}

