package mario;

/**
 * Created by brianhoehne on 6/18/15.
 */
public class Mario {

    private Pyramid pyramid;


    public Mario(Pyramid pyramid){
        this.pyramid = pyramid;
        this.printPyramid(pyramid);

    }

    public static void main(String[] args) {
        Mario mario = new Mario(Pyramid.getInstance());

    }

    public void printPyramid(Pyramid pyramid){
        System.out.println("I\'m-a gonna make-a you-a a pyramid-a!");

        // Creates print object
        Print print = pyramid.printType();

        // Creates int representing the size of the pyramid to print
        int pyramidInt = pyramid.pyramidHeight();

        // Prints the pyramid
        print.print(pyramidInt);

    }
}