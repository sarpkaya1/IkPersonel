package org.example;

import java.util.ArrayList;
import java.util.List;

public class IkDepatment {  // Abstract sınıf oluşturarak ortak özellikleri buraya ekledim.
   private String takimLideri;
   private List<Personel> personelList;
   private List<AtananIsListesi> atananIsListesiList;


   public String getTakimLideri() {
      return takimLideri;
   }

   public List<Personel> getPersonelList() {
      return personelList;
   }

   public List<AtananIsListesi> getAtananIsListesiList() {
      return atananIsListesiList;
   }

   public IkDepatment (String takimLideri){
      this.takimLideri= takimLideri;
      this.personelList = new ArrayList<>();
      this.atananIsListesiList = new ArrayList<>();

   }
   public void addPersonel(Personel personel) {
      this.personelList.add(personel);
   }
   public void removePersonel(Personel personel) {
      this.personelList.remove(personel);
   }
   public void adGorev(AtananIsListesi gorev){
      this.atananIsListesiList.add(gorev);
   }
   public void removeGorev(AtananIsListesi gorev) {
      this.atananIsListesiList.remove(gorev);
      System.out.println("Görev tamamlanmıştır");
   }


//










}


