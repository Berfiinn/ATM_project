package com.company;

public class Hesap {
    private String kullanici_adi;
    private String parola;
    private int bakiye;

    public Hesap(String kullanici_adi,String parola,int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola=parola;
        this.bakiye=bakiye;
    }



    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {

        this.bakiye = bakiye;
    }
    public void parayatir(int miktar){

        bakiye += miktar;
        System.out.println("para yatırma işleminiz tamamlanmıştır bakiyeniz:" + bakiye );
    }
    public void paracekme(int tutar){
        if(tutar>1500) {
            System.out.println("bu kadar yüksek para çekemezsiniz");
        }

        else if(bakiye - tutar<0){
            System.out.println("yetersiz bakiye bakiyeniz: " + bakiye);
        }
        else{
            bakiye-=tutar;
            System.out.println("para çektiniz yeni bakiyeniz: "+ bakiye);

            
        }

    }
}
