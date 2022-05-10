package sogutucu;

public interface ISogutucuBilgiSistemi {
    public MusteriHesabi kullaniciDogrula(int hesapNumarasi, int sifre);
    public void hesapGuncelle(MusteriHesabi musteriHesabi);

}
