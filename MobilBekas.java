public class MobilBekas extends Mobil {
    private int tahunProduksi;

    public MobilBekas(String merk, String model, double harga, int tahunProduksi) {
        super(merk, model, harga);
        this.tahunProduksi = tahunProduksi;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
}
