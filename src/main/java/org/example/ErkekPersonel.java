package org.example;

public class ErkekPersonel extends  IkDepatment{
    public ErkekPersonel(String ad, String soyad, int dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    int emekliOlmaYasi = 65;
    int mevcutYil = 2024;
    int mevcutYas = mevcutYil - getDogumTarihi();
    int emekliligeKalanYil = emekliOlmaYasi - mevcutYas;
    public void emeklilikHesapla(int mevcutYas){
        if (mevcutYas <emekliOlmaYasi){
            System.out.println(getAd()+ "Kişisinin emekli olmasına " + emekliligeKalanYil + " yıl vardır");
        }


    }


}
