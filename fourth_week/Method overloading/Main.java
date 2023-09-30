class Try {
    public int add(int a, int b) {
        System.out.println("# v1, int");

        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("# v2, double");

        return a + b;
    }
    
    public int add(int a, int b, int c) {
        System.out.println("# v3, int - 3 parameters");

        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Try t = new Try();

        System.out.println(t.add(2, 3));
        System.out.println(t.add(2.2, 3.3));
        System.out.println(t.add(1, 2, 3));
    }
}