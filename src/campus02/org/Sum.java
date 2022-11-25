package campus02.org;

public class Sum {
    public static void main(String[] args) {

        System.out.println(sumUpIterative(3));
        System.out.println(sumUpRecursive(3));
        System.out.println(sumUpRecursiveAcc(3, 0));

    }
    public static int sumUpIterative(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            // beginne mit 1 und laufe so lange, bis du kleiner gleich n bist
            //erhöhe nach jeder Iteration um i um 1
            sum = sum + i;

        }
        //retourniere das Ergebnis
        return sum;
    }

    public static int sumUpRecursive(int n) {
        //!!! Abbruchsbestimmung
        if(n<=0) {
            return n;
        }
        return n + sumUpIterative(n-1);
    }

    public static int sumUpRecursiveAcc(int n, int acc) {
        if(n<=0) {
            return acc;
        }
        acc = acc + n;
        return sumUpRecursiveAcc(n-1, acc);
    }

}

