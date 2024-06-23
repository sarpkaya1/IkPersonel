package org.example;

public class TakımLideri extends IkDepatment{ // Bu sınıfta takım liderinin özelliklerini ana sınıftan çektim ve
                                              // kadın ve erkek için emeklilik hesaplaması işlemi oluşturdum.
    public TakımLideri(String ad, String soyad, int dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }
    String cinsiyet;
    int mevcutYil = 2024;
    int mevcutYas = mevcutYil - getDogumTarihi();

    public void emeklilikHesapla(String cinsiyet){
        if (cinsiyet == "Erkek"){
            int erkekIcinHesaplama = 65 - mevcutYas;
            System.out.println(getAd() + " Kişisinin emekliliğine  " + erkekIcinHesaplama + "  yıl vardır." );
        }else{

            if (cinsiyet=="Kadın"){
                int kadınIcinHesaplama = 60 - mevcutYas;
                System.out.println(getAd() + " Kişisinin emekliliğine " + kadınIcinHesaplama + " yıl vardır.");
            }

        }


    }



}


