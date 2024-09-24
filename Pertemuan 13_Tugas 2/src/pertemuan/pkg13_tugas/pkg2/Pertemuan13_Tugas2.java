package pertemuan.pkg13_tugas.pkg2;

public class Pertemuan13_Tugas2 {
    public static class Segitiga {
        private double alas;
        private double tinggi;
        private double luas;
        
        public Segitiga(double alas, double tinggi) {
            this.alas = alas;
            this.tinggi = tinggi;
            this.luas = hitungLuas();
        }
        
        private double hitungLuas() {
            return(alas * tinggi) / 2;
        }
        public double getAlas() {
            return alas;
        }
        public double getTinggi() {
            return tinggi;
        }
        public double getLuas() {
            return luas;
        }
    }
    
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(10, 5);
        
        System.out.println("Alas: " + segitiga.getAlas());
        System.out.println("Tinggi: " + segitiga.getTinggi());
        System.out.println("Luas: " + segitiga.getLuas());
    }
}
