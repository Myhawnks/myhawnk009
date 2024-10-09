package pertemuan.pkg10_tugas.pkg1;

public class Pertemuan10_Tugas1 {
    // Mendefinisikan variabel
    int a = 10;
    int b = 20;
    int c;

    // Constructor untuk menghitung nilai c
    public Pertemuan10_Tugas1() { // Ganti Aritmatika dengan Pertemuan10_Tugas1
        c = a + b;
    }

    // Method untuk menampilkan hasil
    public void tampilkanHasil() {
        System.out.println("Bialngan 1 = " + a);
        System.out.println("Bialngan 2 = " + b);
        System.out.println("Hasil Pertambahan = " + c);
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        Pertemuan10_Tugas1 aritmatika = new Pertemuan10_Tugas1(); // Ganti Aritmatika dengan Pertemuan10_Tugas1
        aritmatika.tampilkanHasil();
    }
}
