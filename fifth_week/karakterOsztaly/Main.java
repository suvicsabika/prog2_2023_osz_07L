public class Main {
    public static void main(String[] args) {
        char c1;
        c1 = (char)65;
        System.out.println(c1);
        System.out.println((int)c1);

        //http://xahlee.info/comp/unicode_index.html
        System.out.println((char)9654);

        System.out.println(Character.isAlphabetic(c1));
        System.out.println(Character.isLetter(c1));
        System.out.println(Character.isUpperCase(c1));
        System.out.println(Character.isLowerCase(c1));
        System.out.println(Character.isLetterOrDigit(c1));
        
        System.out.println(Character.isDigit(c1));
        System.out.println(Character.isWhitespace(c1));
        System.out.println(Character.isSpaceChar(c1));

        System.out.println(Character.toUpperCase(c1));
        System.out.println(c1);
        System.out.println(Character.toLowerCase(c1));
        
        System.out.println(Character.getNumericValue('9'));
        System.out.println(Character.getNumericValue('1'));
        System.out.println(Character.getNumericValue('4'));
    }
}
