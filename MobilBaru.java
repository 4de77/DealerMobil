public class MobilBaru extends Mobil {
    private int garansiTahun;

    public MobilBaru(String merk, String model, double harga, int garansiTahun) {
        super(merk, model, harga);
        this.garansiTahun = garansiTahun;
    }

    public int getGaransiTahun() {
        return garansiTahun;
    }

    public void setGaransiTahun(int garansiTahun) {
        this.garansiTahun = garansiTahun;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Garansi: " + garansiTahun + " tahun");
    }
}
