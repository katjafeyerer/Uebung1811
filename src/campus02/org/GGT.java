package campus02.org;

import java.io.IOException;

public class GGT {

    public static void main(String[] args) {
        System.out.println(printIterativeGGT(4, 3));
        System.out.println(printIterativeGGT(4, 2));
        System.out.println(printIterativeGGT(10, 0));
        //System.out.println(printIterativeGGT2(10, 2));
    }

    public static int printIterativeGGT(int a, int b) {
        int ggt = a % b;

        if (b != 0) {
            a = b;
            b = a % b;
        } else {
            ggt = a;
        }
        //printIterativeGGT(a, b--);
        System.out.println("printIterativeGGT: " + ggt);
        return ggt;


    }
}

    /*public static int printIterativeGGT2(int c, int d) {
        int ggt2 = c % d;

        if(d==0)
        {
            return c;
        }
        c=d;
        d=c%d;
        printIterativeGGT2(c, d--);
        System.out.println("printIterativeGGT: " + ggt2);
        return ggt2;

    }
}
    /*public static int printRecursiveGGT(int a, int b) {

    }

        /*if(b==0)
        {
            return;
        }
            a=b;
            b=a%b;
        System.out.println("printIterativeGGT: " + ggt);
        return ggt;
    }


}*/

