import java.util.Scanner;


    public class Zad8{

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int wiek;
        System.out.println("ile masz lat?: ");
        wiek = klawiatura.nextInt();
        klawiatura.nextLine();


        System.out.println("ile chcesz zarabiac?: ");
        double zarobek = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Jak sie nazywasz?: ");
        String nazwa = klawiatura.nextLine();




        System.out.println("Nazwywam się " + nazwa + ",mam " + wiek + " lat" + ", chce zarabiac " + zarobek + "złotych rocznie");
    }





}
