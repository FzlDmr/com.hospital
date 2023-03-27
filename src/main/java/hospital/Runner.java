package practice.hospital;

public class Runner extends Methodlar implements Renk {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println(YESIL + "************************\nHastanemize Hosgeldiniz\n************************\n");
        System.out.println("Yapmak istediginiz islemi seciniz\n1- Hasta Giris\n2- Hasta Taburcu\n3- Hasta Listesi Goruntule \n4- cikis");
        String menuSecim = scan.next();
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
