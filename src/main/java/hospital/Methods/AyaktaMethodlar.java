package hospital.Methods;


import hospital.Depo;
import hospital.ayaktaHasta.AcilHastaliklar;
import hospital.ayaktaHasta.CiltHastaliklari;
import hospital.ayaktaHasta.CocukHastaliklari;
import hospital.ayaktaHasta.RuhHastaliklari;

import static hospital.Runner.menu;

public class AyaktaMethodlar extends Depo {
    public static void ciltHastaliklari() {
        tedaviFiyat=100.00;
        CiltHastaliklari hastalik=new CiltHastaliklari();
        doktorBrans= hastalik.ayaktaBransSec();
        doktorIsim= hastalik.ayaktaDoktorSec();

        ciltHastaIsimList.add(hastaIsim);
        ciltHastaSoyisimList.add(hastaSoyisim);
        ciltHastaKimlikNoList.add(hastaKimlikNo);
        ciltHastaFiyatList.add(tedaviFiyat);
        ciltHastaIdList.add(id);//1001
        ciltHastaGirisTarih.add(time);


        System.out.println("Sayin "+hastaIsim.toUpperCase()+" "+hastaSoyisim.toUpperCase()+
                " Doktorunuz "+doktorIsim.toUpperCase()+" Gideceginiz Bolum "+doktorBrans.toUpperCase()+"" +
                "\n Gecmis Olsun");
        menu();

    }

    public static void ruhHastaliklari() {
        tedaviFiyat=200.00;
        RuhHastaliklari hastalik=new RuhHastaliklari();
        doktorBrans= hastalik.ayaktaBransSec();
        doktorIsim= hastalik.ayaktaDoktorSec();

        ruhHastaIsimList.add(hastaIsim);
        ruhHastaSoyisimList.add(hastaSoyisim);
        ruhHastaKimlikNoList.add(hastaKimlikNo);
        ruhHastaFiyatList.add(tedaviFiyat);
        ruhHastaIdList.add(id);
        ruhHastaGirisTarih.add(time);

        System.out.println("Sayin "+hastaIsim.toUpperCase()+" "+hastaSoyisim.toUpperCase()+
                " Doktorunuz "+doktorIsim.toUpperCase()+" Gideceginiz Bolum "+doktorBrans.toUpperCase()+"" +
                "\n Gecmis Olsun");
        menu();
    }


    public static void acilHastaliklari() {
        tedaviFiyat=500.00;
        AcilHastaliklar hastalik=new AcilHastaliklar();
        doktorBrans= hastalik.ayaktaBransSec();
        doktorIsim= hastalik.ayaktaDoktorSec();

        acilHastaIdList.add(id);
        acilHastaIsimList.add(hastaIsim);
        acilHastaSoyisimList.add(hastaSoyisim);
        acilHastaKimlikNoList.add(hastaKimlikNo);
        acilHastaFiyatList.add(tedaviFiyat);
        acilHastaGirisTarih.add(time);
        System.out.println(acilHastaIdList+" acilHastaid");

        System.out.println("Sayin "+hastaIsim.toUpperCase()+" "+hastaSoyisim.toUpperCase()+
                " Doktorunuz "+doktorIsim.toUpperCase()+" Gideceginiz Bolum "+doktorBrans.toUpperCase()+"" +
                "\n Gecmis Olsun");
        menu();
    }
    public static void cocukHastaliklari() {
        tedaviFiyat=1000.00;
        CocukHastaliklari hastalik=new CocukHastaliklari();
        doktorBrans= hastalik.ayaktaBransSec();
        doktorIsim= hastalik.ayaktaDoktorSec();

        cocukHastaIdList.add(id);
        cocukHastaIsimList.add(hastaIsim);
        cocukHastaSoyisimList.add(hastaSoyisim);
        cocukHastaKimlikNoList.add(hastaKimlikNo);
        cocukHastaFiyatList.add(tedaviFiyat);
        cocukHastaGirisTarih.add(time);

        System.out.println("Sayin "+hastaIsim.toUpperCase()+" "+hastaSoyisim.toUpperCase()+
                " Doktorunuz "+doktorIsim.toUpperCase()+" Gideceginiz Bolum "+doktorBrans.toUpperCase()+"" +
                "\n Gecmis Olsun");
        menu();
    }
}
