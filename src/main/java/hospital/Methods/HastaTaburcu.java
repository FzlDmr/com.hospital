package hospital.Methods;

import java.time.LocalDateTime;

import static hospital.Depo.*;
import static hospital.Depo.idIndex;
import static hospital.Methods.Methodlar.*;
import static hospital.Renk.scan;

public class HastaTaburcu extends Fatura {
    protected static void hastaTaburcu() {

        if (hastaIdList.size() == 0) {
            System.out.println("Hastanemizde Hasta Bulunmamaktadir \n\n Ana Menuye Yonlendiriliyorsunuz");
            for (int i = 0; i <= 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print(".");
            }
            System.out.println();
            menu();
        }
        System.out.println("Gecmis olsun");
        System.out.printf("%6s  %15s  %13s %17s ","Hasta Id" ,  "Hasta Kimlik No" ,   "Hasta Isim"   ,  "Hasta Soyisim");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");


        for (int i = 0; i <hastaIdList.size() ; i++) {
            System.out.printf("%6d   %15s  %13s %17s ",hastaIdList.get(i) , hastaKimlikNoList.get(i),
                    hastaIsimList.get(i) ,hastaSoyisimList.get(i));
            System.out.println();

        }

        System.out.println("Hasta id Giriniz");
        try {
            id = Integer.parseInt(scan.next());
        } catch (NumberFormatException e) {
            System.out.println("Yanlis giris yaptiniz");
            sayac++;
            if (sayac==3){
                menuYonlendir();
            }
            hastaTaburcu();
        }

        if (!hastaIdList.contains(id)) {
            System.out.println("Yanlis Id Girdiniz");
            sayac++;
            if (sayac==3){
                menuYonlendir();
            }
            hastaTaburcu();
        }


        System.out.printf(" %-11s %16s %18s %18s %25s %25s %20s","Hasta Id" ,  "Hasta Kimlik No" ,   "Hasta Isim"  ,   "Hasta Soyisim"  ,
                "Giris Tarihi"   ,  "Cikis Tarihi"    ,   "Fiyat" );
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------- ");

        if (acilHastaIdList.contains(id)) {
            acilHastaTaburcuTarih.add(time);
            idIndex = acilHastaIdList.indexOf(id);
                System.out.format(" %-11d %16s %18s %18s %25s %25s %10s",acilHastaIdList.get(idIndex) , acilHastaKimlikNoList.get(idIndex) ,
                        acilHastaIsimList.get(idIndex) , acilHastaSoyisimList.get(idIndex) ,
                        acilHastaGirisTarih.get(idIndex) ,time , acilHastaFiyatList.get(idIndex));


            System.out.println();

        }


        if (ciltHastaIdList.contains(id)) {
            ciltHastaTaburcuTarih.add(time);
            idIndex = ciltHastaIdList.indexOf(id);

            System.out.format(" %-11d %16s %18s %18s %25s %25s %10s",ciltHastaIdList.get(idIndex) , ciltHastaKimlikNoList.get(idIndex) ,
                        ciltHastaIsimList.get(idIndex) , ciltHastaSoyisimList.get(idIndex) ,
                        ciltHastaGirisTarih.get(idIndex) , time, ciltHastaFiyatList.get(idIndex));

            System.out.println();

        }

        if (cocukHastaIdList.contains(id)) {
            cocukHastaTaburcuTarih.add(time);
            idIndex = cocukHastaIdList.indexOf(id);

            System.out.format(" %-11d %16s %18s %18s %25s %25s %10s",cocukHastaIdList.get(idIndex) , cocukHastaKimlikNoList.get(idIndex) ,
                         cocukHastaIsimList.get(idIndex) , cocukHastaSoyisimList.get(idIndex) ,
                        cocukHastaGirisTarih.get(idIndex) , time , cocukHastaFiyatList.get(idIndex));
            System.out.println();

        }

        if (ruhHastaIdList.contains(id)) {
            ruhHastaTaburcuTarih.add(time);
            idIndex = ruhHastaIdList.indexOf(id);


            System.out.format(" %-11d %16s %18s %18s %25s %25s %10s",ruhHastaIdList.get(idIndex) ,ruhHastaKimlikNoList.get(idIndex) ,
                        ruhHastaIsimList.get(idIndex), ruhHastaSoyisimList.get(idIndex) ,
                        ruhHastaGirisTarih.get(idIndex),time ,ruhHastaFiyatList.get(idIndex));
            System.out.println();


        }

        if (genelCerrahHastaIdList.contains(id)) {
            genelCerrahHastaTaburcuTarih.add(time);
            idIndex = genelCerrahHastaIdList.indexOf(id);


            System.out.format(" %-11d %16s %18s %18s %25s %25s %10s",genelCerrahHastaIdList.get(idIndex) ,genelCerrahHastaKimlikNoList.get(idIndex)
                      , genelCerrahHastaIsimList.get(idIndex) , genelCerrahHastaSoyisimList.get(idIndex) ,
                        genelCerrahHastaGirisTarih.get(idIndex) , time, genelCerrahHastaFiyatList.get(idIndex));
            System.out.println();


        }

        if (icHastalikIdList.contains(id)) {
            icHastalikHastaTaburcuTarih.add(time);
            idIndex = icHastalikIdList.indexOf(id);


            System.out.format(" %-11d %16s %18s %18s %25s %25s %10s",icHastalikIdList.get(idIndex) , icHastalikHastaKimlikNoList.get(idIndex) ,
                         icHastalikHastaIsimList.get(idIndex) , icHastalikHastaSoyisimList.get(idIndex),
                        icHastalikHastaGirisTarih.get(idIndex) , LocalDateTime.now() , icHastalikHastaFiyatList.get(idIndex));
            System.out.println();


        }


        if (kalpHastalikIdList.contains(id)) {
            kalpHastalikHastaTaburcuTarih.add(time);
            idIndex = kalpHastalikIdList.indexOf(id);


            System.out.format(" %-11d %16s %18s %18s %25s %25s %10s",kalpHastalikIdList.get(idIndex) , kalpHastalikHastaKimlikNoList.get(idIndex),
                        kalpHastalikHastaIsimList.get(idIndex) ,kalpHastalikHastaSoyisimList.get(idIndex),
                        kalpHastalikHastaGirisTarih.get(idIndex) ,time , kalpHastalikHastaFiyatList.get(idIndex));

            System.out.println();

        }

        if (sinirHastalikIdList.contains(id)) {
            sinirHastalikHastaTaburcuTarih.add(time);
            idIndex = sinirHastalikIdList.indexOf(id);

            System.out.format(" %-11d %16s %18s %18s %25s %25s %10s" ,sinirHastalikIdList.get(idIndex) ,sinirHastalikHastaKimlikNoList.get(idIndex),
                    sinirHastalikHastaIsimList.get(idIndex) ,sinirHastalikHastaSoyisimList.get(idIndex),
                    sinirHastalikHastaGirisTarih.get(idIndex),time,sinirHastalikHastaFiyatList.get(idIndex));

            System.out.println();

        }

        System.out.println("Yapmak istediginiz islemi giriniz\n1- Fatura Olustur\n2-Ana Menu");
        menuSecim = scan.next();
        switch (menuSecim) {
            case "1":
                faturaOlustur();
            case "2":
                menu();
            default:
                yanlisSecim();
                menu();
        }


    }


}
