package üb_3;

public class DogTestDrive {
        public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Blanche";
        dog1.breed = "Labrador";
        dog1.age = 3;

        dog1.bark();

        Dog dog2 = dog1; // dog2 verweist auf dasselbe Objekt wie dog1
        dog2.name = "Solo"; // beide hunde von Buddy auf Max
        dog2.bark();
        dog1.breed = "Husky"; // egal wen man ändert es ändert 1 & 2
        dog1.info();
        dog2.info();

        Dog dog3 = new Dog();
        dog3.name = "Maya";
        dog3.breed = "Berger d'anatolie";
        dog3.age = 2;

        Dog dog4 = new Dog();
        dog4.name = "Baloo";
        dog4.breed = "Mischling";
        dog4.age = 4;

        Dog nullDog = new Dog();
        nullDog.info(); // Ausgabe der Standardwerte


        Dog [] dogs = new Dog[4];
        dogs[0] = dog1; // zeigt auf dasselbe Objekt wie dog2
        dogs[1] = dog2; // zeigt auf dasselbe Objekt wie dog1
        dogs[2] = dog3;
        dogs[3] = dog4;
        while (dogs != null) {
            for (int i = 0; i < dogs.length; i++) {
                dogs[i].info();
            }
            break;
        }
        
        dogs[2].age = 7; // Ändert das Alter von dog3
        dogs[3].name = "Chips"; // Ändert den Namen von dog4
        dogs[3].breed = "staffordshire terrier"; // Ändert die Rasse von dog4
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].info();
        }

    }
}
