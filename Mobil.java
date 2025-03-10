public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setManufaktur(String manufaktur) {
        this.manufaktur = manufaktur;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void setWaktu(double waktu) {
        this.waktu = waktu;
    }

    private double rubahSekon(double sekon) {
        return sekon * 3600;
    }

    private double rubahKecepatan(double cepat) {
        return cepat * (1000.0 / 3600.0);
    }

    public double hitungJarak() {
        return kecepatan * waktu;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan);

        double ubah = rubahKecepatan(kecepatan);
        System.out.println("berubah dengan kecepatan " + ubah);
        System.out.println("dalam  waktu " + waktu);
        double detik = rubahSekon(waktu);
        System.out.println("dengan detik " + detik);
        double jarak = hitungJarak();
        System.out.println("sedangkan jarak yang  ditempuh " + jarak);
    } 
}
