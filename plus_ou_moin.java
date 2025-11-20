import java.util.Random;
import java.util.Scanner;

public class plus_ou_moin {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; 

        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;

        System.out.println("Bienvenue à 'Plus ou Moins'! Essayez de deviner le nombre entre 1 et 100.");
        while (userGuess != numberToGuess) {
            System.out.print("Entrez votre choix: ");
            userGuess = scanner.nextInt();
            
            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Veuillez entrer un nombre valide entre 1 et 100.");
                continue;
            }

            if (userGuess < numberToGuess) {
                System.out.println("Plus!");
            } 

            else if (userGuess > numberToGuess) {
                System.out.println("Moins!");
            } 

            else {
                System.out.println("Félicitations! Vous avez deviné le nombre " + numberToGuess + "!");
            }
        }
        scanner.close();
    }
}
