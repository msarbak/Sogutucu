package sogutucu;

public interface IVeritabaniRepository {
    public MusteriHesabi kullaniciDogrula(int hesapNumarasi, int sifre);
    public void hesapGuncelle(MusteriHesabi musteriHesabi);

}
