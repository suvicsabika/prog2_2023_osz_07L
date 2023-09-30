public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};

        int[] copyArray = array.clone();
        array[0] = 99;

        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
        
        for (int n : copyArray) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}