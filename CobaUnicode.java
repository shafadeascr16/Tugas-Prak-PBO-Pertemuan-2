public class CobaUnicode {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
        char c = '\u0063';
        String kata = "\u0061\u0062\u0063";

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("kata: " + kata);
    }
}

//Representasi character menggunakan unicode.