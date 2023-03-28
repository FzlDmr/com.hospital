package hospital.yatanHasta;


import hospital.Depo;

public class SinirHastaliklari extends Depo implements YatanHastaliklar {


    @Override
    public String yatanDoktorSec() {
        return doktorIsim=yatanDoktorIsimleri.get(3);

    }

    @Override
    public String yatanBransSec() {
        return doktorBrans=yatanDoktorBransi.get(3);

    }

    public SinirHastaliklari() {
    }
    public SinirHastaliklari(String doktorBransi, String doktorAdi){
        this.yatanDoktorSec();
        this.yatanBransSec();
    }

}
