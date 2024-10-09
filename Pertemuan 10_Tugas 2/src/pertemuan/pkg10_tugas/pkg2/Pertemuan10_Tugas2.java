package pertemuan.pkg10_tugas.pkg2;

public class Pertemuan10_Tugas2 {
    // Mendefinisikan variabel
    int a = 10;
    int b = 20;
    int c;

    // Constructor untuk menghitung nilai c
    public Pertemuan10_Tugas2() {
        c = a + b;
    }

    // Method untuk menampilkan hasil
    public void tampilkanHasil() {
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
        System.out.println("Nilai c (a + b): " + c);
    }

    // Method pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Method pembagian
    public int pembagian(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol.");
            return 0; // Mengembalikan 0 jika b adalah nol
        }
    }

    // Method pangkat
    public double pangkat(int a, int b) {
        return Math.pow(a, b);
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        Pertemuan10_Tugas2 aritmatika = new Pertemuan10_Tugas2();
        aritmatika.tampilkanHasil();

        // Contoh penggunaan method tambahan
        System.out.println("Pengurangan (20 - 10): " + aritmatika.pengurangan(20, 10));
        System.out.println("Perkalian (10 * 20): " + aritmatika.perkalian(10, 20));
        System.out.println("Pembagian (20 / 10): " + aritmatika.pembagian(20, 10));
        System.out.println("Pangkat (2^3): " + aritmatika.pangkat(2, 3));
    }
}
