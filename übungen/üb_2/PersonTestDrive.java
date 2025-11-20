package üb_2;

import java.util.Scanner;

public class PersonTestDrive {
        public static void main(String[] args) {
        person p = new person("John", 30);
        p.getName();
        p.getAge();

        student s = new student("Anna", 20, "Informatik", "374GE");
        s.greet();
        s.giveID();

        professor prof = new professor("Dr. Smith", 45, "Mathematik");
        prof.teach();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Namen ein: ");
        String name = scanner.nextLine();
        System.out.print("Geben Sie das Alter ein: ");
        int age = scanner.nextInt();
        scanner.close();
        person test = new person(name, age);
        test.getName();
        test.getAge();
    }
}

