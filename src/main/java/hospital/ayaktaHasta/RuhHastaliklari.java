package hospital.ayaktaHasta;


import hospital.Depo;

public class RuhHastaliklari extends Depo implements AyaktaHastaliklar{


    @Override
    public String ayaktaDoktorSec() {
        return doktorIsim=ayaktaDoktorIsimleri.get(3);

    }

    @Override
    public String ayaktaBransSec() {
        return doktorBrans=ayaktaDoktorBransi.get(3);

    }

    public RuhHastaliklari() {
    }
    public RuhHastaliklari(String doktorBransi, String doktorAdi){
        this.ayaktaBransSec();
        this.ayaktaDoktorSec();
    }

}
