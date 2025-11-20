package Dividierer;

public class dividierer {

    private int dividend;
    private int divisor = 1; // Initialisierung mit 1, um Division durch Null zu vermeiden

    public int getDividend() {
        return dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDividend(int d) {
        dividend = d;
    }

    public void setDivisor(int d) {
        if (d == 0) {
            throw new IllegalArgumentException("Divisor darf nicht 0 sein.");
        }
        divisor = d;
    }

    public int divide() {
        return dividend / divisor;
    }
}
