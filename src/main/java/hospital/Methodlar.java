package practice.hospital;


import static practice.hospital.ayaktaHasta.AyaktaHastaliklar.ayaktaHastaliklar;
import static practice.hospital.ayaktaHasta.AyaktaMethodlar.*;
import static practice.hospital.yatanHasta.YatanHastaliklar.yatanHastaliklar;
import static practice.hospital.yatanHasta.YatanMethodlar.*;
import static practice.hospital.yatanHasta.YatanMethodlar.sinirHastaliklari;

public class Methodlar implements Renk {
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
    public static void hastaTaburcu() {
        System.out.println("Gecmis olsun");
        for (int i = 0; i <ciltHastaIdList.size() ; i++) {
            System.out.println(ciltHastaIdList.get(i)+" "+ciltHastaKimlikNoList.get(i)+
                    ciltHastaIsimList.get(i)+" "+ciltHastaSoyisimList.get(i)+" "+ciltHastaFiyatList.get(i));
        }
    }

    static void yanlisSecim() {
        System.out.println("Yanlis secim yaptiniz");
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(".");
        }
          System.out.println("");

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
        System.out.println("");
    }

    static void kullaniciBilgileriAl() {
        kullaniciIsimAl();
    }

    private static void kullaniciKimlikNoAl() {
        System.out.println(KIRMIZI + "Kimlik No Giriniz" + YESIL);
        hastaKimlikNo = scan.next();
        hastaKimlikNoList.add(hastaKimlikNo);
        if (hastaKimlikNo.replaceAll("[^0-9]","").length() !=11){
            yanlisGiris();
            kullaniciBilgileriAl();
        }
        hastaIdList.add(id++);

        tedaviTuruSec();
    }

    private static void kullaniciSoyisimAl() {
        System.out.println(KIRMIZI + "Soyisim Giriniz" + YESIL);
        hastaSoyisim = scan.next();
        hastaSoyisimList.add(hastaSoyisim);
        kullaniciKimlikNoAl();
    }

    private static void kullaniciIsimAl() {
        System.out.println(KIRMIZI + "Isim Giriniz" + YESIL);
        hastaIsim = scan.next();
        hastaIsimList.add(hastaIsim);
        kullaniciSoyisimAl();
    }

    public static void hastaListesiGoruntule() {
        for (int i = 0; i <hastaIsimList.size() ; i++) {
            System.out.println("========================");
            System.out.println("Kimlik No: "+hastaKimlikNoList.get(i));
            System.out.println("Isim     : "+hastaIsimList.get(i));
            System.out.println("Soyisim  : "+hastaSoyisimList.get(i));

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

}
