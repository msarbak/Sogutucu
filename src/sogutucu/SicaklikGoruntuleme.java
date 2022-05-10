package sogutucu;

public class SicaklikGoruntuleme extends Islem {

    public SicaklikGoruntuleme(IEkran ekran, ITusTakimi tusTakimi, MusteriHesabi musteriHesabi) {
        super(ekran, tusTakimi, null, musteriHesabi);
    }

    public void islemYap() {
        ekran.mesajGoruntule("Sicaklik Goruntuleme islemini sectiniz");
        Araclar.bekle(1000);
        ekran.mesajGoruntule("Sicaklik Algilaniyor");
        Araclar.bekle(1000);
     
        
        int min = 19;
        int max = 21;
          
        
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
       
        ekran.mesajGoruntule("sicaklik:" +random_int);
        Araclar.bekle(1000);
       

    }
}
