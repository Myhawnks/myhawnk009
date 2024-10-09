package pertemuan.pkg14_tugas.pkg2;

public class Pertemuan14_Tugas2 {
    public static void main(String[] args) {
        abstract class AbstrakHewan {
            public abstract void suara();
            public void suara2() {
                System.out.println("Ini method konkrit dari parent class");
            }
        }
        
        class Kucing extends AbstrakHewan {
            @Override
            public void suara() {
                System.out.println("Kucing bersuara: Meow");
            }
        }
        
        class Anjing extends AbstrakHewan {
            @Override
            public void suara() {
                System.out.println("Anjing bersuara: Guk Guk");
            }
        }

        class Burung extends AbstrakHewan {
            @Override
            public void suara() {
                System.out.println("Burung bersuara: Kicau");
            }
        }

        AbstrakHewan kucing = new Kucing();
        kucing.suara();
        kucing.suara2();
        
        AbstrakHewan anjing = new Anjing();
        anjing.suara();
        anjing.suara2();

        AbstrakHewan burung = new Burung();
        burung.suara();
        burung.suara2();
    }
}
