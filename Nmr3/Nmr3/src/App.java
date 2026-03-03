import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int hargaA = 25500;
        int hargaB = 14200;

        System.out.print("Jumlah Barang A: ");
        int jumlahA = input.nextInt();

        System.out.print("Jumlah Barang B: ");
        int jumlahB = input.nextInt();

        System.out.print("Uang dibayar: ");
        int uangBayar = input.nextInt();
        int total = (jumlahA * hargaA) + (jumlahB * hargaB);
        int totalDenganPPN = (int)(total * 1.11);
        int kembalian = uangBayar - totalDenganPPN;
        int lembar50 = kembalian / 50000;
        int sisa = kembalian % 50000;
        int lembar10 = sisa / 10000;

        System.out.println("Total belanja + PPN: Rp " + totalDenganPPN);
        System.out.println("Kembalian: Rp " + kembalian);
        System.out.println("Lembar 50.000: " + lembar50);
        System.out.println("Lembar 10.000: " + lembar10);
    }
}