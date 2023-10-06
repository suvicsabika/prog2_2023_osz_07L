public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Hiba! Pontosan ketto darab parancssori argumentumot adjon meg.");
            System.exit(1); // echo $?
        }

        int elso = Integer.parseInt(args[0]);
        int masodik = Integer.parseInt(args[1]);
        int eredmeny = elso + masodik;

        System.out.println("Eredmeny: " + eredmeny);
    }
}
