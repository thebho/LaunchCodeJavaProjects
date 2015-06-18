package mario.print;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import mario.Print;
import java.io.*;

/**
 * Created by brianhoehne on 6/18/15.
 */
public class PrintToFile implements Print {
    public void print(int pyramidSize) {
        File marioPrint = new File("marioPrint.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(marioPrint.getAbsoluteFile()));){
            for (int i = 1; i <= pyramidSize; i++) {
                for (int ii = i; ii < pyramidSize; ii++) {
                    bw.write(" ");
                }
                for (int ii = 0; ii <= i; ii++) {
                    bw.write("#");
                }
                bw.write("\n");


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
