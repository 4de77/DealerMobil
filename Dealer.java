import java.util.ArrayList;

public class Dealer {
    private ArrayList<Mobil> daftarMobil = new ArrayList<>();

    public void tambahMobil(Mobil mobil) {
        daftarMobil.add(mobil);
    }

    public void tampilSemuaMobil() {
        for (Mobil mobil : daftarMobil) {
            System.out.println("---- Info Mobil ----");
            mobil.tampilInfo();
            System.out.println();
        }
    }
}
