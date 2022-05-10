package sogutucu;


public class SogutucuBilgiSistemi implements ISogutucuBilgiSistemi {

    private IVeritabaniRepository veritabani;

    public SogutucuBilgiSistemi(IVeritabaniRepository veritabani) {
        this.veritabani=veritabani;
    }

    public MusteriHesabi kullaniciDogrula(int hesapNumarasi, int sifre) {

        return veritabani.kullaniciDogrula(hesapNumarasi, sifre);

    }

    public void hesapGuncelle(MusteriHesabi musteriHesabi) {

        veritabani.hesapGuncelle(musteriHesabi);

    }
}
