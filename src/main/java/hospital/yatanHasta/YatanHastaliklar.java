package hospital.yatanHasta;

import java.util.List;

public interface YatanHastaliklar {

    List<String> yatanHastaliklar = List.of(
            "1- Genel Cerrahi",
             "2- Ic Hastaliklar",
            "3- Kalp Hastaliklar",
            "4- Sinir Hastaliklari");

    List<String> yatanDoktorBransi = List.of(
            "Genel Cerrah",
            "Dahiliye",
            "Kardiolog",
            "Norolog");
    List<String> yatanDoktorIsimleri=List.of("Huseyin", "Mustafa", "Musab", "Sezgin");

    String yatanDoktorSec();
    String yatanBransSec();


}
