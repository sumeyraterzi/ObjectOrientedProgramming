package MaterialTransportApplication;

import java.sql.SQLOutput;

public class Transport {

    String productType;
    double weight;
    double distance;
    String typeTransport;

    Transport(String productType, double weight, double distance, String typeTransport){
        this.productType=productType;
        this.weight=weight;
        this.distance=distance;
        this.typeTransport=typeTransport;
    }

    public double hesaplaMaliyet() {
        double maliyet = 0.0;
        double korumaMaliyeti = 0.0;
        double izinBelgesiMaliyeti = 0.0;

        if (this.typeTransport.equalsIgnoreCase("uçak")) {
            maliyet = 2 * this.weight * this.distance;
        } else if (this.typeTransport.equalsIgnoreCase("gemi")) {
            maliyet = 0.5 * this.weight * this.distance;
        } else if (this.typeTransport.equalsIgnoreCase("tren")) {
            maliyet = 1 * this.weight * this.distance;
        } else if (this.typeTransport.equalsIgnoreCase("kara")) {
            maliyet = 0.8 * this.weight * this.distance;
        }

        if (this.productType.equalsIgnoreCase("kimyasal")) {
            korumaMaliyeti = 2 * this.weight;
            izinBelgesiMaliyeti = 5 * this.weight;
        } else if (this.productType.equalsIgnoreCase("biyoloji")) {
            korumaMaliyeti = 6 * this.weight;
            izinBelgesiMaliyeti = 10 * this.weight;
        } else if (this.productType.equalsIgnoreCase("radyoloji")) {
            korumaMaliyeti = 12 * this.weight;
            izinBelgesiMaliyeti = 15 * this.weight;
        } else if (this.productType.equalsIgnoreCase("nükleer")) {
            korumaMaliyeti = 25 * this.weight;
            izinBelgesiMaliyeti = 20 * this.weight;
        }
        System.out.println(" Belirttiğiniz "+ this.productType + " ürünü "+ this.typeTransport + " yolu ile "+ this.distance+ " km taşıdığımızda :" );
        System.out.println("Maliyet :"+ maliyet);
        System.out.println("Koruma Maliyeti : " + korumaMaliyeti);
        System.out.println("İzin Belgesi : "+ izinBelgesiMaliyeti);
        System.out.print( "TOPLAM MAALİYET : ");
        return maliyet + korumaMaliyeti + izinBelgesiMaliyeti;

    }



}
