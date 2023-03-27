package practice.hospital.ayaktaHasta;

import java.util.List;

public interface AyaktaHastaliklar {
    List<String>ayaktaHastaliklar =List.of(
            "1- Cilt Hastaliklari",
            "2- Acil Hastaliklar",
            "3- Cocuk Hastaliklari",
            "4- Ruh Hastaliklarii");

    List<String> ayaktaDoktorBransi = List.of(
            "Dermatolog" ,
            "Acil Doktoru",
            "Pediatri" ,
            "Psikiyatri");
    List<String> ayaktaDoktorIsimleri=List.of("Bahadir", "Fazil", "Hakan", "Cemal");

    String ayaktaDoktorSec();
    String ayaktaBransSec();


}
