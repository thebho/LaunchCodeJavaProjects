package mario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import mario.print.*;
/**
 * Created by brianhoehne on 6/18/15.
 */



public class Pyramid {

    private static Pyramid pyramid;

    private Pyramid() {}

    public static Pyramid getInstance(){
        if (pyramid == null) {
            pyramid = new Pyramid();
        }
        return pyramid;
    }


    public int pyramidHeight() {

        String pyramidHeight = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.print("How tall should I make that pyramid? ");

            try {
                pyramidHeight = br.readLine();
            } catch (IOException var5) {
                var5.printStackTrace();
            }

            System.out.println();

            try {
                int pyramidInt = Integer.parseInt(pyramidHeight);
                if(pyramidInt > 0) {
                    return pyramidInt;
                }

                System.out.println("Must be greater than 0");
            } catch (NumberFormatException var4) {
                System.out.println("Not an integer, try again");
            }
        }
    }

    public static Print printType() {
        System.out.print("Would you like me to marioPrint.print that pyramid to the (c)onsole or create (t)ext file?: ");
        String printType;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            try {
                printType = br.readLine();
                System.out.println(printType);
                if(printType.equals("c") || printType.equals("t")) {
                    System.out.println();
                    Object e;
                    if(printType.equals("c")) {
                        e = new PrintToConsole();
                    } else {
                        e = new PrintToFile();
                    }

                    return (Print)e;
                }

                System.out.print("Please respond with \'c\' or \'t\': ");
            } catch (IOException var3) {
                var3.printStackTrace();
            }
        }
    }
}