

// /**
//  * mahasiswa
//  */
// public class mahasiswa {

//     public string nim;
//     public string nama;
//     public string alamat;
//     public string nomorBBM;
//     // public string nim;

// }

public class mahasiswa {
    public String nim;
    public String nama;
    public String alamat;
    public String kelas;
    public String NamaIg;
    public String NamaTwitter;
    public String NamaBokap;
    public String NamaNyokap;
    public String NamaAkong;
    public String NamaPekerjaan;
    public int NomorKendaraan;

    public void displayBiodata() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nama Instagram: " + NamaIg);
        System.out.println("Nama Twitter: " + NamaTwitter);
        System.out.println("Nama Ayah: " + NamaBokap);
        System.out.println("Nama Ibu: " + NamaNyokap);
        System.out.println("Nama Kakek: " + NamaAkong);
        System.out.println("Pekerjaan: " + NamaPekerjaan);
        System.out.println("Nomor Kendaraan: " + NomorKendaraan);
    }

    public void println() {
        System.out.println("=========");
        System.out.println("QUOTE OF THE DAY APA LOO");
    }
}

// public class MahasiswaDemo {
//     public static void main(String[] args) {
//         Mahasiswa m1 = new Mahasiswa();
//         m1.nim = "023432";
//         m1.nama = "Yansy Ayuningtyas";
//         m1.alamat = "Nias, Sumatera Utara";
//         m1.kelas = "2A";

//         m1.displayBiodata();
//     }
// }
