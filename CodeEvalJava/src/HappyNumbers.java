/**
 * Created by brianhoehne on 6/25/15.
 */
import java.io.*;

public class HappyNumbers {
    public static void main (String[] args) throws IOException {
        int[] test = {1, 202, 300, 42, 7};

        for (int testCase : test) {

            System.out.println(happyNumberCheck(testCase));
        }
    }

    public static int happyNumberCheck (int emptyNumber) {
        if (emptyNumber == 1){
            return 1;
        // starting with 4 never ends well
        } else if (emptyNumber == 4 || emptyNumber <= 0)  {
            return 0;
        } else {
            int newNumber = 0;
            int enCopy = emptyNumber;

            // loop until all digits are added
            while (enCopy > 0) {
                newNumber += (enCopy % 10) * (enCopy % 10);
                enCopy /= 10;
            }
            return happyNumberCheck(newNumber);
        }
    }
}
