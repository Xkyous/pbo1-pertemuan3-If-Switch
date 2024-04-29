import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan pilihan (1 untuk percabangan if, 2 untuk percabangan switch): ");
        int pilihan = input.nextInt();
        
        if (pilihan == 1) {
            System.out.println("Anda memilih percabangan if.");
            System.out.println("Masukkan nilai: ");
            int nilai = input.nextInt();
            
            if (nilai >= 70) {
                System.out.println("Anda lulus.");
            } else {
                System.out.println("Anda tidak lulus.");
            }
        } else if (pilihan == 2) {
            System.out.println("Anda memilih percabangan switch.");
            System.out.println("Masukkan sebuah huruf: ");
            char huruf = input.next().charAt(0);
            
            switch (huruf) {
                case 'A':
                case 'a':
                    System.out.println("Excellent!");
                    break;
                case 'B':
                case 'b':
                    System.out.println("Good job!");
                    break;
                case 'C':
                case 'c':
                    System.out.println("Well done!");
                    break;
                case 'D':
                case 'd':
                    System.out.println("You passed!");
                    break;
                case 'F':
                case 'f':
                    System.out.println("Better try again!");
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        
        input.close();
    }
}