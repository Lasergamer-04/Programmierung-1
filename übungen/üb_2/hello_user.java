package üb_2;
import java.util.Scanner;

public class hello_user {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (age < 18) {
            System.out.println("Hello, " + name + "! nice to meet you.");
        } 
        else if (age >= 18 &&    age < 65) {
            System.out.println("Good day, " + name + "! How are you?");
        } 
        else {
            System.out.println("Hello mister " + name + "! respect to you.");
        }
        scanner.close();
    }
    
}
