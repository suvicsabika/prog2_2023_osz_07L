import java.util.Scanner;

public class Stringek {
    static void stringMetodusok() {
        String pelda = "cica";
        //           = new String("cica");

        char elsoKarakter = pelda.charAt(0);
        System.out.println(elsoKarakter);

        String reszString = pelda.substring(1, 3);
        String lancoltMetodusok = pelda.toUpperCase().substring(1, 3); //toLowerCase()
        System.out.println(reszString);
        System.out.println(lancoltMetodusok);

        String szokozosSzo = "    cica     ";
        String tisztitott = szokozosSzo.trim();
        System.out.println(tisztitott);

        int karakterekSzama = pelda.length();
        int index = pelda.indexOf("ci");
        System.out.println(karakterekSzama);
        System.out.println(index);

        boolean kezdo = pelda.startsWith("c");
        boolean veg = pelda.endsWith("a");
        boolean benneVanE = pelda.contains("cic");
        System.out.println(kezdo);
        System.out.println(veg);
        System.out.println(benneVanE);
    }

    static void olvasasBillentyuzetrol() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kerem adja meg nevet: ");
        String nev = sc.nextLine();
        System.out.println("Udvozoljuk " + nev + "!");

        sc.close();//!!!
    }

    static void formazottKiiratas() {
        String nev = "Balazs";
        String szakma = "pek";
        int eletkor = 22;

        System.out.println(nev + ", (" + szakma + ") " + eletkor + " eves.");
        System.out.printf("%s, (%s) %d eves.\n", nev, szakma, eletkor);
        String formazott = String.format("%s, (%s) %d eves.\n", nev, szakma, eletkor);
        System.out.print(formazott);
    }
    static String greeting(String nev) {
        String formazott = String.format("Hello %s!", nev); 
        return formazott;
        //return "Hello " + nev +"!";
    }
    public static void main(String[] args) {
        String elvalaszto = "-".repeat(10);
        stringMetodusok();
        System.out.println(elvalaszto);
        olvasasBillentyuzetrol();
        System.out.println(elvalaszto);
        formazottKiiratas();
        System.out.println(elvalaszto);
        System.out.println(greeting("Aniko"));
    }
}