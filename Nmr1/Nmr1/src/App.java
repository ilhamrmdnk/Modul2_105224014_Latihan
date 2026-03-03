import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Panjang Ruangan: ");
        double panjang = input.nextDouble();

        System.out.println("Masukan Lebar Ruangan: ");
        double lebar = input.nextDouble();

        System.out.println("Masukan Tinggi Ruangan: ");
        double tinggi = input.nextDouble();

        double luas = 2 * (panjang*tinggi) + 2 * (lebar * tinggi);

        double liter = Math.ceil(luas/10); //pembulatan ke atas
        
        System.out.println("Luas Permukaan Dinding: " + luas + " meter persegi" );
        System.out.println("Kebutuhan Cat: " + liter + " Liter");

    }
}
