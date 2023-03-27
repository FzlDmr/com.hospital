package practice.hospital.ayaktaHasta;

import practice.hospital.Depo;


import static practice.hospital.Runner.menu;

public class AyaktaMethodlar extends Depo  {
    public static void ciltHastaliklari() {
        tedaviFiyat=100.00;
        CiltHastaliklari hastalik=new CiltHastaliklari();
        doktorBrans= hastalik.ayaktaBransSec();
        doktorIsim= hastalik.ayaktaDoktorSec();

        ciltHastaIsimList.add(hastaIsim);
        ciltHastaSoyisimList.add(hastaSoyisim);
        ciltHastaKimlikNoList.add(hastaKimlikNo);
        ciltHastaFiyatList.add(tedaviFiyat);
        ciltHastaIdList.add(id);

        System.out.println("Sayin "+hastaIsim.toUpperCase()+" "+hastaSoyisim.toUpperCase()+
                " Doktorunuz "+doktorIsim.toUpperCase()+" Gideceginiz Bolum "+doktorBrans.toUpperCase()+"" +
                "\n Gecmis Olsun");
        menu();

    }

    public static void ruhHastaliklari() {
        RuhHastaliklari hastalik=new RuhHastaliklari();
        doktorBrans= hastalik.ayaktaBransSec();
        doktorIsim= hastalik.ayaktaDoktorSec();

        System.out.println("Sayin "+hastaIsim.toUpperCase()+" "+hastaSoyisim.toUpperCase()+
                " Doktorunuz "+doktorIsim.toUpperCase()+" Gideceginiz Bolum "+doktorBrans.toUpperCase()+"" +
                "\n Gecmis Olsun");
        menu();
    }


    public static void acilHastaliklari() {
        AcilHastaliklar hastalik=new AcilHastaliklar();
        doktorBrans= hastalik.ayaktaBransSec();
        doktorIsim= hastalik.ayaktaDoktorSec();

        System.out.println("Sayin "+hastaIsim.toUpperCase()+" "+hastaSoyisim.toUpperCase()+
                " Doktorunuz "+doktorIsim.toUpperCase()+" Gideceginiz Bolum "+doktorBrans.toUpperCase()+"" +
                "\n Gecmis Olsun");
        menu();
    }
    public static void cocukHastaliklari() {
        CocukHastaliklari hastalik=new CocukHastaliklari();
        doktorBrans= hastalik.ayaktaBransSec();
        doktorIsim= hastalik.ayaktaDoktorSec();

        System.out.println("Sayin "+hastaIsim.toUpperCase()+" "+hastaSoyisim.toUpperCase()+
                " Doktorunuz "+doktorIsim.toUpperCase()+" Gideceginiz Bolum "+doktorBrans.toUpperCase()+"" +
                "\n Gecmis Olsun");
        menu();
    }
}
