package hospital.ayaktaHasta;


import hospital.Depo;

public class AcilHastaliklar extends Depo implements AyaktaHastaliklar {


    @Override
    public String ayaktaDoktorSec() {
        return doktorIsim=ayaktaDoktorIsimleri.get(1);

    }

    @Override
    public String ayaktaBransSec() {
        return doktorBrans=ayaktaDoktorBransi.get(1);

    }

    public AcilHastaliklar() {
    }
    public AcilHastaliklar(String doktorBransi, String doktorAdi){
        this.ayaktaBransSec();
        this.ayaktaDoktorSec();
    }

}
