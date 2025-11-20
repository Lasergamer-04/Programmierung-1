package Dividierer;

public class dividiererTestDrive {
    public static void main(String[] args) {
        dividierer div1 = new dividierer();
        div1.setDividend(10);
        div1.setDivisor(2);
        System.out.println("Result of division: " + div1.divide()); // Ausgabe: 5

        dividierer div2 = new dividierer(); // nur zum error test
        div2.setDivisor(0); // error
    }
}
