class TestConversions {
    public static void main(String[] args) {
        // Widening
        double d = 2.12345D;
        float f = 150.50F;
        long l = 15000L;
        int i = 55;
        char c = 20;
        short s = 1000;
        byte b = 126;

        // Implicit Widening conversions
        System.out.println("Implicit Widening conversions:");
        System.out.println("------------------------------");
        System.out.println("  byte to short: \t -> " + (s=(short)b));
        System.out.println("   short to int: \t -> " + (i=(int)s));
        System.out.println("    int to long: \t -> " + (l=(long)i));
        System.out.println("  long to float: \t -> " + (f=(float)l));
        System.out.println("float to double: \t -> " + (d=(double)f));

        // Explicit Widening conversions
        System.out.println();
        System.out.println("Explicit Widening conversions:");
        System.out.println("------------------------------");
        System.out.println("cast byte to char: \t -> " + (char)b);
        System.out.println("cast short to char: \t -> " + (char)s);

        // Narrowing
        double a = 150.234256421235489645;
        System.out.println();
        System.out.println("Explicit Narrowing conversions:");
        System.out.println("------------------------------");
        System.out.println("double to float: \t -> " + (f = (float)d));
        System.out.println("  float to long: \t -> " + (l = (long)f));
        System.out.println("    long to int: \t -> " + (i = (int)l));
        System.out.println("   int to short: \t -> " + (s = (short)i));
        System.out.println("  short to byte: \t -> " + (b = (byte)s));
    }
}

//Konversi dari tipe data ke tipe data lainnya.