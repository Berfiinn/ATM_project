package com.company;

import java.util.Scanner;

public class ATM {
    public  void calis(Hesap hesap){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
         System.out.println("hoşgeldiniz");
         System.out.println("*************************");
         System.out.println("Kullanıcı girişi");
         System.out.println("*************************");
         int giris_hakki=3;
         while(true){
             if(login.login(hesap)){
                 System.out.println("Giriş başarılı...");
                 break;
             }
             else{
                 System.out.println("giriş başarısız");
                 giris_hakki -= 1;
                 System.out.println("Kalan giriş hakkınız " +giris_hakki);
             }
             if(giris_hakki == 0){
                 System.out.println("giriş hakkınız bitmiştir");
                 return;
             }
         }

         String islemler= "1.Bakiye Ogrenme\n"
                        + "2.Para Yatır\n"
                        + "3.Para Cekme\n"
                        + "Cikiş icin q basin";

         System.out.println(islemler);

         while(true){
             System.out.println("İşlemi seciniz: ");
             String islem = scanner.nextLine();
             if(islem.equals("q")){

                 break;
             }
             else if(islem.equals("1")) {
                 System.out.println("Bakiyeniz: " + hesap.getBakiye());

             }
             else if(islem.equals("2")){
                 System.out.println("Yatırmak istediğiniz tutarı giriniz");
                 int tutar = scanner.nextInt();
                 scanner.nextLine();
                 hesap.parayatir(tutar);
             }
             else if(islem.equals("3")){
                 System.out.println("çekmek istediğiniz tutarı giriniz:");
                 int tutar = scanner.nextInt();
                 scanner.nextLine();
                 hesap.paracekme(tutar);
             }
             else{
                 System.out.println("Gecersiz İslem");
             }


         }




    }
}
