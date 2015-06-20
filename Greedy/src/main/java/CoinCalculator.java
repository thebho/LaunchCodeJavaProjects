import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by brianhoehne on 6/19/15.
 */
public class CoinCalculator {

    private static CoinCalculator coinCal;

    public static CoinCalculator getInstance() {
        if (coinCal == null) {
            coinCal = new CoinCalculator();
        }
        return coinCal;
    }
    private String askForInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("How much change is owed?: ");
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
    }

    private float validateFloatInput(String userInput) throws NumberFormatException{
        float userFloat;
        try {
            userFloat = Float.parseFloat(userInput);
            if (userFloat > 0) {
                System.out.println();
                return userFloat;
            } else if (userFloat == 0) {
                return 0;
            }else {
                System.out.println();
                System.out.print("Must be a number greater than 0.");
                return -1;
            }
        } catch (NumberFormatException n) {
            System.out.println("Must be a float or int.");
            return -1;
        }
    }

    public int askForChange(String userInput){

        // Asks user for input, checks if it can be parse to float and is greater than 0
        float change = validateFloatInput(userInput);

        // Rounds up for making change
        int changeInt = Math.round(change * 100);

        // Returns number of Coins needed
        return numberOfCoins(changeInt);

    }

    public int askForChange(){
        int changeInt;
        while (true) {
            // Asks user for input
            String userInput = askForInput();

            // If input fails restarts loop
            if (userInput == null) continue;

            // Asks user for input, checks if it can be parse to float and is greater than 0
            float change = validateFloatInput(userInput);

            // If change is negative number restarts loop
            if (change < 0) continue;

            // Rounds up for making change
            changeInt = Math.round(change * 100);
            break;

        }
        System.out.println(changeInt);
        // Returns number of Coins needed
        return numberOfCoins(changeInt);
    }

    // Returns number of coins needed for change
    private int numberOfCoins (int changeOwed) {
        int coins = 0;
        while (changeOwed > 0) {
            if (changeOwed >= 100) {
                changeOwed /= 100;
            }
            else if (changeOwed >= 25) {
                coins += changeOwed / 25;
                changeOwed = changeOwed % 25;
            }
            else if (changeOwed >= 10) {
                coins += changeOwed / 10;
                changeOwed = changeOwed % 10;
            }
            else if (changeOwed >= 5) {
                coins += changeOwed / 5;
                changeOwed = changeOwed % 5;
            }
            else {
                coins += changeOwed;
                changeOwed = 0;
            }
        }
        return coins;

    }
}
