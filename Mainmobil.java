import java.util.Scanner;

public class Mainmobil {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        Mobil m1 = new Mobil();
        System.out.println("Apa merek mobilmu ");
        String manufaktur = io.nextLine();
        m1.setManufaktur(manufaktur);
        System.out.println("nomor platnya ");
        String noPlat = io.nextLine();
        m1.setNoPlat(noPlat);
        System.out.println("warna mobilnya ");
        String Warna = io.nextLine();
        m1.setWarna(Warna);
        System.out.println("berapa kecepatannya ");
        int kecepatan = io.nextInt();
        m1.setKecepatan(kecepatan);
        System.out.println("berapa waktunya");
        double waktu = io.nextDouble();
        m1.setWaktu(waktu);
        m1.displayMessage();
        System.out.println("================");

        Mobil m2 = new Mobil();
        System.out.println("Apa merek mobilmu ");
        String manufaktur2 = io.nextLine();
        m2.setManufaktur(manufaktur2);
        System.out.println("nomor platnya ");
        String noPlat2 = io.nextLine();
        m2.setNoPlat(noPlat2);
        System.out.println("warna mobilnya ");
        String Warna2 = io.nextLine();
        m2.setWarna(Warna2);
        System.out.println("berapa kecepatannya ");
        int kecepatan2 = io.nextInt();
        m2.setKecepatan(kecepatan2);
        System.out.println("berapa waktunya");
        double waktu2 = io.nextDouble();
        m2.setWaktu(waktu2);
        m2.displayMessage();
        System.out.println("================");
        io.close();
    }
}
