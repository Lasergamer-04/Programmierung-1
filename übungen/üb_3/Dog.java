package üb_3;
public class Dog {
    String name;
    String breed;
    int age;

    void bark() {
        System.out.println(name + " barks:" + " Woof!".repeat(age));
    }

    void info() {
        System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age);
    }
}