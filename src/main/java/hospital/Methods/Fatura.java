package hospital.Methods;


import java.time.LocalDateTime;

import static hospital.Depo.*;
import static hospital.Depo.idIndex;
import static hospital.Methods.Methodlar.menu;
import static java.awt.SystemColor.menu;

public class Fatura {

    public static void faturaOlustur() {

        System.out.println(
                "---------------------------------------------------------------------------------------\n" +
                "--------------------- DevTeam 3 Hastane Faturasi-------------------------\n" +
                "-------------------------------------------------------------------------------------- ");

        System.out.printf(" %-11s %16s %18s %18s %20s","Hasta Id" ,  "Hasta Kimlik No" ,   "Hasta Isim"  ,   "Hasta Soyisim"  , "Fiyat" );
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");

        if (acilHastaIdList.contains(id)) {
            acilHastaTaburcuTarih.add(time);
            idIndex = acilHastaIdList.indexOf(id);
            System.out.format(" %-11d %16s %18s %18s %10s",acilHastaIdList.get(idIndex) , acilHastaKimlikNoList.get(idIndex) ,
                      acilHastaIsimList.get(idIndex) , acilHastaSoyisimList.get(idIndex) ,
                    acilHastaFiyatList.get(idIndex));
            System.out.println();

            hastaIdList.remove(acilHastaIdList.get(idIndex));
            hastaIsimList.remove(acilHastaIsimList.get(idIndex));
            hastaSoyisimList.remove(acilHastaSoyisimList.get(idIndex));
            hastaKimlikNoList.remove(acilHastaKimlikNoList.get(idIndex));

            acilHastaIdList.remove(idIndex);
            acilHastaIsimList.remove(idIndex);
            acilHastaSoyisimList.remove(idIndex);
            acilHastaGirisTarih.remove(idIndex);
            acilHastaFiyatList.remove(idIndex);
            acilHastaKimlikNoList.remove(idIndex);


        }


        if (ciltHastaIdList.contains(id)) {
            ciltHastaTaburcuTarih.add(time);
            idIndex = ciltHastaIdList.indexOf(id);

            System.out.format(" %-11d %16s %18s %18s %10s" ,ciltHastaIdList.get(idIndex),ciltHastaKimlikNoList.get(idIndex) ,
                     ciltHastaIsimList.get(idIndex) ,ciltHastaSoyisimList.get(idIndex)
                    , ciltHastaFiyatList.get(idIndex));
            System.out.println();

            hastaIdList.remove(ciltHastaIdList.get(idIndex));
            hastaIsimList.remove(ciltHastaIsimList.get(idIndex));
            hastaSoyisimList.remove(ciltHastaSoyisimList.get(idIndex));
            hastaKimlikNoList.remove(ciltHastaKimlikNoList.get(idIndex));

            ciltHastaIdList.remove(idIndex);
            ciltHastaIsimList.remove(idIndex);
            ciltHastaSoyisimList.remove(idIndex);
            ciltHastaGirisTarih.remove(idIndex);
            ciltHastaFiyatList.remove(idIndex);
            ciltHastaKimlikNoList.remove(idIndex);


        }

        if (cocukHastaIdList.contains(id)) {
            cocukHastaTaburcuTarih.add(time);
            idIndex = cocukHastaIdList.indexOf(id);

            System.out.format(" %-11d %16s %18s %18s %10s" ,cocukHastaIdList.get(idIndex) ,
                    cocukHastaKimlikNoList.get(idIndex) , cocukHastaIsimList.get(idIndex)
                    ,cocukHastaSoyisimList.get(idIndex) ,
                        cocukHastaFiyatList.get(idIndex));
            System.out.println();

            hastaIdList.remove(cocukHastaIdList.get(idIndex));
            hastaIsimList.remove(cocukHastaIsimList.get(idIndex));
            hastaSoyisimList.remove(cocukHastaSoyisimList.get(idIndex));
            hastaKimlikNoList.remove(cocukHastaKimlikNoList.get(idIndex));


            cocukHastaIdList.remove(idIndex);
            cocukHastaIsimList.remove(idIndex);
            cocukHastaSoyisimList.remove(idIndex);
            cocukHastaGirisTarih.remove(idIndex);
            cocukHastaFiyatList.remove(idIndex);
            cocukHastaKimlikNoList.remove(idIndex);



        }

        if (ruhHastaIdList.contains(id)) {
            ruhHastaTaburcuTarih.add(time);
            idIndex = ruhHastaIdList.indexOf(id);

                System.out.println(ruhHastaIdList.get(idIndex) + " " + ruhHastaKimlikNoList.get(idIndex) + ""
                        + ruhHastaIsimList.get(idIndex) + " " + ruhHastaSoyisimList.get(idIndex) + " " +
                        ruhHastaFiyatList.get(idIndex));

            System.out.println();
            hastaIdList.remove(ruhHastaIdList.get(idIndex));
            hastaIsimList.remove(ruhHastaIsimList.get(idIndex));
            hastaSoyisimList.remove(ruhHastaSoyisimList.get(idIndex));
            hastaKimlikNoList.remove(ruhHastaKimlikNoList.get(idIndex));



            ruhHastaIdList.remove(idIndex);
            ruhHastaIsimList.remove(idIndex);
            ruhHastaSoyisimList.remove(idIndex);
            ruhHastaGirisTarih.remove(idIndex);
            ruhHastaFiyatList.remove(idIndex);
            ruhHastaKimlikNoList.remove(idIndex);



        }

        if (genelCerrahHastaIdList.contains(id)) {
            genelCerrahHastaTaburcuTarih.add(time);
            idIndex = genelCerrahHastaIdList.indexOf(id);

                System.out.println(genelCerrahHastaIdList.get(idIndex) + " " + genelCerrahHastaKimlikNoList.get(idIndex) + ""
                        + genelCerrahHastaIsimList.get(idIndex) + " " + genelCerrahHastaSoyisimList.get(idIndex) + " " +
                        genelCerrahHastaFiyatList.get(idIndex));

            System.out.println();
            hastaIdList.remove(genelCerrahHastaIdList.get(idIndex));
            hastaIsimList.remove(genelCerrahHastaIsimList.get(idIndex));
            hastaSoyisimList.remove(genelCerrahHastaSoyisimList.get(idIndex));
            hastaKimlikNoList.remove(genelCerrahHastaKimlikNoList.get(idIndex));


            genelCerrahHastaIdList.remove(idIndex);
            genelCerrahHastaIsimList.remove(idIndex);
            genelCerrahHastaSoyisimList.remove(idIndex);
            genelCerrahHastaGirisTarih.remove(idIndex);
            genelCerrahHastaFiyatList.remove(idIndex);
            genelCerrahHastaKimlikNoList.remove(idIndex);



        }

        if (icHastalikIdList.contains(id)) {
            icHastalikHastaTaburcuTarih.add(time);
            idIndex = icHastalikIdList.indexOf(id);

                System.out.println(icHastalikIdList.get(idIndex) + " " + icHastalikHastaKimlikNoList.get(idIndex) + ""
                        + icHastalikHastaIsimList.get(idIndex) + " " + icHastalikHastaSoyisimList.get(idIndex) + " " +
                        icHastalikHastaFiyatList.get(idIndex));

            System.out.println();
            hastaIdList.remove(icHastalikIdList.get(idIndex));
            hastaIsimList.remove(icHastalikHastaIsimList.get(idIndex));
            hastaSoyisimList.remove(icHastalikHastaSoyisimList.get(idIndex));
            hastaKimlikNoList.remove(icHastalikHastaKimlikNoList.get(idIndex));

            icHastalikIdList.remove(idIndex);
            icHastalikHastaIsimList.remove(idIndex);
            icHastalikHastaSoyisimList.remove(idIndex);
            icHastalikHastaGirisTarih.remove(idIndex);
            icHastalikHastaFiyatList.remove(idIndex);
            icHastalikHastaKimlikNoList.remove(idIndex);



        }


        if (kalpHastalikIdList.contains(id)) {
            kalpHastalikHastaTaburcuTarih.add(time);
            idIndex = kalpHastalikIdList.indexOf(id);

                System.out.println(kalpHastalikIdList.get(idIndex) + " " + kalpHastalikHastaKimlikNoList.get(idIndex) + ""
                        + kalpHastalikHastaIsimList.get(idIndex) + " " + kalpHastalikHastaSoyisimList.get(idIndex) + " " +
                        kalpHastalikHastaFiyatList.get(idIndex));

            System.out.println();
            hastaIdList.remove(kalpHastalikIdList.get(idIndex));
            hastaIsimList.remove(kalpHastalikHastaIsimList.get(idIndex));
            hastaSoyisimList.remove(kalpHastalikHastaSoyisimList.get(idIndex));
            hastaKimlikNoList.remove(kalpHastalikHastaKimlikNoList.get(idIndex));


            kalpHastalikIdList.remove(idIndex);
            kalpHastalikHastaIsimList.remove(idIndex);
            kalpHastalikHastaSoyisimList.remove(idIndex);
            kalpHastalikHastaGirisTarih.remove(idIndex);
            kalpHastalikHastaFiyatList.remove(idIndex);
            kalpHastalikHastaKimlikNoList.remove(idIndex);



        }

        if (sinirHastalikIdList.contains(id)) {
            sinirHastalikHastaTaburcuTarih.add(time);
            idIndex = sinirHastalikIdList.indexOf(id);

                System.out.println(sinirHastalikIdList.get(idIndex) + " " + sinirHastalikHastaKimlikNoList.get(idIndex) + ""
                        + sinirHastalikHastaIsimList.get(idIndex) + " " + sinirHastalikHastaSoyisimList.get(idIndex) + " " +
                        sinirHastalikHastaFiyatList.get(idIndex));
            System.out.println();

            hastaIdList.remove(sinirHastalikIdList.get(idIndex));
            hastaIsimList.remove(sinirHastalikHastaIsimList.get(idIndex));
            hastaSoyisimList.remove(sinirHastalikHastaSoyisimList.get(idIndex));
            hastaKimlikNoList.remove(sinirHastalikHastaKimlikNoList.get(idIndex));


            sinirHastalikIdList.remove(idIndex);
            sinirHastalikHastaIsimList.remove(idIndex);
            sinirHastalikHastaSoyisimList.remove(idIndex);
            sinirHastalikHastaGirisTarih.remove(idIndex);
            sinirHastalikHastaFiyatList.remove(idIndex);
            sinirHastalikHastaKimlikNoList.remove(idIndex);



        }

        menu();
    }
}
