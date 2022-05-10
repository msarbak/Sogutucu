package sogutucu;

public abstract class Islem {

    protected final IEkran ekran;
    protected final ITusTakimi tusTakimi;
    protected final ISogutucuBilgiSistemi sogutucuBilgiSistemi;
    protected final MusteriHesabi musteriHesabi;

    protected Islem(IEkran ekran, ITusTakimi tusTakimi, ISogutucuBilgiSistemi sogutucuBilgiSistemi, MusteriHesabi musteriHesabi) {
        this.ekran = ekran;
        this.tusTakimi = tusTakimi;
        this.sogutucuBilgiSistemi = sogutucuBilgiSistemi;
        this.musteriHesabi = musteriHesabi;
    }

    public abstract void islemYap();
}
