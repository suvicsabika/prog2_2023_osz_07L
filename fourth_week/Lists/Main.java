import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);
        
        for (int n : numbers) {
            System.out.println(n);
        }

        System.out.println(numbers);

        //numbers.add()
        //numbers.addAll()
        //numbers.clear()
        //numbers.get()
        //numbers.isEmpty()
        //numbers.size()
        //numbers.contains();
    }
}