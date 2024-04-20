public class RewardValue {
    double cash;
    int mile;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    RewardValue(double cash)  //accept cash value
    {
        this.cash = cash;
    }
    RewardValue(int mile) // accept value in miles
    {
        this.cash = convertToCash(mile);
    }
    static int convertToMiles(double cash){
        return (int)(cash/MILES_TO_CASH_CONVERSION_RATE);
    }
    static double convertToCash(int mile){
        return mile*MILES_TO_CASH_CONVERSION_RATE;
    }
    double getCashValue(){
        return cash;
    }
    int getMilesValue(){
        return convertToMiles(this.cash);
    }
}
