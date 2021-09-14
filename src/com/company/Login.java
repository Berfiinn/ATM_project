package com.company;


import java.util.Scanner;

public class Login {
    public boolean login (Hesap hesap){
        Scanner scanner=new Scanner(System.in);
        String kullaniciadi;
        String parola;
        System.out.println("kullanici adi ");
        kullaniciadi = scanner.nextLine();
        System.out.println("parolanız ");
        parola = scanner.nextLine();

        if(hesap.getKullanici_adi().equals(kullaniciadi) && hesap.getParola().equals(parola)){

            return true;
        }
        else {
            return  false;
        }
    }

}
