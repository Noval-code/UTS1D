import java.util.Scanner;

public class jawabanNomor3 {
    static int JumlahPlat = 5;// jumlah plat
    public static String[] Kudus = new String[1];//jumlah array area kudus
    public static String[] Jakarta = new String[1];//jumlah array area jakarta
    public static String[] Jogja = new String[1];//jumlah array area Jogja
    public static String[] Karawang = new String[1];// jumlah array area karawang
    public static String[] Solo = new String[1];// jumlah array area solo


    public static void PrintInfoPlat(){
        int sisaKuotaPlat = 0;
        int totalPlatKudus = 0;
        for (int index=0;index<Kudus.length;index++){
            if (Kudus[index] != null){
                totalPlatKudus++;
            }
        }
        int totalPlatJakarta = 0;
        for (int index=0;index<Jakarta.length;index++){
            if (Jakarta[index] != null){
                totalPlatJakarta++;
            }
        }
        int totalPlatJogja = 0;
        for (int index=0;index<Jogja.length;index++){
            if (Jogja[index] != null){
                totalPlatJogja++;
            }
        }

        int totalPlatKarawang = 0;
        for (int index=0;index<Karawang.length;index++) {
            if (Karawang[index] != null) {
                totalPlatKarawang++;
            }
        }
        int totalPlatSolo = 0;
        for (int index=0;index<Solo.length;index++) {
            if (Karawang[index] != null) {
                totalPlatSolo++;
            }
        }

        sisaKuotaPlat = JumlahPlat - totalPlatKudus - totalPlatJakarta - totalPlatJogja - totalPlatKarawang - totalPlatSolo;
        System.out.println("Total Plat Kudus : " + totalPlatKudus + " | " + " Total Plat jakarta : " + totalPlatJakarta + " | Total Plat Jogja : " + totalPlatJogja +
                " | Total Plat Karawang : " + totalPlatKarawang + " | Total Plat Solo : " + totalPlatSolo);
        System.out.println("jumlah penerima vaksin : " + JumlahPlat + "Sisa kuota " + sisaKuotaPlat);

    }
    public static void checkIndexArray(String[] myArray, String plat){
        int indexNow=0;
        for (int index=0;index<myArray.length;index++){
            if (myArray[index] != null){
                indexNow = index+1;
            }
        }if (indexNow < myArray.length){
            myArray[indexNow] = plat;
        }
    }

    public static void cekPlat(String kodePlat){
        if (kodePlat.contains("K")) {
            checkIndexArray(Kudus,kodePlat);
            PrintInfoPlat();
        } else if (kodePlat.contains("B")) {
            checkIndexArray(Jakarta,kodePlat);
            PrintInfoPlat();
        } else if (kodePlat.contains("AB")) {
            checkIndexArray(Jogja,kodePlat);
            PrintInfoPlat();
        } else if (kodePlat.contains("T")) {
            checkIndexArray(Karawang,kodePlat);
            PrintInfoPlat();
        } else if (kodePlat.contains("AD")) {
            checkIndexArray(Solo,kodePlat);
            PrintInfoPlat();
        }
        else {
            System.out.println("plat yang anda isi tidak valid");
        }
    }
    public static void ganjilGenap(int angka){
        if (angka%2==0){
            int genap = 0;
            System.out.println("plat merupakan bilangan genap");
            genap++;
            System.out.println("jumlah plat genap " + genap);
        }else {
            int ganjil = 0;
            System.out.println("plat merupakan bilangan ganjil");
            ganjil++;
            System.out.println("jumlah plat ganjil " + ganjil);
        }
    }
    public static void inputPasien (){

        while (true){
            Scanner inputData = new Scanner(System.in);
            System.out.println("masukkan plat nomor anda : ");
            String platNomor = inputData.next();
            cekPlat(platNomor);
            int cekNomor = Integer.parseInt(platNomor);
            ganjilGenap(cekNomor);


        }
    }

    public static void main(String[] args) {

        inputPasien();
    }
}
