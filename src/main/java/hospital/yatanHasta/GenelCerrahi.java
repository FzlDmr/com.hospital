package practice.hospital.yatanHasta;

import practice.hospital.Depo;

public class GenelCerrahi extends Depo implements YatanHastaliklar {


    @Override
    public String yatanDoktorSec() {
        return doktorIsim=yatanDoktorIsimleri.get(0);

    }

    @Override
    public String yatanBransSec() {
        return doktorBrans=yatanDoktorBransi.get(0);

    }

    public GenelCerrahi() {
    }
    public GenelCerrahi(String doktorBransi, String doktorAdi){
        this.yatanBransSec();
        this.yatanDoktorSec();
    }

}
