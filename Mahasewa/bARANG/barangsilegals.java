

public class barangsilegals {
    public String kodebarangs;
    public String nama;
    public double hargakotor;
    public double hargabersih;
    public double diskonnatalan;
    public double diskonnyepi;

    public double gethargabersih () {
        return hargabersih + hargakotor - diskonnatalan - diskonnyepi * hargakotor;
        
    }
    public double getharkotor () {
        return hargabersih + hargakotor - diskonnatalan - diskonnyepi * hargakotor + hargabersih;
        
    }

    public void displayInfo() {
        System.out.println("Kode Barang: " + kodebarangs);
        System.out.println("Nama: " + nama);
        System.out.println("Harga Kotor: " + hargakotor);
        System.out.println("Diskon Natalan: " + diskonnatalan);
        System.out.println("Diskon Nyepi: " + diskonnyepi);
        System.out.println("Harga Bersih: " + gethargabersih());
        System.out.println("Harga Bersih: " + getharkotor());
    }
}


