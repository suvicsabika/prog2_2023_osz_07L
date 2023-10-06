public class Main {
    public static void main(String[] args) {
        String name = StringUtils.getName();
        System.out.println("Welcome " + name + "!");

        System.out.println("---");

        String nextName = StringUtils.getName("What is your name? ");
        System.out.println("Welcome " + nextName + "!");

        StringUtils.sc.close();
    }
}
