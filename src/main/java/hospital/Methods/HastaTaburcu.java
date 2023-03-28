package hospital.Methods;

import java.time.LocalDateTime;

import static hospital.Depo.*;
import static hospital.Depo.idIndex;
import static hospital.Methods.Methodlar.menu;
import static hospital.Methods.Methodlar.yanlisSecim;
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
        System.out.println("Hasta Id   Hasta Kimlik No    Hasta Isim     Hasta Soyisim");
        System.out.println("----------------------------------------------------------");


        for (int i = 0; i <hastaIdList.size() ; i++) {
            System.out.println(hastaIdList.get(i) + "       " + hastaKimlikNoList.get(i) + " " +
                    hastaIsimList.get(i) + " " + hastaSoyisimList.get(i));

        }

        System.out.println("Hasta id Giriniz");
        try {
            id = Integer.parseInt(scan.next());
        } catch (NumberFormatException e) {
            System.out.println("Yanlis giris yaptiniz");
            hastaTaburcu();
        }

        if (!hastaIdList.contains(id)) {
            System.out.println("Yanlis Id Girdiniz");
            hastaTaburcu();
        }


        System.out.println("Hasta Id   Hasta Kimlik No    Hasta Isim     Hasta Soyisim      Giris Tarihi       Cikis Tarihi       Fiyat ");
        System.out.println("------------------------------------------------------------------------------------------------------------ ");

        if (acilHastaIdList.contains(id)) {
            acilHastaTaburcuTarih.add(time);
            idIndex = acilHastaIdList.indexOf(id);

                System.out.println(acilHastaIdList.get(idIndex) + "       " + acilHastaKimlikNoList.get(idIndex) + "         "
                        + acilHastaIsimList.get(idIndex) + "         " + acilHastaSoyisimList.get(idIndex) + "      " +
                        acilHastaGirisTarih.get(idIndex) + "   " + time + "    " + acilHastaFiyatList.get(idIndex));



        }


        if (ciltHastaIdList.contains(id)) {
            ciltHastaTaburcuTarih.add(time);
            idIndex = ciltHastaIdList.indexOf(id);

                System.out.println(ciltHastaIdList.get(idIndex) + " " + ciltHastaKimlikNoList.get(idIndex) + ""
                        + ciltHastaIsimList.get(idIndex) + " " + ciltHastaSoyisimList.get(idIndex) + " " +
                        ciltHastaGirisTarih.get(idIndex) + " " + time + " " + ciltHastaFiyatList.get(idIndex));



        }

        if (cocukHastaIdList.contains(id)) {
            cocukHastaTaburcuTarih.add(time);
            idIndex = cocukHastaIdList.indexOf(id);

                System.out.println(cocukHastaIdList.get(idIndex) + " " + cocukHastaKimlikNoList.get(idIndex) + ""
                        + cocukHastaIsimList.get(idIndex) + " " + cocukHastaSoyisimList.get(idIndex) + " " +
                        cocukHastaGirisTarih.get(idIndex) + " " + time + " " + cocukHastaFiyatList.get(idIndex));


        }

        if (ruhHastaIdList.contains(id)) {
            ruhHastaTaburcuTarih.add(time);
            idIndex = ruhHastaIdList.indexOf(id);


                System.out.println(ruhHastaIdList.get(idIndex) + " " + ruhHastaKimlikNoList.get(idIndex) + ""
                        + ruhHastaIsimList.get(idIndex) + " " + ruhHastaSoyisimList.get(idIndex) + " " +
                        ruhHastaGirisTarih.get(idIndex) + " " + time + " " + ruhHastaFiyatList.get(idIndex));



        }

        if (genelCerrahHastaIdList.contains(id)) {
            genelCerrahHastaTaburcuTarih.add(time);
            idIndex = genelCerrahHastaIdList.indexOf(id);


                System.out.println(genelCerrahHastaIdList.get(idIndex) + " " + genelCerrahHastaKimlikNoList.get(idIndex) + ""
                        + genelCerrahHastaIsimList.get(idIndex) + " " + genelCerrahHastaSoyisimList.get(idIndex) + " " +
                        genelCerrahHastaGirisTarih.get(idIndex) + " " + time + " " + genelCerrahHastaFiyatList.get(idIndex));



        }

        if (icHastalikIdList.contains(id)) {
            icHastalikHastaTaburcuTarih.add(time);
            idIndex = icHastalikIdList.indexOf(id);


                System.out.println(icHastalikIdList.get(idIndex) + " " + icHastalikHastaKimlikNoList.get(idIndex) + ""
                        + icHastalikHastaIsimList.get(idIndex) + " " + icHastalikHastaSoyisimList.get(idIndex) + " " +
                        icHastalikHastaGirisTarih.get(idIndex) + " " + LocalDateTime.now() + " " + icHastalikHastaFiyatList.get(idIndex));



        }


        if (kalpHastalikIdList.contains(id)) {
            kalpHastalikHastaTaburcuTarih.add(time);
            idIndex = kalpHastalikIdList.indexOf(id);

                System.out.println(kalpHastalikIdList.get(idIndex) + " " + kalpHastalikHastaKimlikNoList.get(idIndex) + ""
                        + kalpHastalikHastaIsimList.get(idIndex) + " " + kalpHastalikHastaSoyisimList.get(idIndex) + " " +
                        kalpHastalikHastaGirisTarih.get(idIndex) + " " + time + " " + kalpHastalikHastaFiyatList.get(idIndex));



        }

        if (sinirHastalikIdList.contains(id)) {
            sinirHastalikHastaTaburcuTarih.add(time);
            idIndex = sinirHastalikIdList.indexOf(id);

                System.out.println(sinirHastalikIdList.get(idIndex) + " " + sinirHastalikHastaKimlikNoList.get(idIndex) + ""
                        + sinirHastalikHastaIsimList.get(idIndex) + " " + sinirHastalikHastaSoyisimList.get(idIndex) + " " +
                        sinirHastalikHastaGirisTarih.get(idIndex) + " " + time + " " + sinirHastalikHastaFiyatList.get(idIndex));


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
