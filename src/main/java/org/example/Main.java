package org.example;

import java.util.SortedMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       // 1. Takım için personel sıralaması
        System.out.println("-------------BİRİNCİ TAKIM---------------");

        TakımLideri birinciTakımınLideri = new TakımLideri("Seçilay ","Temiz",1983);
        KadınPersonel nergisKurt = new KadınPersonel("Nergis ","Kurt",1991);
        KadınPersonel aycaAy = new KadınPersonel("Ayça ","Ay",1998);
        ErkekPersonel denizAydın = new ErkekPersonel("Deniz ","Aydın",1989);
        ErkekPersonel calisanI = new ErkekPersonel("Ahmet ","Tezel",1981);
        System.out.println(birinciTakımınLideri.getAd()+birinciTakımınLideri.getSoyad() + " (Takım Lideri)");
        System.out.println(nergisKurt.getAd()+nergisKurt.getSoyad());
        System.out.println(aycaAy.getAd()+aycaAy.getSoyad());
        System.out.println(denizAydın.getAd()+denizAydın.getSoyad());
        System.out.println(calisanI.getAd()+calisanI.getSoyad());

        // Birinci Takım Görevleri
        System.out.println("-------------Birinci takımın görevleri:------------------");
        AtananIsListesi ilkIs = new AtananIsListesi(" Müşteri taleplerini düzenleme");
        System.out.println("1- "+ ilkIs.getGorev());
        AtananIsListesi ikinciIs = new AtananIsListesi(" Test senaryoları oluşturma");
        System.out.println("2- "+ikinciIs.getGorev());

        // 2. Takım için personel sıralaması
        System.out.println("--------------İKİNCİ TAKIM---------------");
        TakımLideri ikinciTakımınLideri = new TakımLideri("Mehmet ","Bal",1978);
        KadınPersonel sevalSahin = new KadınPersonel("Seval ","Şahin",1992);
        KadınPersonel selinCamci = new KadınPersonel("Selin ","Çamcı",1996);
        ErkekPersonel emreAydin = new ErkekPersonel("Emre ","Aydın",1985);
        ErkekPersonel sarpKaya = new ErkekPersonel("Sarp ","Kaya",1998);
        System.out.println(ikinciTakımınLideri.getAd()+ikinciTakımınLideri.getSoyad() + " (Takım Lideri)");
        System.out.println(sevalSahin.getAd()+sevalSahin.getSoyad());
        System.out.println(selinCamci.getAd()+selinCamci.getSoyad());
        System.out.println(emreAydin.getAd()+emreAydin.getSoyad());
        System.out.println(sarpKaya.getAd()+sarpKaya.getSoyad());

        // İkinci takım görevleri
        System.out.println("---------İkinci takım görevleri:-----------------");
        AtananIsListesi gorevI = new AtananIsListesi("Seneryoları otomatize etme");
        System.out.println("1- " + gorevI.getGorev());
        AtananIsListesi gorevII = new AtananIsListesi("Seneryo koşumu ve raporlama");
        System.out.println("2- " + gorevII.getGorev());

        // Personelin emeklilik durumunu sorgulama
        System.out.println("----------Personelin emeklilik durumu:-------------");
        birinciTakımınLideri.emeklilikHesapla("Kadın");
        nergisKurt.emeklilikHesapla(nergisKurt.mevcutYas);
        aycaAy.emeklilikHesapla(aycaAy.mevcutYas);
        denizAydın.emeklilikHesapla(denizAydın.mevcutYas);
        calisanI.emeklilikHesapla(calisanI.mevcutYas);
        ikinciTakımınLideri.emeklilikHesapla("Erkek");
        sevalSahin.emeklilikHesapla(sevalSahin.mevcutYas);
        selinCamci.emeklilikHesapla(sevalSahin.mevcutYas);
        emreAydin.emeklilikHesapla(emreAydin.mevcutYas);
        sarpKaya.emeklilikHesapla(sarpKaya.mevcutYas);

        // İşlerin tamamlanması
        System.out.println("-----------İşlerin tamamlanma durumu----------");
        ilkIs.gorevTamamla(true);
        ikinciIs.gorevTamamla(true);
        gorevI.gorevTamamla(true);
        gorevII.gorevTamamla(false);

        System.out.println("------------PERSONEL EKLEME/DEĞİŞTİRME---------------");
        // Birinci takıma bir personel daha eklenecek ve bir personel değiştirilecek
        // ikinci takımın takım lideri değiştirilecektir.
        KadınPersonel IsikVanli = new KadınPersonel("Işık","Vanlı",1992);
        calisanI.setAd("Muharrem ");
        calisanI.setSoyad("Yaman");
        ikinciTakımınLideri.setAd("Çağdaş ");
        ikinciTakımınLideri.setSoyad("Ateş");

        System.out.println("----Değişiklikleri kontrol etme----");
        System.out.println(calisanI.getAd() + calisanI.getSoyad());
        System.out.println(ikinciTakımınLideri.getAd() + ikinciTakımınLideri.getSoyad());
        System.out.println("Yeni Personel" + IsikVanli.getAd()+IsikVanli.getSoyad());








    }
}