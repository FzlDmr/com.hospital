package practice.hospital.yatanHasta;

import practice.hospital.Depo;
import practice.hospital.ayaktaHasta.AyaktaHastaliklar;

public class IcHastaliklar extends Depo implements YatanHastaliklar {


    @Override
    public String yatanDoktorSec() {
        return doktorIsim=yatanDoktorIsimleri.get(1);

    }

    @Override
    public String yatanBransSec() {
        return doktorBrans=yatanDoktorBransi.get(1);

    }

    public IcHastaliklar() {
    }
    public IcHastaliklar(String doktorBransi, String doktorAdi){
        this.yatanBransSec();
        this.yatanDoktorSec();
    }

}
