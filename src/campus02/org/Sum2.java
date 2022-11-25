package campus02.org;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Sum2 {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>(); //Strg + Alt + v --> Automatische Erstellung
        values.add(1);
        values.add(2);
        values.add(3);
        System.out.println(iterativeSum(values));
        System.out.println(recursiveSum(values));

    }

    public static int iterativeSum(ArrayList<Integer> values) {
        int sum = 0;
        //for(int i = 0; i < values.size(); i++);
        for (Integer value : values) { //for each Methode
            sum += value;
            //sum = sum + value; //andere Möglichkeit für sum += value;
        }
        return sum;
    }

    public static int recursiveSum(ArrayList<Integer> values) {
        //Abbruchbestimmung
        //if(values.isEmpty() = andere Möglichkeit
        if (values.size() == 0) {
            return 0;
        }
        //gib mir den ersten Wert in der Liste und lösche ihn aus der Liste
        Integer value = values.remove(0);
        //Integer value = values.get(0); --> Dauerschleife würde entstehen
        return value + recursiveSum(values); //values sind hier um 1 Eintrag kleiner
    }
}