package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main { //
    public static void main(String[] args) {
       // 1. Takım için personel sıralaması
        System.out.println("-------------BİRİNCİ TAKIM---------------");

        IkDepatment birinciTakim = new IkDepatment("Seçilay Temiz");
        KadınPersonel nergisKurt = new KadınPersonel("Nergis ","Kurt",1991,60);
        KadınPersonel aycaAy = new KadınPersonel("Ayça ","Ay",1998,60);
        ErkekPersonel denizAydın = new ErkekPersonel("Deniz ","Aydın",1989,65);
        ErkekPersonel calisanI = new ErkekPersonel("Ahmet ","Tezel",1981,65);
        birinciTakim.addPersonel(nergisKurt);
        birinciTakim.addPersonel(aycaAy);
        birinciTakim.addPersonel(denizAydın);
        birinciTakim.addPersonel(calisanI);
        System.out.println("Birinci Takım Lideri= " + birinciTakim.getTakimLideri());
        System.out.println("--Personel--");
        for (Personel p : birinciTakim.getPersonelList()) {
            System.out.println("Ad: " + p.getAd() + " Soyad : " + p.getSoyad());
        }

        // Birinci Takım Görevleri

        System.out.println("-------------Birinci takımın görevleri:------------------");
        AtananIsListesi ilkIs = new AtananIsListesi(" Müşteri taleplerini düzenleme");
        AtananIsListesi ikinciIs = new AtananIsListesi(" Test senaryoları oluşturma");
        //System.out.println("1- "+ ilkIs.getGorev());
        //System.out.println("2- "+ikinciIs.getGorev());
        birinciTakim.adGorev(ilkIs);
        birinciTakim.adGorev(ikinciIs);
        for (AtananIsListesi i : birinciTakim.getAtananIsListesiList()) {
            System.out.println(  i.getGorev()  );
        }
        // 2. Takım için personel sıralaması

        System.out.println("--------------İKİNCİ TAKIM---------------");
        IkDepatment ikinciTakim = new IkDepatment("Selçuk Yalçın");
        KadınPersonel sevalSahin = new KadınPersonel("Seval ","Şahin",1992,60);
        KadınPersonel selinCamci = new KadınPersonel("Selin ","Çamcı",1996,60);
        ErkekPersonel emreAydin = new ErkekPersonel("Emre ","Aydın",1985,65);
        ErkekPersonel sarpKaya = new ErkekPersonel("Sarp ","Kaya",1998,65);
        ikinciTakim.addPersonel(sevalSahin);
        ikinciTakim.addPersonel(selinCamci);
        ikinciTakim.addPersonel(emreAydin);
        ikinciTakim.addPersonel(sarpKaya);
        System.out.println("İkinci takımın lideri= " + ikinciTakim.getTakimLideri());
        System.out.println("---Personel---");
        for (Personel p : ikinciTakim.getPersonelList()) {
            System.out.println("Ad: " + p.getAd() + " Soyad : " + p.getSoyad());
        }
        // İkinci takım görevleri

        System.out.println("---------İkinci takım görevleri:-----------------");
        AtananIsListesi gorevI = new AtananIsListesi("Seneryoları otomatize etme");
        AtananIsListesi gorevII = new AtananIsListesi("Seneryo koşumu ve raporlama");
        ikinciTakim.adGorev(gorevI);
        ikinciTakim.adGorev(gorevII);
        for (AtananIsListesi i : ikinciTakim.getAtananIsListesiList()) {
            System.out.println(  i.getGorev()  );
        }



        // Personelin emeklilik durumunu sorgulama
        System.out.println("----------Personelin emeklilik durumu:-------------");
        nergisKurt.emeklilikHesapla(1992);
        aycaAy.emeklilikHesapla(1996);
        denizAydın.emeklilikHesapla(1989);
        calisanI.emeklilikHesapla(1981);
        sevalSahin.emeklilikHesapla(1992);
        selinCamci.emeklilikHesapla(1996);
        emreAydin.emeklilikHesapla(1985);
        sarpKaya.emeklilikHesapla(1998);



        // İşlerin tamamlanması
        System.out.println("-----------İşlerin tamamlanma durumu----------");
        ilkIs.gorevTamamla(true);
        ikinciIs.gorevTamamla(true);
        gorevI.gorevTamamla(true);
        gorevII.gorevTamamla(false);

        System.out.println("------------PERSONEL EKLEME/DEĞİŞTİRME---------------");
        // Birinci takıma bir personel daha eklenecek ve bir personel değiştirilecek
        // ikinci takımın takımda bir kişi listeden çıkrılacak.
        KadınPersonel IsikVanli = new KadınPersonel("Işık","Vanlı",1992,60);
        calisanI.setAd("Muharrem ");
        calisanI.setSoyad("Yaman");
        ikinciTakim.removePersonel(emreAydin);


        System.out.println("----Değişiklikleri kontrol etme----");
        System.out.println("calisanI yeni ismi= " + calisanI.getAd() + calisanI.getSoyad());
        System.out.println("Yeni Personel " + IsikVanli.getAd()+IsikVanli.getSoyad());
        System.out.println("Emre Aydın'ın listeden kalktığını teyit etme ");
        for (Personel p : ikinciTakim.getPersonelList()) {
            System.out.println("Ad: " + p.getAd() + " Soyad : " + p.getSoyad());
        }











    }
}