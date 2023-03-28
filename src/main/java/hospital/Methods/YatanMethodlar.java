package hospital.Methods;


import hospital.Depo;
import hospital.yatanHasta.GenelCerrahi;
import hospital.yatanHasta.IcHastaliklar;
import hospital.yatanHasta.KalpHastaliklari;
import hospital.yatanHasta.SinirHastaliklari;

import static hospital.Runner.menu;

public class YatanMethodlar extends Depo {
    public static void sinirHastaliklari() {
        tedaviFiyat=1500.0;
        SinirHastaliklari hastalik=new SinirHastaliklari();
        doktorBrans= hastalik.yatanBransSec();
        doktorIsim= hastalik.yatanDoktorSec();

        sinirHastalikHastaIsimList.add(hastaIsim);
        sinirHastalikHastaSoyisimList.add(hastaSoyisim);
        sinirHastalikIdList.add(id);
        sinirHastalikHastaKimlikNoList.add(hastaKimlikNo);
        sinirHastalikHastaFiyatList.add(tedaviFiyat);
        sinirHastalikHastaGirisTarih.add(time);


        System.out.println("Sayin "+hastaIsim.toUpperCase()+" "+hastaSoyisim.toUpperCase()+
                " Doktorunuz "+doktorIsim.toUpperCase()+" Gideceginiz Bolum "+doktorBrans.toUpperCase()+"" +
                "\n Gecmis Olsun");
        menu();

    }
    public static void icHastaliklari() {
        tedaviFiyat= 2000.0;
        IcHastaliklar hastalik=new IcHastaliklar();
        doktorBrans= hastalik.yatanBransSec();
        doktorIsim= hastalik.yatanDoktorSec();

        icHastalikHastaIsimList.add(hastaIsim);
        icHastalikHastaSoyisimList.add(hastaSoyisim);
        icHastalikIdList.add(id);
        icHastalikHastaKimlikNoList.add(hastaKimlikNo);
        icHastalikHastaFiyatList.add(tedaviFiyat);
        icHastalikHastaGirisTarih.add(time);

        System.out.println("Sayin "+hastaIsim.toUpperCase()+" "+hastaSoyisim.toUpperCase()+
                " Doktorunuz "+doktorIsim.toUpperCase()+" Gideceginiz Bolum "+doktorBrans.toUpperCase()+"" +
                "\n Gecmis Olsun");
        menu();
    }


    public static void genelCerrahi() {
        tedaviFiyat=3000.0;
        GenelCerrahi hastalik=new GenelCerrahi();
        doktorBrans= hastalik.yatanBransSec();
        doktorIsim= hastalik.yatanDoktorSec();

        genelCerrahHastaIsimList.add(hastaIsim);
        genelCerrahHastaSoyisimList.add(hastaSoyisim);
        genelCerrahHastaIdList.add(id);
        genelCerrahHastaFiyatList.add(tedaviFiyat);
        genelCerrahHastaKimlikNoList.add(hastaKimlikNo);
        genelCerrahHastaGirisTarih.add(time);

        System.out.println("Sayin "+hastaIsim.toUpperCase()+" "+hastaSoyisim.toUpperCase()+
                " Doktorunuz "+doktorIsim.toUpperCase()+" Gideceginiz Bolum "+doktorBrans.toUpperCase()+"" +
                "\n Gecmis Olsun");
        menu();
    }
    public static void kalpHastaliklari() {
        tedaviFiyat=5000.0;
        KalpHastaliklari hastalik=new KalpHastaliklari();
        doktorBrans= hastalik.yatanBransSec();
        doktorIsim= hastalik.yatanDoktorSec();

        kalpHastalikHastaIsimList.add(hastaIsim);
        kalpHastalikHastaSoyisimList.add(hastaSoyisim);
        kalpHastalikHastaKimlikNoList.add(hastaKimlikNo);
        kalpHastalikHastaFiyatList.add(tedaviFiyat);
        kalpHastalikIdList.add(id);
        kalpHastalikHastaGirisTarih.add(time);

        System.out.println("Sayin "+hastaIsim.toUpperCase()+" "+hastaSoyisim.toUpperCase()+
                " Doktorunuz "+doktorIsim.toUpperCase()+" Gideceginiz Bolum "+doktorBrans.toUpperCase()+"" +
                "\n Gecmis Olsun");
        menu();
    }

}
