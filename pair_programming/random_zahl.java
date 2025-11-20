import java.util.Random;
public class random_zahl {
    public static void main(String[] args) {
        Random rand = new Random();

        int zahl1 = rand.nextInt(11);
        System.out.println("Zahl 1: " + zahl1);
        int zahl2 = rand.nextInt(11);
        System.out.println("Zahl 2: " + zahl2);

        int result = zahl1 + zahl2;

        if (result <= 10){
        System.out.print(result + " ist kleiner als 10");
        } else{
        System.out.print(result + " ist grösser als 10");
        }
    }
}