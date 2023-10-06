import java.util.Scanner;

public class StringUtils {
    private StringUtils() {

    }   

    public static Scanner sc = new Scanner(System.in);
    
    public static String getName() {
        System.out.print("May I ask what is your name? ");
        String name = sc.nextLine();

        return name;
    }

    
    public static String getName(String sentence) {
        System.out.print(sentence);
        String name = sc.nextLine();

        return name;
    }
}
