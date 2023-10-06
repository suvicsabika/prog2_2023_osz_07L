import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5); //Immutable!!!
        // numbers.add(6); //Exception in thread "main" java.lang.UnsupportedOperationException
        // System.out.println(numbers);

        List<Integer> moreNumbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        moreNumbers.add(6);
        System.out.println(moreNumbers);
    }    
}
