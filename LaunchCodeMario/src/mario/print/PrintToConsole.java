package mario.print;
import mario.Print;

/**
 * Created by brianhoehne on 6/18/15.
 */
public class PrintToConsole implements Print {
    public void print(int pyramidSize) {
        for (int i = 1; i <= pyramidSize; i++) {
            for (int ii = i; ii < pyramidSize; ii++) {
                System.out.printf(" ");
            }
            for (int ii = 0; ii <= i; ii++) {
                System.out.printf("#");
            }
            System.out.printf("\n");


        }
    }
}