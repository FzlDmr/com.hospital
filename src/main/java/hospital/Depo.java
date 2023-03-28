package hospital;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Depo {

    public static String hastaIsim;
    public static String hastaSoyisim;
    public static String hastaKimlikNo;
    public static String ayaktaHastalikSecim;
    public static String yatanHastalikSecim;
    public static String doktorIsim;
    public static String doktorBrans;
    public static String tedaviTuruSecim;
    public static Double tedaviFiyat;
    public static Random rnd=new Random(1000);
    public static int id ;
    public static String menuSecim;
    public static int idIndex;
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm") ;
    public static LocalDateTime ldTime=LocalDateTime.now();
    public static String time=ldTime.format(formatter);


    public static List<Integer> hastaIdList = new ArrayList<>();
    public static List<String> hastaIsimList = new ArrayList<>();
    public static List<String> hastaSoyisimList = new ArrayList<>();
    public static List<String> hastaKimlikNoList = new ArrayList<>();
    public static List<String> hastaGirisTarih = new ArrayList<>();
    public static List<String> hastaTaburcuTarih = new ArrayList<>();



    ////////////////////////////////////////////////////////////////
    public static List<Integer> ciltHastaIdList = new ArrayList<>();
    public static List<String> ciltHastaIsimList = new ArrayList<>();
    public static List<String> ciltHastaSoyisimList = new ArrayList<>();
    public static List<String> ciltHastaKimlikNoList = new ArrayList<>();
    public static List<Object> ciltHastaFiyatList = new ArrayList<>();
    public static List<String> ciltHastaGirisTarih = new ArrayList<>();
    public static List<String> ciltHastaTaburcuTarih = new ArrayList<>();


    ////////////////////////////////////////////////////////////////
    public static List<Integer> acilHastaIdList = new ArrayList<>();
    public static List<String> acilHastaIsimList = new ArrayList<>();
    public static List<String> acilHastaSoyisimList = new ArrayList<>();
    public static List<String> acilHastaKimlikNoList = new ArrayList<>();
    public static List<Object> acilHastaFiyatList = new ArrayList<>();
    public static List<String> acilHastaGirisTarih = new ArrayList<>();
    public static List<String> acilHastaTaburcuTarih = new ArrayList<>();

    ////////////////////////////////////////////////////////////////
    public static List<Integer> cocukHastaIdList = new ArrayList<>();
    public static List<String> cocukHastaIsimList = new ArrayList<>();
    public static List<String> cocukHastaSoyisimList = new ArrayList<>();
    public static List<String> cocukHastaKimlikNoList = new ArrayList<>();
    public static List<Object> cocukHastaFiyatList = new ArrayList<>();
    public static List<String> cocukHastaGirisTarih = new ArrayList<>();
    public static List<String> cocukHastaTaburcuTarih = new ArrayList<>();

    ////////////////////////////////////////////////////////////////
    public static List<Integer> ruhHastaIdList = new ArrayList<>();
    public static List<String> ruhHastaIsimList = new ArrayList<>();
    public static List<String> ruhHastaSoyisimList = new ArrayList<>();
    public static List<String> ruhHastaKimlikNoList = new ArrayList<>();
    public static List<Object> ruhHastaFiyatList = new ArrayList<>();
    public static List<String> ruhHastaGirisTarih = new ArrayList<>();
    public static List<String> ruhHastaTaburcuTarih = new ArrayList<>();

    ////////////////////////////////////////////////////////////////
    public static List<Integer> genelCerrahHastaIdList = new ArrayList<>();
    public static List<String> genelCerrahHastaIsimList = new ArrayList<>();
    public static List<String> genelCerrahHastaSoyisimList = new ArrayList<>();
    public static List<String> genelCerrahHastaKimlikNoList = new ArrayList<>();
    public static List<Object> genelCerrahHastaFiyatList = new ArrayList<>();
    public static List<String>genelCerrahHastaGirisTarih = new ArrayList<>();
    public static List<String> genelCerrahHastaTaburcuTarih = new ArrayList<>();

    ////////////////////////////////////////////////////////////////
    public static List<Integer> icHastalikIdList = new ArrayList<>();
    public static List<String> icHastalikHastaIsimList = new ArrayList<>();
    public static List<String> icHastalikHastaSoyisimList = new ArrayList<>();
    public static List<String> icHastalikHastaKimlikNoList = new ArrayList<>();
    public static List<Object> icHastalikHastaFiyatList = new ArrayList<>();
    public static List<String> icHastalikHastaGirisTarih = new ArrayList<>();
    public static List<String> icHastalikHastaTaburcuTarih = new ArrayList<>();

    ////////////////////////////////////////////////////////////////
    public static List<Integer> kalpHastalikIdList = new ArrayList<>();
    public static List<String> kalpHastalikHastaIsimList = new ArrayList<>();
    public static List<String> kalpHastalikHastaSoyisimList = new ArrayList<>();
    public static List<String> kalpHastalikHastaKimlikNoList = new ArrayList<>();
    public static List<Object> kalpHastalikHastaFiyatList = new ArrayList<>();
    public static List<String> kalpHastalikHastaGirisTarih = new ArrayList<>();
    public static List<String> kalpHastalikHastaTaburcuTarih = new ArrayList<>();



    ////////////////////////////////////////////////////////////////
    public static List<Integer> sinirHastalikIdList = new ArrayList<>();
    public static List<String> sinirHastalikHastaIsimList = new ArrayList<>();
    public static List<String> sinirHastalikHastaSoyisimList = new ArrayList<>();
    public static List<String> sinirHastalikHastaKimlikNoList = new ArrayList<>();
    public static List<Object> sinirHastalikHastaFiyatList = new ArrayList<>();
    public static List<String> sinirHastalikHastaGirisTarih = new ArrayList<>();
    public static List<String> sinirHastalikHastaTaburcuTarih = new ArrayList<>();

}
