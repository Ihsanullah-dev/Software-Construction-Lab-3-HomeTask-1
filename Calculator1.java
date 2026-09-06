package Calculator1;

public class Calculator1 {
    public int power(int base, int exp) {
        return (int) Math.pow(base, exp);
    }

    public int modulus(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Cannot divide by zero");

        return a % b;
    }
}
