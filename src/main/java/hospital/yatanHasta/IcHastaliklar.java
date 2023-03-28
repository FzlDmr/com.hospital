package hospital.yatanHasta;


import hospital.Depo;

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
