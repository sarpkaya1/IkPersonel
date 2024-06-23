package org.example;

public class AtananIsListesi { // Atanan işler için bir sınıf oluturdum ve görevlerin yapıldıktan sonra koşacak
                               // bir cons. oluşturdum.
    private boolean tamamlanmaDurumu = false;
  private String gorev;

  public AtananIsListesi (String gorev){
      this.gorev = gorev;

  }
  public void gorevTamamla(boolean tamamlanmaDurumu){
      if (tamamlanmaDurumu == true){
          System.out.println(gorev + " tamamlanmıştır.");

      }else{
          if (tamamlanmaDurumu == false) {
              System.out.println(gorev + " TAMAM DEĞİLDİR");
          }
      }

  }

    public boolean isTamamlanmaDurumu() {
        return tamamlanmaDurumu;
    }

    public String getGorev() {
        return gorev;
    }
}
