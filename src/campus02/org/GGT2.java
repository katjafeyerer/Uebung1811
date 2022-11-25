package campus02.org;

public class GGT2 {
    public static void main(String[] args) {
        System.out.println(printRecursiveGGT(10, 0));
        System.out.println(printRecursiveGGT(10, 3));
        System.out.println(printRecursiveGGT(7, 11));
        System.out.println(printRecursiveGGT(8,4));
        System.out.println(printRecursiveGGT(6,2));
        System.out.println(printRecursiveGGT(112,44));

    }
    public static int printRecursiveGGT(int a, int b) {
        //abbruchsbestimmung
        if(b==0) {
            return a;
        }
        return printRecursiveGGT(b, a%b);

        //int rest = a%b
        //return ggtRecurive(b, a%b)
    }
}
