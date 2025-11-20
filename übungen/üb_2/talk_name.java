package üb_2;
import java.util.Scanner;

public class talk_name{
    public static void main(String[] args) {
        int count = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        if(name == null || name.trim().isEmpty()){
            System.out.print("give me your name please");
            scanner.close();
            return;
        }
        scanner.close();
        while(count >= 1){
          System.out.println("Hello, " + name + "!");
          count -= 1;
        }
    }
}
