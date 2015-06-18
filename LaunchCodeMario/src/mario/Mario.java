package mario;

/**
 * Created by brianhoehne on 6/18/15.
 */
public class Mario {
    public Mario() {
    }

    public static void main(String[] args) {
        System.out.println("I\'m-a gonna make-a you-a a pyramid-a!");

        // Creates print object
        Print print = Pyramid.printType();

        // Creates int representing the size of the pyramid to print
        int pyramidInt = Pyramid.pyramidHeight();

        // Prints the pyramid
        print.print(pyramidInt);
    }
}