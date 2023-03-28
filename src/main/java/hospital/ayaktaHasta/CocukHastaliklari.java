package hospital.ayaktaHasta;


import hospital.Depo;

public class CocukHastaliklari extends Depo implements AyaktaHastaliklar  {


    @Override
    public String ayaktaDoktorSec() {
        return doktorIsim=ayaktaDoktorIsimleri.get(2);

    }

    @Override
    public String ayaktaBransSec() {
        return doktorBrans=ayaktaDoktorBransi.get(2);

    }

    public CocukHastaliklari() {
    }
    public CocukHastaliklari(String doktorBransi, String doktorAdi){
        this.ayaktaBransSec();
        this.ayaktaDoktorSec();
    }

}
