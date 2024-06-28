package org.example;

public class ErkekPersonel extends Personel{
    public ErkekPersonel(String ad, String soyad, int dogumTarihi, int emekliOlmaYasi) {
        super(ad, soyad, dogumTarihi, emekliOlmaYasi);
    }

    @Override
    void emeklilikHesapla(int dogumTarihi) {
        System.out.println(getAd()+"kişisinin emekliliğine " + (emekliOlmaYasi - mevcutYas) + " var.");
    }

    int emekliOlmaYasi = 65;
    int mevcutYil = 2024;
    int mevcutYas = mevcutYil - getDogumTarihi();
    int emekliligeKalanYil = emekliOlmaYasi - mevcutYas;

//
}
