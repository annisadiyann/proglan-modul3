import java.util.Scanner;

public class HitungVolumeTabung {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /**
         * memasukkan nilai jari-jari dan tinggi tabung
         */
        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = input.nextDouble();
        /**
         * menghitung volume tabung
         */
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
        /**
         * menampilkan hasil
         */
        System.out.println("Volume tabung adalah: " + volume);
        /**
         * menutup objek Scanner
         */
        input.close();
    }
}