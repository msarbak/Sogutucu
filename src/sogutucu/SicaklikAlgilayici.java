package sogutucu;

public class SicaklikAlgilayici implements ISicaklikAlgilayici {

    private int  hesapNumarasi;


    public int sicaklikOku() {
    	
    	System.out.println("Sicaklik Algilama devrede...");
    	Araclar.bekle(2000);

        
        this.hesapNumarasi=2;
        return hesapNumarasi;
 
    }

}
