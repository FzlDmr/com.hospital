package practice.hospital.yatanHasta;

import practice.hospital.Depo;

import static practice.hospital.Runner.menu;

public class YatanMethodlar extends Depo {
    public static void sinirHastaliklari() {
        SinirHastaliklari hastalik=new SinirHastaliklari();
        doktorBrans= hastalik.yatanBransSec();
        doktorIsim= hastalik.yatanDoktorSec();

        System.out.println("Sayin "+hastaIsim.toUpperCase()+" "+hastaSoyisim.toUpperCase()+
                " Doktorunuz "+doktorIsim.toUpperCase()+" Gideceginiz Bolum "+doktorBrans.toUpperCase()+"" +
                "\n Gecmis Olsun");
        menu();

    }
    public static void icHastaliklari() {
        IcHastaliklar hastalik=new IcHastaliklar();
        doktorBrans= hastalik.yatanBransSec();
        doktorIsim= hastalik.yatanDoktorSec();

        System.out.println("Sayin "+hastaIsim.toUpperCase()+" "+hastaSoyisim.toUpperCase()+
                " Doktorunuz "+doktorIsim.toUpperCase()+" Gideceginiz Bolum "+doktorBrans.toUpperCase()+"" +
                "\n Gecmis Olsun");
        menu();
    }


    public static void genelCerrahi() {
        GenelCerrahi hastalik=new GenelCerrahi();
        doktorBrans= hastalik.yatanBransSec();
        doktorIsim= hastalik.yatanDoktorSec();

        System.out.println("Sayin "+hastaIsim.toUpperCase()+" "+hastaSoyisim.toUpperCase()+
                " Doktorunuz "+doktorIsim.toUpperCase()+" Gideceginiz Bolum "+doktorBrans.toUpperCase()+"" +
                "\n Gecmis Olsun");
        menu();
    }
    public static void kalpHastaliklari() {
        KalpHastaliklari hastalik=new KalpHastaliklari();
        doktorBrans= hastalik.yatanBransSec();
        doktorIsim= hastalik.yatanDoktorSec();

        System.out.println("Sayin "+hastaIsim.toUpperCase()+" "+hastaSoyisim.toUpperCase()+
                " Doktorunuz "+doktorIsim.toUpperCase()+" Gideceginiz Bolum "+doktorBrans.toUpperCase()+"" +
                "\n Gecmis Olsun");
        menu();
    }

}
