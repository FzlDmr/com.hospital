package practice.hospital.yatanHasta;

import practice.hospital.Depo;
import practice.hospital.ayaktaHasta.AyaktaHastaliklar;

public class KalpHastaliklari extends Depo implements YatanHastaliklar {


    @Override
    public String yatanDoktorSec() {
        return doktorIsim=yatanDoktorIsimleri.get(2);

    }

    @Override
    public String yatanBransSec() {
        return doktorBrans=yatanDoktorBransi.get(2);

    }

    public KalpHastaliklari() {
    }
    public KalpHastaliklari(String doktorBransi, String doktorAdi){
        this.yatanBransSec();
        this.yatanDoktorSec();
    }

}
