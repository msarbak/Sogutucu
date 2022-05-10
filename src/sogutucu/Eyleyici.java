package sogutucu;

public class Eyleyici implements IEyleyici {

    private int mevcutSicaklikMiktari=24;

    public void SogutucuAc(int sicaklik) {
        System.out.println("sogutucu aciliyor...");
        mevcutSicaklikMiktari-=sicaklik;
    }

    public void SogutucuKapat(int sicaklik) {
        System.out.println("sogutucu kapatiliyor...");
        mevcutSicaklikMiktari+=sicaklik;
    }


}
