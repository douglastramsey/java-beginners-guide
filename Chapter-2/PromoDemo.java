// A promotion surprise!
class PromoDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        b = 10;
        i = b * b; // OK, no cast needed

        b = 10;
        b = (byte) (b * b); // cast needed!!

        System.out.println("i and b: " + i + " " + b);

        char ch1 = 'a', ch2 = 'b';

        ch1 = (char) (ch1 + ch2);

        System.out.println("char(a) + char(b) = " + ch1);
    }
}
