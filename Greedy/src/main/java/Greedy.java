
/**
 * Created by brianhoehne on 6/19/15.
 */
public class Greedy {

    public static void main(String [] args){

        CoinCalculator coin = CoinCalculator.getInstance();
        // Requests user input
        int coins = coin.askForChange();

        System.out.printf("%d\n", coins);
    }


}