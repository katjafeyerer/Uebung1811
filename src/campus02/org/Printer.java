package campus02.org;

public class Printer {

    public static void main(String[] args) {
        /*printFromNToZero(5);*/

        printFromNToZeroRecursive(5);
        printFromZeroToNRecursive(5);
        printFromNToZeroRecursive(5);
        printFromNToZero(5);

    }
    //Methodendeklaration
    public static void printFromNToZero(int n) {
        while(n >= 0) {
            System.out.println("nFromNToZero = " + n);
            n--;
            //n = n-1;
        }
    }

    public static void printFromNToZeroRecursive(int n) {
        //Abbruchsbestimmung
        if(n < 0 ) {
            return;
        }
        System.out.println("nNToZero2= " + n);
        //rufe mich selbst nochmal auf
        printFromNToZeroRecursive(n-1); // oder --n; n udpdaten (1 verringern)
    }

    public static void printFromZeroToNRecursive(int n) {
        if(n < 0) {
            return;
        }

        //schreibe erst auf die KOnsole, wenn
        printFromZeroToNRecursive(n-1);
        System.out.println("n= " + n);

    }
}
