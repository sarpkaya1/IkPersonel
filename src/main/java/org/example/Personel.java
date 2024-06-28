package org.example;

abstract class Personel {
    private String takimAdi;
    private String ad;
    private String soyad;        ;
    private int dogumTarihi;
    private int emekliOlmaYasi;
    private int mevcutYil = 2024;
    private int mevcutYas = mevcutYil - dogumTarihi;

    public Personel (String ad, String soyad, int dogumTarihi, int emekliOlmaYasi){
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
        this.emekliOlmaYasi = emekliOlmaYasi;
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

    public int getEmekliOlmaYasi() {
        return emekliOlmaYasi;
    }

    public int getMevcutYil() {
        return mevcutYil;
    }

    public int getMevcutYas() {
        return mevcutYas;
    }

    public String getTakimAdi() {
        return takimAdi;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    abstract void emeklilikHesapla(int dogumTarihi);

//





}
