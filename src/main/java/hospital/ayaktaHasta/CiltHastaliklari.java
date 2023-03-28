package hospital.ayaktaHasta;


import hospital.Depo;

public class CiltHastaliklari extends Depo implements AyaktaHastaliklar{


    @Override
    public String ayaktaDoktorSec() {
        return doktorIsim=ayaktaDoktorIsimleri.get(0);

    }

    @Override
    public String ayaktaBransSec() {
        return doktorBrans=ayaktaDoktorBransi.get(0);

    }

    public CiltHastaliklari() {
    }
    public CiltHastaliklari(String doktorBransi,String doktorAdi){
        this.ayaktaBransSec();
        this.ayaktaDoktorSec();
    }

}
