package hospital.Methods;


import hospital.Renk;

import static hospital.Depo.*;
import static hospital.ayaktaHasta.AyaktaHastaliklar.*;
import static hospital.Methods.AyaktaMethodlar.*;
import static hospital.yatanHasta.YatanHastaliklar.*;
import static hospital.Methods.YatanMethodlar.*;


public class Methodlar extends HastaTaburcu implements Renk {
    private static void ayaktaHastalikSec() {
        switch (ayaktaHastalikSecim) {
            case "1":
                ciltHastaliklari();
                break;
            case "2":
                acilHastaliklari();
                break;
            case "3":
                cocukHastaliklari();
                break;
            case "4":
                ruhHastaliklari();
                break;
            default:
                yanlisSecim();
                tedaviTuruSec();
        }

    }

    private static void yatanHastalikSec() {
        switch (yatanHastalikSecim) {
            case "1":
                genelCerrahi();
                break;
            case "2":
                icHastaliklari();
                break;
            case "3":
                kalpHastaliklari();
                break;
            case "4":
                sinirHastaliklari();
                break;
            default:
                yanlisSecim();
                tedaviTuruSec();

        }

    }


    protected static void yanlisSecim() {
        System.out.println("Yanlis secim yaptiniz");
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(".");
        }
        System.out.println();

    }

    static void yanlisGiris() {
        System.out.println("Yanlis Kimlik No Girdiniz \n Kimlik No sadece rakamlardan olusmalidir\n kimlik no 11 hane olmalidir");
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(".");
        }
        System.out.println();
    }

    protected static void kullaniciBilgileriAl() {
        kullaniciKimlikNoAl();

    }

    private static void kullaniciKimlikNoAl() {
        System.out.println(KIRMIZI + "Kimlik No Giriniz" + YESIL);
        hastaKimlikNo = scan.next();
        hastaKimlikNoList.add(hastaKimlikNo);
        if (hastaKimlikNo.replaceAll("[^0-9]", "").length() != 11) {
            yanlisGiris();
            kullaniciBilgileriAl();
        }
        id=rnd.nextInt(1000);
        hastaIdList.add(id);
           kullaniciIsimAl();

    }

    private static void kullaniciSoyisimAl() {
        System.out.println(KIRMIZI + "Soyisim Giriniz" + YESIL);
        hastaSoyisim = scan.next();
        hastaSoyisimList.add(hastaSoyisim);
        tedaviTuruSec();
    }

    private static void kullaniciIsimAl() {
        System.out.println(KIRMIZI + "Isim Giriniz" + YESIL);
        hastaIsim = scan.next();
        hastaIsimList.add(hastaIsim);
        kullaniciSoyisimAl();
    }

    public static void hastaListesiGoruntule() {
        for (int i = 0; i < hastaIsimList.size(); i++) {
            System.out.println("========================");
            System.out.println("Kimlik No: " + hastaKimlikNoList.get(i));
            System.out.println("Isim     : " + hastaIsimList.get(i));
            System.out.println("Soyisim  : " + hastaSoyisimList.get(i));

        }
        System.out.println("Yapmak istediginiz islemi seciniz\n1- Hasta Taburcu\n2- Ana Menu");
        menuSecim = scan.next();
        switch (menuSecim) {
            case "1":
                hastaTaburcu();
            case "2":
                menu();
            default:
                yanlisSecim();
                hastaListesiGoruntule();
        }


    }


    private static void tedaviTuruSec() {
        System.out.println(KIRMIZI + "Tedavi Turunuzu Seciniz\n1- Ayakta\n2- Yatan");
        tedaviTuruSecim = scan.next();
        switch (tedaviTuruSecim) {
            case "1":
                System.out.println(SARI + ayaktaHastaliklar + KIRMIZI + "\nListeden Hastaliginizi Seciniz" + YESIL);
                ayaktaHastalikSecim = scan.next();
                ayaktaHastalikSec();

            case "2":
                System.out.println(KIRMIZI + yatanHastaliklar + "\nListeden Hastaliginizi Seciniz" + YESIL);
                yatanHastalikSecim = scan.next();
                yatanHastalikSec();
            default:
                yanlisSecim();
                tedaviTuruSec();
        }
    }

    public static void menu() {
        System.out.println(YESIL + "************************\nHastanemize Hosgeldiniz\n************************\n");
        System.out.println("Yapmak istediginiz islemi seciniz\n1- Hasta Giris\n2- Hasta Taburcu\n3- Hasta Listesi Goruntule \n4- cikis");
        menuSecim = scan.next();
        switch (menuSecim) {
            case "1":
                kullaniciBilgileriAl();
            case "2":
                hastaTaburcu();
                break;
            case "3":
                hastaListesiGoruntule();
            case "4":
                System.out.println("Bizi Tercih Ettiginiz icin Tesekkur Ederiz");
                System.exit(0);
            default:
                yanlisSecim();
        }


    }


}
