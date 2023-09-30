public class Main {
    public static void main(String[] args) {
        final int[] array = {1, 2, 3, 4, 5};
        array[0] = 99; //!!

        for (int e : array) {
            System.out.println(e);
        }

        final int number = 3;
        //number = 5; //!!
    }
}