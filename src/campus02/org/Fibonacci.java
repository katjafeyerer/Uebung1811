package campus02.org;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));

    }
    public static int fibonacci(int n) {
        //abbruchsbestimmung = Basisfall= n1 = 1 oder n2=1, dann 1 return
        if(n == 1 || n==2){
            return 1;
        }

        //rekursionsschritt
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
