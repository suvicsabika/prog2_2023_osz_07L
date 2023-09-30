class PairIntInt {
    int min;
    int max;
}

public class Main {
    public static PairIntInt getMinMax2(int[] array) {
        PairIntInt values = new PairIntInt();
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        values.min = min;
        values.max = max;
        
        return values;
    }

    public static int[] getMinMax1(int array[]) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        int[] result = new int[] {min, max} ;

        return result;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] result = getMinMax1(array);
        System.out.println(result[0]);
        System.out.println(result[1]);

        PairIntInt result2 = getMinMax2(array);
        System.out.println(result2.min);
        System.out.println(result2.max);
    }
}