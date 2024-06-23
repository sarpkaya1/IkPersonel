package org.example;

abstract class IkDepatment {  // Abstract sınıf oluşturarak ortak özellikleri buraya ekledim.
   private String ad;
   private String soyad;        ;
   private int dogumTarihi;

   public IkDepatment (String ad, String soyad, int dogumTarihi){
      this.ad = ad;
      this.soyad = soyad;
      this.dogumTarihi = dogumTarihi;
   }

   public String getAd() {
      return ad;
   }

   public String getSoyad() {
      return soyad;
   }

   public int getDogumTarihi() {
      return dogumTarihi;
   }


   public void setAd(String ad) {
      this.ad = ad;
   }

   public void setSoyad(String soyad) {
      this.soyad = soyad;
   }
}


