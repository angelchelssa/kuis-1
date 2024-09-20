
import java.util.Scanner;

public class PembagianBeras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan jumlah bantuan beras dari pemerinitah (kuintal): ");
            long berasKuintal = scanner.nextLong();

            long berasKg = berasKuintal * 100;

            System.out.print("Masukkan jumlah KK: ");
            short jumlahKK = scanner.nextShort();

            long berasPerKK = berasKg / jumlahKK;

            System.out.println("Setiap KK mendapatkan " + berasPerKK + " kg beras.");

        }

    }
