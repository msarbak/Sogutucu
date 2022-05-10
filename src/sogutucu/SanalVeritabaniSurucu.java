package sogutucu;



public class SanalVeritabaniSurucu implements IVeritabaniRepository {
    @Override
    public MusteriHesabi kullaniciDogrula(int hesapNumarasi, int sifre) {
        MusteriHesabi musteriHesabi =null;

        System.out.println("kullancici dogrulaniyor ...");
        Araclar.bekle(2000);
        System.out.println("veritabanina baglandi  ve kullaniciyi sorguluyor..");
        Araclar.bekle(2000);
        if(hesapNumarasi==2 && sifre==1234)
            musteriHesabi = new MusteriHesabi(hesapNumarasi, 1000, "Mehmet", "SARBAK");
        return musteriHesabi;
    }

    @Override
    public void hesapGuncelle(MusteriHesabi musteriHesabi) {
        System.out.println("veri tabani kaydi guncellendi...");
    }
}
