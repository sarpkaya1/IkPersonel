package org.example;

public class KadınPersonel extends IkDepatment{
    public KadınPersonel(String ad, String soyad, int dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }
    int emekliOlmaYasi = 60;
    int mevcutYil = 2024;
    int mevcutYas = mevcutYil - getDogumTarihi();
    int emekliligeKalanYil = emekliOlmaYasi - mevcutYas;
    public void emeklilikHesapla(int mevcutYas){
        if (mevcutYas <emekliOlmaYasi){
            System.out.println(getAd()+ "Kişisinin emekli olmasına " + emekliligeKalanYil + " yıl vardır");
        }


    }

}
