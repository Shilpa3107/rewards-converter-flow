import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
       double cash = 1000.90;
       int miles = (int)(cash/RewardValue.MILES_TO_CASH_CONVERSION_RATE);
       var rewardValue = new RewardValue(cash);
       assertEquals(miles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int mile = 100000;
        double cash = mile*RewardValue.MILES_TO_CASH_CONVERSION_RATE;
        var rewardValue = new RewardValue(mile);
        assertEquals(cash, rewardValue.getCashValue());
    }
}
