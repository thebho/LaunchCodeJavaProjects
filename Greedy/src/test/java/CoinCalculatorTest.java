import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by brianhoehne on 6/19/15.
 */
public class CoinCalculatorTest {

    @Test
    public void zeroCoinTest () {
        CoinCalculator coin = CoinCalculator.getInstance();
        assertEquals(0,coin.askForChange("0.00"));
    }

    @Test
    public void oneCoinTest () {
        CoinCalculator coin = CoinCalculator.getInstance();
        assertEquals(1,coin.askForChange("5.00"));
    }

    @Test
    public void sevenCoinTest () {
        CoinCalculator coin = CoinCalculator.getInstance();
        assertEquals(7,coin.askForChange("49.00"));
    }
}
